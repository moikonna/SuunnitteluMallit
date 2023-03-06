import java.util.Scanner;

public class RockPaperScissors extends Game {
    
    private int[] moves;
    private String[] options = {"Rock", "Paper", "Scissors"};
    private int[] scores;
    
    @Override
    void initializeGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();
        this.playersCount = numPlayers;
        this.moves = new int[numPlayers];
        this.scores = new int[numPlayers];
    }

    @Override
    void makePlay(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + (player+1) + ", enter your move (1-Rock, 2-Paper, 3-Scissors): ");
        int move = scanner.nextInt();
        scanner.nextLine();
        this.moves[player] = move-1;
    }

    @Override
    boolean endOfGame() {
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return (sum >= 3); // game ends when a player wins three rounds
    }

    @Override
    void printWinner() {
        int maxScore = 0;
        int winner = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > maxScore) {
                maxScore = scores[i];
                winner = i;
            }
        }
        System.out.println("Player " + (winner+1) + " wins the game!");
        calculateScores();
    }

    @Override
    public final void playOneGame(int playersCount) {
        super.playOneGame(playersCount);
    }
    
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.playOneGame(2); // change the number of players as desired
    }
    
    private int compareMoves(int move1, int move2) {
        if(move1 == move2) {
            return 0;
        }
        if(move1 == 0 && move2 == 1 || move1 == 1 && move2 == 2 || move1 == 2 && move2 == 0) {
            return -1;
        }
        return 1;
    }
    
    private void calculateScores() {
        for(int i = 0; i < moves.length; i++) {
            for(int j = i+1; j < moves.length; j++) {
                int result = compareMoves(moves[i], moves[j]);
                if(result == -1) {
                    scores[j]++;
                } else if(result == 1) {
                    scores[i]++;
                }
            }
        }
        for(int i = 0; i < moves.length; i++) {
            System.out.println("Player " + (i+1) + " score: " + scores[i]);
        }
    }

}

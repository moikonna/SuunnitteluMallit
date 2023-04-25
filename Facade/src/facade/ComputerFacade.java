package facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        this.cpu.freeze();
        this.memory.load(0, new char[]{'B', 'O', 'O', 'T', ' ', 'M', 'E', '!'});
        this.cpu.jump(0);
        char[] data = new char[16];
        for (int i = 0; i < data.length; i++) {
            data[i] = this.memory.read(i);
        }
        System.out.println("Booting data: " + new String(data));
        this.cpu.execute();
    }
}
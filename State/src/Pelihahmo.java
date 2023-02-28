
public class Pelihahmo {
private PelihahmoState state;
    
    public Pelihahmo() {
        state = null;
    }
    
    public void setPelihahmoState(PelihahmoState state) {
        this.state = state;
    }
    
    public PelihahmoState getState() {
        return state;
    }
  
    public void Name() {
        state.Name();
    }
    
    public void showAttack() {
        state.showAttack();
    }
}

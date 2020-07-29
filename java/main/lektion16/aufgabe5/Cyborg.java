package main.lektion16.aufgabe5;

public class Cyborg extends Mensch implements Persönlichkeit {
    private Roboter robot = new Roboter();
    private Mensch organic = new Mensch();

    @Override
    public Entscheidung entscheide(Gefahren gefahr){
        Entscheidung robohirn = this.robot.entscheide(gefahr);
        Entscheidung organic  = this.organic.entscheide(gefahr);
        if(robohirn == organic) return robohirn;
        else if(Math.random()>0.5) return organic;
        else return robohirn;
    }



}

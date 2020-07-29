package main.lektion14;

public class Strecke {
    public static final String NEGATIV_WERT = "keine Negativ Zahlen";
    int a;
    int b;

    public Strecke (int a, int b){if(a<0||b<a) throw new ArithmeticException(NEGATIV_WERT);
        this.a=a;
        this.b=b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public boolean collision(Strecke pathA, Strecke pathB){
        if(
                ((pathA.getA() >= pathB.getA()) && (pathA.getA() < pathB.getB()))||
                        ((pathB.getA() >= pathA.getA()) && (pathB.getA() < pathA.getB()))
        )
            return true;
        else return false;
    }

    @Override
    public String toString() {
        String sol = String.valueOf(this.getA());
        if (this.getA()==this.getB()) return sol;
        for(int i = this.getA() ; i<this.getB();i++)
        {
            sol += "-";
        }
        sol+=String.valueOf(this.getB());
        System.out.println(sol);


        return sol;
    }
}

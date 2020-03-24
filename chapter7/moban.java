class zilei extends moban {
    public double getRadius() {
        return 0.28;
    }

    public static void main(String[] args) {
        zilei csm = new zilei();
        csm.setTurnRate(15);
        System.out.println(csm.getSpeed());
    }
}

public abstract class moban {
    private double turnRate;

    public moban() {
    }

    public abstract double getRadius();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    public double getSpeed() {
        return java.lang.Math.PI * 2 * getRadius() * turnRate;
    }
}
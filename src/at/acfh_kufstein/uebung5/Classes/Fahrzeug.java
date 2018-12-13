package at.acfh_kufstein.uebung5.Classes;

public class Fahrzeug {

    private short reifen;
    private String color;
    private short ps;
    private short tueren;
    private boolean getartet;
    private short geschwindigkeit;
    private int anzahl;
    private int maxSpeed;



    public Fahrzeug(short reifen, String color, short ps, short tueren, int maxSpeed) {
        this.setReifen(reifen);
        this.setColor(color);
        this.setPs(ps);
        this.setTueren(tueren);
        this.setGetartet(false);
        this.setGeschwindigkeit(geschwindigkeit = 0);
        this.setAnzahl(anzahl=+1);
        this.setMaxSpeed(maxSpeed);
    }

    public void starten() {
        if (isGetartet() == false) {
            setGetartet(true);
        } else {
            System.err.println("Auto ist breits an");
        }

    }

    public void stoppen() {
        if (isGetartet() == true) {
            setGetartet(false);
        } else {
            System.err.println("Das Auto ist bereits aus");
        }
    }

    public void beschleunigen(short plusSpeed) {
        if ((isGetartet() == true) && getGeschwindigkeit() < getMaxSpeed()) {
            setGeschwindigkeit((short) (getGeschwindigkeit() + plusSpeed));
        } else {
            System.err.println("Das Aoto ist nicht an");
        }
    }

    public void bremsen(short minusSpeed) {
        if ((isGetartet() == true) && getGeschwindigkeit() > 0) {
            setGeschwindigkeit((short) (getGeschwindigkeit() - minusSpeed));

        } else {
            System.err.println("Das Auto steht bereits");
        }
    }

    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGetartet() {
        return getartet;
    }

    public void setGetartet(boolean getartet) {
        this.getartet = getartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}



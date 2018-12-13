package at.acfh_kufstein.uebung5.Classes;

public class Wasserfahrzeug extends Fahrzeug {

    private double tiefgang;
    private short schreuben;
    private double ladung;


    public Wasserfahrzeug(short reifen, String color, short ps, short tueren, int maxSpeed, double tiefgang, short schreuben, double ladung) {
        super(reifen, color, ps, tueren, maxSpeed);
        this.setTiefgang(tiefgang);
        this.setSchreuben(schreuben);
        this.setLadung(ladung);
    }
    public void entladen() throws InterruptedException {
        if (ladung<0){
            setLadung(0);
            Thread.sleep(5000);
        }
        else {
            System.err.println("Ladung ist bereits entladen");
        }
    }
    @Override
    public String toString()

    {
        return String.format("Mein Wasserfahrzeuf hat "+this.getPs()+" Ps und einen Tiefgang von "+this.getTiefgang()+"m");

    }

    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchreuben() {
        return schreuben;
    }

    public void setSchreuben(short schreuben) {
        this.schreuben = schreuben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
}

package at.acfh_kufstein.uebung5.Classes;

public class Auto extends Fahrzeug{

    private boolean klimaanlage;
    private short airbags;


    public Auto(short reifen, String color, short ps, short tueren, int maxSpeed, short airbags) {
        super(reifen, color, ps, tueren, maxSpeed);
        this.setKlimaanlage(false);
        this.setAirbags(airbags);
    }

    @Override
    public String toString()

    {
        return String.format("Mein Auto hat "+this.getPs()+" Ps und fährt mit "+this.getGeschwindigkeit()+" km/h");

    }
    public void klimaAn(){
        if (klimaanlage==false){
        setKlimaanlage(true);
    }else {
            System.err.println("Klima läuft bereits");
        }
    }
    public void klimaAus(){
        if (klimaanlage==true){
            setKlimaanlage(false);
        }else {
            System.err.println("Klima ist bereits aus");
        }
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}

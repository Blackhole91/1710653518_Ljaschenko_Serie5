import at.acfh_kufstein.uebung5.Classes.Auto;
import at.acfh_kufstein.uebung5.Classes.Wasserfahrzeug;

import java.util.ArrayList;

public class Aufruf {
    public static void main(String[] args) {

        Auto bmw = new Auto((short)4,"Silber",(short)220,(short)5,300,(short) 4);
        Auto vw = new Auto((short)4,"Blau",(short)220,(short)5,300,(short) 4);
        Auto audi = new Auto((short)4,"Schwarz",(short)180,(short)5,260,(short) 8);
        Wasserfahrzeug schiff =new Wasserfahrzeug((short)0,"Grün",(short)15000,(short)5,100,10,(short)2,4.5);

        ArrayList<Auto> autoList = new ArrayList<Auto>();
        autoList.add(bmw);
        autoList.add(audi);
        autoList.add(vw);

        for(Auto f:autoList){
            System.out.println(f);
        }
        System.out.println("");

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(schiff);
    }

}

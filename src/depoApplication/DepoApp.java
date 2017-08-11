package depoApplication;

import BO.Furnitori;
import BO.Konsumatori;

public class DepoApp {
    public static void main(String arg []){
        try{
            Konsumatori k=new Konsumatori(5,"Jerry","Hinton","Feugiat Non Lobortis Associates","2706 Urna. Av.","Châteauroux","Bahamas","Centre","9734","0383 628 6280","Endriti95@gmail.com",2);
           BL.BLKonsumatori.insert(k);
            //Furnitori f=new Furnitori(10,"Beni Dona", "Breg Dillit", "Prishtina", "Rrafshi Kosoves","Kosove", "10000", "044-152-251", "endritti95@gmail.com",1122);
            //BL.BLFurnitori.insert(f);
           
        } catch (Exception ex) {
            System.out.println("Exception"+ex);
        }
    }
}
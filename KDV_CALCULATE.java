import java.util.Scanner;
public class KDV_CALCULATE {
    public static void main(String[] args) {

        Scanner myJob   =   new Scanner(System.in);
        System.out.print("Notunuzu Giriniz: ");
        double note = myJob.nextFloat();
        if (note<=1000.0 && note>0.0 ){

            double addKdv= note*(0.18)+note;
            //System.out.println(addKdv);
            double kdvTutar= addKdv-note;
            System.out.println("KDV'li Tutar: "+addKdv+" "+ "KDV Miktarı: "+kdvTutar);

        }
        if (note>1000.0){

            double addKdv= note*(0.08)+note;
            //System.out.println(addKdv);
            double kdvTutar= addKdv-note;
            System.out.println("KDV'li Tutar: "+addKdv+" "+ "KDV Miktarı: "+kdvTutar);

        }
    }
}

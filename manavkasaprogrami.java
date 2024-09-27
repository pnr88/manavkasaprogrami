import java.util.Scanner;

public class manavkasaprogrami {
    public static void main(String[] args) {
        Scanner imp=new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5;

        double armutkilo,elmakilo,domateskilo,muzkilo,patlicankilo;

        System.out.print("Armut kaç kilo=");
        armutkilo=imp.nextDouble();
        System.out.print("Elma kaç kilo=");
        elmakilo=imp.nextDouble();
        System.out.print("Domates kaç kilo=");
        domateskilo=imp.nextDouble();
        System.out.print("Muz kaç kilo=");
        muzkilo= imp.nextDouble();
        System.out.print("Patlıcan kaç kilo=");
        patlicankilo=imp.nextDouble();

        double toplam=(armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.print("Toplam tutar="+toplam);

    }
}

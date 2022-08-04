import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican;

        Scanner inp=new Scanner(System.in);

        System.out.print("Armut kac kilo :");
        armut=inp.nextDouble();

        System.out.print("Elma kac kilo :");
        elma=inp.nextDouble();

        System.out.print("Domates kac kilo :");
        domates=inp.nextDouble();

        System.out.print("Muz kac kilo :");
        muz=inp.nextDouble();

        System.out.print("Patlican kac kilo :");
        patlican=inp.nextDouble();

        double toplamtutar;
        toplamtutar=((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0));
        System.out.println("Toplam Tutar :"+"\s"+toplamtutar+"\s"+"TL");

    }
}

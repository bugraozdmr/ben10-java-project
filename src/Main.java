import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //polymorphism

        Scanner scanner=new Scanner(System.in);

        kahraman_ol kahraman=new kahraman_ol();

        System.out.print("Kahramanlık zamanı (çıkış için q) :");
        String a=scanner.nextLine();
        while(!a.equals("q")){
            /*
                fireball fireball1=(fireball)kahraman.uzaylı_sec(a);
                fireball sadece olması gerektiği gibi fireball classından ifade kabul eder ondan dolayı
                değişken değiştirdik ama daha zor yolla ..
            */



            if(a.equals("fireball")||a.equals("ateş topu")){
                fireball fireball1=(fireball)kahraman.uzaylı_sec(a);
                fireball1.yazdir(); // fireball nesnesinin yazdir() metodunu çağırma
                fireball1.rep(); // fireball nesnesinin rep() metodunu çağırma
            }else if (a.equals("xlr8")||a.equals("şimşek hız")) {
                xlr8 xlr81 = (xlr8) kahraman.uzaylı_sec(a);
                xlr81.yazdir();
                xlr81.rep();
            }
            else if(a.equals("dort kol")) {
                dort_kol dort_kol1 = (dort_kol) kahraman.uzaylı_sec(a);
                dort_kol1.yazdir();
                dort_kol1.rep();
            }else System.out.println("Böyle bir karakter mevcut değil");

            System.out.print("Uzaylı :");
            a=scanner.nextLine();
        }
    }
}

public class kahraman_ol {

    //bunun kullanımı önemli istersek bir class'tan nasıl istenilen değerler çağırabiliriz gösterir
    public uzaylılar uzaylı_sec(String uzaylı){
        if(uzaylı.equals("dort kol")){
            return new dort_kol("dört kol",400,"4 kolu var","dört birden iyidir");
        }
        else if(uzaylı.equals("xlr8")||uzaylı.equals("şimşek hız")){
            return new xlr8("xlr8",280,"hızlıdır","catch me if u can");
        }
        else if(uzaylı.equals("fireball")||uzaylı.equals("ateş topu")){
            return new fireball("fireball",320,"yanıyor","burn them all");
        }
        else return null;
    }
}

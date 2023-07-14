public class fireball extends uzaylılar{
    public String ozel_guc;
    public String replik;

    public fireball(String isim, int guc, String ozel_guc, String replik) {
        super(isim, guc);
        this.ozel_guc = ozel_guc;
        this.replik = replik;
    }

    public void yazdir() {
        super.yazdir();
        System.out.println("Özel gücü :"+this.ozel_guc);
    }
    public void rep() {
        System.out.println(isim+" favori repliği:"+replik);
    }
}

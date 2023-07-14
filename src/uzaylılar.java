public class uzaylılar {
    public String isim;
    public int guc;

    public uzaylılar(String isim, int guc) {
        this.isim = isim;
        this.guc = guc;
    }

    public void saldir(){
        System.out.println(this.isim+" "+this.guc+" ile saldırıyor.");
    }
    public void yazdir(){
        System.out.println("Uzaylı ismi :"+isim);
        System.out.println("Uzaylı gücü :"+guc);
    }
    public void rep(){
        System.out.println("replikk yok");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getGuc() {
        return guc;
    }

    public void setGuc(int guc) {
        this.guc = guc;
    }
}

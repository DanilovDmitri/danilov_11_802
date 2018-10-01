 class Drob {
    private int chs;
    private int znm;
    public Drob () {
        this.chs=0;
        this.znm=1;
     }
     public Drob (int chs, int znm) {
        this. setChs (chs);
        this. setZnm (znm);
     }
     public void setChs(int chs) {
         this.chs = chs;
     }

     public int getChs() {
         return chs;
     }
     public void setZnm(int znm) {
        if (znm!=0) {
        this.znm = znm;
        }
     }

     public int getZnm() {
         return znm;
     }
     private static int gcd(int a, int b) {
        while ((a != 0)&(b!=0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a;
     }
    public void optimize(Drob drob){
        int a = gcd( drob.chs , drob.znm);
        drob.chs = drob.chs / a;
        drob.znm = drob.znm / a;
     }
     public Drob Mult (Drob ber, Drob ike) {
     Drob och = new Drob ();
        och.chs=ber.chs*ike.chs;
        och.znm=ber.znm*ike.znm;
     return och;
      }
     public void print(Drob drob) {
         System.out.print (drob.chs + " / " + drob.znm);
     }
}

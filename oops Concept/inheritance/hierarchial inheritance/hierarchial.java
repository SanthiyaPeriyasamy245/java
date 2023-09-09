public class hierarchial {
  int l;
  int m;
  public static void main(String[] args) {
     hierarchial hl=new hierarchial();
     hierarchial hl1=new hlchild1(15,4,10);
      hierarchial hl2=new hlchild2(100,4,9);
     System.out.println(hl.l);
      System.out.println(hl1.l);
        System.out.println(hl2.l);
  }
  hierarchial()
  {
    this.l=5;
    this.m=6;
  }
   hierarchial(int g1,int g2)
  {
    this.l=g1;
    this.m=g2;
  }
}

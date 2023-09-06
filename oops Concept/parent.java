public class parent {
  int l;
  int b;
  public static void main(String[] args) {
    parent pt1=new parent(5,6);
    parent pt=new parent(pt1);
    System.out.println(pt1.l);
    Child cd=new Child();
    Child cd2=new Child(1,2,3);
    System.out.println(cd.w);
    System.out.println(cd2.l+" "+cd2.b+" "+cd2.w);
    // parent class propertise can be accesable by the child class but child class properties are not accesable by parent class.
    // for example 
    //System.out.println(pt.w);here w can't be accesable because it declared in the child class.
    System.out.println(cd.b);// here eventhough child class doesn't have l or b variable it can be accessable because it extends it's parent class.
  }
  parent(){
    this.l=-1;
    this.b=-1;
  }

  parent(int l,int b){
     this.l=l;
     this.b=b;
  }
  parent(parent pt1){
     this.l=pt1.l;
     this.b=-pt1.b;
  }

}

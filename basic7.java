class dress{
    int price;
    String name;
    String type;
   
    // to set default values to the varaaibles when object get created we cna use constructor and it's name should be same as class name.
    // constructor will be called irrespective of how many objects you have created.
    public dress(){
       price=250;
       name="";
       type="cotten";
       

    } 
     public dress(int p,String n,String t)// parameterized constructor.
    {
       price=p;
       name=n;
       type=t;

    }
    
    public dress(String name,String type)
    {
      this.name=name;
      this.type=type;
    }
}
public class basic7 {
    public static void main(String a[])
    {
        dress d=new dress();
        System.out.println(d.price+d.name+d.type);
        dress d1=new dress("kurti","cotton");
        
        System.out.println(d1.price+":"+d1.name+":"+d1.type);
    }
}

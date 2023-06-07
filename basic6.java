 class bio{
    String name="santhiya";
    char grade;
    private int age;
    public String getname(String name)
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age,bio b)

    {
        // we can use this keyword to tell that the variable is an instance variable of current object.
        bio b1=b;
        b1.age=age;
    }
    public int getage()
    {
        return age;
    }

}
public class basic6  {
    public static void main(String a[]){
    bio b=new bio();
    b.setage(19,b);
    int g=b.getage();
    System.out.println(g);
    String x=b.getname("Santhiya");
    System.out.println(x);
}
}


// in java each mathod has it's own stack.
class mobile
{
    int num=90;
    public void spotify()
    {
        System.out.println("playing yuvan song..");
    }
    // mehtod overloading
    /* we can have a same mehtod names but the thing is number of parameters that we have used and the type it's not about return type it's about parameter type.that matters */
    public int add(int num1,int num2)
    {
        return num1+num2;
    } 
    public int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    } 
   
    public String gpa(float gpa)
    {
       if(gpa>=7.5)
       return "distinction";
        
      return "pass";
    }
}
public class basic3 {
    public static void main(String a[])
    {
    // objkect oriented programmig language.
    int n1=12;
    int n2=22;
    int n3=90;
    float gpa=9.9f;
    mobile phone=new mobile();
    mobile phone1=new mobile();
    /* you can create multiple onjects with the help of  class. */
    int r=phone1.num=11;
    int u=phone.num;
    phone.spotify();
   String result= phone.gpa(gpa);
   int y= phone.add(n1,n2,n3);
   System.out.println(y);
   System.out.println(result);
   System.out.println(r);
   System.out.println(u);
   

    }
} 
// basically what you need is class which act as blueprint by using the class onject will be created in jvm(java virtual machine) where program get execued.)
// compilation done by using jdk then drives to jvm it has library and it'll be run at jre.

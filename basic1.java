public class basic1 {
    public static void main(String a[]){
    // type casting and conversion.
    int n=12;
    byte b=127;
    int g=b;// normal conversion.
    byte h=(byte)n;//explicit conversion.
    float f=12.8f;
    double d=f;
    double r=3.44;
    float f1=(float)r;
    int p=288;
    byte w=(byte)p;// there will be a modulo operation 288%256 .256 is the total range of byte(-128 T128).
    //operators(arthemetic,relational,logical,bitwise) and conditional statements(if,else if,if else)
    int v=3;
    String  result=v%2==0?"even":"odd";//ternary operator
    System.out.println(result);
    
 
}
}

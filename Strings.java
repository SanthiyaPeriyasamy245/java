public class Strings{
  public static void main(String[]args){
     String s="Santhiya Periyasamy";
     String p="Santhiya Periyasamy";
     //it'll be in string pool
    // here these two variables are referred to the same object
    //to check that we can use == operator.
     System.out.println(s==p); // it'll print true.

     String t=new String("Santhiya Periyasamy");
     String m=new String("Santhiya Periyasamy");

     //here if we check both the variables are equal it'll give false.because we have created seperate object for each one of them eventhough the values are same object is created separately.
     // so it'll give you a false.it'll be outside the string pool inside the heap.

     System.out.println(t==m);
     System.out.println(t.equals(m)); // here it'll give you true .because it'll check the values.

     System.out.printf("Hi My namw is  %s","santhiya"); // %s is a  placeholder.
     System.out.println();
     //a to z using normal string.
     String alphabets="";  // in this operation it'll create new object every time memory get wasted.because we know that strings are immutable. 
     for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        alphabets+=ch;
     }
     System.out.println(alphabets);
     // stringbuilder that we can do modification in the string which is reffer to same object.
     StringBuilder builder=new StringBuilder(); //here only one object get created and it get modified.
      for(int i=0;i<26;i++){
        char ch=(char)('a'+i);
        builder.append(ch); 
     }
     System.out.println(builder);
     //palindrome with string
     String name="anna";
     int num=0;
     for(int i=0;i<name.length()/2;i++){
      char start=name.charAt(i);
      char end=name.charAt(name.length()-1-i);
      if(start!=end){
         num++;
      }
     }
   if(num!=0){
    System.out.println("false");

   }
   else
   System.out.println("true");
  }
}
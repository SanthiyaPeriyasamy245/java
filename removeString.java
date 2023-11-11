import javax.swing.border.StrokeBorder;

public class removeString {
    public static void main(String[] args) {
        String word="SanPeriyasamysaraswathygowsivakumar";
        System.out.println(removeword(word));
      
    }
    public static String removeword(String word)
    {
        if(word.isEmpty())
        {
            return word; 
               }

 if(word.startsWith("gow")&&(!(word.startsWith("gowtham")))) // to remove san when it's not santhiya.
{
 return removeword(word.substring(3));

}
else{
     return word.charAt(0)+ removeword(word.substring(1));
}    
    }     
 

}

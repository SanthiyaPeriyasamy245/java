import java.util.ArrayList;

public class subset{
    public static void main(String[] args) {
        String word="abd";
        subsets(" ",word);
        System.out.println(arraylist);
    }
static ArrayList<String> arraylist = new ArrayList<>();
    public static void subsets(String ch,String word)
    {
        if(word.isEmpty())
        {
            System.out.println(ch);
          arraylist.add(ch);
           return;
        }
       char letter=word.charAt(0);
       subsets(ch +letter, word.substring(1));
        subsets(ch, word.substring(1));
    }
}
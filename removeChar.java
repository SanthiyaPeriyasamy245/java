public class removeChar{
    public static void main(String[] args) {
        {
            String word="santhiya";
            System.out.println(removeCharacter(word));

        }
    }
    public static String removeCharacter(String word)
    {
        if(word.isEmpty())
        {
            return word;
        }
        if(word.charAt(0)=='s')
        {
            return removeCharacter(word.substring(1));
        }
        else{
            return word.charAt(0)+removeCharacter(word.substring(1));
        }
    }
}
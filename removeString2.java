public class removeString2 {
    public static void main(String[] args) {
        
        String word="santhiyaperiyasamygowthamsivasaraswathy";
    
        System.out.println(remove(word));
    }
    public static String remove(String word) {
        if(word.isEmpty())
        {
            return word;
        }
        if(word.startsWith("periyasamy"))
        {
            return remove(word.substring(10));
        }
        else{
            return word.charAt(0)+remove(word.substring(1));
        }
    }
}

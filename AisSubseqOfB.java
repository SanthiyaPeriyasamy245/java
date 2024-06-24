public class AisSubseqOfB {
    public static void main(String[] args) {
        String A = "AXY";
        String B = "YADXCY";
        // problem is to check whether the A can be a subsequence of B.
        // so let's traverse through the B string untill it get the first character of A
        // and so on if A reached it's end after checking all characters return true
        // else false this is the logic
        System.out.println(subseqcheck(A, B));

    }

    public static boolean subseqcheck(String A, String B) {

        int j = 0;

        for (int i = 0; i < B.length(); i++) {
            if (A.charAt(j) == B.charAt(i)) {
                j++;
                if (j == A.length())
                    return true;
            }
        }
        return false;
    }
}

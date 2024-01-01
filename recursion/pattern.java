public class pattern {
    public static void main(String[] args) {
        int n = 5;
        patternprinting(0, 0, n);
    }

    public static void patternprinting(int i, int j, int n) {
        if (i > n - 1) {
            return;
        } else if (j >= n - i) {
            System.out.println();
            patternprinting(i + 1, 0, n);
        } else {
            System.out.print("*");
            patternprinting(i, j + 1, n);
        }

    }
}

public class basicProblems {
    public static void main(String[] args) {
        // sum of the digits
        System.out.println(SumofThedigits(1234123));
        int x = 12;
        x--; // here 12 decremented to 11.
        int y = x--;// here 11 stored and decrement to 10
        System.out.println(y);// 11
        System.out.println(x);// 10
        System.out.println(reverseAnumber(1234));
        System.out.println(1231 == reverseAnumber(1231));// check palindrome or not.
        System.out.println(countZero(10200010, 0)); // count the zero's.
        int t = 8;
        System.out.println(numberofstepstoreduceittoZero(t));
    }

    static int c = 0;

    public static int numberofstepstoreduceittoZero(int x) {
        if (x == 0) {
            return c;
        }
        if ((x & 1) == 1)

        {
            c++;
            return numberofstepstoreduceittoZero(x - 1);
        } else {
            c++;
            return numberofstepstoreduceittoZero((x / 2));
        }

    }

    public static int countZero(int x, int count) {
        if (x == 0) {
            return count;
        }

        if (x % 10 == 0) {
            count = count + 1;
        }
        return countZero(x / 10, count);
    }

    public static int reverseAnumber(int x) {
        if (x == 0) {
            return 0;
        }
        int count = (int) Math.log10(x);
        return ((x % 10) * ((int) Math.pow(10, count))) + reverseAnumber(x / 10);
    }

    public static int SumofThedigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + SumofThedigits(n / 10);
    }

}

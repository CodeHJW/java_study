public class Homework4 {
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        else if (m > n) {
            return gcd(n, m%n);
        }
        else {
            return gcd(m, n%m);
        }
    }
    public static void main(String[] args){

        System.out.println(gcd(6,12));
    }
}

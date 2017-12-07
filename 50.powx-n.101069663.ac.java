public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return (n % 2 == 0) ? myPow(x * x, n / 2) : myPow(x * x, n / 2) / x;
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
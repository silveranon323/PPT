class Solution {
    public String fractionAddition(String expression) {
        int numerator = 0, denominator = 1, index = 0, n = expression.length();

        while (index < n) {
            int sign = 1;
            if (expression.charAt(index) == '-' || expression.charAt(index) == '+') {
                sign = expression.charAt(index++) == '-' ? -1 : 1;
            }

            int num = 0;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                num = num * 10 + expression.charAt(index++) - '0';
            }
            num *= sign;
            index++; 

            int denom = 0;
            while (index < n && Character.isDigit(expression.charAt(index))) {
                denom = denom * 10 + expression.charAt(index++) - '0';
            }

            numerator = numerator * denom + num * denominator;
            denominator *= denom;

            int gcd = gcd(Math.abs(numerator), denominator);
            numerator /= gcd;
            denominator /= gcd;
        }

        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

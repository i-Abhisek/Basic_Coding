class Solution {
    public static Long[] lcmAndGcd(Long A, Long B) {
        // Calculate GCD using the Euclidean algorithm
        Long gcd = gcd(A, B);

        // Calculate LCM using the relation LCM(A, B) * GCD(A, B) = A * B
        Long lcm = (A * B) / gcd; // Safe to multiply first since we're using Long

        // Return the result as an array
        return new Long[]{lcm, gcd};
    }

    // Helper method to compute GCD using the Euclidean algorithm
    private static Long gcd(Long a, Long b) {
        while (b != 0) {
            Long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method for testing
    public static void main(String[] args) {
        Long A = 12L;
        Long B = 18L;
        Long[] result = lcmAndGcd(A, B);
        System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
    }
}

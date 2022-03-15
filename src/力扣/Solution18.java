package 力扣;

/**
 * @Author xqf
 */
//最佳观光组合

public class Solution18 {
//    public int maxScoreSightseeingPair(int[] A) {
//        int length = A.length;
//        int max = 0;
//        for (int i = 1; i < length; i++) {
//            max = Math.max(A[i - 1] + A[i] - i, max);
//            A[i] = Math.max(A[i - 1], A[i] + i);
//        }
//        return max;
//    }

    public int maxScoreSightseeingPair(int[] A) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                sum = A[i] + A[j] + i - j;
                if (sum > res) {
                    res = sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution18 a = new Solution18();
        int[] dd = {8, 1, 5, 2, 6};
        System.out.println(a.maxScoreSightseeingPair(dd));
    }
}

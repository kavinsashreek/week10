public class ExamScoreBandCounter {

    public static int countInBand(int[] scores, int low, int high) {
        int first = firstPosition(scores, low, false);
        int afterLast = firstPosition(scores, high, true);
        return afterLast - first;
    }

    // Finds first score >= target, or > target when strict is true.
    private static int firstPosition(int[] scores, int target, boolean strict) {
        int left = 0;
        int right = scores.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (scores[mid] > target || (!strict && scores[mid] == target)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));
        System.out.println(countInBand(scores, 90, 100));
    }
}
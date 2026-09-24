class Sliding {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int maxT = k * threshold;
        int count = 0;

        for (int i = 0; i <= arr.length - k; i++) {

            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
            }

            if (sum >= maxT) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int result = numOfSubarrays(arr, k, threshold);

        System.out.println(result);
    }
}
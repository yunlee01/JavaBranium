public class HoanViChinhTac {

    private static void output(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static boolean nextPermunation(int[] arr) {

        int i = arr.length - 2;

        while (i >= 0 && arr[i] > arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int k = arr.length - 1;

            while (arr[i] > arr[k]) {
                k--;
            }

            swap(arr, i, k);

            int r = i + 1;
            int s = arr.length - 1;

            while (r < s) {
                swap(arr, r, s);
                r++;
                s--;
            }

            return false;
        } else {
            return true;
        }
    }

    private static void generate(int[] arr) {
        boolean isFinal = false;

        while (!isFinal) {
            output(arr);
            isFinal = nextPermunation(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5};
        generate(arr);
    }
    
}

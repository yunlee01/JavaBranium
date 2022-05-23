public class Binary {

    private static void output(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    private static boolean nextBinaryString(int[] arr) {
        int i = arr.length - 1;

        while (i >= 0 && arr[i] != 0) {
            arr[i] = 0;
            i--;
        }

        if (i >= 0 ) {
            arr[i] = 1;
            return false;
        } else {
            return true;
        }
    }

    private static void generate(int[] arr) {
        boolean isFinal = false;

        while (!isFinal) {
            output(arr);
            isFinal = nextBinaryString(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0};
        generate(arr);
    }
}
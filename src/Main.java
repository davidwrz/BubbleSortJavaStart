import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Nieposortowane liczby: ");
        System.out.println(Arrays.toString(numbers));

        int sorted = sort(numbers);
        System.out.println("Porównano " + sorted + " razy");
        System.out.println("Posortowane liczby: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static int sort(int[] array) {
        int compares = 0;
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int change = 0;
            for (int j = 0; j < n - i - 1; j++) {
                compares++;
                if (array[j] > array[j + 1]) {
                    change++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (change == 0) {
                return compares;
            }
        }
        return compares;
    }
}

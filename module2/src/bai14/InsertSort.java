package bai14;

public class InsertSort {
    static int[] array = {2, 3, 0, 4, 7, 1, -9, 8, 44, 10};

    public static void insertSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
package bai11;

import java.sql.SQLOutput;
import java.util.Stack;

public class Reverse {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int i:
                array) {
            stack.push(i);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static String reverseString(String input) {
        Stack<String> wordStack = new Stack<>();
        StringBuilder output = new StringBuilder();

        //tach tung phan tu va dua vao Stack
        String[] words = input.split("\\s+");
        for (String word:
                words) {
            wordStack.push(word);
        }
        //Lay tung stack va noi vao chuoi moi
        while (!wordStack.isEmpty()) {
            output.append(wordStack.pop()).append("");
        }

        //Loai bo khoang trang
        return output.toString().trim();
    }

    public static void main(String[] args) {

        //Dao nguoc mang so nguyen
        int[] integerArray = {1,2,3,4,5};
        System.out.println("Original array: " + java.util.Arrays.toString(integerArray));
        reverseArray(integerArray);
        System.out.println("Reverse array: " + java.util.Arrays.toString(integerArray));


        //Dao nguoc chuoi
        String inputString = "Hello World";
        System.out.println("Original String: " + inputString);
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
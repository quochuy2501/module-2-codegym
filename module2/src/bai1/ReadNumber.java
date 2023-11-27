package bai1;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int b = n % 10, a = n / 10;
        int c = n % 100, d = n / 100;

        String[] single_digits = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] two_digits = new String[]{"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds_multiple = new String[]{"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", "seven hundred ", "eight hundred ", "nine hundred "};
        if (a == 1) {
            System.out.println(two_digits[b + 1]);
        } else if (b == 0) {
            System.out.println(tens_multiple[a]);
        } else if ( b<10 && a<10 ) {
            System.out.println(tens_multiple[a] + "-" + single_digits[b]);
        } else {
            System.out.println(hundreds_multiple[d] + "-" + tens_multiple[c / 10] + "-" + single_digits[c % 10]);
        }
    }
}


//public class ReadNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập số cần đọc: ");
//        int number = scanner.nextInt();
//
//        // Bước 2: Đọc các số có một chữ số
//        if (number >= 0 && number < 10) {
//            switch (number) {
//                case 0:
//                    System.out.println("zero");
//                    break;
//                case 1:
//                    System.out.println("one");
//                    break;
//                case 2:
//                    System.out.println("two");
//                    break;
//                case 3:
//                    System.out.println("three");
//                    break;
//                case 4:
//                    System.out.println("four");
//                    break;
//                case 5:
//                    System.out.println("five");
//                    break;
//                case 6:
//                    System.out.println("six");
//                    break;
//                case 7:
//                    System.out.println("seven");
//                    break;
//                case 8:
//                    System.out.println("eight");
//                    break;
//                case 9:
//                    System.out.println("nine");
//                    break;
//                default:
//                    System.out.println("Out of ability");
//                    break;
//            }
//
//        } else if (number < 20) {
//            // Bước 3: Đọc các số có hai chữ số nhỏ hơn 20
//            int ones = number % 10;
//            switch (ones) {
//                case 0:
//                    System.out.println("ten");
//                    break;
//                case 1:
//                    System.out.println("eleven");
//                    break;
//                case 2:
//                    System.out.println("twelve");
//                    break;
//                case 3:
//                    System.out.println("thirteen");
//                    break;
//                case 4:
//                    System.out.println("fourteen");
//                    break;
//                case 5:
//                    System.out.println("fifteen");
//                    break;
//                case 6:
//                    System.out.println("sixteen");
//                    break;
//                case 7:
//                    System.out.println("seventeen");
//                    break;
//                case 8:
//                    System.out.println("eighteen");
//                    break;
//                case 9:
//                    System.out.println("nineteen");
//                    break;
//                default:
//                    System.out.println("Out of ability");
//                    break;
//            }
//        } else if (number < 100) {
//            // Bước 4: Đọc các số có hai chữ số lớn hơn hoặc bằng 20
//            int tens = number / 10;
//            int ones = number % 10;
//
//            String tensString = "";
//            String onesString = "";
//
//            switch (tens) {
//                case 2:
//                    tensString = "twenty";
//                    break;
//                default:
//                    System.out.println("Out of ability");
//                    return;
//            }
//
//            switch (ones) {
//                case 0:
//                    onesString = "";
//                    break;
//                case 1:
//                    onesString = "one";
//                    break;
//                default:
//                    System.out.println("Out of ability");
//                    return;
//            }
//
//            System.out.println(tensString + " " + onesString);
//        } else if (number < 1000) {
//            // Bước 5: Đọc các số có ba chữ số
//            int hundreds = number / 100;
//            int remainder = number % 100;
//
//            String hundredsString = "";
//            String remainderString = "";
//
//            switch (hundreds) {
//                case 1:
//                    hundredsString = "one hundred";
//                    break;
//                // Thêm các trường hợp còn lại tương ứng
//                default:
//                    System.out.println("Out of ability");
//                    return;
//            }
//
//            // Sử dụng đệ quy để đọc phần còn lại của số
//            readNumber(remainder);
//
//            System.out.println(hundredsString + " " + remainderString);
//        } else {
//            System.out.println("Out of ability");
//        }
//
//        scanner.close();
//    }
//
//    private static void readNumber(int number) {
//        // Các bước xử lý đọc số ở đây (tương tự như trong main method)
//    }
//}



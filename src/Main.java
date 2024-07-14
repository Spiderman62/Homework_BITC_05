import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            System.out.print("\nChương trình làm việc với chuỗi!\n");
            System.out.println("1: Tính tổng số chẵn");
            System.out.println("2: Tìm số lớn nhất trong mảng");
            System.out.println("3: Đếm số lần xuất hiện trong mảng");
            System.out.println("4: Tính tổng bình phương các số trong mảng");
            System.out.println("Nhập số phía trên để thực hiện chương trình");

                StringMethod stringMethod = new StringMethod();

                int choice = scanner.nextInt();
                int result;
                switch (choice) {
                    case 1:
                        int[] numbers = new int[0];
                            System.out.print("Nhập số lượng phần tử: ");
                            int n = scanner.nextInt();
                            numbers = new int[n];
                            for (int j = 0; j < n; j++) {
                                System.out.print("Nhập phần tử thứ " + (j+1) + ": ");
                                numbers[j] = scanner.nextInt();
                            }
                        result = stringMethod.SumEvenNumberArray(numbers);
                        System.out.println("Tổng số chẵn là: "+result);
                        break;
                    case 2:
                        int[] numbers1 = new int[0];
                        System.out.print("Nhập số lượng phần tử: ");
                        int n1 = scanner.nextInt();
                        numbers1 = new int[n1];
                        for (int j = 0; j < n1; j++) {
                            System.out.print("Nhập phần tử thứ " + (j+1) + ": ");
                            numbers1[j] = scanner.nextInt();
                        }
                        result = stringMethod.maxInArray(numbers1);
                        System.out.println("Số lớn nhất trong mảng là: "+result);
                        break;
                    case 3:
                        int[] numbers2 = new int[0];
                        System.out.print("Nhập số lượng phần tử: ");
                        int n2 = scanner.nextInt();
                        numbers2 = new int[n2];
                        for (int j = 0; j < n2; j++) {
                            System.out.print("Nhập phần tử thứ " + (j+1) + ": ");
                            numbers2[j] = scanner.nextInt();
                        }
                        System.out.print("Nhập số cần tìm: ");
                        int find = scanner.nextInt();
                        result = stringMethod.countMatchArray(numbers2,find);
                        System.out.println("Số lần xuất hiện trong mảng là: "+result);
                        break;
                    case 4:
                        ArrayList<Integer> numbers3 = new ArrayList<>();
                        int totalSum = StringMethod.SumOfSquaresElements(numbers3);
                        System.out.println("Tổng bình phương các phần tử trong mảng: " + totalSum);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                        break;
                }



        scanner.close();
    }
}
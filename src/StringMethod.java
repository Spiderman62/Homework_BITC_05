import java.util.ArrayList;
import java.util.Scanner;

public class StringMethod {

    private int sum = 0 , max,count = 0;
    public int SumEvenNumberArray(int[]array){
        for(int i = 0;i<array.length;i++){
            if(array[i] % 2 == 0){
                this.sum += array[i];
            }
        }
        return this.sum;
    }
    public int maxInArray(int[]array){
        this.max = array[0];
        for(int i = 0;i<array.length;i++){
            if(array[i] > this.max){
                this.max = array[i];
            }
        }
        return this.max;
    }
    public int countMatchArray(int[]array,int find){
        for(int i = 0;i<array.length;i++){
                if(array[i] == find){
                    this.count++;
                }
        }
        return this.count;
    }
    public static int SumOfSquaresElements(ArrayList<Integer> arr) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Nhập giá trị (hoặc 'n' để kết thúc): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            int value = Integer.parseInt(input);
            arr.add(value);
            sum += value * value;
        }

        return sum;
    }
}

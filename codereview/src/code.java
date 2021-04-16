import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String nums = inp.nextLine();
        String[] num = nums.split("\\s+");
        String[] s = {"2", "3", "4", "5", "6", "7", "8", "9"};
        int a = 0;
        int array[] =new int[8];
        if (num[num.length - 1].equals("0")) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < num.length; j++) {
                    if (s[i].equals(num[j])) {
                        a++;
                    }
                }
                array[i] = a;
                a = 0;

            }
            for (int p = 0; p < array.length; p++) {
                System.out. print(array[p] + " ");
            }
            System.out.print(0);

        } else {
            System.out.print("Error");
        }
    }
}

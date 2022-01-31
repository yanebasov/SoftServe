import java.util.Arrays;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LuckyTicket {
    public static int sumOfArr(int[] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
    public static void moscowWay(int[] mainArr) {

        for (int i = 0; i < mainArr.length; i++) {
            int[] leftSide = Arrays.copyOfRange(mainArr, 0, mainArr.length / 2);
            int[] rightSide = Arrays.copyOfRange(mainArr, mainArr.length / 2, mainArr.length);
            int sumLeft = sumOfArr(leftSide);
            int sumRight = sumOfArr(rightSide);

            if (sumLeft == sumRight) {
                System.out.println("Билетик счастливый");
                System.out.println("Сумма слева:" + sumLeft);
                System.out.println("Сумма справа:" + sumRight);
                return;
            }
            else{
                System.out.println("Билетик несчастливый:(");
                return;
            }
        }
    }
    public static void petersWay(int[] mainArr) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < mainArr.length; i++) {
            if (i % 2 == 0) {
                evenSum += mainArr[i];
            } else {
                oddSum += mainArr[i];
            }
        }
        if (evenSum == oddSum) {
            System.out.println("\nБилетик счастливый");
            System.out.println("Сумма чётных: "+evenSum);
            System.out.println("Сумма нечётных: "+ oddSum);
            return;
        }
        else{
            System.out.println("\nБилетик несчастливый:(");
            return;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File myFile1 = new File("E:\\SoftServe Elementary\\Task 6.2(files and switch)\\src\\input.txt");
        File myFile2 = new File("E:\\SoftServe Elementary\\Task 6.2(files and switch)\\src\\input2.txt");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("1->Moscow");
        System.out.println("2->Petersburg");
        System.out.println("0->Exit");
        System.out.println("Выберите тип определния билетика Moscow или Petersburg:");
        String city = sc3.nextLine();
        switch(city){
            case"Moscow":System.out.println("Московский способ:");
                Scanner sc = new Scanner(myFile1);
                if (myFile1.exists()) {
                    System.out.println("Файл 1 существует!");
                } else {
                    System.out.println("Файл 1 отсутствует!");
                }
                int[] num1 = new int[6];
                System.out.println("Array 'num1':");
                for (int i = 0; i < num1.length; i++) {
                    num1[i] = sc.nextInt();
                    System.out.print(num1[i] + " ");
                }
                System.out.print("\n");
                moscowWay(num1);
                break;
            case "Petersburg":System.out.println("_________________________");
                System.out.println("\nПитерский(Ленинградский) способ:");
                Scanner sc1 = new Scanner(myFile2);
                int[] num2 = new int[6];
                System.out.println("Array 'num2':");
                for (int i = 0; i < num2.length; i++) {
                    num2[i] = sc1.nextInt();
                    System.out.print(num2[i] + " ");
                }
                petersWay(num2);break;
            default:break;
        }

    }}

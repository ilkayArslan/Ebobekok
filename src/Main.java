import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int  ebob=1,ekok,num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        num2 = input.nextInt();
        int i = 1;
        while (i<=num1){
            if (num1 % i ==0 && num2 % i ==0){
                ebob = i ;
            }
            i++;
        }
        ekok = (num1*num2)/ebob;
        System.out.println(ebob + " iki sayısının ebobudur");
        System.out.println(ekok + " iki sayının ekokudur");

    }
}
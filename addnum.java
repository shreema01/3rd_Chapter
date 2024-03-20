import java.util.Scanner;

public class addnum {
    public static void main(String[] args) {
        System.out.println("Welcome to our Calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter numone:");
        int numone=input.nextInt();
        System.out.print("Enter numtwo:");
        int numtwo=input.nextInt();
        int sum=numone+numtwo;
        System.out.print("Sum:" +sum);
       // System.out.print("sum:" +(numone+numtwo));//second method to slove(my method)




    }
}

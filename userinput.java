import java.util.Scanner;//supporting class of JRE

public class userinput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);//object declaration(pore dekbo)
        System.out.print("please Enter your name:");
        String name=input.nextLine();//this is for string
        System.out.println(name);
        System.out.print("please Enter your age");
        int age=input.nextInt();//this is for integer
        System.out.println(age);}
}
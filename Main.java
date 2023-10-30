import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Q1
//        small(25,37,24);

        //Q2
//        System.out.println("please enter number:");
//        int check = s.nextInt();
//        check(check);



        //Q3
        System.out.println("1.A password must have at least eight characters ");
        System.out.println("2.A password consists of only letters and digits.");
        System.out.println("3.A password must contain at least two digits");
        System.out.println("input a password(You are agreeing to the above terms and conditions):");
        String str =s.nextLine();
        match(str);
        System.out.println(Character.isLetterOrDigit(str.charAt(0)));


    }
    //Q1
    public static void small(int num1,int num2,int num3){
        if(num1 < num2 && num1 < num3){
            System.out.println("The smallest value is "+num1);
        }else if (num2 < num1 && num2 <num3){
            System.out.println("The smallest value is "+num2);
        }else System.out.println("The smallest value is "+num3);

    }

    //Q2

    public static void check(int num){
        if(num >0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }else System.out.println("zero");

    }
        //Q3
    public static void match(String str) {
        boolean check=false;
        int count=0;
        if(str.length()>=8){
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLetterOrDigit(str.charAt(i))==false){
                check=false;
                break;

            }else check =true;

        }
        for (int i = 0; i <str.length() ; i++) {
            if (count == 2) {
                break;
            } else if (Character.isDigit(str.charAt(i))) {
                count++;

            }
        }

        if(check==true && count==2){
            System.out.println("Password is valid: "+str);
        }else System.out.println("Password is invalid: "+str);

        }else System.out.println("Password is invalid: "+str);

    }
}
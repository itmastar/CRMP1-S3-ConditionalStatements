import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Conditional Statements
        //if
//        int age=20;
//        if(age>=18){
//            System.out.println("Major");
//        }else{
//            System.out.println("Minor");
//        }
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter age ");
//        int age=input.nextInt();
//        if(age>=18){
//            System.out.println("Major");
//        }else{
//            System.out.println("Minor");
//        }

        //else-if
//        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter your marks ");
//        int score=input.nextInt();
//        if(score>=70){
//            System.out.println("Grade A");
//        } else if (score <70 && score>=50) {
//            System.out.println("Grade B");
//
//        }else if(score<50 && score>=35){
//            System.out.println("Grade C");
//        }else{
//            System.out.println("Fail");
//        }

//        int marks= input.nextInt();
//        if(marks>=70){
//            System.out.println("Distinction");
//        } else if (marks>=60) {
//            System.out.println("First class");
//
//        }else{
//            System.out.println("Pass");
//        }

        //nested if-else
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name ");
        String name=sc.next();
        int price=100;
        System.out.println("Do you have a coupon , reply 'Y' or 'N' ");
        char hasCoupon=sc.next().charAt(0);
        //SAVE70, SAVE50
        if(hasCoupon=='Y'){
            System.out.println("Coupon code");
            String couponCode=sc.next();
            if(couponCode.equals("SAVE70")){
                price= (int) (100*0.7);
                System.out.println(name + " You have to pay "+price +" rupees only !!" );
            } else if (couponCode.equals("SAVE50")) {
                price= (int) (100*0.5);
                System.out.println(name + " You have to pay "+price +" rupees only !!" );
            }
        }else{
            System.out.println(name + " You have to pay "+price +" rupees only !!" );
        }

 }
}
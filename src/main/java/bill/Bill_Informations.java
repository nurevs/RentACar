package bill;


import java.util.Scanner;

public class Bill_Informations {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please,enter cardholder name.");
        String  CHName=input.nextLine();
        System.out.println("Please,enter card number.");
        String CardNo=input.next();


        if(CardNo.length()!=12){
            System.out.println("Please enter a valid card number");
        }



    }

}

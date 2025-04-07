import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean notNum=false;

        while(!notNum)
        {
            try{
                System.out.println("Unesite broj:");
                String broj = input.nextLine();
                double num= Double.valueOf(broj);
                if(Double.valueOf(broj)<=0 || Double.valueOf(broj)>=0){
                    notNum=true;
                    System.out.println("Unijeli ste broj "+num);
                }
            }catch (NumberFormatException e){
                System.out.println("Niste unijeli broj.");
            }


        }
    }
}

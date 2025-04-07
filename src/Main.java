import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String broj;
        double num;
        int f=1;

        while(f==1)
        {
            try{
                System.out.println("Unesite broj");
                broj = input.nextLine();
                num= Double.valueOf(broj);
                if(Double.valueOf(broj)<=0 || Double.valueOf(broj)>=0){
                    f=0;
                    System.out.println("Unijeli ste broj "+num);
                }
            }catch (NumberFormatException e){
                System.out.println("Niste unijeli broj");
            }


        }
    }
}

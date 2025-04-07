import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String broj;
        double num;

        try{
            System.out.println("Unesite broj");
            broj = input.next();
            Double.valueOf(broj);

        }catch (NumberFormatException e){
            int f=1;
            while(f==1){
                try {
                    broj = input.next();
                    System.out.println("Unesite broj:");
                    if(Double.valueOf(broj)<=0 || Double.valueOf(broj)>=0){
                        f=0;
                         num = Double.valueOf(broj);
                    }
                }
                catch (NumberFormatException e1){
                    System.out.println("Nije unesen broj.");
                }

            }

        }finally {
            System.out.println("Uneseni broj je"+num);
        }


    }
}

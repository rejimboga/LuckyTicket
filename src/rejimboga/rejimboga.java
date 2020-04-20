package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть номер квитка:");
        int a = sc.nextInt();

        if(99 < a && 1000 > a){
            int b = (a/1000);
            int c = ((a%1000)/100);
            int d = (((a%1000)%100)/10);
            int e = (((a%1000)%100)%10);

            if (b + c == d + e){
                System.out.println("Ваш квиток є щасливим");
            } else
                System.out.println("Ваш квиток не є щасливим");
        }
    }
}

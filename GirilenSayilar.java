import java.util.Scanner;
public class GirilenSayilar {
    public static void main(String[] args) {
        int number,sum,count;
        Scanner input = new Scanner(System.in);

        // sayıları bulurken bulduğumuz sayıların kaç tane olduğunu count değşkeninde saklıyoruz
        // bu sayıların toplamını ise sum adlı değişkende topladıktan sonra
        // sum/ count olarak yazdırıyoruz.

        System.out.print("Bir sayı giriniz.  ");
        number = input.nextInt();

        int i = 0;
        sum = 0;
        count = 0;
        while( i < number){
            if((i % 3 == 0) && (i % 4 == 0) ){
                count++;
                sum +=i;
            }
            i++;
        }

        System.out.println( "0 ile "+number+ " arasında 3 ve 4 e bölünebilen 0 dahil "+ count +
                " sayı var ve toplamları: " + sum );
        System.out.println("Ortalamaları :  "  + sum/count*1d);
    }
}

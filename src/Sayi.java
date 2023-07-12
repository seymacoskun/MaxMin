import java.util.Scanner;
public class Sayi
{
	public static void main(String[] args)
	{
        int n ;
        int number;
        int min = 0;
        int max = 0;

        Scanner sca = new Scanner(System.in);
        System.out.print("Kaç adet sayi gireceksiniz?: ");
        n = sca.nextInt();
        System.out.print("\n");

        for (int i = 1; i<= n; i++) {
            System.out.println( i + ". sayýyý girin");
            number = sca.nextInt();
            System.out.print("\n");

            if (number > max) {
                max = number;
            }
            if (number < min || min == 0) {
                  min = number;
            }

        }
        System.out.println("En küçük eleman: " +min);
        System.out.println("En büyük eleman: " + max);
	}
}

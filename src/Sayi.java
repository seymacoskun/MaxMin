import java.util.Scanner;
public class Sayi
{
	public static void main(String[] args)
	{
        int n, number, min = 0, max = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ka� adet sayi gireceksiniz?: ");
        n = inp.nextInt();
        System.out.print("\n");

        for (int i = 1; i<= n; i++) {
            System.out.println( i + ". say�y� girin");
            number = inp.nextInt();
            System.out.print("\n");

            if (number > max) {
                max = number;
            }
            if (number < min || min == 0) {
                  min = number;
            }

        }
        System.out.println("En k���k eleman: " +min);
        System.out.println("En b�y�k eleman: " + max);
	}
}
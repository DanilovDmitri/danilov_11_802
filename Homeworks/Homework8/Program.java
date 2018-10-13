import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int N = input.nextInt();
        int a[] = new int[N];
        System.out.println("Insert array elements:");
        for (int i = 0; i < N; i++) {
            a[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < N; i++) {
            System.out.print (" " + a[i]);
        }
        System.out.println();

        int n2=N-1;
        int n1=0;
        int nm=-1;

        Scanner chislo = new Scanner (System.in);
        System.out.println("Vvedite iskomoe chislo");
        int c = chislo.nextInt();

        if ((c<=a[a.length -1]) && (c>=a[0])) {
            nm=(n2+n1)/2;
            while (c != a[nm]) {
                if (c > a[nm]) {
                    n1 = nm + 1;
                } else {
                    n2 = nm - 1;
                }
                nm = (n1 + n2) / 2;
            }
        }
        System.out.print(nm);
    }
}
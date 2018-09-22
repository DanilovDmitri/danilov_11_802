import java.util.Scanner;
public class Program {
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
    int t=0;
    int k=1;
    int p=1;
   for (int i = 0; i < N; i++) { int c=a[N-i-1];
                while ((c>0) | (p!=0)) {
                t=t + (c % 10)*k;
                c=c/10;
                k=k*10; p=0; }
                p=1;
                
                
   }
    System.out.print (" " + t);
	}
}
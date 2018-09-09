import java.util.Scanner;
class Program {
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
   for (int i = 1; i < N-1; i++) {
        if ((a[i]>a[i-1]) & (a[i]>a[i+1])) {
            t=t+1;
            }
       }
    System.out.print (" " + t);
	}
}
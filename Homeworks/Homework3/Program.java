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
    int s=0;
     for (int i = 0; i < N; i++) {
        if (i % 2==0){
            s=s+a[i];
        }
     }
     System.out.print(" " + s);
	}
}
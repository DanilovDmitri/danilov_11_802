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
    int k=1;
   for (int i = 0; i < N; i++) {
                t=t + a[N-i-1]*k;
                k=k*10;
   }
    System.out.print (" " + t);
	}
}
0 1 2 3 4 5 6 7 8 9 n1=0 n2=n-1 5 9
1 2 3 4 5 6 7 8 9 10
if (k>a[(n2-n1)/2+n1]) {n1=(n2/2+(n2%2))}
         else n2=(n2-n1)/2+n1-(n2%2);
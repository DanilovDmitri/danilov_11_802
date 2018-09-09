import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int p = 1;
                int sum = 0;
                while (number != -1) { int k = number;                       
                         while (k != 0) { 
                                          sum = sum + (k % 10);
                                          k = k/10;
                                         }
                        if ((sum % 2) != 0) { 
                                       p=p*number;
                                      }
			number = scanner.nextInt();
			sum = 0;
		}
		System.out.println(p);
	}
}
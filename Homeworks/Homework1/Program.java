class Program {
	public static void main(String[] args) {
		int a = 200;
                a = (a % 2) + (10*((a/2) % 2))+ (100*((a/4) % 2))+(1000*((a/8) % 2))+(10000*((a/16) % 2))+(100000*((a/32) % 2))+(1000000*((a/64)%2))+10000000*((a/128)%2);
		System.out.println(a);
                }
	}

           
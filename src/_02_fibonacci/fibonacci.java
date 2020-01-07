package _02_fibonacci;

public class fibonacci {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int temp = 0;
	System.out.println(a);
	System.out.println(b);
	for (int i = 0; i < 10; i++) {
	temp = b;
	b=a+b;
	a=temp;
	System.out.println(b);
	}
}
}

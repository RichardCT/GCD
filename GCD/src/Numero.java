
public class Numero {
	int num;
	
	void setnumero(int valor) {
		num = valor;
	}
	
	void max(Numero n) {
		int a, b , c;
		a = num;
		b = n.num;
		while (b > 0) {
			c = a%b;
			a = b;
			b = c;
	
		}
		System.out.println("The greatest common divisor is " + a);
	}

}

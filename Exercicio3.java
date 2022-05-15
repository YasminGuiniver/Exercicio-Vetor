
//3 
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[5];
		
		for (int j=0; j<5; j++) {
			resto0=0;
			//LER UM NUMERO E VERIFICAR SE É PRIMO
			
			System.out.println("Entre com um numero inteiro");
			a[j] = in.nextInt();
			//VERIFICAR SE O RESTO DA DIVISÃO É ZERO
			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}
			//VERIFICANDO SE O NUMERO É PRIMO OU NÃO
			if (resto0 > 2) {
				System.out.println("N?o ? primo");
			}else {
				System.out.println("? primo");
			}
		} //FECHANDO O VETOR
	}
}
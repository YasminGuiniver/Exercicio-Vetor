
//3 
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[5];
		
		for (int j=0; j<5; j++) {
			resto0=0;
			//LER UM NUMERO E VERIFICAR SE � PRIMO
			
			System.out.println("Entre com um numero inteiro");
			a[j] = in.nextInt();
			//VERIFICAR SE O RESTO DA DIVIS�O � ZERO
			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}
			//VERIFICANDO SE O NUMERO � PRIMO OU N�O
			if (resto0 > 2) {
				System.out.println("N?o ? primo");
			}else {
				System.out.println("? primo");
			}
		} //FECHANDO O VETOR
	}
}
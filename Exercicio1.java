//1
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, contpar=0, contimpar=0;
		a = new int[5];
		//LER O VETOR MISTURADO
		for(i=0; i<5; i++) {
			System.out.println("Entre com o "+(i+1)+" numero");
			a[i] = in.nextInt();
			//verificando se ? par ou ?mpar
			if (a[i] % 2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		System.out.println("Pares = "+contpar+" Impares = "+contimpar);
		int par[], impar[];
		par = new int[contpar];
		impar = new int[contimpar];
		//POVOANDO O VETOR PAR
		int ipar=0;
		int iimpar=0;
		for (i=0; i<5; i++) {
			if (a[i]%2 == 0) {
				par[ipar] = a[i];
				ipar++;
			}else {
				impar[iimpar] = a[i];
				iimpar++;
			}
		}
		//APRESENTAR O VETORES
		//APRESENTANDO O VETOR COMPLETO
		System.out.print("[");
		for(i=0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.println();
		//APRESENTANDO O VETOR DE PAR
		System.out.print("[");
		for (i=0; i<contpar; i++) {
			System.out.print(par[i]+" ");
		}
		System.out.print("]");
		
	  	//APRESENTANDO O VETOR IMPAR
		System.out.print("[");
		for (i=0; i<contimpar; i++) {
			System.out.print(impar[i]+" ");
		}
		System.out.print("]");
	}

}
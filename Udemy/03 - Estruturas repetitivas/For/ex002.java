import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor será a quantidade de valores 
		 inteiros X que serão lidos em seguida.
		 Mostre quantos destes valores X estão dentro do intervalo [10,20] e
		 quantos estão fora do intervalo, mostrando essas informações conforme
		 exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora
		 do intervalo).*/
		 int cont1 = 0, cont2 = 0;
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Insira quantos números serão lidos: ");
		 int n = scan.nextInt();
		 
		 for(int i = 0; i < n; i++) {
			 System.out.println("-----------------------------------------------");
			 System.out.print("Insira um número: ");
			 int num = scan.nextInt();
			 if((num >= 10) && (num <= 20)) {
				 cont1++;
				 System.out.printf("%d in [10,20]. TOTAL IN: %d\n", num, cont1);
			 }else {
				 cont2++;
				 System.out.printf("%d out [10,20]. TOTAL OUT: %d\n", num, cont2);
			 }
		 }
		 scan.close();
	}
}

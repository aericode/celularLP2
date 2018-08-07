import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Celular nokia;
		nokia = new Celular();
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		nokia.AddCredits(valor);
	}
}
public class Celular{
	private int credits;

	public Celular(int credits){
		credits = credits;
	}

	public void AddCredits(int ValueToAdd){
		if(ValueToAdd>=0){
			credits -= ValueToAdd;
		}
		System.out.println("Valor inválido");
	}
}

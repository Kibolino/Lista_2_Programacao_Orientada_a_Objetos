package listaDoisQuestaoUm;

public class Main {

	public static void main(String[] args) {
		Empregados empregado1 = new Empregados("Marcos", "Campos", 1518.00);
		Empregados empregado2 = new Empregados("Thais", "Santos" , 5000.00);
		
		System.out.println("Salário anual:");
		System.out.printf("Empregado 1 (%s %s): R$ %.2f%n ", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
		System.out.printf("Empregado 2 (%s %s): R$ %.2f%n ", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());
		
		System.out.println("\nAplicando aumento de 10% no salario.");
		empregado1.aumento();
		empregado2.aumento();
		
		System.out.println("\nSalário anual com aumento de 10%:");
		System.out.printf("Empregado 1 (%s %s): R$ %.2f%n ", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
		System.out.printf("Empregado 2 (%s %s): R$ %.2f%n ", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());
	}

}

package operadores;

public class Unario {

	public static void main(String[] args) {
		
		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIntrementoOriginal = 8, posIncrementoResultado;
		
		System.out.printf("Pr� Incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Ap�s pr� Incrementar a vari�vel original: resultado = %d, Valor Atualizado = %d%n", preIncrementoResultado, preIncrementoOriginal);
		
		System.out.printf("P�s Incremento: valor original = %d%n", posIntrementoOriginal);
		posIncrementoResultado = posIntrementoOriginal++;
		System.out.printf("Ap�s p�s Incrementar a vari�vel original: resultado = %d, Valor Atualizado = %d%n", posIncrementoResultado, posIntrementoOriginal);

	}

}

package operadores;

public class Unario {

	public static void main(String[] args) {
		
		int preIncrementoOriginal = 8, preIncrementoResultado;
		int posIntrementoOriginal = 8, posIncrementoResultado;
		
		System.out.printf("Pré Incremento: valor original = %d%n", preIncrementoOriginal);
		preIncrementoResultado = ++preIncrementoOriginal;
		System.out.printf("Após pré Incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", preIncrementoResultado, preIncrementoOriginal);
		
		System.out.printf("Pós Incremento: valor original = %d%n", posIntrementoOriginal);
		posIncrementoResultado = posIntrementoOriginal++;
		System.out.printf("Após pós Incrementar a variável original: resultado = %d, Valor Atualizado = %d%n", posIncrementoResultado, posIntrementoOriginal);

	}

}

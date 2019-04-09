package br.ucsal.busca;

public class Busca {
	public static void main(String[] args) {

		int[] numeros = {0,1,2,3,4,5,6,7,8,9};

		System.out.println(buscaBinaria(numeros, 10, 0, numeros.length-1));

	}
	public static int buscaSequencial(int[] numeros, int numeroProcurado) {
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]==numeroProcurado)
				return i;
		}
		return -1;
	}
	public static int buscaBinaria(int[] numeros, int numeroProcurado, int inicio, int fim) {		
		int meio;		
		while(inicio<=fim) {			
			meio = ((fim-inicio)/2)+inicio;			
			if(numeros[meio]==numeroProcurado)
				return meio;
			else if (numeroProcurado<numeros[meio]){
				fim=meio-1;
			}else if (numeroProcurado>numeros[meio]){
				inicio=meio+1;
			}			
		}		
		return -1;
	}
	public static int buscaBinariaRecursiva(int[] numeros, int inicio, int fim, int numeroProcurado) {
		if(fim<inicio)
			return -1;		
		int meio = (inicio+fim)/2;		
		if(numeros[meio]==numeroProcurado) {
			return meio;
		} else {
			if(numeroProcurado<numeros[meio]) {
				return buscaBinariaRecursiva(numeros, inicio, meio-1, numeroProcurado);
			}else {
				return buscaBinariaRecursiva(numeros, meio+1, fim, numeroProcurado);				
			}
		}
	}	
}

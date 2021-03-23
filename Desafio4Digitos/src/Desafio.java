import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {

		int ValorDigitado = 6;

		List<Integer> numeros = new ArrayList<>(Valor4Digitos(ValorDigitado));

		for (Integer numero : numeros) {
			System.out.println(numero);
		}

	}

	public static List<Integer> Valor4Digitos(int valorDigitado) {

		// OperaçoesString op = new OperaçoesString();
		List<Integer> digitos21 = new ArrayList<>();

		if (valorDigitado <= 5 || valorDigitado > 9) {
			return digitos21;
		}

		String n1 = String.valueOf(valorDigitado);
		String n2 = String.valueOf(valorDigitado);
		String n3 = String.valueOf(valorDigitado);
		String n4 = String.valueOf(valorDigitado);
		String valorMax = n1 + n2 + n3 + n4;
		int ValMax = Integer.parseInt(valorMax);

		for (int i = 5555; i <= ValMax; i++) {

			String numero = String.valueOf(i);
			char dig1 = numero.charAt(3);
			char dig2 = numero.charAt(2);
			char dig3 = numero.charAt(1);
			char dig4 = numero.charAt(0);

			if (VerificaIgual21(dig1, dig2, dig3, dig4, valorDigitado)) {
				digitos21.add(Integer.parseInt(numero));
			}

		}

		return digitos21;

	}

	public static boolean VerificaIgual21(char n1, char n2, char n3, char n4, int ValorDigitado) {
		String caracter1 = String.valueOf(n1);
		int x1 = Integer.parseInt(caracter1);
		String caracter2 = String.valueOf(n2);
		int x2 = Integer.parseInt(caracter2);
		String caracter3 = String.valueOf(n3);
		int x3 = Integer.parseInt(caracter3);
		String caracter4 = String.valueOf(n4);
		int x4 = Integer.parseInt(caracter4);

		if (x1 > ValorDigitado || x2 > ValorDigitado || x3 > ValorDigitado || x4 > ValorDigitado) {
			return false;
		}

		int soma = x1 + x2 + x3 + x4;

		if (soma == 21) {
			return true;
		} else {
			return false;
		}

	}

}

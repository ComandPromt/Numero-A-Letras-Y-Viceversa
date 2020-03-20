public class Main {

	public static String numeroALetras(int num) {

		int numNegativo = num;

		if (num < 0) {
			num *= -1;
		}

		n2t numero = new n2t(num);

		String resultado = numero.convertirLetras(num);

		if (numNegativo < 0) {
			resultado = "menos " + resultado;
		}

		return resultado;

	}

	public static void main(String[] args) {
		System.out.println(numeroALetras(-222));

	}

}

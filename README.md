# Numero-A-Letras

## Numero A Letras con java (incluye numeros negativos,del 0 al 999.999)

![Preview](previews/1.png)

## Letras A Numeros

![Preview](previews/2.png)

~~~java

	public static long textoALong(String numeroTexto) throws NumberFormatException {

		Map<String, Long> numeros = new HashMap<>();

		numeros.put("cero", 0L);

		numeros.put("uno", 1L);

		numeros.put("dos", 2L);

		numeros.put("tres", 3L);

		numeros.put("cuatro", 4L);

		numeros.put("cinco", 5L);

		numeros.put("seis", 6L);

		numeros.put("siete", 7L);

		numeros.put("ocho", 8L);

		numeros.put("nueve", 9L);

		numeros.put("diez", 10L);

		numeros.put("once", 11L);

		numeros.put("doce", 12L);

		numeros.put("trece", 13L);

		numeros.put("catorce", 14L);

		numeros.put("quince", 15L);

		numeros.put("dieciséis", 16L);

		numeros.put("diecisiete", 17L);

		numeros.put("dieciocho", 18L);

		numeros.put("diecinueve", 19L);

		numeros.put("veinte", 20L);

		numeros.put("treinta", 30L);

		numeros.put("cuarenta", 40L);

		numeros.put("cincuenta", 50L);

		numeros.put("sesenta", 60L);

		numeros.put("setenta", 70L);

		numeros.put("ochenta", 80L);

		numeros.put("noventa", 90L);

		numeros.put("cien", 100L);

		numeros.put("mil", 1000L);

		numeros.put("millón", 1000000L);

		numeros.put("menos", -1L);

		String[] palabras = numeroTexto.split(" ");

		long resultado = 0;

		long parcial = 0;

		boolean esNegativo = false;

		for (String palabra : palabras) {

			if (palabra.equals("y")) {

				continue;

			}

			else if (palabra.equals("menos")) {

				esNegativo = true;

			}

			else {

				Long valor = numeros.get(palabra);

				if (valor == null) {

					throw new NumberFormatException("Palabra no reconocida: " + palabra);

				}

				if (valor == 100) {

					parcial *= 100;

				}

				else if (valor == 1000) {

					resultado += parcial * 1000;

					parcial = 0;

				}

				else if (valor == 1000000) {

					resultado *= 1000000;

				}

				else {

					parcial += valor;

				}

			}

		}

		resultado += parcial;

		return esNegativo ? -resultado : resultado;

	}

~~~
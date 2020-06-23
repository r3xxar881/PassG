
//PassG_v1 By r3xx.


/*Genera contraseñas de 10 digitos, con todo 
  el alfabeto y todos los numero del 0 al 9*/


package Pass_Gen;

import java.util.Random; //Libreria Random.

public class PassG
	{
		public static void main(String args[])
			{
				
				//Se crea la cadena que contendrá los caracteres que queremos para la contraseña:
				String elemento = "abcdefghijklmn\u00f1opqrstuvwxyzABCDEFGHIJKLMN\u00d1OPQRSTUVWXYZ0123456789";
				
				Random aleatorio = new Random(); //Creamos un objeto de la clase "Random".
				
				String pass = ""; //Hacemos una nueva cadena vacia que contendrá a los caracteres concatenados (Osea, la contraseña).
				
				
				//Siclo for que realiza 10 veces una concatenacion de caracteres al azar que los toma segun la posicion con respecto al numero random que generamos.
				for(int i = 0; i < 10; i++)
					{
						int num = aleatorio.nextInt(elemento.length()); //el elemento de tipo Random genera un numero de entre 0 y 64, sin contar el 65.
				
						char caract = elemento.charAt(num); //se toma el caracter ubicado en la posicion del numero generado al azar.
				
						pass += caract; //concatenamos los caracteres.
					}
				
				
				System.out.println("\n");
				System.out.println("?88,.d88b, d888b8b   .d888b, .d888b, d888b8b");
				System.out.println("`?88'  ?88d8P' ?88   ?8b,    ?8b,   d8P' ?88");  
				System.out.println("88b  d8P88b  ,88b    `?8b    `?8b 88b  ,88b");
				System.out.println("888888P'`?88P'`88b`?888P' `?888P' `?88P'`88b");
				System.out.println("88P'                                     )88");
				System.out.println("d88                                      ,88P");
				System.out.println("?8P                                  `?8888P   By r3xx_");
				
				
																   // "\u00f1" = ñ en ASCII.
				System.out.println("\n*Puede usar PassG_v1 para generar contrase\u00f1as aleatorias de 10 digitos.");
				
				
				System.out.println("\nContrase\u00f1a generada!: " + pass); //Imprimimos en pantalla la contraseña.
				
			}
	}


//PassG_v3 By r3xx.


/*Genera contraseñas de X digitos, con todo 
  el alfabeto y todos los numero del 0 al 9, 
  el tiempo de espera para generar la contraseña 
  depende de tu poder de computo*/


package Pass_Gen;

import java.util.Random; //Libreria Random.
import java.util.Scanner;

public class PassG_v3
	{
		
		public static void generar(int x, String cad) //Todo el codigo que genera la cadena o contraseña esta en un procedimiento la cual es llamada mas tarde teniendo en cuenta la cantidad de digitos que quiere el usuario en su contraseña mayores a 8.
			{
				
				Random aleatorio = new Random(); //Creamos un objeto de la clase "Random".
				
				String pass = ""; //Hacemos una nueva cadena vacia que contendrá a los caracteres concatenados (Osea, la contraseña).
				
				
				//Siclo for que realiza x veces una concatenacion de caracteres al azar que los toma segun la posicion con respecto al numero random que generamos.
				for(int i = 0; i < x; i++)
					{
						int num = aleatorio.nextInt(cad.length()); //el elemento de tipo Random genera un numero de entre 0 y la longitud de la cadena de caracteres (en este caso) que especifiquemos.
				
						char caract = cad.charAt(num); //se toma el caracter ubicado en la posicion del numero generado al azar.
				
						pass += caract; //concatenamos los caracteres.
					}
			
				System.out.println("\nContrase\u00f1a generada!: " + pass); //Imprimimos en pantalla la contraseña.
			
			}
		
		
		public static void doWhileFinal(int x2, String XElement) //El procedimeinto es utilizado para preguntar de cuantos caracteres será el Pass.
			{
				Scanner in_Int2 = new Scanner(System.in);
				
				do{
									
					System.out.print("*Cuantos caracteres quiere en su contrase\u00f1a?: "); x2 = in_Int2.nextInt();
									
					if(x2 < 8)
						{
							System.out.println("\n*La cantidad de digitos no es valida para generar una contrase\u00f1a, minimo necesita ser de 8 en adelante.");
						}
								
				}while(x2 < 8);
								
				System.out.println("*Generando...");
				generar(x2, XElement); //Genera e imprime la contraseña.
			}
		
		
		
		
		public static void main(String args[])
			{
				
				Scanner in_Int = new Scanner(System.in);
				
				//Se crea la cadena que contendrá los caracteres que queremos para la contraseña:
				String elementos = "abcdefghijklmn\u00f1opqrstuvwxyzABCDEFGHIJKLMN\u00d1OPQRSTUVWXYZ0123456789";
				String elementosLetraMinMay = "abcdefghijklmn\u00f1opqrstuvwxyzABCDEFGHIJKLMN\u00d1OPQRSTUVWXYZ";
				String elementosLetraMin = "abcdefghijklmn\u00f1opqrstuvwxyz";
				String elementosLetraMay = "ABCDEFGHIJKLMN\u00d1OPQRSTUVWXYZ";
				String elementosNum = "0123456789";
				
				int cantDigitos = 0;
				int eleccion = 0;
				int eleccion2 = 0;
				
				
				System.out.println("\n");
				System.out.println("	?88,.d88b, d888b8b   .d888b, .d888b, d888b8b");
				System.out.println("	`?88'  ?88d8P' ?88   ?8b,    ?8b,   d8P' ?88");  
				System.out.println("	88b  d8P88b  ,88b    `?8b    `?8b 88b  ,88b");
				System.out.println("	888888P'`?88P'`88b`?888P' `?888P' `?88P'`88b");
				System.out.println("	88P'                                     )88");
				System.out.println("	d88                                      ,88P");
				System.out.println("	?8P                                  `?8888P   By r3xx_");
				
																   // "\u00f1" = ñ en ASCII.
				System.out.println("\n*Puede usar PassG_v3 para generar contrase\u00f1as aleatorias de la cantidad de digitos que quiera.\n");
				
				
				do{
					System.out.println("*Que tipo de contrase\u00f1a desea generar?:");
					System.out.println("1-SOLO LETRAS.");
					System.out.println("2-SOLO NUMEROS.");
					System.out.println("3-GENERAR ALEATORIO (Genera una clave con todos los caracteres disponibles).");
					
					System.out.print(">"); eleccion = in_Int.nextInt();
					
					if (eleccion < 1 || eleccion > 3)
						{
							System.out.println("*Esa opcion no es valida.\n");
						}
				}while(eleccion < 1 || eleccion > 3);
					
				
				if(eleccion == 1)
					{
						do{	
							
							System.out.println("*Quiere mayusculas y minusculas, solo mayusculas o solo minusculas?:");
							System.out.println("4-MAYUSCULAS Y MINUSCULAS.");
							System.out.println("5-SOLO MAYUSUCLAS");
							System.out.println("6-SOLO MINUSCULAS");
							
							System.out.print(">"); eleccion2 = in_Int.nextInt();
							
							if(eleccion2 < 4 || eleccion2 > 6 )
								{
									System.out.println("*Esa opcion no es valida.\n");
								}
								
						}while(eleccion2 < 4 || eleccion2 > 6);
						
						if(eleccion2 == 4)
							{
								
								doWhileFinal(cantDigitos, elementosLetraMinMay);
								
							}
						
						if(eleccion2 == 5)
							{
								
								doWhileFinal(cantDigitos, elementosLetraMay);
								
							}
						
						if(eleccion2 == 6)
							{
								
								doWhileFinal(cantDigitos, elementosLetraMin);
								
							}
					}
					
				
				if(eleccion == 2)
					{
						doWhileFinal(cantDigitos, elementosNum);
					}
				
					
					/*if(cantDigitos != int)
						{
							System.out.println("\n*Porfavor ingrese un numero entero como dato valido.");  "Aun en proceso de desarrollo"
						}*/
						
				if(eleccion == 3)
					{
						doWhileFinal(cantDigitos, elementos);
					}
				
			}
	}

/**Su profesora de Teor�a se encuentra dado el tema "Expresiones regulares" y ha decido darle un punto de participacion
   a quien realice un algoritmo en Java que pida una direccion de correo electronico y mediante el uso de expresiones
   regulares diga si dicho direcci�n de correo es valida o no.**/

   import java.util.Scanner; // Para pedir un dato
   import java.util.regex.Matcher; // Libreria para comparar una cadena con una ER
   import java.util.regex.Pattern; // Libreria para establecer la expresi�n regular
   
   public class prueba
   {
     public static void main(String [] args)
     {
       Scanner entrada=new Scanner(System.in); // Para pedir un dato
       System.out.println("Digite el correo que desea validar: ");
       String correo=entrada.nextLine(); // Se le pide al ususario el correo
       System.out.println("\nEl correo que ingreso fue: " + correo);
       String correo_v = "";
       
       /** Verificar que el correo recibido siga la estructura dad�**/
    
       Pattern patron = Pattern.compile("\\w+@(hotmail|gmail|outlook).(com|co|es|org)"); // Se estabece la expresion regular
       Matcher m = patron.matcher(correo); // compara el string "correo" para ver si coincide con la ER
       
       if (m.find())
         System.out.println("El correo electronico es VALIDO.");
        else
         System.out.println("El correo electronico es INVALIDO.");
     }
   }
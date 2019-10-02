import java.util.Scanner; // Para pedir un dato
import java.util.regex.Matcher; // Libreria para comparar una cadena con una ER
import java.util.regex.Pattern; // Libreria para establecer la expresi�n regular

public class prueba
{
  public static void main(String [] args)
  {
    Scanner entrada=new Scanner(System.in); // Para pedir un dato
    do
    {
      System.out.println("Ingrese su contrase�a: ");
      String contrase�a=entrada.nextLine(); 
    
      Pattern patron = Pattern.compile("[A-Z]\\w+(\\d)"); // Se estabece la expresion regular
      Matcher m = patron.matcher(contrase�a); // compara el string "correo" para ver si coincide con la ER
    
    
      System.out.println("Contrase�a Incorrecta. ")
    }while(m.find() != true)
    
      
  }
}
import java.util.Scanner;

public class A1E2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        String NomPais;
        String NomCapital;
        
        //pedir los datos 
        System.out.print("Ingrese el pais: ");
        NomPais = scanner.nextLine();
        System.out.print("Ingrese la capital: ");
        NomCapital = scanner.nextLine();

        System.out.println(NomCapital + " es la capital de: " + NomPais);
    }

}

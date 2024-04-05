import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      Automovil auto = new Automovil();

      System.out.println("Ingrese Marca del automovil");
      String marca = sc.next();
      auto.setMarca(marca);
      System.out.println("Marca ingresada es " + auto.getMarca());



    }
    
}

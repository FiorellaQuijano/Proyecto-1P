/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.proyectopoo;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fiorella Quijano
 */
public class ProyectoPOO {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Menú de opciones:");
        System.out.println("1. Vendedor");
        System.out.println("2. Comprador");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opción: ");
        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                do{
                System.out.println("1. Registrar un nuevo vendedor");
                System.out.println("2. Registrar un nuevo vehículo");
                System.out.println("3. Aceptar oferta");
                System.out.println("4. Regresar");
                System.out.println("Ingrese una opción: ");
                int opcion_vendedor= sc.nextInt();
                switch (opcion_vendedor) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                
                }while(opcion_vendedor ==4);
                break;
            case 2:
                break;
            default:
                System.out.println("Gracias por entrar al sistema");
                break;
        }
    }
}

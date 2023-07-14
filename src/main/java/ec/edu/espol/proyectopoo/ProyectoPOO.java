/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.proyectopoo;

import java.util.Scanner;

/**
 *
 * @author Fiorella Quijano
 */
public class ProyectoPOO {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        boolean bandera1=true;
        while(bandera1){
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Vendedor");
        System.out.println("2. Comprador");
        System.out.println("3. Salir");
        System.out.print("\nIngrese una opción: ");
        try{
            
        
        int opcion= sc.nextInt();
        switch (opcion) {
            case 1:
                Vendedor.menuVendedor(opcion);
                break;
            case 2:
                Comprador.menuComprador(opcion);
                break;
            case 3:
                System.out.println("\nGracias por entrar al sistema");
                bandera1=false;
                break;
            default:
                System.out.println("\nIngrese una opcion correcta\n");
                break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nIngrese un número válido");
            sc.nextLine(); 
        }
        
        
        
    }
        
    }
}

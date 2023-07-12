/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

/**
 *
 * @author Fiorella Quijano
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String organizacion;
    private String correo;
    private String clave;

    public Cliente(String nombre, String apellido, String organizacion, String correo, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.organizacion = organizacion;
        this.correo = correo;
        this.clave = clave;
    }

    public static Cliente nextCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("ingrese apellido: ");
        String apellido = sc.nextLine();
        System.out.println("ingrese organizacion: ");
        String organizacion = sc.nextLine();
        System.out.println("ingrese correo: ");
        String correo = sc.nextLine();
        System.out.println("ingrese clave: ");
        String clave = sc.nextLine();
        
        return new Cliente(nombre,apellido,organizacion,correo,clave);
        
    }
    
}

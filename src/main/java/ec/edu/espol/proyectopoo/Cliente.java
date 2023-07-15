/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Cliente {
    private String nombre;
    private String apellido;
    private String organizacion;
    private String correo;
    private String clave;
    private static ArrayList<Cliente> clientes = new ArrayList<>();


    public Cliente(String nombre, String apellido, String organizacion, String correo, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.organizacion = organizacion;
        this.correo = correo;
        this.clave = clave;
    }
    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }
    

    public static Cliente nextCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("ingrese apellido: ");
        String apellido = sc.nextLine();
        System.out.println("ingrese organizacion: ");
        String organizacion = sc.nextLine();
        String correo1;
        
        do{
            System.out.println("Ingrese correo: ");
            correo1 = sc.nextLine();
            
            boolean correoExistente=false;
            for(Cliente c:clientes){
                if(correo1.equals(c.correo)){
                    System.out.println("Ya existe el correo");
                    correoExistente=true;
                    break;
                }
            
            }
            if(!correoExistente){
                break;
            }
        }while(true);
         
        System.out.println("Ingrese clave: ");
        String clave = sc.nextLine();
        Cliente cliente= new Cliente(nombre,apellido,organizacion,correo1,clave);
        clientes.add(cliente);
        return cliente;
    }
    public static byte[] getSHA(String input)throws NoSuchAlgorithmException{
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    
    }
    public static String toHexString(byte[] hash){
        BigInteger number=new BigInteger(1,hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }

            
        
    

   
}

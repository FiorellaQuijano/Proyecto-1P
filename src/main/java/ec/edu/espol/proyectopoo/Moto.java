/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecu.edu.espol.proyectopoo;

/**
 *
 * @author aquin
 */
public class Moto extends Vehiculo{
    public Moto(String placa, String marca, String modelo, String tipoMotor, int anio, double recorrido, String color, String tipoCombustible, double precio) {
        super(placa, marca, modelo, tipoMotor, anio, recorrido, color, tipoCombustible, precio);
    }
    
    public String toString(){
        return "MOTO,"+super.toString();
    }
    
    public static void agregarVehiculo(Moto m){
        FileWriter fw= null;
        BufferedWriter bfw= null;
        try{
           fw= new FileWriter("Archivo.csv",true);
           bfw= new BufferedWriter(fw);
           bfw.write(m.toString()+"\n");
           System.out.println("\nSe ha registrado correctamente");
        }catch(IOException e){
            System.out.println("\nError abriendo el archivo: " + e);
        }finally {
            try{
                if (bfw != null) {
                    bfw.close();
            }
                if (fw != null) {
                    fw.close();
                }
                
            }catch(IOException e2){
                System.out.println("\nNo se pudo cerrar el archivo: " +e2);
            }
        }
        
    }
    
    
}

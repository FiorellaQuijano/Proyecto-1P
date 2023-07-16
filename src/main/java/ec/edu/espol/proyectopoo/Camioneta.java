/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Fiorella Quijano
 */
public class Camioneta extends Vehiculo{
    private double traccion;
    private String vidrio;
    private String transmicion;

    public Camioneta(double traccion, String vidrio, String transmicion, String placa, String marca, String modelo, String tipoMotor, int anio, double recorrido, String color, String tipoCombustible, double precio) {
        super(placa, marca, modelo, tipoMotor, anio, recorrido, color, tipoCombustible, precio);
        this.traccion = traccion;
        this.vidrio = vidrio;
        this.transmicion = transmicion;
    }

    
    public double getTraccion() {
        return traccion;
    }

    public void setTraccion(double traccion) {
        this.traccion = traccion;
    }
    
    @Override
    public String toString(){
        return "CAMIONETA,"+ super.toString()+","+this.vidrio+ ","+this.transmicion+","+this.traccion;
    }
    
    public static void agregarVehiculo(Camioneta c){
        FileWriter fw= null;
        BufferedWriter bfw= null;
        try{
           fw= new FileWriter("Archivo.csv",true);
           bfw= new BufferedWriter(fw);
           bfw.write(c.toString()+"\n");
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecu.edu.espol.proyectopoo;

/**
 *
 * @author aquin
 */
public class Auto extends Vehiculo{
    
    private String vidrio;
    private String transmicion;
    private String traccion;

    public Auto(String placa, String marca, String modelo, String tipoMotor, int anio, double recorrido, String color, String tipoCombustible,String vidrio, String transmicion, String traccion, double precio) {
        super(placa, marca, modelo, tipoMotor, anio, recorrido, color, tipoCombustible, precio);
        this.vidrio = vidrio;
        this.transmicion = transmicion;
        this.traccion = traccion;
    }
      

  
}

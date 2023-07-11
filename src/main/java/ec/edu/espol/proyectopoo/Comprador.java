/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

import java.util.ArrayList;

/**
 *
 * @author Fiorella Quijano
 */
public class Comprador extends Cliente{
    private static String tipo;
    private ArrayList<Vehiculo> vehiculos;

    public Comprador(String nombre, String apellido, String organizacion, String correo, String clave) {
        super(nombre, apellido, organizacion, correo, clave);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    }
    
    public ArrayList<Vehiculo> busquedaVehiculo(String tipo, double recorrido, int anio, double precio){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
           
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 edit
 
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

 public ArrayList<Vehiculo> busquedaVehiculo(ArrayList<Vehiculo> vehiculos,String tipo, int anioInicio,int anioFin,  double recorridoInicio,double recorridoFin,double precioInicio, double precioFin){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
        
        for(Vehiculo v: vehiculos){
            int a= v.getAnio();
            double r = v.getRecorrido();
            double p = v.getPrecio();
            
            if(tipo.equals("moto")){
                if(v instanceof Moto){
                    if((a>anioInicio && a<anioFin)&&(r>recorridoInicio && r<recorridoFin )&&(p>precioInicio && p<precioFin))
                        vehiculosFiltro.add(v);                    
                }
            }
            else if (tipo.equals("auto")){
                if(v instanceof Auto){
                    if((a>anioInicio && a<anioFin)&&(r>recorridoInicio && r<recorridoFin )&&(p>precioInicio && p<precioFin))
                        vehiculosFiltro.add(v);
                }
            }
            else
                System.out.println("no existe ese tipo de vehiculos en la compañia");
        }
        return vehiculosFiltro;    
    }
    
    public ArrayList<Vehiculo> busquedaVehiculo(ArrayList<Vehiculo> vehiculos,String tipo, double recorridoInicio,double recorridoFin, double precioInicio, double precioFin){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
        
        for(Vehiculo v: vehiculos){
            double r = v.getRecorrido();
            double p = v.getPrecio();
            
            if(tipo.equals("moto")){
                if(v instanceof Moto){
                    if((r>recorridoInicio && r<recorridoFin )&&(p>precioInicio && p<precioFin))
                        vehiculosFiltro.add(v);                    
                }
            }
            else if (tipo.equals("auto")){
                if(v instanceof Auto){
                    if((r>recorridoInicio && r<recorridoFin )&&(p>precioInicio && p<precioFin))
                        vehiculosFiltro.add(v);
                }
            }
            else
                System.out.println("no existe ese tipo de vehiculos en la compañia");
        }
        return vehiculosFiltro;    
    }
    
    public ArrayList<Vehiculo> busquedaVehiculo(ArrayList<Vehiculo> vehiculos,String tipo, double precioInicio, double precioFin){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
        
        for(Vehiculo v: vehiculos){
            double p = v.getPrecio();
            
            if(tipo.equals("moto")){
                if(v instanceof Moto){
                    if(p>precioInicio && p<precioFin)
                        vehiculosFiltro.add(v);                    
                }
            }
            else if (tipo.equals("auto")){
                if(v instanceof Auto){
                    if(p>precioInicio && p<precioFin)
                        vehiculosFiltro.add(v);
                }
            }
            else
                System.out.println("no existe ese tipo de vehiculos en la compañia");
        }
        return vehiculosFiltro;    
    }
    
    public ArrayList<Vehiculo> busquedaVehiculo(ArrayList<Vehiculo> vehiculos,String tipo){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
        
        for(Vehiculo v: vehiculos){
            
            if(tipo.equals("moto")){
                if(v instanceof Moto){
                    vehiculosFiltro.add(v);                    
                }
            }
            else if (tipo.equals("auto")){
                if(v instanceof Auto){
                    vehiculosFiltro.add(v);
                }
            }
            else
                System.out.println("no existe ese tipo de vehiculos en la compañia");
        }
        return vehiculosFiltro;
        
        
    }
    

 
   
}

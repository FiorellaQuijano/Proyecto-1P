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
    

    public Auto(String placa, String marca, String modelo, String tipoMotor, int anio, double recorrido, String color, String tipoCombustible,String vidrio, String transmicion, double precio) {
        super(placa, marca, modelo, tipoMotor, anio, recorrido, color, tipoCombustible, precio);
        this.vidrio = vidrio;
        this.transmicion = transmicion;
        
    }

    public String getVidrio() {
        return vidrio;
    }

    public void setVidrio(String vidrio) {
        this.vidrio = vidrio;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }
    
    @Override
    public String toString(){
        return "AUTO,"+ super.toString()+","+this.vidrio+ ","+this.transmicion;
    }
    
    public static void agregarVehiculo(Auto a){
        FileWriter fw= null;
        BufferedWriter bfw= null;
        try{
           fw= new FileWriter("Archivo.csv",true);
           bfw= new BufferedWriter(fw);
           bfw.write(a.toString()+"\n");
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
      

  
}

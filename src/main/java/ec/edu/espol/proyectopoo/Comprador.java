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

    /*lo resumi en esto */
    
    public ArrayList<Vehiculo> busquedaVehiculo(ArrayList<Vehiculo> vehiculos,Scanner sc){
        
        ArrayList<Vehiculo> vehiculosFiltro = new ArrayList<>();
        
        System.out.println("tipo vehiculo (MOTO/AUTO/CAMIONETA)");
        String tipoV = sc.nextLine();
        System.out.println("tipo año inicio");
        int anioInicio = sc.nextInt();
        sc.nextLine();
        System.out.println("tipo año fin");
        int anioFin = sc.nextInt();
        sc.hasNextLine();
        System.out.println("tipo recorrido incio");
        double recorridoInicio = sc.nextDouble();
        System.out.println("tipo recorido fin");
        double recorridoFin = sc.nextDouble();
        System.out.println("tipo precio inicio");
        double precioInicio = sc.nextDouble();
        System.out.println("tipo precio fin");
        double precioFin = sc.nextDouble();
        
               
        
        for(Vehiculo v: vehiculos){
            int a= v.getAnio();
            double r = v.getRecorrido();
            double p = v.getPrecio();
            
            if(tipoV.equals("MOTO")){
                if(v instanceof Moto){
                    if(((a>anioInicio && a<anioFin)|| anioInicio == 0)&&((r>recorridoInicio && r<recorridoFin )|| recorridoInicio==0)&&((p>precioInicio && p<precioFin)|| precioInicio==0))
                        vehiculosFiltro.add(v);                    
                }
            }
            else if (tipoV.equals("AUTO")){
                if(v instanceof Auto){
                    if(((a>anioInicio && a<anioFin)|| anioInicio == 0)&&((r>recorridoInicio && r<recorridoFin )|| recorridoInicio==0)&&((p>precioInicio && p<precioFin)|| precioInicio==0))
                        vehiculosFiltro.add(v);
                }
            }
            else if (tipoV.equals("CAMIONETA")){
                if(v instanceof Auto){
                    if(((a>anioInicio && a<anioFin)|| anioInicio == 0)&&((r>recorridoInicio && r<recorridoFin )|| recorridoInicio==0)&&((p>precioInicio && p<precioFin)|| precioInicio==0))
                        vehiculosFiltro.add(v);
                }
            }
            else
                if (((a>anioInicio && a<anioFin)|| anioInicio == 0)&&((r>recorridoInicio && r<recorridoFin )|| recorridoInicio==0)&&((p>precioInicio && p<precioFin)|| precioInicio==0))
                    vehiculosFiltro.add(v);
        }
        return vehiculosFiltro;    
    }


 /*
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
*/
    //NUEVO
    @Override
    public String toString(){
        return "COMPRADOR,"+ super.toString();
    }
    
    public static Comprador nextComprador(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombres: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese apellidos: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese organización: ");
        String organizacion = sc.nextLine();
        
        String correo;
        boolean bandera;
        do{
            System.out.print("Ingrese correo: ");
            correo = sc.nextLine();
            bandera= Cliente.validarCorreoUnico(correo);
        }while(bandera);
        
        System.out.print("Ingrese su clave: ");
        String clave = sc.nextLine();
        
        return new Comprador(nombre,apellido,organizacion,correo,clave);
        
    }
    
    public static void menuComprador(int opcion){
        Scanner sc= new Scanner(System.in);
        int opcion_comprador;
        do {
        System.out.println("\n1. Registrar comprador"); 
        System.out.println("2. Ofertar por un vehículo");
        System.out.print("\nIngrese una opción: ");
        try{
        opcion_comprador= sc.nextInt();
        switch(opcion_comprador){
            case 1:
                
                Comprador c= nextComprador();
                agregarComprador(c);
                break;
            case 2:
                
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("\nIngrese una opcion correcta");
                break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nIngrese un número válido\n");
            sc.nextLine();
            opcion_comprador = 0;
            
        }
        
        }while (opcion_comprador < 1 || opcion_comprador > 2);
    }
    
    public static void agregarComprador(Comprador c){
        FileWriter fw= null;
        BufferedWriter bfw= null;
        try{
           fw= new FileWriter("Archivo.csv",true);
           bfw= new BufferedWriter(fw);
           bfw.write(c.toString()+"\n");
     
        }catch(IOException e){
            System.out.println("Error abriendo el archivo: " + e);
        }finally {
            try{
                if (bfw != null) {
                    bfw.close();
            }
                if (fw != null) {
                    fw.close();
                }
            }catch(IOException e2){
                System.out.println("No se pudo cerrar el archivo: " +e2);
            }
        }
        System.out.println("Se ha registrado correctamente");
    }

    public static String buscarLinea(String s){
        String nombreArchivo = "Archivo.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                if (!linea.equals("TipoUsuario,nombres,apellidos,organizacion,correo,clave")) {
                    if(linea.equals(s)){
                        return linea;
                    } 
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("\nNo se encuentra en el sistema");
        return null;
    }
    
    public static void eliminarLinea(String s){
        String nombreArchivo = "Archivo.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                if (!linea.equals("TipoUsuario,nombres,apellidos,organizacion,correo,clave o TipoVehiculo,placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,precio,vidrio,transmicion,traccion")) {
                    if(linea.equals(s)){
                        System.out.println("\nSe eliminó con éxito");
                    } 
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
    }
    
    public static List<String> buscarTipo(String tipo_ingresado){
        List<String> ltipos= new ArrayList<>();
        String nombreArchivo = "Archivo.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                if (!linea.equals("TipoUsuario,nombres,apellidos,organizacion,correo,clave")) {
                    String[] datos = linea.split(",");
                    String tipo= datos[0];
                    if(tipo.equals(tipo_ingresado)){
                        ltipos.add(linea);
                        
                    } 
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return ltipos;
    }
 
    

 
   
}

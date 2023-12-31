/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

/**
 *
 * @author Fiorella Quijano
 */
public class Vehiculo {
  
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String tipoMotor;
    protected int anio;
    protected double recorrido;
    protected String color;
    protected String tipoCombustible;
    protected double precio;
    
    public Vehiculo(String placa, String marca, String modelo, String tipoMotor, int anio, double recorrido, String color, String tipoCombustible, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.anio = anio;
        this.recorrido = recorrido;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getAnio() {
        return anio;
    }

    public double getRecorrido() {
        return recorrido;
    }

    public String getColor() {
        return color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setRecorrido(double recorrido) {
        this.recorrido = recorrido;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static Vehiculo nextVehiculo(){
               
        Scanner sc = new Scanner(System.in);
        boolean bandera;
        
        System.out.print("Ingrese tipo de vechiculo (CARRO/MOTO/CAMIONETA) : ");
        String tipoVehiculo = sc.nextLine();
        do{
        if(tipoVehiculo.equals("CARRO")){
            System.out.print("Ingrese Placa: ");
            String placa = sc.nextLine();
            System.out.print("Ingrese marca: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Ingrese tipo de motor: ");
            String tipoMotor = sc.nextLine();
            System.out.print("Ingrese año: ");
            int anio = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese recorrido: ");
            double recorrido= sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese color: ");
            String color= sc.nextLine();
            System.out.print("Ingrese Tipo combustible: ");
            String tipoCombustible= sc.nextLine();
            System.out.print("Ingrese Tipo vidrios: ");
            String vidrio= sc.nextLine();
            System.out.print("Ingrese Transimicion: ");
            String transmicion= sc.nextLine();
            System.out.print("Ingrese precio: ");
            double precio= sc.nextDouble();
            Vehiculo v1 = new Auto(placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,vidrio,transmicion,precio);
            bandera=false;
            Auto.agregarVehiculo(v1);
            return v1;
        }
        
        else if(tipoVehiculo.equals("MOTO")){
            
            System.out.print("Ingrese Placa: ");
            String placa = sc.nextLine();
            System.out.print("Ingrese marca: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Ingrese tipo de motor: ");
            String tipoMotor = sc.nextLine();
            System.out.print("Ingrese año: ");
            int anio = sc.nextInt();
            System.out.print("Ingrese recorrido: ");
            double recorrido= sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese color: ");
            String color= sc.nextLine();
            System.out.print("Ingrese Tipo combustible: ");
            String tipoCombustible= sc.nextLine();
            System.out.print("Ingrese precio: ");
            double precio= sc.nextDouble();
            Vehiculo v1 = new Moto(placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,precio);
            bandera=false;
            Moto.agregarVehiculo(v1);
            return v1;
            
        }else if(tipoVehiculo.equals("CAMIONETA")){
            System.out.print("Ingrese Placa: ");
            String placa = sc.nextLine();
            System.out.print("Ingrese marca: ");
            String marca = sc.nextLine();
            System.out.print("Ingrese modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Ingrese tipo de motor: ");
            String tipoMotor = sc.nextLine();
            System.out.print("Ingrese año: ");
            int anio = sc.nextInt();
            System.out.print("Ingrese recorrido: ");
            double recorrido= sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese color: ");
            String color= sc.nextLine();
            System.out.print("Ingrese Tipo combustible: ");
            String tipoCombustible= sc.nextLine();
            System.out.print("Ingrese Tipo vidrios: ");
            String vidrio= sc.nextLine();
            System.out.print("Ingrese Transimicion: ");
            String transmicion= sc.nextLine();
            System.out.print("Ingrese Traccion: ");
            double traccion= sc.nextDouble();
            System.out.print("Ingrese precio: ");
            double precio= sc.nextDouble();
            
            Vehiculo v1 = new Camioneta(traccion,vidrio,transmicion,placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,precio);
            bandera=false;
            Camioneta.agregarVehiculo(v1);
            return v1;
        }
    
        else {
            System.out.println("No existe ese tipo de vehivulo en la empresa");
            bandera= true;
            return null;
        }
        }while(bandera);
                    
    }
    
    @Override
    public String toString(){
        return this.placa+","+this.marca+","+this.modelo+","+this.tipoMotor+","+ this.anio+ ","+ this.recorrido+","+this.color+","+this.tipoCombustible+","+this.precio;
    }
    
    public static void agregarVehiculo(Vehiculo v){
        FileWriter fw= null;
        BufferedWriter bfw= null;
        try{
           fw= new FileWriter("Archivo.csv",true);
           bfw= new BufferedWriter(fw);
           bfw.write(v.toString()+"\n");
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

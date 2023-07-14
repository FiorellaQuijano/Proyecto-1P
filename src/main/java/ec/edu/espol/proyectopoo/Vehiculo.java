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
    private String placa;
    private String marca;
    private String modelo;
    private String tipoMotor;
    private int anio;
    private double recorrido;
    private String color;
    private String tipoCombustible;
    private double precio;

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
        
        System.out.println("ingrese tipo de vechiculo (CARRO/MOTO) : ");
        String tipoVehiculo = sc.nextLine();
        
        if(tipoVehiculo.equals(TipoVehiculo.CARRO)){
            System.out.println("ingrese Placa : ");
            String placa = sc.nextLine();
            System.out.println("ingrese marca: ");
            String marca = sc.nextLine();
            System.out.println("ingrese modelo: ");
            String modelo = sc.nextLine();
            System.out.println("ingrese tipo de motor: ");
            String tipoMotor = sc.nextLine();
            System.out.println("ingrese anio: ");
            int anio = sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese recorrido: ");
            double recorrido= sc.nextDouble();
            System.out.println("ingrese color: ");
            String color= sc.nextLine();
            System.out.println("ingrese Tipo combustible: ");
            String tipoCombustible= sc.nextLine();
            System.out.println("ingrese Tipo vidrios: ");
            String vidrio= sc.nextLine();
            System.out.println("ingrese Transimicion: ");
            String transmicion= sc.nextLine();
            System.out.println("ingrese Traccion: ");
            String traccion= sc.nextLine();
            System.out.println("ingrese precio: ");
            double precio= sc.nextDouble();
            Vehiculo v1 = new Auto(placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,vidrio,transmicion,traccion,precio);
            return v1;
        }
        
        else if(tipoVehiculo.equals(TipoVehiculo.MOTO)){
            
            System.out.println("ingrese Placa : ");
            String placa = sc.nextLine();
            System.out.println("ingrese marca: ");
            String marca = sc.nextLine();
            System.out.println("ingrese modelo: ");
            String modelo = sc.nextLine();
            System.out.println("ingrese tipo de motor: ");
            String tipoMotor = sc.nextLine();
            System.out.println("ingrese anio: ");
            int anio = sc.nextInt();
            sc.nextLine();
            System.out.println("ingrese recorrido: ");
            double recorrido= sc.nextDouble();
            sc.nextLine();
            System.out.println("ingrese color: ");
            String color= sc.nextLine();
            System.out.println("ingrese Tipo combustible: ");
            String tipoCombustible= sc.nextLine();            
            System.out.println("ingrese precio: ");
            double precio= sc.nextDouble();
            Vehiculo v1 = new Moto(placa,marca,modelo,tipoMotor,anio,recorrido,color,tipoCombustible,precio);
            return v1;
        }
        else {
            System.out.println("no existe ese tipo de vehivulo en la empresa");
            return null;
        }
                    
    }
    
    @Override
    public String toString(){
        return this.marca+" "+this.modelo+" "+this.tipoMotor+" Precio; "+this.precio;
    }
    

}

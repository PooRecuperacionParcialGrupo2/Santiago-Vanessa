/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pppoo;

/**
 *
 * @author vanes
 */
public class Vehiculos {
   private String placa;
   private String marca;
   private String modelo;
   


    public Vehiculos(String placa, String marca, String modelo){
       this.placa=placa;
       this.marca=marca;
       this.modelo=modelo;
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

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarInfoGeneral() {
        System.out.println("Vehículo/ Placa: "+ placa +" Marca: " + marca );
    }
    
    public abstract void calcularAutonomia();
}
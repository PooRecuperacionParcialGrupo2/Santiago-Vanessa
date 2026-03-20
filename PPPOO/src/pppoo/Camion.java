/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pppoo;

/**
 *
 * @author vanes
 */
public class Camion extends Vehiculos{
    private double capacidadCargaToneladas;

    public Camion(String placa, String marca, double capaciCargaToneladas) {
       super(placa,marca);
       this.capacidadCargaToneladas=capacidadCargaToneladas;
    }
    @Override
    public void calcularAutonomia(){
        double autonomia= 1000/capacidadCargaToneladas;
        System.out.println("calculo por peso: la autonomia del camion es de"  + autonomia + "km");              
    }
    public void asignarRuta(){
        System.out.println("Ruta Estandar asignada. sin destino especifico por el momento");
    }
    
    public void asignarRuta(String atrDestino){
        System.out.println("Ruta  asignada con destino a: "+atrDestino);
    }
    
    public void asignarRuta(String atrDestino, double atrDistanciaKm){
        System.out.println("Ruta  asignada con destino a: "+atrDestino+ "Distancia total: " + atrDistanciaKm+ "km.preparando logistica pesada");
        
    }
}

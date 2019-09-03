package com.udec.Utilitarios;
/**
 * Clase que contiene los datos del objeto Cubo.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Cubo extends Figura3D implements IFiguras{
    /**
     * atributos de la clase.
     */
    private double arista;

    /**
     * Constructor de la clase Cubo.
     * @param arista 
     */
    public Cubo(double arista) {
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    
    /**
     * Metodo implementado de la interfaz IFiguras y especializado para hallar el 
     * area.
     * @return area 
     */
    @Override
    public double hallarArea() {
        return 6*Math.pow(getArista(),2);
    }
    
    /**
     * Metodo implementado de la interfaz IFiguras y especializado para imprimir los datos
     * calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("| Figura: 3D |"+"Cubo "+"| Area: "+hallarArea()+"| Volumen: "+hallarVolumen()+" |");
        System.out.println("|---------------------------------------------------------------------------------------|");
    }
    /**
     * Metodo heredado de la clase Figura3D especializado para hallar el volumen.
     * @return volumen.
     */
    @Override
    public double hallarVolumen() {
        return Math.pow(getArista(), 3);
    }
    
}

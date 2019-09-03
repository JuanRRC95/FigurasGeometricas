package com.udec.Utilitarios;
/**
 * Clase que contiene los datos del objeto Esfera.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Esfera extends Figura3D implements IFiguras {

    /**
     * atributos de la clase.
     */
    private double radio;

    /**
     * Constructor de la clase esfera.
     * @param radio 
     */
    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Metodo implementado de la interfaz IFiguras y especializado para hallar el 
     * area.
     * @return area 
     */
    @Override
    public double hallarArea() {
        return 4*Math.PI*(Math.pow(getRadio(),2));
    }

    /**
     * Metodo implementado de la interfaz IFiguras y especializado para imprimir
     * los datos calculados.
     */
    @Override
    public void imprimirResultados() {
        System.out.println("|----------------------------------------------------------------------------- ---------|");
        System.out.println("| Figura: 3D |"+" Esfera "+"| Area: "+hallarArea()+"| Perimetro: "+hallarVolumen()+" |");
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

    /**
     * Metodo heredado de la clase Figura3D especializado para hallar volumen
     * @return volumen.
     */
    @Override
    public double hallarVolumen() {
        return ((4*Math.PI)/3)*Math.pow(getRadio(),3);
    }
    
}

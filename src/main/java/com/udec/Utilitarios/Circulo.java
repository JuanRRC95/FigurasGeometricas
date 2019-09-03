package com.udec.Utilitarios;
/**
 * Clase que contiene los datos del objeto Circulo.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Circulo extends Figura2D implements IFiguras{
    /**
     * atributos de la clase
     */
    private double radio;

    /**
     * Constructor de la clase Circulo que recibe el radio.
     * @param radio 
     */
    public Circulo(double radio) {
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
        return (Math.pow(getRadio(),2))*Math.PI;
    }

    /**
     * Metodo implementado de la interfaz IFiguras que imprime los datos calculados
     */
    @Override
    public void imprimirResultados() {
        System.out.println("|----------------------------------------------------------------------------- ---------|");
        System.out.println("| Figura: 2D |"+" Circulo "+"| Area: "+hallarArea()+"cm^2"+"| Perimetro: "+hallarPerimetro()+"cm"+" |");
        System.out.println("|---------------------------------------------------------------------------------------|");
    
    }

    /**
     * Metodo heredado de la clase Figura2D y especializado para hallar el perimetro
     * @return perimetro.
     */
    @Override
    public double hallarPerimetro() {
        return 2*Math.PI*getRadio();
    }
   
}

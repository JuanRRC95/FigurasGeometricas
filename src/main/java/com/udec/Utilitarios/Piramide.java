package com.udec.Utilitarios;
/**
 * Clase que contiene los datos del objeto Piramide.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Piramide extends Figura3D implements IFiguras {
    /**
     * Atributos de la clase Piramide
     */
    private double ladoBase;
    private double altura;

    /**
     * Constructor de la clase Piramide que recibe un ladoBase y altura.
     * @param ladoBase
     * @param altura 
     */
    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    /**
     * Metodo implementado de la interfaz IFiguras y especializado para hallar el 
     * area.
     * @return area. 
     */
    @Override
    public double hallarArea() {
        double areaBase = Math.pow(getLadoBase(),2);
        double perimetroBase= 4*getLadoBase();
        double apotema=Math.sqrt((Math.pow(getAltura(),2))+(Math.pow(getAltura()/2,2)));
        double areaLateral=(perimetroBase*apotema)/2;
        return areaLateral+areaBase;
    }

    /**
     * Metodo implementado de la interfaz IFiguras y especializado para imprimir los datos
     * calculados.
     */
    @Override
    public void imprimirResultados() {
        System.out.println("|----------------------------------------------------------------------------- ---------|");
        System.out.println("| Figura: 3D |"+" Piramide "+"| Area: "+hallarArea()+"| Volumen : "+hallarVolumen()+"    |");
        System.out.println("|---------------------------------------------------------------------------------------|");
    
    }

    /**
     * Metodo heredado de la clase Figura3D y especializado para hallar el volumen
     * @return volumen
     */
    @Override
    public double hallarVolumen() {
        double areaBase = Math.pow(getLadoBase(),2);
        return (areaBase*getAltura())/3;
    }
    
}

package com.udec.Utilitarios;
/**
 * Clase que contiene los datos del objeto Cuadrado.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Cuadrado extends Figura2D implements IFiguras{
    /**
     * Atributos de la clase
     */
    private double lado1;   
    private double lado2;
    private String tipo;

    /**
     * contructor de la clase que recibe los lados del cuadrado.
     * @param lado1
     * @param lado2 
     */
    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Metodos Get y Set de la clase. 
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Metodo implementado de la interfaz IFiguras y especializado para hallar
     * el area del cuadrado.
     * @return area.
     */
    @Override
    public double hallarArea() {
        return getLado1()*getLado2();
    }

    /**
     * Metodo implementado de la interfaz y especializado para imprimir los datos
     * calculados.
     */
    @Override
    public void imprimirResultados() {
        if(getLado1()!=getLado2()){
            setTipo("Rectangulo");
        }else{
            setTipo("Cuadrado");
        }
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("| Figura: 2D | "+getTipo()+" | Area: "+hallarArea()+" cm^2"+"| Perimetro: "+hallarPerimetro()+" cm"+"|");
        System.out.println("|---------------------------------------------------------------------------------------|");
    }

    /**
     * Metodo heredado de la clase Figura2D para hallar el perimetro.
     * @return perimetro.
     */
    @Override
    public double hallarPerimetro() {
        return getLado1()*4;
    }

    
    
    
}

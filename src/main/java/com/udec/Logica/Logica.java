package com.udec.Logica;

import com.udec.Utilitarios.Circulo;
import com.udec.Utilitarios.Cuadrado;
import com.udec.Utilitarios.Cubo;
import com.udec.Utilitarios.Esfera;
import com.udec.Utilitarios.IFiguras;
import com.udec.Utilitarios.Piramide;
import com.udec.Utilitarios.Triangulo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que contiene los metodos logicos del programa.
 * @since FiguraGeometrica 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Logica {
    /**
     * atributos globales de la clase.
     */
    List<IFiguras> lista = new ArrayList<IFiguras>();
    Scanner consola = new Scanner(System.in);
    
    public Logica(){
        inicio();
    }
    
    /**
     * Metodo inicio() que contiene el ciclo y la condicional para pedir los datos
     * de las figuras.
     */
    public void inicio(){
        byte opcion=0;
        while(opcion==0){
            menu();
            byte tipo=consola.nextByte();
            switch (tipo){
            case 1: capturaDatosTriangulos();
                break;
            case 2: capturaDatosCuadrado();
                break;
            case 3: capturaDatosCirculos();
                break;
            case 4: capturaDatosPiramide();
                break;
            case 5: capturaDatosCubo();
                break;
            case 6: capturaDatosEsfera();
                break;
            case 0: impresion();
                    opcion=1;
                break;
            default: System.out.println("No es una opcion valida");
            }
        }
    }
    
    /**
     * Metodo que imprime el menu del programa.
     */
    public void menu(){
        System.out.println("|-------------Menu------------|");
        System.out.println("|--Elija una opcion-----------|");
        System.out.println("|-----------Figuras 2D--------|");
        System.out.println("| 1. Triangulo                |");
        System.out.println("| 2. Cuadrado                 |");
        System.out.println("| 3. Circulo                  |");
        System.out.println("|-----------Figuras 3D--------|");
        System.out.println("| 4. Piramide                 |");
        System.out.println("| 5. Cubo                     |");
        System.out.println("| 6. Esfera                   |");
        System.out.println("| 0. Finalizar                |");
        System.out.println("|-----------------------------|");        
    }
    
    /**
     * Metodo que recorre la lista de tipo IFigura y hace casteo de los objetos 
     * que contiene para imprimir los resultados.
     */
    public void impresion(){
        for (IFiguras elemento : lista) {
            if(elemento instanceof Triangulo) {
                ((Triangulo) elemento).imprimirResultados();
            }else if((elemento instanceof Cuadrado)){
                     ((Cuadrado) elemento).imprimirResultados();
                }else if(elemento instanceof Circulo){
                         ((Circulo) elemento).imprimirResultados();
                        }else if(elemento instanceof Piramide){
                                 ((Piramide)elemento).imprimirResultados();
                              }else if (elemento instanceof Cubo){
                                        ((Cubo) elemento).imprimirResultados();
                                    }else if(elemento instanceof Esfera){
                                            ((Esfera)elemento).imprimirResultados();
                                          }else{
                                        System.out.println("No existe el objeto");
                                    }   
        } 
    }
    
    /**
     * Metodo que captura los datos para el triangulo
     */
    public void capturaDatosTriangulos(){
//        System.out.println("Ingrese la base del triangulo : ");
//        double base=consola.nextDouble();
//        System.out.println("Ingrese la altura del triangulo :");
//        double altura=consola.nextDouble();
        System.out.println("Ingrese el lado 1 :");
        double lado1=consola.nextDouble();
        System.out.println("Ingrese el lado 2 :");
        double lado2=consola.nextDouble();
        System.out.println("Ingrese el lado 3 :");
        double lado3=consola.nextDouble();
        //Triangulo triangulo = new Triangulo(base,altura,lado1,lado2,lado3);
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        
        lista.add(triangulo);
    }
    
    /**
     * Metodo que captura los datos para el cuadrado
     */
    public void capturaDatosCuadrado(){
        System.out.println("Ingrese el lado 1  : ");
        double lado1=consola.nextDouble();
        System.out.println("Ingrese el lado 2  : ");
        double lado2=consola.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado1,lado2);
        lista.add(cuadrado);
    }
    
    /**
     * Metodo que captura los datos para el circulo
     */
    public void capturaDatosCirculos(){
        System.out.println("Ingrese el radio del circulo  : ");
        double radio=consola.nextDouble();
        Circulo circulo = new Circulo(radio);
        lista.add(circulo);
        
    }
    
    /**
     * Metodo que captura los datos para la piramide
     */
    public void capturaDatosPiramide(){
        System.out.println("Ingrese un lado de la base : ");
        double ladoBase=consola.nextDouble();
        System.out.println("Ingrese la altura de la piramide : ");
        double altura=consola.nextDouble();
        Piramide piramide = new Piramide(ladoBase,altura);
        lista.add(piramide);
    }
    
    /**
     * Metodo que captura los datos para el cubo.
     */
    public void capturaDatosCubo(){
        
        System.out.println("Ingrese el tamaño de la arista : "+"(Se asumira que el cubo es perfecto)");
        double arista = consola.nextDouble();
        Cubo cubo = new Cubo(arista);
        lista.add(cubo);
        
    }
    
    /**
     * Metodo que captura los datos para la esfera.
     */
    public void capturaDatosEsfera(){
        System.out.println("Ingrese el radio del circulo  : ");
        double radio=consola.nextDouble();
        Esfera esfera = new Esfera(radio);
        lista.add(esfera);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author khalid
 */
public class SopaLetras {

    Random r = new Random();

    public char[][] sopa;

    public SopaLetras(int tam) {
        this.sopa = new char[tam][tam];
    }

    public void rellenarSopa(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = (char) r.nextInt(65, 91);
            }
        }
    }

    public void mostrarSopa(char[][] sopa) {
        System.out.println(sopa);
    }

    public char[][] getSopa() {
        return sopa;
    }

    public void setSopa(char[][] sopa) {
        this.sopa = sopa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SopaLetras{");
        sb.append(", sopa=").append(sopa);
        sb.append('}');
        return sb.toString();
    }
    
    
    public char [][] colocarPalabraHorizontal(){
        
        
    }
    
    public char [][] colocarPalabraHorizontalInvertida(){
        
        
    }
    
    public char [][] colocarPalabraVertical(){
        
        
    }
    
    public char [][] colocarPalabraVerticalInvertida(){
        
        
    }
    
    
    
    
    
    

}

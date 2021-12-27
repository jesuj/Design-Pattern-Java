/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototipoYEstrategia;

/**
 *
 * @author Oni
 */
public class Burbuja implements Ordena{
    int vector[];
    

    public Burbuja(int vector[]) {
        this.vector = vector;
    }
    
    @Override
    public int[] ordenar() {
          int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        return vector;
    }

    @Override
    public Ordena clonar() {
        Burbuja burbu = new Burbuja(this.vector);
        return burbu;
    }

    @Override
    public int[] getVector() {
        return vector;
    }
    
}

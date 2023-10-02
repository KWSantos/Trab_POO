package Modificador;

import Modificador.Modificador;

import java.util.Arrays;
import java.util.Random;
/**
 *   Esta classe que implementa a interface Modificador para embaralhar uma palavra de forma aleatória.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class Randomicamente implements Modificador {
    private char[] word = new char[6];
    private char aux;
    private int index1, index2;
    private Random gerador = new Random();
    @Override
    public String Embaralha(String palavra) {
        word = palavra.toCharArray();
        for(int i = 0; i<6; i++){
            index1 = gerador.nextInt(6);
            index2 = gerador.nextInt(6);
            aux = word[index1];
            word[index1] = word[index2];
            word[index2] = aux;
        }
        palavra = Arrays.toString(word);
        return palavra;
    }

    @Override
    public String getNome() {
        return "Modificador.Randomicamente";
    }
}

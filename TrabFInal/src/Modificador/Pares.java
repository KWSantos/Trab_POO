package Modificador;

import Modificador.Modificador;

import java.util.Random;
/**
 *   Esta classe que implementa a interface Modificador para embaralhar uma palavra selecionando letras em pares.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class Pares implements Modificador {
    private String[] sub = new String[3];
    private int index1, index2, index3 = 0;
    private Random gerador = new Random();
    @Override
    public String Embaralha(String word) {
        sub[0] = word.substring(0, 2);
        sub[1] = word.substring(2, 4);
        sub[2] = word.substring(4, 6);
        index1 = gerador.nextInt(3);
        do{
            index2 = gerador.nextInt(3);
        } while(index2==index1);
        do{
            index3 = gerador.nextInt(3);
        }while (index3==index1 || index3==index2);
        return sub[index1]+sub[index2]+sub[index3];
    }

    @Override
    public String getNome() {
        return "Inverte por pares";
    }
}

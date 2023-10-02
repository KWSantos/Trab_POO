package Modificador;

import Modificador.Modificador;
/**
 *   Esta classe que implementa a interface Modificador para embaralhar uma palavra invertendo suas letras.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class InvertePalavra implements Modificador {
    private String reverse;
    @Override
    public String Embaralha(String word) {
        reverse = new StringBuffer(word).reverse().toString();
        return reverse;
    }

    @Override
    public String getNome() {
        return "Inverte Palavra";
    }
}

package DataBase;

import java.util.ArrayList;
import java.util.Random;

/**
 *   Esta classe que representa uma coleção de palavras.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class ConjuntoPalavras {

    // Um ArrayList para armazenar as palavras na coleção
    private static ArrayList<String> words = new ArrayList<String>();
    // Um gerador de números aleatórios para selecionar palavras
    private static Random gerador = new Random();
    // Bloco de inicialização estática para preencher a coleção inicial de palavras
    static {
        words.add("Feijao"); // Adicionando a palavra "Feijao"
        words.add("Batata"); // Adicionando a palavra "Batata"
        words.add("Alface"); // Adicionando a palavra "Alface"
        words.add("Caviar"); // Adicionando a palavra "Caviar"
        words.add("Pinhao"); // Adicionando a palavra "Pinhao"
        words.add("Rucula"); // Adicionando a palavra "Rucula"
        words.add("Mousse"); // Adicionando a palavra "Mousse"
        words.add("Cereal"); // Adicionando a palavra "Cereal"
        words.add("Nhoque"); // Adicionando a palavra "Nhoque"
        words.add("Nachos"); // Adicionando a palavra "Nachos"
    }
    /**
     * Adiciona uma nova palavra à coleção.
     *
     * @param palavra A palavra a ser adicionada à coleção.
     */
    public void adicionaPalavra(String palavra){
        words.add(palavra);
    }
    /**
     * Retorna uma palavra selecionada aleatoriamente da coleção.
     *
     * @return Uma palavra selecionada aleatoriamente.
     */
    public String word () {
        return words.get(gerador.nextInt(words.size()));
    }
}

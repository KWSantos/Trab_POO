package Modificador;
/**
 *   Esta interface que define os métodos necessários para um modificador de palavras.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public interface Modificador {
    /**
     * Embaralha uma palavra de acordo com a lógica do modificador.
     *
     * @param palavra A palavra a ser embaralhada.
     * @return A palavra embaralhada.
     */
    public String Embaralha(String palavra);
    /**
     * Obtém o nome do modificador.
     *
     * @return O nome do modificador.
     */
    public String getNome();
}

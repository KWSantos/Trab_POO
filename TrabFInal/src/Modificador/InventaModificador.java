package Modificador;

/**
 *   Esta classe que escolhe um modificador de embaralhamento com base no nível especificado.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class InventaModificador {
    InvertePalavra inverse1 = new InvertePalavra();
    Pares inverse2 = new Pares();
    Randomicamente inverse3 = new Randomicamente();

    /**
     * Escolhe um modificador de embaralhamento com base no nível.
     *
     * @param nivel O nível de dificuldade escolhido.
     * @param palavra A palavra a ser embaralhada.
     * @return A palavra embaralhada.
     */
    public String escolheEmbaralha(int nivel, String palavra){
        switch (nivel){
            case 1:
                palavra = inverse1.Embaralha(palavra);
                break;
            case 2:
                palavra = inverse2.Embaralha(palavra);
                break;
            case 3:
                palavra = inverse3.Embaralha(palavra);
                break;
        }
        return palavra;
    }
}

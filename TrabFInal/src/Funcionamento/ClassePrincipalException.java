package Funcionamento;

/**
 *   Uma exceção personalizada que representa um problema na classe principal.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class ClassePrincipalException extends RuntimeException{
    /**
     * Construtor que cria uma exceção com a mensagem fornecida.
     *
     * @param message A mensagem que descreve a exceção.
     */
    public ClassePrincipalException(String message) {
        super(message);
    }
}

package Funcionamento;

import Funcionamento.FuncionamentoModificador;

/**
 *   Esta classe que gera instâncias de FuncionamentoModificador com base em um modo específico.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class InventaFuncionamentoModificador {
    private int modo;
    /**
     * Construtor que define o modo de funcionamento desejado.
     *
     * @param modo O modo de funcionamento.
     */
    public InventaFuncionamentoModificador(int modo){
        this.modo = modo;
    }
    /**
     * Obtém uma instância de FuncionamentoModificador com base no modo definido.
     *
     * @param palavra A palavra a ser utilizada no jogo.
     * @return Uma instância de FuncionamentoModificador.
     */
    public FuncionamentoModificador getFuncionamento(String palavra){
        switch (modo){
            case 1:
                return new MaximoTresTentativas(palavra);
            case 2:
                return new ErrouAcabou(palavra);
        }
        return new MaximoTresTentativas(palavra);
    }
}

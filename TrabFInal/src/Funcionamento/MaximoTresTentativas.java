package Funcionamento;

import Funcionamento.FuncionamentoModificador;
import Modificador.Modificador;

/**
 *   Esta classe implementa a interface FuncionamentoModificador e representa o
 *   funcionamento do jogo "MaximoTresTentativas".
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class MaximoTresTentativas implements FuncionamentoModificador {
    private String palavra;
    /**
     * Construtor que define a palavra a ser adivinhada.
     *
     * @param palavra A palavra a ser adivinhada no jogo.
     */
    public MaximoTresTentativas(String palavra){
        this.palavra = palavra;
    }
    private int vidas = 3, pontuacao = 0;

    @Override
    public String getPalavraCerta() {
        return palavra;
    }

    @Override
    public String getNome() {
        return "Abracadabra";
    }
    @Override
    public String getDesc() {
        return "Neste jogo voce tera de decifrar qual e a palavra embaralhada em 3 tentativas.\nTema: Comidas.";
    }

    @Override
    public boolean acertou(String chute) {
        if(chute.equalsIgnoreCase(palavra)){
            pontuacao += 50;
            return true;
        }
        else{
            pontuacao -= 50;
            vidas--;
            return false;
        }
    }
    @Override
    public int getTentativas() {
        return vidas;
    }
    @Override
    public boolean finalizou() {
        if(getTentativas()==0){
            return true;
        }
        else  return false;
    }

    @Override
    public int pontuacao() {
        return pontuacao;
    }

    @Override
    public String getModificador(Modificador modificador) {
        return modificador.getNome();
    }
}

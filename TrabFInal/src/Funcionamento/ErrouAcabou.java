package Funcionamento;

import Funcionamento.FuncionamentoModificador;
import Modificador.Modificador;

/**
 *   Esta classe implementa a interface FuncionamentoModificador
 *   e representa o funcionamento do jogo "Errou, acabou!".
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class ErrouAcabou implements FuncionamentoModificador {
    private String palavra;

    /**
     * Construtor que define a palavra a ser adivinhada.
     *
     * @param palavra A palavra a ser adivinhada no jogo.
     */
    public ErrouAcabou(String palavra){
        this.palavra = palavra;
    }
    private int vidas = 1, pontuacao = 0;
    /**
     * Obtém a palavra correta que deve ser adivinhada.
     *
     * @return A palavra correta.
     */
    public String getPalavraCerta() {
        return palavra;
    }
    @Override
    public String getNome() {
        return "Errou, acabou!";
    }

    @Override
    public String getDesc() {
        return "Neste jogo voce tera de decifrar qual e a palavra embaralhada em 1 tentativas.\nTema: Comidas.";
    }

    /**
     * Verifica se o chute do jogador está correto.
     *
     * @param chute O chute feito pelo jogador.
     * @return True se o chute estiver correto, False caso contrário.
     */
    public boolean acertou(String chute) {
        if(chute.equalsIgnoreCase(getPalavraCerta())){
            System.out.println("Parabens, voce acertou!");
            pontuacao += 50;
            return true;
        }
        else{
            System.out.println("Que pena, voce errou!!");
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

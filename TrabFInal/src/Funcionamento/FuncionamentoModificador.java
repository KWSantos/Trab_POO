package Funcionamento;

import Modificador.Modificador;

/**
 *   Esta interface que define os métodos necessários para o funcionamento do jogo com modificadores.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public interface FuncionamentoModificador {
    /**
     * Obtém o nome do jogo.
     *
     * @return O nome do jogo.
     */
    public String getNome();
    /**
     * Obtém uma descrição do jogo.
     *
     * @return Uma descrição do jogo.
     */
    public String getDesc();
    /**
     * Verifica se o jogo foi finalizado.
     *
     * @return True se o jogo foi finalizado, False caso contrário.
     */
    public boolean finalizou();
    /**
     * Verifica se o chute feito pelo jogador está correto.
     *
     * @param chute O chute feito pelo jogador.
     * @return True se o chute estiver correto, False caso contrário.
     */
    public boolean acertou(String chute);
    /**
     * Obtém o número de tentativas restantes no jogo.
     *
     * @return O número de tentativas restantes.
     */
    public int getTentativas();
    /**
     * Obtém a pontuação atual no jogo.
     *
     * @return A pontuação atual.
     */
    public int pontuacao();
    /**
     * Obtém a palavra correta que deve ser adivinhada no jogo.
     *
     * @return A palavra correta a ser adivinhada.
     */
    public String getPalavraCerta();
    /**
     * Obtém o nome do modificador utilizado no jogo.
     *
     * @param modificador O modificador a ser obtido o nome.
     * @return O nome do modificador.
     */
    public String getModificador(Modificador modificador);
}

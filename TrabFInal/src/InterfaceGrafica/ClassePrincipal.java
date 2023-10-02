package InterfaceGrafica;

import DataBase.ConjuntoPalavras;
import Funcionamento.ClassePrincipalException;
import Funcionamento.FuncionamentoModificador;
import Funcionamento.InventaFuncionamentoModificador;
import Modificador.InventaModificador;
import java.util.Scanner;
/**
 *   Esta classe é a principal que executa a interface gráfica do jogo.
 *   @author Brenda, Kauê e Vanessa
 *   @version 1.0
 */
public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int nivel, modo, simnao;
        String chute, certa, embaralhada, palavraAdicionada;
        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();
        certa = conjuntoPalavras.word();
        InventaModificador inventaModificador = new InventaModificador();
        System.out.println("Deseja adiconar palavras ao nosso banco de dados? S - 1/N - 2");
        simnao = c.nextInt();
        try{
            if(simnao==1){
                palavraAdicionada = c.next();
                validateWordLength(palavraAdicionada);
                conjuntoPalavras.adicionaPalavra(palavraAdicionada);
            }
        } catch (ClassePrincipalException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("Escolha um nivel: ");
        System.out.println("1 - Facil \n2 - Medio \n3 - Dificil");
        nivel = c.nextInt();
        System.out.println("Escolha um modo: ");
        System.out.println("1 - Maximo tres tentivas. \n2 - Errou acabou.");
        modo = c.nextInt();
        InventaFuncionamentoModificador inventaFuncionamentoModificador = new InventaFuncionamentoModificador(modo);
        FuncionamentoModificador funcionamentoModificador = inventaFuncionamentoModificador.getFuncionamento(certa);
        embaralhada = inventaModificador.escolheEmbaralha(nivel, certa);
        System.out.println("Nome do modo: "+funcionamentoModificador.getNome());
        System.out.println("Descricao: "+funcionamentoModificador.getDesc());
        while(true) {
            System.out.println("Numero de tentativas: "+funcionamentoModificador.getTentativas());
            System.out.println("Palavra embaralhada: " + embaralhada );
            System.out.println("Numero de pontos do jogador: "+funcionamentoModificador.pontuacao());
            System.out.print("De o seu chute: ");
            try{
                chute = c.next();
                validateWordLength(chute);
                if(funcionamentoModificador.acertou(chute)){
                    System.out.println("Jogo encerrado!");
                    break;
                }
            } catch (ClassePrincipalException e){
                System.out.println("Erro: "+ e.getMessage());
            }
            if(funcionamentoModificador.finalizou()){
                System.out.println("Jogo encerrado!");
                break;
            }
        }
    }

    public static void validateWordLength(String word) throws ClassePrincipalException {
        if (word.length() != 6) {
            throw new ClassePrincipalException("A palavra deve ter 6 caracteres.");
        }
    }
}
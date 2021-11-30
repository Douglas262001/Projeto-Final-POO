import javax.swing.*;
import java.time.LocalDate;

public class GerenciadorPartidaImplementacao implements GerenciadorPartida {

    @Override
    public Partida iniciarPartida(String nomeAdversario, LocalDate dataPartida, Atleta[] atletas) {

        Partida novaPartida = new Partida();

        JOptionPane.showMessageDialog(null, "** Partida Iniciada **" +
                "\n" + " Adversário: " + nomeAdversario +
                "\n" + "Data da Partida: " + dataPartida);

        for (int i = 0; i < atletas.length; i++){
            JOptionPane.showMessageDialog(null, "** Escalação **" +
                    "\n" + "Numero da Camisa: " + atletas[i].getNumeroCamisa() +
                    "\n" + "Nome: " + atletas[i].getNome());
        }
        return novaPartida;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        return tipoEvento;
    }

    @Override
    public Atleta ImprimirEstatisticas(Atleta[] atletas) {

        System.out.println("** Estatiscas dos Atletas **" + "\n");

        for(int i = 0; i < atletas.length; i++){
            System.out.println("Nome: " + atletas[i].getNome());
            System.out.println("Número da Camisa: " + atletas[i].getNumeroCamisa());
            System.out.println("Salário: " + atletas[i].getSalarioMensal());
            System.out.println("Data de Admissão: " + atletas[i].getDataAdmissao());
            System.out.println("Cartões Amarelos: " + atletas[i].getCartoesAmarelos());
            System.out.println("Cartões Vermelhos: " + atletas[i].getCartoesVermelho());
            System.out.println("Faltas Cometidas: " + atletas[i].getFaltasCometidas());

            if (atletas[i] instanceof Goleiro){
                Goleiro goleiro = (Goleiro) atletas[i];
                System.out.println("Número de Defesas: " + goleiro.getNumeroDefesas());
            }
            if (atletas[i] instanceof  Defensor){
                Defensor defensor = (Defensor) atletas[i];
                System.out.println("Partidas sem sofrer Gols: " + defensor.getPartidasSemSofrerGols());
                System.out.println("Bolas Roubadas: " + defensor.getBolasRoubadas());
            }
            if (atletas[i] instanceof Atacante) {
                Atacante atacante = (Atacante) atletas[i];
                System.out.println("Finalizações: " + atacante.getNumeroFinalisacoes());
                System.out.println("Número de Gols: " + atacante.getNumeroDeGols());
            }
            if (atletas[i] instanceof  MeioCampista){
                MeioCampista meioCampo = (MeioCampista) atletas[i];
                System.out.println("Assistências: " + meioCampo.getNumeroAssistencias());
                System.out.println("Número de Passes: " + meioCampo.getNumeroPasses());
                System.out.println("Passes Errados: " + meioCampo.getPassesErrados());
            }
            System.out.println("------------------\n");
        }
        return null;
    }

}
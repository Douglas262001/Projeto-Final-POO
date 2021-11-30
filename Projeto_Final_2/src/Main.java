import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Goleiro goleiro1 = new Goleiro();
        goleiro1.setNome("Diego Alves");
        goleiro1.setNumeroCamisa(1);
        goleiro1.setSalarioMensal(450000.0);
        goleiro1.setDataAdmissao(LocalDate.of(2019, 1, 26));
        goleiro1.setCartoesAmarelos(3);
        goleiro1.setCartoesVermelho(0);
        goleiro1.setFaltasCometidas(3);
        goleiro1.setNumeroDefesas(78);
        goleiro1.setPartidasSemSofrerGols(18);
        goleiro1.setBolasRoubadas(0);

        Defensor defensor1 = new Defensor();
        defensor1.setNome("Felipe Luis");
        defensor1.setNumeroCamisa(16);
        defensor1.setSalarioMensal(450000.0);
        defensor1.setDataAdmissao(LocalDate.of(2019, 1, 26));
        defensor1.setCartoesAmarelos(0);
        defensor1.setCartoesVermelho(0);
        defensor1.setFaltasCometidas(10);
        defensor1.setPartidasSemSofrerGols(18);
        defensor1.setBolasRoubadas(54);

        Defensor defensor2 = new Defensor();
        defensor2.setNome("Isla");
        defensor2.setNumeroCamisa(44);
        defensor2.setSalarioMensal(450000.0);
        defensor2.setDataAdmissao(LocalDate.of(2019, 1, 26));
        defensor2.setCartoesAmarelos(2);
        defensor2.setCartoesVermelho(0);
        defensor2.setFaltasCometidas(19);
        defensor2.setPartidasSemSofrerGols(18);
        defensor2.setBolasRoubadas(49);

        Defensor defensor3 = new Defensor();
        defensor3.setNome("Rodigo Caio");
        defensor3.setNumeroCamisa(3);
        defensor3.setSalarioMensal(450000.0);
        defensor3.setDataAdmissao(LocalDate.of(2019, 1, 26));
        defensor3.setCartoesAmarelos(0);
        defensor3.setCartoesVermelho(0);
        defensor3.setFaltasCometidas(0);
        defensor3.setPartidasSemSofrerGols(18);
        defensor3.setBolasRoubadas(0);

        Defensor defensor4 = new Defensor();
        defensor4.setNome("David Luis");
        defensor4.setNumeroCamisa(23);
        defensor4.setSalarioMensal(450000.0);
        defensor4.setDataAdmissao(LocalDate.of(2019, 1, 26));
        defensor4.setCartoesAmarelos(0);
        defensor4.setCartoesVermelho(0);
        defensor4.setFaltasCometidas(0);
        defensor4.setPartidasSemSofrerGols(18);
        defensor4.setBolasRoubadas(58);

        MeioCampista meioCampista1 = new MeioCampista();
        meioCampista1.setNome("Wilian Arão");
        meioCampista1.setNumeroCamisa(5);
        meioCampista1.setSalarioMensal(450000.0);
        meioCampista1.setDataAdmissao(LocalDate.of(2018, 1, 26));
        meioCampista1.setCartoesAmarelos(2);
        meioCampista1.setCartoesVermelho(0);
        meioCampista1.setFaltasCometidas(18);
        meioCampista1.setNumeroAssistencias(3);
        meioCampista1.setNumeroPasses(200);
        meioCampista1.setPassesErrados(9);

        MeioCampista meioCampista2 = new MeioCampista();
        meioCampista2.setNome("Andreas Pereira");
        meioCampista2.setNumeroCamisa(18);
        meioCampista2.setSalarioMensal(450000.0);
        meioCampista2.setDataAdmissao(LocalDate.of(2021, 1, 26));
        meioCampista2.setCartoesAmarelos(1);
        meioCampista2.setCartoesVermelho(0);
        meioCampista2.setFaltasCometidas(6);
        meioCampista2.setNumeroAssistencias(12);
        meioCampista2.setNumeroPasses(220);
        meioCampista2.setPassesErrados(13);

        MeioCampista meioCampista3 = new MeioCampista();
        meioCampista3.setNome("Arrascaeta");
        meioCampista3.setNumeroCamisa(14);
        meioCampista3.setSalarioMensal(450000.0);
        meioCampista3.setDataAdmissao(LocalDate.of(2019, 1, 26));
        meioCampista3.setCartoesAmarelos(1);
        meioCampista3.setCartoesVermelho(0);
        meioCampista3.setFaltasCometidas(8);
        meioCampista3.setNumeroAssistencias(25);
        meioCampista3.setNumeroPasses(235);
        meioCampista3.setPassesErrados(10);

        Atacante atacante1 = new Atacante();
        atacante1.setNome("Everton Ribeiro");
        atacante1.setNumeroCamisa(7);
        atacante1.setSalarioMensal(450000.0);
        atacante1.setDataAdmissao(LocalDate.of(2018, 1, 26));
        atacante1.setCartoesAmarelos(0);
        atacante1.setCartoesVermelho(0);
        atacante1.setFaltasCometidas(12);
        atacante1.setNumeroAssistencias(15);
        atacante1.setNumeroPasses(201);
        atacante1.setPassesErrados(26);
        atacante1.setNumeroFinalisacoes(13);
        atacante1.setNumeroDeGols(9);

        Atacante atacante2 = new Atacante();
        atacante2.setNome("Bruno Henrique");
        atacante2.setNumeroCamisa(27);
        atacante2.setSalarioMensal(450000.0);
        atacante2.setDataAdmissao(LocalDate.of(2019, 1, 26));
        atacante2.setCartoesAmarelos(1);
        atacante2.setCartoesVermelho(0);
        atacante2.setFaltasCometidas(10);
        atacante2.setNumeroAssistencias(22);
        atacante2.setNumeroPasses(190);
        atacante2.setPassesErrados(22);
        atacante2.setNumeroFinalisacoes(54);
        atacante2.setNumeroDeGols(26);

        Atacante atacante3 = new Atacante();
        atacante3.setNome("Gabigol");
        atacante3.setNumeroCamisa(9);
        atacante3.setSalarioMensal(450000.0);
        atacante3.setDataAdmissao(LocalDate.of(2019, 1, 26));
        atacante3.setCartoesAmarelos(5);
        atacante3.setCartoesVermelho(2);
        atacante3.setFaltasCometidas(16);
        atacante3.setNumeroAssistencias(15);
        atacante3.setNumeroPasses(165);
        atacante3.setPassesErrados(40);
        atacante3.setNumeroFinalisacoes(82);
        atacante3.setNumeroDeGols(35);

        Atleta[] atletas = new Atleta[11];
        atletas[0] = goleiro1;
        atletas[1] = defensor1;
        atletas[2] = defensor2;
        atletas[3] = defensor3;
        atletas[4] = defensor4;
        atletas[5] = meioCampista1;
        atletas[6] = meioCampista2;
        atletas[7] = meioCampista3;
        atletas[8] = atacante1;
        atletas[9] = atacante2;
        atletas[10] = atacante3;

        GerenciadorPartidaImplementacao gerenciador = new GerenciadorPartidaImplementacao();

        gerenciador.iniciarPartida("Palmeiras", LocalDate.of(2021,11,27), atletas);

        for (int i = 0; i < atletas.length - 1; i++){

            for (int j = i + 1; j < atletas.length; j++){

                if (atletas[j].getNumeroCamisa() == atletas[i].getNumeroCamisa()){
                    JOptionPane.showMessageDialog(null, "Verifique as camisas!");

                }
            }
        }

        JOptionPane.showMessageDialog(null, "Começa o primeiro tempo");

        JOptionPane.showMessageDialog(null, "Final do primeiro tempo");

        JOptionPane.showMessageDialog(null, "Começa o segundo tempo");

        JOptionPane.showMessageDialog(null, "Final do segundo tempo");

        gerenciador.ImprimirEstatisticas(atletas);
    }
}
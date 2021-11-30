import java.time.LocalDate;

public interface GerenciadorPartida {

    Partida iniciarPartida(String nomeAdversario, LocalDate dataPartida, Atleta[] atletas);

    TipoEvento registrarEvento(TipoEvento tipoEvento);

    Atleta ImprimirEstatisticas(Atleta[] atletas);

}
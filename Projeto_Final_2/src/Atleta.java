import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class Atleta extends GerenciadorPartidaImplementacao{

    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private int numeroCamisa;
    private double salarioMensal;
    private LocalDate dataAdmissao;
    private int cartoesAmarelos;
    private int cartoesVermelho;
    private int faltasCometidas;

    public Atleta() {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
        this.salarioMensal = salarioMensal;
        this.dataAdmissao = dataAdmissao;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelho = cartoesVermelho;
        this.faltasCometidas = faltasCometidas;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case CARTAO_AMARELO: setCartoesAmarelos(getCartoesAmarelos()+1);
                System.out.println(getNome() + " recebeu um cartão amarelo!!");
                break;
            case CARTAO_VERMELHO: setCartoesVermelho(getCartoesVermelho()+1);
                System.out.println(getNome() + " recebeu um cartão vermelho!!");
                break;
            case FALTA_COMETIDA: setFaltasCometidas(getFaltasCometidas()+1);
                System.out.println(getNome() + " cometeu uma falta!!");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getDataAdmissao() {
        return formatoData.format(dataAdmissao);
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public int getCartoesVermelho() {
        return cartoesVermelho;
    }

    public void setCartoesVermelho(int cartoesVermelho) {
        this.cartoesVermelho = cartoesVermelho;
    }

    public int getFaltasCometidas() {
        return faltasCometidas;
    }

    public void setFaltasCometidas(int faltasCometidas) {
        this.faltasCometidas = faltasCometidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atleta atleta = (Atleta) o;
        return numeroCamisa == atleta.numeroCamisa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCamisa);
    }
}
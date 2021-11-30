public class Atacante extends MeioCampista{

    private int numeroDeGols;
    private int numeroFinalisacoes;

    public Atacante() {
        super();
        this.numeroDeGols = numeroDeGols;
        this.numeroFinalisacoes = numeroFinalisacoes;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case GOL: setNumeroDeGols(getNumeroDeGols()+1); setNumeroFinalisacoes(getNumeroFinalisacoes()+1);
                System.out.println("Goool do Mengão, " + getNome() + " é deleeeee");
                break;
            case FINALIZACAO: setNumeroFinalisacoes(getNumeroFinalisacoes()+1);
                System.out.println("Foi quasee " + getNome() + ", quase altera o placar");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroDeGols() {
        return numeroDeGols;
    }

    public void setNumeroDeGols(int numeroDeGols) {
        this.numeroDeGols = numeroDeGols;
    }

    public int getNumeroFinalisacoes() {
        return numeroFinalisacoes;
    }

    public void setNumeroFinalisacoes(int numeroFinalisacoes) {
        this.numeroFinalisacoes = numeroFinalisacoes;
    }
}
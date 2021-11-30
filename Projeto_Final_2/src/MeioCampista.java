public class MeioCampista extends Atleta{

    private int numeroAssistencias;
    private int numeroPasses;
    private int passesErrados;

    public MeioCampista() {
        super();
        this.numeroAssistencias = numeroAssistencias;
        this.numeroPasses = numeroPasses;
        this.passesErrados = passesErrados;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case ASSISTENCIA: setNumeroAssistencias(getNumeroAssistencias()+1);
                System.out.println(getNome() + " deu uma assistencia!");
                break;
            case PASSE_CERTO: setNumeroPasses(getNumeroPasses()+1);
                System.out.println("Passe certo de " + getNome());
                break;
            case PASSE_ERRADO: setPassesErrados(getPassesErrados()+1);setNumeroPasses(getNumeroPasses()+1);
                System.out.println("Passe errado de "+getNome());
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroAssistencias() {
        return numeroAssistencias;
    }

    public void setNumeroAssistencias(int numeroAssistencias) {
        this.numeroAssistencias = numeroAssistencias;
    }

    public int getNumeroPasses() {
        return numeroPasses;
    }

    public void setNumeroPasses(int numeroPasses) {
        this.numeroPasses = numeroPasses;
    }

    public int getPassesErrados() {
        return passesErrados;
    }

    public void setPassesErrados(int passesErrados) {
        this.passesErrados = passesErrados;
    }
}
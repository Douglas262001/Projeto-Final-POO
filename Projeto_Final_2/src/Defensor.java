public class Defensor extends Atleta{

    private int partidasSemSofrerGols;
    private int bolasRoubadas;

    public Defensor() {
        super();
        this.partidasSemSofrerGols = partidasSemSofrerGols;
        this.bolasRoubadas = bolasRoubadas;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case ROUBADA_DE_BOLA: setBolasRoubadas(getBolasRoubadas()+1);
                System.out.println(getNome() + "realizou uma roubada de bola!");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getPartidasSemSofrerGols() {
        return partidasSemSofrerGols;
    }

    public void setPartidasSemSofrerGols(int partidasSemSofrerGols) {
        this.partidasSemSofrerGols = partidasSemSofrerGols;
    }

    public int getBolasRoubadas() {
        return bolasRoubadas;
    }

    public void setBolasRoubadas(int bolasRoubadas) {
        this.bolasRoubadas = bolasRoubadas;
    }
}
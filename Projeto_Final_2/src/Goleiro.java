public class Goleiro extends Defensor{

    private int numeroDefesas;

    public Goleiro() {
        super();
        this.numeroDefesas = numeroDefesas;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento) {
            case DEFESA:setNumeroDefesas(getNumeroDefesas() + 1);
                System.out.println(getNome() + " defendeu como um gato! ");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroDefesas() {
        return numeroDefesas;
    }

    public void setNumeroDefesas(int numeroDefesas) {
        this.numeroDefesas = numeroDefesas;
    }
}
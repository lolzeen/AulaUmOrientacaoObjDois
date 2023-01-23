public class Ornitorrinco extends Animal {
    private boolean temAsas;
    public boolean isTemAsas() {
        return temAsas;
    }

    public void setTemAsas(boolean temAsas) {
        this.temAsas = temAsas;
    }
    public void voar() {
        System.out.println("Voando baixo");
    }
    public void nadar() {
        System.out.println("Nadando");
    }
}

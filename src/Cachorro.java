public class Cachorro extends Animal implements AnimalQueAnda, AnimalQueNada {

    @Override
    public int obterNumeroDePernas() {
        return 4;
    }

    @Override
    public void nadar() {
        System.out.println("Nadando estilo cachorro");
    }
}

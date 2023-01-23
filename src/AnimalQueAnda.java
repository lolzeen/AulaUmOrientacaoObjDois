public interface AnimalQueAnda {
    // não precisa colocar modificador de acesso, sempre é public e abstract
    int obterNumeroDePernas();
    default void andar() {
        System.out.println("Andando");
    }
}

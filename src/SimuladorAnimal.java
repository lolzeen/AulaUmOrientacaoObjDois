import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SimuladorAnimal {
    public static void main(String[] args) {

        Animal cao = new Cachorro();
        Animal nemo = new Peixe();
        Animal perry = new Ornitorrinco();
        Animal garfield = new Gato();
        Animal loro = new Papagaio();

        List listaAnimais = Arrays.asList(cao, nemo, perry, garfield, loro);

        for (Object animal : listaAnimais) {
            // para cada animal em listaAnimais retorna um animal
            printAtributos((Animal) animal);
        }
    }
    public static void printAtributos(Animal animal) {
        // como o metodo toString foi definido é só passar o animal
//        System.out.println(animal);
//        if (animal.isTemAsas()) {
//            animal.voar();
//        }
    }
}

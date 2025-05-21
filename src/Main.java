//Estoy practicando sobre Clases Abstractas y Interfaces.
public class Main {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Pikachu pikachu=new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();

        squirtle.atacarBurbuja();
        bulbasaur.atacarPlacaje();
        pikachu.atacarImpactrueno();
        charmander.atacarLanzallamas();

    }
}
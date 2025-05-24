//Estoy practicando sobre Clases Abstractas y Interfaces.
//Este juego se trata de tirar los diferentes ataqueques que tiene los pokemones
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

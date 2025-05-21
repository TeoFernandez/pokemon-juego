import Interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Mordizco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParaliza() {
        System.out.println("Hola soy Bulbasur y este es mi ataque Mordizco");
    }
}

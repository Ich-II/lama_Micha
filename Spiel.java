import greenfoot.*;

public class Spiel extends UIWorld{
    
    public Spiel() {
        super(1199, 799); //1 Abstand f�r wei�en Rand
        
        addScene(new Spielregeln());
        addScene(new Spieltisch());
        addScene(new Startscreen());
        addScene(new Ergebnis());
        
        useScene(Spieltisch.class);
    }
}

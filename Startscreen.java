import greenfoot.*;  

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Startscreen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Startscreen extends Scene
{
    /**
     * Erstellt einen Startscreen
     */
    public Startscreen() {
        super("Scenes/Startscreen/Startscreen.png");
        
        addElement(new Button(500, 400, "NeueRundeButton/default.png") {
                void onClick() {
                    world.useScene(Spieltisch.class);
                    //Spielelogik
                    //neue Runde
                }
            });
        addElement(new Button(700, 400, "NeuesSpielButton/default.png") {
                void onClick() {
                    world.useScene(Spieltisch.class);
                    //Spielelogik
                    //Punkte reset & neues Spiel  
                }
            });
    }    
}
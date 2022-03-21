enum Artefact {Eau, Terre, Feu, Air, Heliport, Vide}

enum Etat {Normale, Inondee, Submergee}

public class Zone {

    /** Attributs **/
    /*Une zone a des coordonnées x et y (abscisse et ordonnée)
    * et peut etre un heliport ou avoir un artéfact ou etre vide*/
    private int x;
    private int y;
    private Etat etat;
    private Artefact artefact;

    /** Constructeurs **/
    public Zone(int x, int y, Etat etat, Artefact artefact){
        this.x = x;
        this.y = y;
        this.etat = etat;
        this.artefact = artefact;
    }

    /** Methodes **/
    public int x(){return this.x;}
    public int y(){return this.y;}
}

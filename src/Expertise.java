public abstract class Expertise {
    private String codeDossier;
    private DateTime dateHeurRDV;
    private String lieuRDV;
    private String addresse;
    private String immariculation;
    private String marque;
    private String modele;
    private Indisponibilite uneIndispo;

    //Constructeur permetant de valoriser les attributs d'un objets
    public Expertise(String codeDossier, DateTime uneDateHeur, String unLieu, String uneAddresse, String uneImmat, String uneMarque, String unModele)
    {...}

    //methode qui determine l'état de l'expertise sous la forme d'un entier
    //<returns>1-a réaliser;2-réaliser;3-indisponnible</returns>
    public int EtatExpertise(){...}

    //methode qui permet de créer l'indisponibiliter de l'expertise qui n'as pas pu avoire lieu
    public void CreerIndisponibiliter(String unMotif, boolean clientResponsable){...}

    //Obtient l'objet de type indisponibiliter si l'expertise n'a pas pu avoire lieu
    //<returns>objet de type Indisponibiliter ou valeur null si expertise à réaliser ou réalisé</returns>
    public  Indisponibilite GetIndisponibilite(){...}
}

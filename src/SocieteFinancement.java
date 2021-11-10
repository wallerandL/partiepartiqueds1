import java.util.List;

public class SocieteFinancement {
    private String code;
    private String nom;
    private List<Expertise>lesExperise;

    //consructeur qui initialise les attributs privés et instancies la collection lesExpertises
    public SocieteFinancement(String codeSL, String nomSL){...}

    public void AjouterExpertiseClient(String dossier,DateTime dateHeur ,String lieu ,String address,String immat ,String marque, String modele, String unContact, String unTel, String unMail){...}

    //methode qui permet d'ajouter une nouvelle expertise de type pool garage
    public void AjouterExpertisePool(String dossier, DateTime dateHeur, String lieu, String addresse, String immat, String marque, String modele){
        //A COMPLETER
    }

    //mhetode qui retourne la lisre des expertse indisponibles
    public List<Expertise>lesExpertisesIndispos(){
        //A COMPLETER
    }

    //methode qui retourne le nombre d'expertise indsponible corespondant au motif leMotif
    public int NBIndisponibilites(String leMotif){
        //A COMPLETER
    }
}

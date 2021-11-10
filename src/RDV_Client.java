public class RDV_Client extends Expertise   //RDV_Client herite de EXPERTISE
        {
        private String nomContact;
        private String telephone;
        private String mail;

        //Consructeur qui permet d'intancier une expertise de type RDV client
            public RDV_Client(String codeDossier,DateTime uneDateHeure, String unLieu, String uneAddresse, String uneImmat, String uneMarque, String unModele, String contact, String tel, String mail):base(codeDossier, uneDateHeur, unlieu, uneAddress, uneImmat, uneMarque, unModele){...}
}

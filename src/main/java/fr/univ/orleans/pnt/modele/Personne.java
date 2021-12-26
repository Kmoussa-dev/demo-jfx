package fr.univ.orleans.pnt.modele;

public class Personne {
    private String nom;
    private String prenon;
    private String pseudo;
    private String password;
    private long id;

    private static long IDS = 0;

    private Personne(String nom, String prenon, String pseudo, String password) {
        this.id=IDS++;
        this.nom = nom;
        this.prenon = prenon;
        this.pseudo = pseudo;
        this.password = password;
    }

    public static Personne creer(String nom,String prenon,String pseudo,String password){
        return new Personne(nom, prenon, pseudo, password);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenon() {
        return prenon;
    }

    public void setPrenon(String prenon) {
        this.prenon = prenon;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static long getIDS() {
        return IDS;
    }

    public static void setIDS(long IDS) {
        Personne.IDS = IDS;
    }
}

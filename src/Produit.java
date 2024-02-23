
public class Produit {  

    private String nom;
    private String description;
    private int prix;

    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("{ nom= " + nom + ", description= " + description + ", prix= " + prix +" }" );
        
    }

    public String getNom() {
        return nom;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getPrix() {
        return prix;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    @Override
    public String toString() {
        return "Produit{" + "nom = " + nom + ", description = " + description + ", prix = " + prix ;
    }


}
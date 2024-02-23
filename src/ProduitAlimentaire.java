import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {

    private LocalDate dateExpiration;

    public ProduitAlimentaire(String nom, String description, int prix, LocalDate dateExpiration) {
        super(nom, description, prix);
        this.dateExpiration = dateExpiration;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    @Override
    public String toString() {
        return "dateExpiration"  + dateExpiration;
    }

    @Override
    public void afficher() {
        System.out.print("{ nom= " + getNom() + ", description= " + getDescription() + ", prix= " + getPrix());
        System.out.print(", dateExpiration= " + dateExpiration + " }");
    }


}
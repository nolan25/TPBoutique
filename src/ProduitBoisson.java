public class ProduitBoisson extends Produit {
    private int quantite;

    public ProduitBoisson(String nom, String description,int prix, int quantite) {
        super(nom, description, prix);
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "ProduitBoisson{" + "quantite=" + quantite + '}';
    }

    @Override
    public void afficher() {
        System.out.print("{ nom= " + getNom() + ", description= " + getDescription() + ", prix= " + getPrix());
        System.out.print(", quantite= " + quantite + " }");
    }

}
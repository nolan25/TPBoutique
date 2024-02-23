import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Produit> articles = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        articles.add(produit);
    }

    // calcul le prix du panier 
    public int prixTotalPanier() {
        int prixTotal = 0;
        for (Produit produit : articles) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Boutique {

     //création des listes
    private List<Produit> produits = new ArrayList<>();
    private List<ProduitElectronique> produitsElectroniques = new ArrayList<>();
    private List<ProduitAlimentaire> produitsAlimentaires = new ArrayList<>();
    private List<ProduitBoisson> produitsBoisson = new ArrayList<>();
    

    
    // ajouter les produits en fonction de leur cathegorie  
    public Produit addProduit(Produit produit) {
        if (produit instanceof ProduitElectronique) {
            produitsElectroniques.add((ProduitElectronique) produit);
        } else if (produit instanceof ProduitAlimentaire) {
            produitsAlimentaires.add((ProduitAlimentaire) produit);
        } else if (produit instanceof ProduitBoisson) {
            produitsBoisson.add((ProduitBoisson) produit);
        } else {
            produits.add(produit);
        }

        return produit;
    }
    
    public void setProduit(List<Produit> produits) {
        this.produits = produits;
    }


    public List<Produit> getProduit() {
        return produits;
    }


    //affichage des produits dans leur bonne cathegorie selont la liste dont-il provienne

    public void afficherStock() {

        System.out.println("Produits:");
        for (Produit produit : produits) {
            produit.afficher();
        }

        System.out.println("\nProduits Electroniques:");
        for (ProduitElectronique produitElectronique : produitsElectroniques) {
            produitElectronique.afficher();
        }

        System.out.println("\nProduits Alimentaires:");
        for (ProduitAlimentaire produitAlimentaire : produitsAlimentaires) {
            produitAlimentaire.afficher();
        }

        System.out.println("\nProduits Boissons:");
        for (ProduitBoisson produitBoisson : produitsBoisson) {
            produitBoisson.afficher();
        }
    }
    

   

}

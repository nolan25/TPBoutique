
import java.time.LocalDate;

public class App {
    public static void main(String[] args)  {
        
        Boutique boutique = new Boutique(); 
        
        Produit table = new Produit("table", "pour manger", 100);
        Produit chaise = new Produit("chaise", "s'asseoir", 50);
        Produit fefe = new Produit("féfé", "F40", 100000);
        boutique.addProduit(table);
        boutique.addProduit(chaise);
        boutique.addProduit(fefe);

        ProduitElectronique ordinateur = new ProduitElectronique("Ordinateur", "HP", 400, 12);
        ProduitAlimentaire pizza = new ProduitAlimentaire("Pizza", "4fromage", 10, LocalDate.of(2024, 03, 01));
        ProduitBoisson coca = new ProduitBoisson("coca", "Cherry", 2, 1);

        boutique.addProduit(ordinateur);
        boutique.addProduit(pizza);
        boutique.addProduit(coca);

        Panier panier = new Panier();
        panier.ajouterProduit(ordinateur);
        panier.ajouterProduit(pizza);
        panier.ajouterProduit(coca);

        boutique.afficherStock();

        System.out.println(" \n Prix total du panier: " + panier.prixTotalPanier());

    }
}

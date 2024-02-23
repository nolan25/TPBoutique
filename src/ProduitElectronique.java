public class ProduitElectronique extends Produit {

    private int dureeGarantie;

    public ProduitElectronique(String nom, String description, int prix, int dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    public int getDureeGarantie(){
        return dureeGarantie;
    }

    @Override
    public String toString() {
        return "ProduitElectronique{" + "dureeGarantie=" + dureeGarantie + '}';
    }

    
    @Override
    public void afficher() {
        System.out.print("{ nom= " + getNom() + ", description= " + getDescription() + ", prix= " + getPrix());
        System.out.print(", dureeGarantie= " + dureeGarantie + " }");
    }


    
}
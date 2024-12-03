// classe qui repésente un compte bancaire, incluant le solde et le taux d'intéret 
/**
 * Banque2
 */
class compte {
    // attributs privée pour l'encapculation
    private double solde;
    private double tauxInteret;

    // constructeur de la classe compte : initialise le solde et le taux d'interet
    public compte(double solde, double tauxInteret) {
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    // pour ajouter les intéret au compte
    public void bouclerCompter() {

        double interets = solde * tauxInteret;
        solde += interets;
    }

    // ajouter les interet au solde du compte
    public void ajouterInterets() {
        // calculer le montant des interet et ajouter au solde
        solde += solde * tauxInteret;
    }

    // afficher le solde du compte avec son type (privé ou d'é'pagne)
    public void afficherSolde(String typecompte) {
        System.out.println("compte" + typecompte + ": " + solde + " francs");
    }
}

// classe qui représente un client de la banque, incluant es information
// personnelles et ces comptes

class Client {
    // Attributs privée por le nom,la ville et les comptes
    private String nom;
    private String ville;
    private compte comptePrive;
    private compte compteEpagne;

    // constucteur de la class client : initialise le nom, la ville, et les comptes
    public Client(String nom, String ville, double soldePrive, double tauxPrive, double soldeEpargne,
            double tauxEpargne) {
        this.nom = nom;
        this.nom = ville;
        // crée les comptes privé et d'épagne avec les solde et les taux d'interet
        // spécifiques
        this.comptePrive = new compte(soldePrive, tauxPrive);
        this.compteEpagne = new compte(soldeEpargne, tauxEpargne);
    }

    // afficher les info du client et le solde de ces comptes
    public void afficherClient() {
        System.out.println("Client " + nom + "de " + ville);
        // afficher les solde du compte privée du compte épagne
        comptePrive.afficherSolde("privé");
        compteEpagne.afficherSolde("d'épagne");
    }
}

// classe pricipale qui exécute le pragramme
public class Banque2 {
    public static void main(String[] args) {
        // taux d'interet pour les compte privé et d'épagne
        double tauxPrive = 0.01;
        double tauxEpargne = 0.02;

        // créqtion des deux client avec leur informations et soldes initiaux
        Client client1 = new Client("pedro", "Geneve", 1000.0, tauxPrive, 2000.0, tauxEpargne);
        Client client2 = new Client("Alexandra", "Lausanne", 3000.0, tauxPrive, 4000.0, tauxEpargne);

        // afficher les données avant le bouclage des comptes
        System.out.println("Dommées avant le bouclage des comptes: ");
        client1.afficherClient();
        client2.afficherClient();

        // bouclage des comptes (ajout des interet)
        // client1.bouclerCompter();
        // client2.bouclerCompter();

        // affichage des données aprés le bouclage des comptes
        System.out.println("\nDonnées aprés le bouclement des compte: ");
        client1.afficherClient();
        client2.afficherClient();
    }
}
package frontiere;

import java.util.Iterator;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche = controlAfficherMarche.donnerInfosMarche();
		if (infosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		} else {
			for (int i = 0, j = 0; i < infosMarche.length/3; i++) {
				String vendeur = infosMarche[j];
				j++;
				String quantite = infosMarche[j];
				j++;
				String produit = infosMarche[j];
				j++;
				System.out.println("- " + vendeur + " qui vend " + quantite + " " + produit);
				
			}
		}
	}
}

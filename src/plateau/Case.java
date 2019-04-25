package plateau;

import java.util.ArrayList;
import java.util.List;

import entites.items.Item;

public class Case {
	private int tourPassage;
	private int nbPassageChass;
	private List<Item> dedans;
	private static int cptCase = 0;
	public final int numCase;

	/**
	 * Constructeur d'une case 
	 */
	public Case() {
		this.dedans = new ArrayList<Item>();
		this.nbPassageChass = 0;
		this.tourPassage = -1;
		this.numCase = cptCase;
		cptCase++;

	}

	/**
	 * @return the tourPassage
	 */
	public int getTourPassage() {
		return tourPassage;
	}

	/**
	 * @return the nbPassageChass
	 */
	public int getNbPassageChass() {
		return nbPassageChass;
	}

	/**
	 * @return the dedans
	 */
	public List<Item> getDedans() {
		return dedans;
	}
	
	public void ajouterItem(Item item) {
		this.dedans.add(item);
	}
	
	public void incrNbPassageChass() {
		nbPassageChass++;
	}
	
	public void setTourPassage() {
		tourPassage = Plateau.getInstance().getTourActuel();
	}
}
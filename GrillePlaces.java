package pobj.motx.tme1;

import java.util.ArrayList;
import java.util.List;

public class GrillePlaces {
	private Grille grille;
	private List<Emplacement> places = null;
	private int NbHorizontal;
	
	public GrillePlaces (Grille grille)
	{
		this.grille = grille;
		this.places = new ArrayList<Emplacement>();
		
		for(int i=0; i<grille.nbLig(); i++)
		{
			this.cherchePlaces(this.getLig(i));
		}
		
		this.NbHorizontal = this.getPlaces().size();
		
		for(int i=0; i<grille.nbCol(); i++)
		{
			this.cherchePlaces(this.getCol(i));
		}
	}
	
	public List<Emplacement> getPlaces()
	{
		return this.places;
	}
	
	public int getNbHorizontal()
	{
		return this.NbHorizontal;
	}
	
	public String toString()
	{
		String s = null;
		for(int i = 0; i< places.size(); i++)
		{
			s += this.places.get(i);
		}
		return s;
	}
	
	private List<Case> getLig (int lig)
	{
		List<Case> cases = new ArrayList<Case>();
		
		for(int i = 0; i<this.grille.nbCol(); i++)
		{
			cases.add(this.grille.getCase(lig, i));
		}
		return cases;
	}
	
	private List<Case> getCol(int col)
	{
		List<Case> cases = new ArrayList<Case>();
		
		for(int i = 0; i<this.grille.nbLig(); i++)
		{
			cases.add(this.grille.getCase(i,col));
		}
		return cases;
	}
	
	private void cherchePlaces(List<Case> cases)
	{
		Emplacement emplacement = new Emplacement();
		for(Case c : cases)
		{
			if(!c.isPleine())
			{
				emplacement.add(c);
			}else
			{
				if(emplacement.size() >= 2)
				{
					this.getPlaces().add(emplacement);
					emplacement = new Emplacement();
				}
				else
				{
					emplacement = new Emplacement();
				}
			}
		}
		if(emplacement.size() >= 2)
		{
			this.getPlaces().add(emplacement);
		}
	}
	
}

package pobj.motx.tme1;

public class Grille {

	private int hauteur;
	private int largeur;
	private Case[][] cases = null;
	
	public Grille(int hauteur, int largeur)
	{
		this.hauteur = hauteur;
		this.largeur = largeur;
		
		this.cases = new Case[hauteur][largeur];
		
		for(int i=0; i<hauteur; i++)
		{
			for(int j=0; j<largeur; j++)
			{
				 cases[i][j] = new Case(i, j, ' ');
			}
		}
	}
	
	public Case getCase(int lig, int col)
	{
		return this.cases[lig][col];
	}
	
	public String toString()
	{
		return GrilleLoader.serialize(this, true);
	}
	
	public int nbLig()
	{
		return this.hauteur;
	}
	
	public int nbCol()
	{
		return this.largeur;
	}
	
	public Grille copy()
	{
		Grille g = new Grille(this.hauteur, this.largeur);
		
		for(int i=0; i<hauteur; i++)
		{
			for(int j=0; j<largeur; j++)
			{
				g.getCase(i, j).setChar(this.getCase(i, j).getChar());
			}
		}
		return g;
	}
}

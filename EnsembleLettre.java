package pobj.motx.tme2;

import java.util.ArrayList;
import java.util.List;

public class EnsembleLettre 
{
	List<Character> letters;

	public EnsembleLettre()
	{
		this.letters = new ArrayList<Character>();
	}

	public int Size()
	{
		return letters.size();
	}
	
	public void add(Character c)
	{
		if(!letters.contains(c))
		{
			this.letters.add(c);
		}
	}
	
	public boolean contains(Character c)
	{
		return this.letters.contains(c);
	}
	
	public EnsembleLettre intersection(EnsembleLettre l2)
	{
		EnsembleLettre l = new EnsembleLettre();
		
		for(Character c : this.letters)
		{
			if(l2.contains(c))
			{
				l.add(c);
			}
		}
		
		return l;
	}
}
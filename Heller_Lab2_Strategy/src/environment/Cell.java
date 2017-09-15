package environment;
import lifeform.LifeForm;
/**
 * A Cell that can hold a LifeForm
 * @author lh9509
 *
 */
public class Cell 
{
	private LifeForm entity;
	
	
	public Cell() {
		
	}
	
	/**
	 * @return the LifeForm in this Cell
	 * 
	 */
	public LifeForm getLifeForm()
	{
		return this.entity;
	}
	
	/**
	 * Tries to add the LifeForm to the Cell. Will not add if a
	 * LifeForm is already present.
	 * @return true if the LifeForm was added to the Cell, false otherwise.
	 */
	public boolean addLifeForm(LifeForm entity)
	{
		if(this.entity != null)
		{
			return false;
		}
		else
		{
			this.entity = entity;
			return true;
		}

	}
		

}

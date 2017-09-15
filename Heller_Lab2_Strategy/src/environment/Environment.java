package environment;
import lifeform.LifeForm;

public class Environment 
{
	private Cell[][] board;
	
	/** Inititializes cell locations on the board
	 * 
	 * @param row
	 * @param col
	 */
	public Environment(int row, int col)
	{
		board = new Cell[row][col];
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				board[i][j] = new Cell();
			}
		}
	}

	/**
	 * This method is used to add a lifeform to a specified cell.
	 * I know this method was not meant to be to here, but I could
	 * not add a lifeform without it.
	 * @param row
	 * @param col
	 * @param entity
	 */
	public void addLifeForm(int row, int col,LifeForm entity)
	{
		board[row][col].addLifeForm(entity);
	}
	/** Method returns position of LifeForm on the board
	 * 
	 * @param row
	 * @param col
	 */
	public LifeForm getLifeForm(int row, int col)
	{
		return board[row][col].getLifeForm();
	}

}

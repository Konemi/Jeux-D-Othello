/**
 * Classe représentant le déroulement de la partie
 * @author omelj
 *
 */
public class PartieDOthello
{

	/**
	 * Exécute tour de jeu tant que ce n'est pas la fin de la partie
	 */
	public void jouer()
	{
		while (!finDeLaPartie())
		{
			jouerUnTour();
		}
	}
	/**
	 * Exécution d'un tour de jeu
	 */
	private void jouerUnTour() 
	{
		// TODO Auto-generated method stub
		
	}

	/**
	 * Obtenir l'information de fin de partie
	 * @return vrai si c'est la fin de la partie
	 */
	public boolean finDeLaPartie()
	{
		return false;		
	}
	
}

	/**
	* Une position est l'intersection d'une ligne et d'une colonne
	*/
	public class Position
	{
	/**
	* Le num�ro de ligne
	*/
	private final int numeroDeLigne;
	/**
	* Le num�ro de colonne
	*/
	private final int numeroDeColonne;
	/**
	* Cr�er une nouvelle position � une ligne et une colonne donn�e
	*
	* @param numeroDeLigne le num�ro de ligne
	* @param numeroDeColonne le num�ro de colonne
	*/
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
	this.numeroDeLigne = numeroDeLigne;
	this.numeroDeColonne = numeroDeColonne;
	}
	/**
	* Obtenir le num�ro de colonne
	*
	* @return le num�ro de colonne
	*/
	public int obtenirNumeroDeColonne()
	{
	return this.numeroDeColonne;
	}
	/**
	* Obtenir le num�ro de ligne
	*
	* @return le num�ro de ligne
	*/
	public int obtenirNumeroDeLigne()
	{
	return this.numeroDeLigne;
	}
}

package geometrie;

/**Liste les methodes obligatoires que doit posseder un objet g�om�trique
 * @author DIGINAMIC
 */

public interface ObjetGeometrique {
	
	/**Retourne le perimetre d'une forme g�om�trique
	 * @return double
	 */
	
	double perimetre();
	
	/**retourne la surface
	 * @return double
	 */
	
	double surface();
}

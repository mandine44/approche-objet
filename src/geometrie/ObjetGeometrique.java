package geometrie;

/**Liste les methodes obligatoires que doit posseder un objet géométrique
 * @author DIGINAMIC
 */

public interface ObjetGeometrique {
	
	/**Retourne le perimetre d'une forme géométrique
	 * @return double
	 */
	
	double perimetre();
	
	/**retourne la surface
	 * @return double
	 */
	
	double surface();
}

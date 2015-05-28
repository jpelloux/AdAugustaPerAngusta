package fr.iut.adaugustaperangusta.core.overlay;

import fr.iut.adaugustaperangusta.core.RelativePos;

/**
 * Elements structuring the Map. Interface. Super-class of fixed elements of the
 * Map.
 *
 * @author jpelloux and Axce
 * @version 1.1.0
 */
public interface Overlay {
	/**
	 * Walkablility test.
	 *
	 * @return <True> if walkable by travellers
	 */
	boolean isAccessible();

}

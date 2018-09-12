package domaine;

import java.util.Collection;

/**
 * Interface IPersonnel.
 * @author @author <a href="www.ib-formation.fr">IB</a>
 */
public interface IPersonnel {

    /**
     * Consulter les cong�s d'un membre du personnel.
     * @return Collection la collection contenant les demandes de cong�s
     */
    Collection<DemandeConges> consulterConges();

}

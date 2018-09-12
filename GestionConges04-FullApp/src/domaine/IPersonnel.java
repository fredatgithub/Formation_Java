package domaine;

import java.util.Collection;

/**
 * Interface IPersonnel.
 * @author @author <a href="www.ib-formation.fr">IB</a>
 */
public interface IPersonnel {

    /**
     * Consulter les congés d'un membre du personnel.
     * @return Collection la collection contenant les demandes de congés
     */
    Collection<DemandeConges> consulterConges();

}

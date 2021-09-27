package tsp.projects.frankenstein.crossover;

import tsp.evaluation.Path;

/**
 * @author Rafaël BACHOURIAN
 * @author Enes USTA
 *
 * @see Crossover
 *
 * Voir le rapport
 */
public class CrossoverPMX extends Crossover {

    @Override
    public Path[] crossover(Path p1, Path p2) {
        int length = p1.getPath().length;
        int pivot = getRandom().nextInt(length);
        int[] child1 = p1.getPath().clone();
        int[] child2 = p2.getPath().clone();

        for (int i = 0; i <= pivot; i++) {
            echange(i, getIndice(p2.getPath()[i], child1), child1);
            echange(i, getIndice(p1.getPath()[i], child2), child2);
        }

        return new Path[]{new Path(child1), new Path(child2)};
    }

}

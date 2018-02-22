package fr.tcd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import fr.tcd.input.Info;
import fr.tcd.input.Input;
import fr.tcd.result.ResultLine;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class Algo {

    public static List<ResultLine> run(final Input data) {
    	Optional<Info> info = data.infos.stream().findFirst();
    	Optional<Integer> montantInvesti = info.get().valeurs.stream()
    			.filter(valeur -> valeur < data.c)
    			.sorted(Comparator.reverseOrder())
    			.findFirst();
    	ResultLine oneResult = new ResultLine();
    	oneResult.dayIn = 0;
    	oneResult.dayOut = 20;
    	oneResult.action = "ALLOUT";
    	oneResult.nom = info.get().nom;
    	oneResult.montant = montantInvesti.get();
        return Arrays.asList(oneResult);
    }
}

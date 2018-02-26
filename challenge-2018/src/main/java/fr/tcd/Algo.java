package fr.tcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fr.tcd.input.Info;
import fr.tcd.input.Input;
import fr.tcd.result.ResultLine;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class Algo {

	public static List<ResultLine> run(final Input data) {
		System.out.println(data);
		List<Info> infos = data.infos.stream().sorted(new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				return o1.valeurs.get(data.h - 1).compareTo(o2.valeurs.get(data.h - 1));
			}

		})
				.filter(info -> !info.isDescendingFlagMoney())
				.filter(info -> info.isAscendingFlagMoney())
				.filter(info -> info.valeurs.get(data.h - 2) < info.valeurs.get(data.h - 1))
				.collect(Collectors.toList());

		List<ResultLine> results = new ArrayList<>();
		int div = 2;
		for (int jour = 0; jour < data.p - 1 - div; jour += 1) {
			results.add(generate(data, infos.get(jour), jour, div));
		}
		return results;
	}

	public static ResultLine generate(Input data, Info info, int jour, int div) {
		ResultLine oneResult = new ResultLine();
		oneResult.nom = info.nom;
		for (int i = 0; i < data.p; i++) {
			if (i == jour) {
				int montant = data.c/div;
				oneResult.actions.add("" + montant);
			} else if (i == jour + div) {
				oneResult.actions.add("ALLOUT");
			} else {
				oneResult.actions.add("0");
			}
		}
		return oneResult;
	}
}

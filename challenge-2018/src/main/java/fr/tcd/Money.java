package fr.tcd;

import fr.tcd.input.Info;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class Money {

    private final Info info;

    public Money(final Info info) {
        this.info = info;
    }

    /**
     * Retourne une valeur entre -100 & 100 pour savoir si une money est une bonne monnaie
     */
    public List<Integer> getDerivate() {
        return derivate(derivate(info.valeurs));
    }

    private List<Integer> derivate(final List<Integer> items) {
        return IntStream.range(0, items.size() - 1)
                .mapToObj(i -> items.get(i + 1) - items.get(i - 1))
                .collect(Collectors.toList());
    }

}

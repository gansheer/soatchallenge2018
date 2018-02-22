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

    public long interest() {
        final List<Integer> gradients = derivate(derivate(info.valeurs));
        return gradients.stream().mapToLong(i -> i).sum();
    }

    private List<Integer> derivate(final List<Integer> items) {
        return IntStream.range(0, items.size() - 1)
                .mapToObj(i -> items.get(i + 1) - items.get(i))
                .collect(Collectors.toList());
    }

}

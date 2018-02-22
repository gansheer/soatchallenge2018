package fr.tcd;

import fr.tcd.input.DataReader;
import fr.tcd.input.Info;
import fr.tcd.input.Input;

import org.junit.Test;

/**
 * @author patrick.allain@soat.fr - 2/22/18.
 */
public class MoneyTest {

    @Test
    public void toto() {
        // GIVEN
        final Input input = DataReader.load("crypto-input.txt");
        final Info info = input.infos.get(1);

        // WHEN
        final long derivate = new Money(info).interest();

        // THEN
//        Assertions.assertThat(derivate).as("Money %s ", info.nom).isGreaterThan(0L);

    }

}
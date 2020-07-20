package org.example;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(App.calculate(1) == null);

        assertTrue(Objects.requireNonNull(App.calculate(2)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(2)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(2)).two == 1);

        assertTrue(App.calculate(3) == null);

        assertTrue(Objects.requireNonNull(App.calculate(4)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(4)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(4)).two == 2);

        assertTrue(Objects.requireNonNull(App.calculate(5)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(5)).five == 1);
        assertTrue(Objects.requireNonNull(App.calculate(5)).two == 0);

        assertTrue(Objects.requireNonNull(App.calculate(6)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(6)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(6)).two == 3);

        assertTrue(Objects.requireNonNull(App.calculate(7)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(7)).five == 1);
        assertTrue(Objects.requireNonNull(App.calculate(7)).two == 1);

        assertTrue(Objects.requireNonNull(App.calculate(8)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(8)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(8)).two == 4);

        assertTrue(Objects.requireNonNull(App.calculate(9)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(9)).five == 1);
        assertTrue(Objects.requireNonNull(App.calculate(9)).two == 2);

        assertTrue(Objects.requireNonNull(App.calculate(10)).ten == 1);
        assertTrue(Objects.requireNonNull(App.calculate(10)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(10)).two == 0);

        assertTrue(Objects.requireNonNull(App.calculate(11)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(11)).five == 1);
        assertTrue(Objects.requireNonNull(App.calculate(11)).two == 3);

        assertTrue(Objects.requireNonNull(App.calculate(12)).ten == 1);
        assertTrue(Objects.requireNonNull(App.calculate(12)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(12)).two == 1);

        assertTrue(Objects.requireNonNull(App.calculate(13)).ten == 0);
        assertTrue(Objects.requireNonNull(App.calculate(13)).five == 1);
        assertTrue(Objects.requireNonNull(App.calculate(13)).two == 4);

        assertTrue(Objects.requireNonNull(App.calculate(14)).ten == 1);
        assertTrue(Objects.requireNonNull(App.calculate(14)).five == 0);
        assertTrue(Objects.requireNonNull(App.calculate(14)).two == 2);
    }
}

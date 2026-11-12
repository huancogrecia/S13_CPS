package pe.edu.tecsup.cps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    void sumaDosNumeros() {
        assertEquals(8, calculadora.sumar(3, 5));
    }

    @Test
    void restaDosNumeros() {
        assertEquals(2, calculadora.restar(7, 5));
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListaDeAmigosTest {

    @Test
    void deveContarUsuariosOnline() {
        Plataforma plataforma = new Plataforma(
                new Usuario("Marco", 123, true, false),
                new Usuario("Luan", 456, true, true),
                new Usuario("José", 789, false, false)
        );
        assertEquals(2, ListaDeAmigos.contarUsuariosOnline(plataforma));
    }

    @Test
    void deveContarUsuariosJogandoAlgo() {
        Plataforma plataforma = new Plataforma(
                new Usuario("Marco", 123, true, false),
                new Usuario("Luan", 456, true, true),
                new Usuario("José", 789, false, false)
        );
        assertEquals(1, ListaDeAmigos.contarUsuariosJogandoAlgo(plataforma));
    }

    @Test
    void deveContarTotalDeUsuariosNaPlataforma() {
        Plataforma plataforma = new Plataforma(
                new Usuario("Marco", 123, true, false),
                new Usuario("Luan", 456, true, true),
                new Usuario("José", 789, false, false)
        );
        assertEquals(3, ListaDeAmigos.contarTotalDeUsuarios(plataforma));
    }

}
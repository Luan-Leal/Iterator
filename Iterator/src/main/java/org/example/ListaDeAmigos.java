package org.example;

import java.util.Iterator;

public class ListaDeAmigos {

    public static Integer contarUsuariosOnline(Plataforma plataforma) {
        int quantidade = 0;
        for (Usuario usuario : plataforma) {
            if (usuario.getIsOnline()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarUsuariosJogandoAlgo(Plataforma plataforma) {
        int quantidade = 0;
        for (Usuario usuario : plataforma) {
            if (usuario.getPlayingSomething()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalDeUsuarios(Plataforma plataforma) {
        int quantidade = 0;
        for (Iterator a = plataforma.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}

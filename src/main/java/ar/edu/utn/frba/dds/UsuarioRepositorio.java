package ar.edu.utn.frba.dds;

import java.util.List;

public class UsuarioRepositorio {
    List<Usuario> lista;

    public void generarSugerenciaDiaria(){
        lista.forEach(e->e.combinarSugerenciaDiaria());
    }

}

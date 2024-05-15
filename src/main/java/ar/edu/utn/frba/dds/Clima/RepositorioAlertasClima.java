package ar.edu.utn.frba.dds.Clima;

import ar.edu.utn.frba.dds.Enum.Alertas;
import ar.edu.utn.frba.dds.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlertasClima {
    List<Alertas> listaAlertas;
    List<Usuario> usuariosObservadores;

    public RepositorioAlertasClima() {
        this.listaAlertas = new ArrayList<>();
    }
    public void actualizarAlertas(List<Alertas> lista){
        this.listaAlertas=lista;
    }

}

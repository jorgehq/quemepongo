package ar.edu.utn.frba.dds.Sugerencias;

import ar.edu.utn.frba.dds.Prenda;
import ar.edu.utn.frba.dds.Usuario;

import java.util.List;

public interface ConfigSugerencia {
  public List<Prenda> logica(Usuario user, String key);
}

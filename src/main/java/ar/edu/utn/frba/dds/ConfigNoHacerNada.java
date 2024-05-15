package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Sugerencias.ConfigSugerencia;

import java.util.List;

public class ConfigNoHacerNada implements ConfigSugerencia {
  @Override
  public List<Prenda> logica(Usuario user,String key) {
    return user.getGuardaropa(key);
  }
}

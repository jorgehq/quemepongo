package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Enum.tipoEstilo;
import ar.edu.utn.frba.dds.Sugerencias.ConfigSugerencia;

import java.util.List;

public class ConfigPorFormalidad implements ConfigSugerencia {
  @Override
  public List<Prenda> logica(Usuario user,String key) {
    if(user.getEdad()>=55){
      return user.getGuardaropa(key).stream().filter(a->a.getEstilo()== tipoEstilo.INFORMAL).toList();
    }
    return user.getGuardaropa(key);
  }
}

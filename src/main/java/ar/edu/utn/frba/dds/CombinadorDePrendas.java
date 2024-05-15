package ar.edu.utn.frba.dds;
import ar.edu.utn.frba.dds.Sugerencias.ConfigSugerencia;
import ar.edu.utn.frba.dds.Sugerencias.Sugerencia;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Sets.cartesianProduct;

public class CombinadorDePrendas{
  private ConfigSugerencia cs;

  public CombinadorDePrendas(ConfigSugerencia cs) {
    this.cs=cs;
  }
  public List<Sugerencia> crearSugerencias(Usuario user, String key) {
    List<Prenda> prendasSuperiores = this.cs.logica(user,key).stream().filter(p -> p.isSuperior()).toList();
    List<Prenda> prendasInferiores = this.cs.logica(user,key).stream().filter(p -> p.isInferior()).toList();
    List<Prenda> calzados = this.cs.logica(user,key).stream().filter(p -> p.isCalzado()).toList();

    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);
    List<Sugerencia> ls=new ArrayList<>();
    for(List<Prenda> p:combinaciones){

      ls.add(new Sugerencia(p.get(0),p.get(1),p.get(2)));
    }
    return ls;
  }
  public Sugerencia crearSugerenciaDiaria(){
    return null;
  }

}

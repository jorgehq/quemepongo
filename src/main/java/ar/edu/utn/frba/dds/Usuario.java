package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Clima.AccionesPorClima;
import ar.edu.utn.frba.dds.Enum.Alertas;
import ar.edu.utn.frba.dds.Sugerencias.Sugerencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuario {

  private int edad;
  private Sugerencia diaria;
  Map<String,Guardaropa> guardaropas;
  private CombinadorDePrendas combinador;

  List<AccionesPorClima> acciones;



  public Usuario(int edad,CombinadorDePrendas comb) {

    this.edad = edad;
    this.combinador=comb;
    this.guardaropas=new HashMap<>();
    this.acciones=new ArrayList<>();
  }

  public int getEdad() {
    return edad;
  }
  public List<Prenda> getGuardaropa(String key){
    return this.guardaropas.get(key).getList();
  }

  public List<Sugerencia> realizarCombinacion(String key){
    return combinador.crearSugerencias(this,key);
  }
  public void agregarPrenda(String key,Prenda p){
    this.getGuardaropa(key).add(p);

  }
  public Guardaropa buscarGuardaropa(int clave){
    return guardaropas.values().stream().filter(g->g.getClave()==clave).toList().get(0);
  }
  public void crearGuardaropa(String nombre){
    this.guardaropas.put(nombre,new Guardaropa(2));
  }
  public void combinarSugerenciaDiaria(){

  }
  public void agregarAccion(AccionesPorClima a){
    acciones.add(a);
  }
  public void verificarClima(List<Alertas> alertas){


  }

}

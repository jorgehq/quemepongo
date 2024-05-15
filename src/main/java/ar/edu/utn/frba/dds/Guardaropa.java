package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Guardaropa {

  private int clave=0;
  List<Prenda> list;
  List<Notificaciones> notificaciones;
  public Guardaropa(int clave) {
    this.clave = clave;
    this.list = new ArrayList<>();
  }

  public int getClave() {
    return clave;
  }

  public List<Prenda> getList() {
    return list;
  }

  public void sugerirQuitarPrenda(Prenda p){
    notificaciones.add(new NotificacionQuitar(p,clave));
  }

  public void sugerirAgregarPrenda(Prenda p){
    notificaciones.add(new NotificacionAgregar(p,clave));
  }
}



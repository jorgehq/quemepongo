package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Enum.EstadoNotif;

public class NotificacionAgregar implements Notificaciones{
  private EstadoNotif estado;
  private Prenda prenda;
  private int clave;


  public NotificacionAgregar(Prenda prenda, int clave) {
    this.estado=EstadoNotif.PENDIENTE;
    this.prenda = prenda;
    this.clave = clave;
  }

  @Override
  public void Aceptar(Guardaropa g) {
    estado=EstadoNotif.ACEPTADA;
    g.list.add(prenda);

  }

  @Override
  public void Rechazar() {
    estado=EstadoNotif.RECHAZADA;
  }

  @Override
  public void Deshacer(Guardaropa g) {
    g.list.removeIf(a->a.equals(prenda));
  }
}

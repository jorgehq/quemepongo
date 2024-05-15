package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Enum.EstadoNotif;

import java.util.List;

public interface Notificaciones {
  public void Aceptar(Guardaropa g);
  public void Rechazar();
  public void Deshacer(Guardaropa g);

}

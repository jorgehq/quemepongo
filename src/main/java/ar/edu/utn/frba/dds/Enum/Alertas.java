package ar.edu.utn.frba.dds.Enum;

public enum Alertas {

    TORMENTA("Se recomienda llevar paraguas"),



    GRANIZO("Se recomienda no ir en auto");
    private final String mensaje;

    Alertas(String mensaje) {
        this.mensaje = mensaje;
    }
    public void notificar(){
        System.out.println(this.mensaje);
    }
}

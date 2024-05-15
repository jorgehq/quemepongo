package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.Enum.*;
public class Borrador {
    private tipoPrenda tipo;
    private material m;

    private Color colorP;

    private trama t;
    private tipoEstilo estilo;

    public Borrador() {

    }
    public Prenda crearPrenda(){
        try{
            verificarNulos(tipo,m,colorP,estilo);
            return new Prenda(tipo,m,colorP,t,estilo);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void setTipo(tipoPrenda tipo) {

        this.tipo = tipo;
    }

    public void setM(material m) {

        this.m = m;
    }

    public void setColorS(int roj,int amar, int azul) {

        this.colorP = new Color(roj,amar,azul);
    }

    public void setT(trama t) {
       if (t==null){
           this.t=trama.LISA;
       }else{
           this.t=t;
       }
    }
    public void setEstilo(tipoEstilo e){
        this.estilo=e;
    }

    public void verificarNulos(tipoPrenda tipo, material m, Color colorP,tipoEstilo e){

        if(tipo==null || m==null || colorP==null || e==null){
            throw new NullPointerException("La prenda le faltan datos");
        }

    }

}

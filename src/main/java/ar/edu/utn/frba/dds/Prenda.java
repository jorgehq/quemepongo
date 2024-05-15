package ar.edu.utn.frba.dds;


import ar.edu.utn.frba.dds.Enum.*;


public class Prenda {
        private tipoPrenda tipo;
        private material m;

        private Color colorP;
        private tipoEstilo estilo;
        private trama t;
        public Prenda(tipoPrenda tipo, material m,Color color,trama t,tipoEstilo estilo) {

              //  verificarNulos(tipo,m,colorP);

                this.tipo = tipo;
                this.m = m;
                this.colorP= color;
                this.t=t;
                this.estilo=estilo;

        }


        public void mostrar() {
                System.out.println("Prenda{" +
                    "tipo= " + tipo +
                    ", categoria= " + tipo.getCate() +
                    ", m= " + m +
                    ", colorP= " + colorP +
                    ", estilo= " +estilo+
                    '}');
        }
        public boolean isSuperior(){
                return tipo.getCate()==categoria.PARTE_SUPERIOR;
        }
        public boolean isInferior(){
                return tipo.getCate()==categoria.PARTE_INFERIOR;
        }
        public boolean isCalzado(){
                return tipo.getCate()==categoria.CALZADO;
        }

        public tipoEstilo getEstilo() {
                return estilo;
        }
}

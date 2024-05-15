package ar.edu.utn.frba.dds.Enum;

public enum tipoPrenda {
    ZAPATOS(categoria.CALZADO),
    CAMISA(categoria.PARTE_SUPERIOR),
    CAMISA_MANGA_CORTA(categoria.PARTE_SUPERIOR),
    CHOMPA(categoria.PARTE_SUPERIOR),
    PANTALON(categoria.PARTE_INFERIOR),
    REMERA(categoria.PARTE_SUPERIOR),
    ANILLO(categoria.ACCESORIOS),
    COLLAR(categoria.ACCESORIOS),
    ARETE(categoria.ACCESORIOS),
    CAMPERA(categoria.PARTE_SUPERIOR),
    MEDIAS(categoria.CUBRE_PIERNA);

    private categoria cate;
    tipoPrenda(categoria c) {
        this.cate=c;
    }

    public categoria getCate() {
        return cate;
    }
}

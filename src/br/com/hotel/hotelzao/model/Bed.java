package br.com.hotel.hotelzao.model;

public enum Bed {


    KING("Bed - King Size"),
    SUPERKING("Bed - Super King Size"),
    SINGLE("Bed - Single");

    private String tipoCama;

    Bed(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;

    }
}

package br.com.hotel.hotelzao.model;

import java.util.ArrayList;

public abstract class Room {

    private String numero;
    private double valor;
    private Bed bed;

    ArrayList <RoomStandard> roomStandard = new ArrayList<RoomStandard>(10);

    ArrayList <RoomDeluxe> roomDeluxe = new ArrayList<RoomDeluxe>(5);


}

//da para criar um arraylist dentro de outro array list? pra dentro de um arraylist
// de quarto Deluxe, conseguir alocar 5 guest
//criar um contador de guest por cama, ex: cama king = +2Guest, cama single = +1 Guest

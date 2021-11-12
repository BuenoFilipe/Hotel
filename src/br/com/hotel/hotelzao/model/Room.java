package br.com.hotel.hotelzao.model;

import java.util.ArrayList;

public class Room {

    private String numero;
    private double valor;

    ArrayList <RoomStandard> roomStandard = new ArrayList<RoomStandard>(10);

    ArrayList <RoomDeluxe> roomDeluxe = new ArrayList<RoomDeluxe>(5);


}

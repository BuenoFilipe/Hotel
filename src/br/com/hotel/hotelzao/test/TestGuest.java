package br.com.hotel.hotelzao.test;

import br.com.hotel.hotelzao.model.Guest;

import java.util.ArrayList;

public class TestGuest {

    public static void main(String[] args) {

        Guest g1 = Guest.create("João", "111.111.111-11", "Rua jiraya",32,"Rua Dezesseis",191,"Guarulhos","SP");

        g1.mostrarInformacoes();

        Guest g2 = Guest.create("Tadeu", "111.111.111-12", "Portero", 31, "Rua zambaloio", 200, "Mezopotamia", "Acre");

        g2.mostrarInformacoes();

        Guest g3 = Guest.create("Olavo", "222.333.111-02","pro player",19,"Rua joaquim",33,"Rio de janeiro","RJ");
        g3.mostrarInformacoes();

        System.out.println("Total of Guests: " + Guest.getTotalGuest());

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(0, g1);

        System.out.println("******** Arrays ********");

        System.out.println(guests.size());

        Guest ref = guests.get(0);
        System.out.println(ref.mostrarInformacoes());


    }



}

package src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.request;

import src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.response.RoomDto;

import java.util.List;

public class HotelReservationDto {
    private List <PersonDto> person;
    private List <ReservationsDto> reservation;

    public HotelReservationDto(List<PersonDto> person, List<ReservationsDto> reservation) {
        this.person = person;
        this.reservation = reservation;
    }

    public List<PersonDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonDto> person) {
        this.person = person;
    }

    public List<ReservationsDto> getReservation() {
        return reservation;
    }

    public void setReservation(List<ReservationsDto> reservation) {
        this.reservation = reservation;
    }
}

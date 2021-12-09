package src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.response;

import java.util.List;

public class ReservationsDto {
    private Integer id;
    private String status;
    private List <src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.response.RoomDto> rooms;

    public ReservationsDto() {
    }

    public ReservationsDto(Integer id, String status, List<RoomDto> rooms) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<RoomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {
        this.rooms = rooms;
    }
}

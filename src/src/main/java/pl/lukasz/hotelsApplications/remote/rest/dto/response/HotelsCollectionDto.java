package src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.response;

import java.util.List;

public class HotelsCollectionDto {
    private List <HotelsDto> hotels;

    public HotelsCollectionDto() {
    }

    public HotelsCollectionDto(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }
}

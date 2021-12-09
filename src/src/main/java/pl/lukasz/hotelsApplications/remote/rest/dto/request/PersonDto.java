package src.src.main.java.pl.lukasz.hotelsApplications.remote.rest.dto.request;

public class PersonDto {
    private String name;
    private Integer phone;
    private String address;
    private String mail;

    public PersonDto() {
    }

    public PersonDto(String name, Integer phone, String address, String mail) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}

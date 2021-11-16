package pl.kacper.pizza.remote.rest.common;

public class PersonOrderDto {

    private String name;
    private String address;
    private Integer floor;
    private String phone;

    public PersonOrderDto() {
    }

    public PersonOrderDto(String name, String address, Integer floor, String phone){
        this.name = name;
        this.address = address;
        this.floor = floor;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}



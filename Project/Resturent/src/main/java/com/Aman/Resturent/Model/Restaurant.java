package com.Aman.Resturent.Model;




public class Restaurant {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

  private String  name;
    private String restaurantAddress;
      private String   number;
   private String specialty;
    private int totalStaffs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Restaurant(String name, String restaurantAddress, String number, String specialty, int totalStaffs,int id) {
        this.name = name;
        this.restaurantAddress = restaurantAddress;
        this.number = number;
        this.specialty = specialty;
        this.totalStaffs = totalStaffs;
        this.id = id;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }
}

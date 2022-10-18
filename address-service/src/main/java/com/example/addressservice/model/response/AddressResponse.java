package com.example.addressservice.model.response;

import com.example.addressservice.model.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressResponse {
    private Long id;
    private String country;
    private String city;

    public AddressResponse(Address address){
        this.id = address.getId();
        this.city = address.getCity();
        this.country = address.getCountry();
    }
}

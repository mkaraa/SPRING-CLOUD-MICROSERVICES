package com.example.addressservice.services;

import com.example.addressservice.errorHandler.AddressNotFoundException;
import com.example.addressservice.model.request.AddressRequest;
import com.example.addressservice.model.entity.Address;
import com.example.addressservice.model.response.AddressResponse;
import com.example.addressservice.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    @Transactional
    public AddressResponse create(AddressRequest dto){
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setCountry(dto.getCountry());
        addressRepository.save(address);
        return new AddressResponse(address);
    }

    public AddressResponse getById(Long id){
        Address address = addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException("Address not found with ID : " + id));
        return new AddressResponse(address);
    }
}

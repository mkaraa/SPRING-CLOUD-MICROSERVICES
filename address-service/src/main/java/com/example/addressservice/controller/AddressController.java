package com.example.addressservice.controller;

import com.example.addressservice.model.request.AddressRequest;
import com.example.addressservice.model.response.AddressResponse;
import com.example.addressservice.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping("create")
    public AddressResponse create(@RequestBody AddressRequest addressRequest){
        return addressService.create(addressRequest);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable Long id){
        return addressService.getById(id);
    }
}

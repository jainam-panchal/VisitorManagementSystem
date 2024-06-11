package com.example.visitorManagement.service;

import com.example.visitorManagement.dto.AddressDto;
import com.example.visitorManagement.dto.UserDto;
import com.example.visitorManagement.entity.Address;
import com.example.visitorManagement.entity.Flat;
import com.example.visitorManagement.entity.User;
import com.example.visitorManagement.enums.Role;
import com.example.visitorManagement.enums.UserStatus;
import com.example.visitorManagement.repo.FlatRepo;
import com.example.visitorManagement.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private FlatRepo flatRepo;

    public Long createUser( UserDto userDto){
        User user = User.builder()
                .email(userDto.getEmail())
                .name(userDto.getName())
                .phone(userDto.getPhone())
                .role(Role.valueOf(userDto.getRole()))
                .status(UserStatus.ACTIVE)
                .idNumber(userDto.getIdNumber())
                .build();
        if(userDto.getAddress() != null){
            AddressDto addressDto = userDto.getAddress();
            Address address = Address.builder()
                    .line1(addressDto.getLine1())
                    .line2(addressDto.getLine1())
                    .pincode(addressDto.getPincode())
                    .city(addressDto.getCity())
                    .country(addressDto.getCountry())
                    .build();
            user.setAddress(address);
        }
        if(userDto.getFlatNo()!=null){
            Flat flat = flatRepo.findByNumber(userDto.getFlatNo());
            if(flat == null){

            }
            user.setFlat(flat);
        }
        user = userRepo.save(user);
        return user.getId();
    }


}

package com.harsh.hotelservice.hotelservice.Dto;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelDto {
    
    private String hotelId;

    @NotEmpty
    private String name;

    @NotEmpty
    private String location;

    @NotEmpty
    private String about;
}

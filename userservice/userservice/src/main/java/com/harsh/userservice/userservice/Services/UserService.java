package com.harsh.userservice.userservice.Services;

import java.util.List;

import com.harsh.userservice.userservice.Dto.UserDto;

public interface UserService {
    // create user
    UserDto createUser(UserDto userDto);

    // get all user
    List<UserDto> getUsers();

    //get single user
    UserDto getUser(String userId);

    // delete
    void deleteUser(String userId);

    // update
    UserDto updateUser(UserDto userDto, String userId);
}

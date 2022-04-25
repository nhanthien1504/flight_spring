package com.mock.flight.security.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Register {

    private String username;
    private String email;
    private String password;
    private Set<String> role;
}

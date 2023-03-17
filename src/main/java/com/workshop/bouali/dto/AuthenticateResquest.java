package com.workshop.bouali.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticateResquest {
    private String email;
    private String password;
}

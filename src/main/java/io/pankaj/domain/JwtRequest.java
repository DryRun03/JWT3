package io.pankaj.domain;

import lombok.Data;

@Data
public class JwtRequest {
    private String email;
    private String password;
}

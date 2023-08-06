package io.pankaj.domain;

import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder @ToString
public class JwtResponse {
    private String jwtToken;
    private String userName;
}

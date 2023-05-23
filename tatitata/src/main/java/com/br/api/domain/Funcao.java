package com.br.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@AllArgsConstructor
@Getter
public enum Funcao {

    USUARIO(Nomes.USUARIO),
    ADMIN(Nomes.ADMIN);

    @UtilityClass
    public static class Nomes {
        public static final String USUARIO = "ROLE_USUARIO";
        public static final String ADMIN = "ROLE_ADMIN";
    }

    private final String role;
}

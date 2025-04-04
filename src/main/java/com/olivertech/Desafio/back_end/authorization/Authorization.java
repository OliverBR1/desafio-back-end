package com.olivertech.Desafio.back_end.authorization;

public record Authorization(
        String message) {
    public boolean isAuthorized() {
        return message.equals("Autorizado");
    }
}

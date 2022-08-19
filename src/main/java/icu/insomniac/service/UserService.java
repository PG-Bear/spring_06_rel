package icu.insomniac.service;

public interface UserService {
    boolean logIn(String username, String password);

    boolean checkUsername(String username);
}

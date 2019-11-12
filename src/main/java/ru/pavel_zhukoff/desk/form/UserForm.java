package ru.pavel_zhukoff.desk.form;

import javax.validation.constraints.*;

public class UserForm {

    @NotEmpty(message = "Заполните имя пользователя!")
    @Size(message = "Имя должно быть длиннее от 2 до 40 символов", min = 2, max = 40)
    private String username = "";

    @NotEmpty(message = "Заполните электронную почту!")
    @Email(message = "Введен некорректный электронный адрес!")
    private String email = "";

    @NotEmpty(message = "Заполните пароль!")
    private String password = "";

    @NotEmpty(message = "Заполните повтор пароля!")
    private String passwordRepeat = "";

    @AssertTrue(message = "Пароли не совпадают!")
    public boolean isPasswords() {
        return password.equals(passwordRepeat);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }
}

package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    User getUserByIdWithPlainQuery(String model, int series);

    void add(User user);

    List<User> listUsers();


}

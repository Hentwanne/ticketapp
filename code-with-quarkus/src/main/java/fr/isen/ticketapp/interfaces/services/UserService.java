package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.UserModel;

public interface UserService {
    List<UserModel> GetAllUser();

    UserModel GetUserById(final int id);

    UserModel AddUser(final UserModel user);

    boolean removeUser(final int userId);

    UserModel updateUser(final UserModel newUser);

}

package ProdReady.Aniket.Service.UserService;

import ProdReady.Aniket.models.Users;

public interface UserService {
    String getUserName();
    Users findById(int id);
}

package business.Abstracts.Abstracts;

import entities.concretes.User;

public interface CheckService {
boolean checkMail(String mail);
boolean checkPassword(String password);
boolean checkName(User user);

}

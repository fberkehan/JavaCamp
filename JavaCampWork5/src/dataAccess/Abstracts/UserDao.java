package dataAccess.Abstracts;

import entities.concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
void getAll();
}

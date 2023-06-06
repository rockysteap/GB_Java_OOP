package src.main.java.homework4.repository;

import src.main.java.homework4.model.User;

import java.util.List;

public interface UserRepository<T extends User> {

    List<T> getAll();
    void add(T t);
    void remove(String name);
    Long getMaxId();

}

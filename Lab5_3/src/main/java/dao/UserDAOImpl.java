package dao;

import bean.Account;

import java.util.List;

public interface UserDAOImpl {
    List<Account> findAll();
    Account findOne(int id);
    boolean Insert(Account acc);
    void update(Account acc);
    void delete(int id);
}

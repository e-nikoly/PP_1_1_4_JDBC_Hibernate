package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Ivanov", (byte) 30);
        userDao.saveUser("Petr", "Petrov", (byte) 27);
        userDao.saveUser("Alex", "Fox", (byte) 19);
        userDao.saveUser("Maria", "Backer", (byte) 34);

        System.out.println(userDao.getAllUsers());

        userDao.removeUserById(1);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

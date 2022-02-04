/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandlingPractice;

import java.util.ArrayList;

/**
 *
 * @author Muhammad Shameer
 */
public class InMemoryUserService implements UserService {

    private static ArrayList<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) throws UserAlreadyExistException {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                throw new UserAlreadyExistException(users.get(i).getId());
            }
        }
        users.add(user);
    }

    @Override
    public void deleteUser(int userID) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userID) {
                users.remove(i);
            }
        }
    }

    @Override
    public void blockUser(int userID) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userID) {
                users.get(i).setStatus(false);
            }
        }
    }

    @Override
    public void unblockUser(int userID) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userID) {
                users.get(i).setStatus(true);
            }
        }
    }

    @Override
    public User getUser(int userID) throws UserAccountIsBlockedException {
        User u = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == userID) {
                u = users.get(i);
                if (!users.get(i).isStatus()) {
                    throw new UserAccountIsBlockedException(users.get(i).getId());
                }
            }
        }
        return u;
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.remove(i);
                users.add(user);
            }
        }
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return users;
    }

}

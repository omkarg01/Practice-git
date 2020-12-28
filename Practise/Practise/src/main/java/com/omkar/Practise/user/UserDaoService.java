package com.omkar.Practise.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
//    private int userCount = 3;

    private static List<User> users = new ArrayList<>();

    static {

        User user1 = new User(1, "Adam", new Date());
        User user2 = new User(2, "Eve", new Date());
        User user3 = new User(3, "jack", new Date());

        users.add(user1);
        users.add(user2);
        users.add(user3);

    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
//        if (user.getId()==null){
//            user.setId(++userCount);
//        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteBy(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}


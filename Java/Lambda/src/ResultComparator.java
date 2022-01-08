import util.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ResultComparator {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3, "Kim"));
        users.add(new User(1, "Yang"));
        users.add(new User(5, "Jin"));
        System.out.println(users);

        Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
        Collections.sort(users, idComparator);
        System.out.println(users);

        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println(users);
    }
}

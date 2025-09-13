package SolidPrinciples.SinglePrinciple;

import java.util.HashMap;

public class UserRepository {
    public static HashMap<Integer, String> AddUsers() {
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "John");
        users.put(2, "Jane");
        users.put(3, "Mary");
        return users;
    }
}

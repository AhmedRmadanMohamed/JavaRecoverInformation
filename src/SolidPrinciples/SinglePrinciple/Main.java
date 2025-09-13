package SolidPrinciples.SinglePrinciple;

import static SolidPrinciples.SinglePrinciple.UserRepository.AddUsers;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        users.GetAllUsers(AddUsers())
                .forEach((i , s) -> System.out.println(i+" = <------- This is Kay  Of User : This is Name Of User -----> = "+s));

    }
}

package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Discription
 */
public class User {
    private String userName ;

    private String password ;
    public User(String userName ,String password){
        this.userName = userName ;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        User user = new User("1" , "222");
        User user2 = new User("1" , "3333");
        list.add(user);
        list.add(user2);
        Map<String, User> collect = list.stream().collect(Collectors.toMap(s -> s.getUserName(), u -> u ,(entity1,entity2) -> entity2));

        System.out.println(collect);

    }

}

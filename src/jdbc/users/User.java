package jdbc.users;

import lombok.Data;

// 한 사람의 정보를 담는 클래스
@Data
public class User {
    private String userid;
    private String username;
    private String userpassword;
    private int userage;
    private String useremail;
}

package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class User extends DateTimeEntity {

    @Id @GeneratedValue
    private Long userId;

    private String password;

    private String username; // id

    private String name; // 이름

}

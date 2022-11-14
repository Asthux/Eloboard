package EloBoardForFriend.asthu.dto;

import EloBoardForFriend.asthu.entity.User;
import lombok.Data;

@Data
public class CreateUserDto {
    private String username;
    private String password;
    private String name;

    public User getEntity() {
        User user = new User();
        user.setUsername(this.getUsername());
        user.setName(this.getName());
        user.setPassword(this.getPassword());

        return user;
    }
}
package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Board extends DateTimeEntity {

    @Id @GeneratedValue
    private int boardId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    private int views;

    private String content;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments = new ArrayList<>();

}

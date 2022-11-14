package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "game_record")
public class GameRecord extends DateTimeEntity {

    @Id @GeneratedValue
    private Long gameRecordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "map_id")
    private Map map;

    private String gameRecord;

    @OneToMany(mappedBy = "gameRecord")
    private List<GamePlayerInfo> gamePlayerInfo = new ArrayList<>();

}

package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "game_player_info")
public class GamePlayerInfo extends DateTimeEntity {

    @Id @GeneratedValue
    private Long playerInfoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private GameRecord gameRecord;

    private String player;

    @Enumerated(EnumType.STRING)
    private Race race;

    private String gameResult;

}

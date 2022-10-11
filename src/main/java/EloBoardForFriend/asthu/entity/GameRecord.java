package EloBoardForFriend.asthu.entity;

import javax.persistence.*;

@Entity
@Table(name = "game_record")
public class GameRecord extends DateTimeEntity {

    @Id @GeneratedValue
    private Long gameId;

    @ManyToOne
    private User user;

    @ManyToOne
    private Map map;

    private String gameRecord;

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getGameRecord() {
        return gameRecord;
    }

    public void setGameRecord(String gameRecord) {
        this.gameRecord = gameRecord;
    }
}

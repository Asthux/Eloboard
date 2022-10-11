package EloBoardForFriend.asthu.entity;

import javax.persistence.*;

@Entity
@Table(name = "game_player_info")
public class GamePlayerInfo extends DateTimeEntity {

    @Id @GeneratedValue
    private Long playerInfoId;

    @ManyToOne
    private GameRecord gameRecord;

    private String player;

    @Enumerated
    private Race race;

    private String gameResult;

    public Long getPlayerInfoId() {
        return playerInfoId;
    }

    public void setPlayerInfoId(Long playerInfoId) {
        this.playerInfoId = playerInfoId;
    }

    public GameRecord getGameRecord() {
        return gameRecord;
    }

    public void setGameRecord(GameRecord gameRecord) {
        this.gameRecord = gameRecord;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getGameResult() {
        return gameResult;
    }

    public void setGameResult(String gameResult) {
        this.gameResult = gameResult;
    }
}

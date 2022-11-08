package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "live_stream")
public class LiveStream extends DateTimeEntity {

    @Id @GeneratedValue
    private Long liveStreamId;

    private String thumbnail;

    private String Streamer;

    private String title;

}

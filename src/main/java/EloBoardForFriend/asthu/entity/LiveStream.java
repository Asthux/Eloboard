package EloBoardForFriend.asthu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "live_stream")
public class LiveStream extends DateTimeEntity {

    @Id @GeneratedValue
    private Long liveStreamId;

    private String thumbnail;

    private String Streamer;

    private String title;

    public Long getLiveStreamId() {
        return liveStreamId;
    }

    public void setLiveStreamId(Long liveStreamId) {
        this.liveStreamId = liveStreamId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getStreamer() {
        return Streamer;
    }

    public void setStreamer(String streamer) {
        Streamer = streamer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

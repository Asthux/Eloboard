package EloBoardForFriend.asthu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Map extends DateTimeEntity {

    @Id @GeneratedValue
    private Long mapId;

    private String name;

}

package EloBoardForFriend.asthu.entity;

import java.text.DateFormat;

public class Datetime {

    private DateFormat create_at;

    private DateFormat update_at;

    public DateFormat getCreate_at() {
        return create_at;
    }

    public void setCreate_at(DateFormat create_at) {
        this.create_at = create_at;
    }

    public DateFormat getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(DateFormat update_at) {
        this.update_at = update_at;
    }
}

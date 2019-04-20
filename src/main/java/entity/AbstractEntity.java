package entity;

import java.util.Date;

public abstract class AbstractEntity {

    private String uid;

    private Date createTimestamp;

    public String getUid() {
        return uid;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

package spring.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Abstract spring.entity class
 */
public abstract class AbstractEntity implements Serializable {

    /**
     * Unique Id column
     */
    @Id
    @Column(name = "uid")
    private String uid;

    /**
     * Create Timestamp column
     */
    @Column(name = "create_timestamp")
    private Date createTimestamp;

    /**
     * Getter for Uid
     *
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * Getter for createTimestamp
     *
     * @return createTimestamp
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * Setter for createTimestamp
     *
     * @param createTimestamp
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * Setter for uid
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }
}

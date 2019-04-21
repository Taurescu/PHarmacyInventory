package spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Entity for holding dealer information
 */
@Entity
@Table(name = "Dealers")
public class Dealer implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Unique Id column
     */
    @Id
    //@Column(name = "uid")
    private Integer uid;

    /**
     * Create Timestamp column
     */
    //@Column(name = "create_timestamp")
    private Date createTimestamp;

    /**
     * Getter for Uid
     *
     * @return uid
     */
    public Integer getUid() {
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
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    /**
     * Dealer name column
     */
    //@Column(name = "dealer_name")
    private String dealerName;

    /**
     * Order made to this dealer
     */
    @OneToMany(mappedBy = "dealer")
    private List<DealerOrder> dealerOrders;

    /**
     * Getter for dealer name
     *
     * @return dealerName
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Setter for dealer name
     *
     * @param dealerName
     */
    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    /**
     * Getter for dealer orders
     *
     * @return dealerOrders
     */
    public List<DealerOrder> getDealerOrders() {
        return dealerOrders;
    }

    /**
     * Setter for dealer orders
     *
     * @param dealerOrders
     */
    public void setDealerOrders(List<DealerOrder> dealerOrders) {
        this.dealerOrders = dealerOrders;
    }
}

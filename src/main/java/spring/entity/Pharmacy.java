package spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Entity class for holding Pharmacies information
 */
@Entity
@Table(name = "Pharmacies")
public class Pharmacy implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Unique Id column
     */
    @Id
   // @Column(name = "uid")
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
     * Column for pharmacy name
     */
    //@Column(name = "pharmacy_name")
    private String pharmacyName;
    /**
     * Orders made to dealers for this pharmacy
     */
    @OneToMany(mappedBy = "pharmacy")
    private List<DealerOrder> dealerOrders;

    /**
     * Orders made by this pharmacy
     */
    @OneToMany(mappedBy = "pharmacy")
    private List<PharmacyOrder> pharmacyOrders;

    /**
     * Getter for pharmacyName
     *
     * @return pharmacyName
     */
    public String getPharmacyName() {
        return pharmacyName;
    }

    /**
     * Setter for pharmacyName
     *
     * @param pharmacyName
     */
    public void setPharmacyName(String pharmacyName) {
        pharmacyName = pharmacyName;
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

    /**
     * Getter for pharmacy orders
     *
     * @return pharmacyOrders
     */
    public List<PharmacyOrder> getPharmacyOrders() {
        return pharmacyOrders;
    }

    /**
     * Setter for pharmacy orders
     *
     * @param pharmacyOrders
     */
    public void setPharmacyOrders(List<PharmacyOrder> pharmacyOrders) {
        this.pharmacyOrders = pharmacyOrders;
    }
}

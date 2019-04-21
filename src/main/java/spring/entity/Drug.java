package spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Entity class for holding drug infromation
 */
@Entity
@Table(name = "Drugs")
public class Drug implements Serializable {

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
     * Column for drug anem
     */
    //@Column(name = "drug_name")
    private String drugName;

    /**
     * Orders made to dealers for this drug
     */
    @OneToMany(mappedBy = "drug")
    private List<DealerOrder> dealerOrders;

    /**
     * Orders made to pharmacies for this drug
     */
    @OneToMany(mappedBy = "drug")
    private List<PharmacyOrder> pharmacyOrders;


    /**
     * Getter for drug name
     *
     * @return drugName
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * Setter for drug name
     *
     * @param drugName
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
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

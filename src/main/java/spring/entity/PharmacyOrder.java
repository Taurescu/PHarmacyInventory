package spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity holding information about orders made by pharmacies
 */
@Entity
@Table(name = "Pharmacy_Orders")
public class PharmacyOrder implements Serializable {

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
     * Pharmacy column
     */
    private Pharmacy pharmacy;

    /**
     * Drug column
     */
    private Drug drug;

    /**
     * Quantity column
     */
    //@Column(name = "quantity")
    private int quantity;

    /**
     * Order Date column
     */
    //@Column(name = "order_date")
    private Date orderDate;

    /**
     * Getter for Pharmacy
     *
     * @return pharmacy
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pharmacy_id")
    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    /**
     * Setter for {@link Pharmacy}
     *
     * @param pharmacy
     */
    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    /**
     * Getter for {@link Drug}
     *
     * @return drug
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drug_id")
    public Drug getDrug() {
        return drug;
    }

    /**
     * Setter for {@link Drug}
     *
     * @param drug
     */
    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    /**
     * Getter for quantity
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for order date
     *
     * @return orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Setter for orderDate
     *
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

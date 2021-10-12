package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "AccountTransaction")
public class AccountTransaction implements Serializable {


    private Long ACCOUNT_TRA_ID ;
    private Long ACCOUNT_TYPE_ID;
    private Long MEMBER_ID;
    private Long AMOUNT;
    private LocalDate TRANSACTION_DATE;

    public AccountTransaction() {

    }

    public AccountTransaction(long transactionID, long accountTypeID, long membershipID, long amount, LocalDate transDate) {
        this.ACCOUNT_TRA_ID = transactionID;
        this.ACCOUNT_TYPE_ID = accountTypeID;
        this.MEMBER_ID = membershipID;
        this.AMOUNT = amount;
        this.TRANSACTION_DATE = transDate;

    }

    @Id
    @SequenceGenerator(name = "AccountSystem_Seq", sequenceName = "AccountSystem.AccountSystem_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "transactionID")
    public Long getTransactionID() {
        return ACCOUNT_TRA_ID;
    }

    @Column(name = "accountTypeID")
    public Long getAccountTypeID() {
        return ACCOUNT_TYPE_ID;
    }

    @Column(name = "membershipID")
    public Long getMembershipID() {
        return MEMBER_ID;
    }

    @Column(name = "amount")
    public Long getAmount() {
        return AMOUNT;
    }

    @Column(name = "transDate")
    public LocalDate getTransDate() {
        return TRANSACTION_DATE;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountTypeID")
    public long getAccountId() {
        return ACCOUNT_TYPE_ID ;
    }

    public void setTransactionID(long transactionID) {
        this.ACCOUNT_TRA_ID = transactionID;
    }

    public void setMembershipID(long membershipID) {
        this.MEMBER_ID = membershipID;
    }

    public void setAccountTypeID(long accountTypeID) {
        this.ACCOUNT_TYPE_ID = accountTypeID;
    }

    public void setAmount(long amount) {
        this.AMOUNT = amount;
    }

    public void setTransDate(LocalDate transDate) {
        this.TRANSACTION_DATE = transDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;

        }
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(ACCOUNT_TRA_ID, that.ACCOUNT_TRA_ID) && Objects.equals(ACCOUNT_TYPE_ID, that.ACCOUNT_TYPE_ID) && Objects.equals(MEMBER_ID, that.MEMBER_ID) && Objects.equals(AMOUNT, that.AMOUNT) && Objects.equals(TRANSACTION_DATE, that.TRANSACTION_DATE);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "accountTypeID ='" + ACCOUNT_TYPE_ID + '\'' +
                "transactionID='" + ACCOUNT_TRA_ID + '\'' +
                ",membershipID='" + MEMBER_ID + '\'' +
                ", amount=" + AMOUNT + '\'' +
                ",transDate=+" + TRANSACTION_DATE +
                '}';
    }
}
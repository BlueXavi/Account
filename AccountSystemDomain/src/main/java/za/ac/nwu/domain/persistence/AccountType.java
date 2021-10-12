package za.ac.nwu.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "AccountType")
public class AccountType implements Serializable {



    private Long ACCOUNT_TYPE_ID;
    private String MNEMONIC;
    private String ACCOUNT_TYPE_NAME;
    private LocalDate CREATION_DATE;

    private Set<AccountTransaction> AccountTransaction;

    public AccountType() {

    }

    public AccountType(long accountTypeID, String mnemonic, String AccountTypeName, LocalDate creation_Date) {
        this.ACCOUNT_TYPE_ID = accountTypeID;
        this.MNEMONIC = mnemonic;
        this.ACCOUNT_TYPE_NAME = AccountTypeName;
        this.CREATION_DATE= creation_Date;
    }

    public AccountType(String mnemonic, String accountTypeName, LocalDate creation_Date) {
        this.MNEMONIC = mnemonic;
        this.ACCOUNT_TYPE_NAME= accountTypeName;

    }

    @Id
    @SequenceGenerator(name = "AccountSystem_Seq", sequenceName = "AccountSystem.AccountSystem_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "Account_Type_ID")
    public long getAccountId() {
        return ACCOUNT_TYPE_ID;
    }

    @Column(name = "AccountTypeName")
    public String getAccountTypeName() {
        return ACCOUNT_TYPE_NAME;
    }

    @Column(name = "mnemonic")
    public String getMnemonic() {
        return MNEMONIC;
    }

    ;

    @Column(name = "creation_Date")
    public LocalDate getCreation_Date() {
        return CREATION_DATE;
    }

    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accountTypeID", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransaction() {
        return AccountTransaction;
    }

    public void setAccountTypeID(long accountTypeID) {
        this.ACCOUNT_TYPE_ID= accountTypeID;
    }

    public void setMnemonic(String mnemonic) {
        this.MNEMONIC = mnemonic;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.ACCOUNT_TYPE_NAME = accountTypeName;
    }

    public void setCreation_Date(LocalDate creation_Date) {
        this.CREATION_DATE = creation_Date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;

        }
        AccountType that = (AccountType) o;
        return Objects.equals(MNEMONIC, that.MNEMONIC) && Objects.equals(ACCOUNT_TYPE_NAME, that.ACCOUNT_TYPE_NAME) && Objects.equals(CREATION_DATE, that.CREATION_DATE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ACCOUNT_TYPE_ID, MNEMONIC, ACCOUNT_TYPE_NAME, CREATION_DATE);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeID ='" + ACCOUNT_TYPE_ID + '\'' +
                "mnemonic='" + MNEMONIC + '\'' +
                ",AccountTypeName='" + ACCOUNT_TYPE_NAME + '\'' +
                ", creation_Date=" + CREATION_DATE +
                '}';
    }
}

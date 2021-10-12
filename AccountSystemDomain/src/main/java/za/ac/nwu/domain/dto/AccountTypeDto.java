package za.ac.nwu.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.domain.persistence.AccountType;

import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountType")

public class AccountTypeDto {

    private static final long serialVersionUID= -5346853206480289868L;
    private String MNEMONIC;
    private String ACCOUNT_TYPE_NAME;
    private LocalDate CREATION_DATE;

    public AccountTypeDto()
    {

    }
    public AccountTypeDto(String MNEMONIC, String ACCOUNT_TYPE_NAME, LocalDate CREATION_DATE)
    {
        this.MNEMONIC = MNEMONIC;
        this.ACCOUNT_TYPE_NAME = ACCOUNT_TYPE_NAME;
        this.CREATION_DATE = CREATION_DATE;
    }

    public AccountTypeDto(AccountType accountType)
    {
        this.setAccountName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreation_Date());
        this.setMnemonic(accountType.getMnemonic());
    }

    public void setMnemonic(String MNEMONIC) {
        this.MNEMONIC = MNEMONIC;
    }

    public void setAccountName(String ACCOUNT_TYPE_NAME)
    {
        this.ACCOUNT_TYPE_NAME = ACCOUNT_TYPE_NAME;
    }

    public void setCreationDate(LocalDate CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }

    @ApiModelProperty(position = 1,
            value = "ACCOUNT_TYPE",
            name = "Kuhlula",
            notes = "Identifiers the ACCOUNT_TYPE",
            dataType = "Java.lang.String",
            example = "MILES",
            required = true)
    public String getMnemonic() {
        return MNEMONIC;
    }

    @ApiModelProperty(position = 2,
            value = "The name of the Account",
            name = "Name",
            notes = "The name of the Accounte",
            dataType = "Java.lang.String",
            example = "MILES",
            allowEmptyValue = false,
            required = true)
    public String getAccountTypeName() {
        return ACCOUNT_TYPE_NAME;
    }

    @ApiModelProperty(position = 3,
            value = "Date the account is created",
            name = "CreationDate",
            notes = "Date when the Account was created",
            dataType = "Java.lang.String",
            example = "1999-02-24",
            allowEmptyValue = true,
            required = false)
    public LocalDate getCreationDate() {
        return CREATION_DATE;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(MNEMONIC,that.MNEMONIC) && Objects.equals(ACCOUNT_TYPE_NAME, that.ACCOUNT_TYPE_NAME)&& Objects.equals(CREATION_DATE,CREATION_DATE);


    }
    @JsonIgnore
    public AccountType getAccountType() {
        return new AccountType(getMnemonic(),getAccountTypeName(),getCreationDate());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(MNEMONIC,ACCOUNT_TYPE_NAME,CREATION_DATE);
    }
    @Override
    public String toString()
    {
        return "AccountTypeDto{" +
                "Mnemonic= '" +MNEMONIC+ '\''+
                ",Account Type Name= '" +ACCOUNT_TYPE_NAME+ '\''+
                ", Creation_Date=" + CREATION_DATE +
                '}';

    }
}

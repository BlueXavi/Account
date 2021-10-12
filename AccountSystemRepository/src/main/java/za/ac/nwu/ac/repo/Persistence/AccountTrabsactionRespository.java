package za.ac.nwu.ac.repo.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.persistence.AccountTransaction;


@Repository

public interface AccountTrabsactionRespository extends JpaRepository<AccountTransaction,Long> {

    @Query(value = "SELECT" +
            "     ACCOUNT_TRA_ID,"+
            "     ACCOUNT_TYPE_ID," +
            "     MEMBER_ID,"+
            "     TRANSACTION_DATE,"+
            "     AMOUNT" +
            "  FROM" +
            "      AccountTransaction" +
            " WHERE AMOUNT= : AMOUNT", nativeQuery = true)
    AccountTransaction getAccountTypeByMnemonicNativeQuery(String AMOUNT);
}

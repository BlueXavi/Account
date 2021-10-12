package za.ac.nwu.ac.Logic.Flow.impi;

import java.util.List;
import za.ac.nwu.domain.dto.AccountTypeDto;

public interface FetchAccountType {
    List<AccountTypeDto> getAllAccountypes();


    AccountTypeDto getAccountTypeByMnemonic(String MNEMONIC);



}

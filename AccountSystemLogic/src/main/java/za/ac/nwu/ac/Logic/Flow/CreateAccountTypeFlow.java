package za.ac.nwu.ac.Logic.Flow;

import za.ac.nwu.domain.dto.AccountTypeDto;

public interface CreateAccountTypeFlow {

    AccountTypeDto create(AccountTypeDto accountType);
}

package za.ac.nwu.ac.Translator.impl;

import java.util.List;
import za.ac.nwu.domain.dto.AccountTypeDto;

public interface AccountTranslator {
    List<AccountTypeDto> getAllAccounts();
    AccountTypeDto getAccountTypeByMnemonicNativeQuery(String MNEMONIC);
    AccountTypeDto create(AccountTypeDto accountTypeDto);

}

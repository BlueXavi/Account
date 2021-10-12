package za.ac.nwu.ac.Logic.Flow.impi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.Translator.impl.AccountTranslator;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.Logic.Flow.FetchAccountType;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@Transactional
public class CreateAccountTypeFlow implements FetchAccountType {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTypeFlow.class);


}

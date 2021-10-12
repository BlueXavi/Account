package za.ac.nwu.ac.Translator.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.repo.Config.RepositoryConfig;

@Import({RepositoryConfig.class})
@Configuration

public class TranslatorConfig {

}

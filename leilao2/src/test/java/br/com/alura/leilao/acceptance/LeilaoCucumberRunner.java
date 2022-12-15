package br.com.alura.leilao.acceptance;


//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;




@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//Configura para o Gherkin sair no console.
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

//Configura para não exibir o quadro do cucumber no console
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")

public class LeilaoCucumberRunner {

}

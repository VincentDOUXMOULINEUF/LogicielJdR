package logicielJdR.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Classe permettant de configuer la redirection par defaut vers la page d'index
 * @author Vincent
 *
 */
@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {

//	@Override
//    public void addViewControllers( ViewControllerRegistry registry ) {
//        registry.addViewController( "/" ).setViewName( "forward:/index" );
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE );
//        super.addViewControllers( registry );
//    }
	
}

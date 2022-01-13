import com.nemil.repository.HibernateSpeakerRepoImp;
import com.nemil.repository.SpeakerRepo;
import com.nemil.service.SpeakerService;
import com.nemil.service.SpeakerServiceImp;

import com.nemil.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.nemil"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(5);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }
//    @Bean(name = "speakerService")
// //   @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService(){
//        SpeakerServiceImp service = new SpeakerServiceImp();
//      //  SpeakerServiceImp service = new SpeakerServiceImp(getSpeakerRepo());
//
//        // Use for setter Injection.
//       // service.setRepo(getSpeakerRepo());
//
//        return service;
//    }
//
//    @Bean(name = "speakerRepo")
//    public SpeakerRepo getSpeakerRepo(){
//        return new HibernateSpeakerRepoImp();
//    }
}

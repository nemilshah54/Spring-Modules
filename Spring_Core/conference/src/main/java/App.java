import com.nemil.service.SpeakerService;
import com.nemil.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main (String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext( AppConfig.class);

      //  SpeakerService service1 = new SpeakerServiceImp();
        SpeakerService service1 = appContext.getBean(SpeakerService.class);
        System.out.println( service1.findAll());
    }
}

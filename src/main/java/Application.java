import com.arudesai.model.Speaker;
import com.arudesai.service.SpeakerService;
import com.arudesai.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService=applicationContext.getBean(SpeakerService.class);
        SpeakerService speakerService2=applicationContext.getBean(SpeakerService.class);
        System.out.println(speakerService.findAll());
        System.out.println(speakerService2.findAll());

    }
}

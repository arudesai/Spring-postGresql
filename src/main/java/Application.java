import com.arudesai.model.Speaker;
import com.arudesai.service.SpeakerService;
import com.arudesai.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService=applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(speakerService.findAll());

    }
}

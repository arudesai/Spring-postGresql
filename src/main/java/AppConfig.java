import com.arudesai.repository.HibernateSpeakerRepositoryImpl;
import com.arudesai.repository.SpeakerRepository;
import com.arudesai.service.SpeakerService;
import com.arudesai.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
//        SpeakerServiceImpl speakerService= new SpeakerServiceImpl(getSpeakerRepository());

//        speakerService.setRepository(getSpeakerRepository());
        return new SpeakerServiceImpl(getSpeakerRepository());
    }


    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }


}

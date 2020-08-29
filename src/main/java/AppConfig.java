import com.arudesai.repository.HibernateSpeakerRepositoryImpl;
import com.arudesai.repository.SpeakerRepository;
import com.arudesai.service.SpeakerService;
import com.arudesai.service.SpeakerServiceImpl;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.arudesai")
public class AppConfig {

   /* @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
//        SpeakerServiceImpl speakerService= new SpeakerServiceImpl(getSpeakerRepository());

//        speakerService.setRepository(getSpeakerRepository());
        System.out.println("inSpeaker");
        return new SpeakerServiceImpl(getSpeakerRepository());
    }


    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }*/


}

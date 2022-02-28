import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config-annotation1.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config-annotation2.xml");
        AsciiPanel asciiPanel = applicationContext.getBean(AsciiPanel.class);
        System.out.println(asciiPanel.getAsciiFont().getFontFilename());
    }
}

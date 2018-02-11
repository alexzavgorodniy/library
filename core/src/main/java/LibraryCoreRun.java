import config.JpaConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.EntityManager;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.BookRepository;

public class LibraryCoreRun {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JpaConfig.class);
        //System.out.println(applicationContext.getApplicationName());
        String applicationName = "";
        applicationName = context.getApplicationName();

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println(applicationName);
    }

}

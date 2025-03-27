package umg.progra3.Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class log4j {
    private static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {
        logger.info("Este es un mensaje informativo.");
        logger.warn("Este es un mensaje de advertencia.");
        logger.error("Este es un mensaje de error.");
    }

}

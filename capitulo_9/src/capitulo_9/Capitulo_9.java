package capitulo_9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Capitulo_9 {

    private static Logger log;
    
    public static void main(String[] args) {
        log = Logger.getLogger(Capitulo_9.class.getName());

        log.log(Level.SEVERE, "HAKING ALL DAY BELONG");
        log.log(Level.WARNING, "Hello people");
        log.log(Level.INFO, "Nice day");
        log.log(Level.FINEST, "uh lala");
    }
    
}

package alpha;
import org.apache.logging.log4j.*;
public class First
{
	private static Logger log = LogManager.getLogger(First.class.getName());
	public static void main (String[] args )
	{
		log.debug("I am Debugging");
		log.info("object is present");
		log.error("object is not present");
		log.fatal("this is fatel");
	}
}

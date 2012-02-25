package gongqi.designer.tools;

import gongqi.designer.got.GOT;
import gongqi.designer.resolver.Resolver;
import javax.servlet.http.HttpServlet;
import org.apache.log4j.Logger;

public class LoadOnStartUp extends HttpServlet
{
	/**
	 * ÷–Œƒƒ⁄»›≤‚ ‘
	 */
	private static final long serialVersionUID = -8508382541271613459L;

	private static Logger log = Logger.getLogger(LoadOnStartUp.class);
	
	static
	{
		log.info("Loading...");
		log.info("Resolver loading..." + Resolver.load());
		log.info("GOT loading..." + GOT.init());
		log.info("Started!!!");
	}
	
}

package spring.test;

import org.apache.log4j.Logger;

public class PropertiesFileLog4j {


    static Logger logger = Logger.getLogger(PropertiesFileLog4j.class);

    public static void main(String[] args) {
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");


    }
}

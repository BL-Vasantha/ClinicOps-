package com.clinicOps.test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;

public class ClinicAppTest {

    private static final Logger logger =
            LogManager.getLogger(ResolverUtil.Test.class);

    public static void main(String[] args) {

        logger.debug("Debug Message");

        logger.info("Information");

        logger.warn("Warning");

        logger.error("Error");
    }
}
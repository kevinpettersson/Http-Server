package com.kevinpettersson.httpserver;

import com.kevinpettersson.httpserver.config.Configuration;
import com.kevinpettersson.httpserver.config.ConfigurationManager;

/**
 *
 *  driver class for the http server !
 *
 */

public class HttpServer {

        public static void main(String[] args){

            System.out.println("Server starting... ");

            ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
            Configuration conf = ConfigurationManager.getInstance().getCurrentCofiguration();

            System.out.println("Using Port: " + conf.getPort());
            System.out.println("Using WebRoot: " + conf.getWebroot());

        }
}

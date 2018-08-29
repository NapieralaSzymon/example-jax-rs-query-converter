package pl.wercia.example.jaxrs.configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath(value = "/rest")
public class RestApplication extends Application {

}

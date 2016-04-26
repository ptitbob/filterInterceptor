package org.shipstone.sandbox.rest.ws.rs.tools;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

/**
 * @author François Robert
 */
@Provider

public class Interceptor implements WriterInterceptor {

  public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
    context.getHeaders().add("x-shipstone", "specificHeader");
    context.proceed();
  }

}

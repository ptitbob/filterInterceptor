package org.shipstone.sandbox.rest.ws.rs.tools;

import javax.ws.rs.NameBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author François Robert
 */
@NameBinding
@Retention(RUNTIME)
@Target({METHOD, TYPE})
public @interface Intercept {
}

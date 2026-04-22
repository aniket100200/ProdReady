package ProdReady.Aniket.Service.Engine.qualifyers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Qualifier;

/** A container for custom qualifier annotations related to Engine services. */
public class EngineQualifiers {
  /** qualifier for Engine which is Diesel Engine */
  @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.TYPE})
  @Retention(value = RetentionPolicy.RUNTIME)
  @Qualifier
  public @interface DieselEngine {}

  /** qualifier for Petrol Engine Service */
  @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
  @Retention(value = RetentionPolicy.RUNTIME)
  @Qualifier
  public @interface PetrolEngine {}
}

## Type Safe Qualifiers

### 1] Declare a Custom Qualifiers class

- for example given below

```java
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
    public @interface DieselEngine {
    }

    /** qualifier for Petrol Engine Service */
    @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
    @Retention(value = RetentionPolicy.RUNTIME)
    @Qualifier
    public @interface PetrolEngine {
    }
}

```

### 2] Mark your Qualifying classes with the Appropriate Annotations.

```java

@Component
@EngineQualifiers.DieselEngine
class DieselEngineServiceImpl implements Engine {

    @Override
    public void start() {
    }

    @Override
    public String getType() {
        return "Diesel";
    }
}

@Component
@EngineQualifiers.PetrolEngine
class PetrolEngineServiceImpl implements Engine {

    @Override
    public void start() {
    }

    @Override
    public String getType() {
        return "Petrol";
    }
}

```

### 3] Use those Annotations to Qualify  the Qualifier

```java

@Service
public class CarService {

    @Autowired
    @EngineQualifiers.PetrolEngine
    private Engine petrolEngine;

    @Autowired
    @EngineQualifiers.DieselEngine
    private Engine dieselEngine;

    @Cacheable(value = "types")
    public String getType() {
        return "{ 'DieselEngine': "
                + dieselEngine.getType()
                + ",\n 'PetrolEngine' : "
                + petrolEngine.getType()
                + " }";
    }
}
```
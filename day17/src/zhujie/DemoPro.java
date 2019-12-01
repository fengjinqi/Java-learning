package zhujie;

import java.lang.annotation.*;

/**
 *
 */
@Target(value ={ElementType.TYPE})
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DemoPro {
    public abstract String className();
    public abstract String methodName();
}

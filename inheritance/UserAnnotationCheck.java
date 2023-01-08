import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck check = new UserAnnotationCheck();
        check.checkAnnotations(UserAnnotationSample.class);
    }

    public void checkAnnotations(Class useClass) {
        Method[] methods = useClass.getDeclaredMethods();
        for(Method thisMethod: methods) {
            UserAnnotation annotation = thisMethod.getAnnotation();
            if (annotation != null) {
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(thisMethod.getName() + "() : number = " + number + ", text = " + text);
            } else {
                System.out.println(thisMethod.getName() + "() : annotation is null.");
            }
        }
    }
}
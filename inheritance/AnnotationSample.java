public class AnnotationSample {
    public void useDeprecated() {
        AnnotationDeprecated sample = new AnnotationDeprecated();
        @SuppressWarnings("deprecation")
        sample.noMoreUse();
    }
}
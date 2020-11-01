package minihearthstone;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
/**
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 * Source : https://dzone.com/articles/unit-testing-jpastop-integration-testing
 * Helper class for test methods
 */
//Modifié par Matthieu Gayraud 
public class AssertAnnotations {

  /**
   * @param annotationClasses List of annotation classes
   * @param annotations List of annotation 
   * Compare the annotation and the annotation class, throw
   * an exception if they do not match
   */
  private static void assertAnnotations(
      List<Class> annotationClasses, List<Annotation> annotations) {
    // length
    if (annotationClasses.size() != annotations.size()) {
      throw new AssertionError(
        String.format("Expected %d annotations, but found %d"
          , annotationClasses.size(), annotations.size()
      ));
    }
    // exists
    annotationClasses.forEach(
      ac -> {
        long cnt
          = annotations.stream()
            .filter(a -> a.annotationType().isAssignableFrom(ac))
            .count();
        if (cnt == 0) {
          throw new AssertionError(
            String.format("No annotation of type %s found", ac.getName())
          );
        }
      }
    );
  }

  /**
   * @param c Class
   * @param annotationClasses Annotations of the class c
   * See {@link #assertAnnotations()}
   */
  public static void assertClassAnnotation(Class c, Class... annotationClasses) {
    assertAnnotations(
        Arrays.asList(annotationClasses)
      , Arrays.asList(c.getAnnotations())
    );
  }

  /**
   * @param c Class 
   * @param fieldName Name of a field in the class c
   * @param annotationClasses Annotation linked to a field
   * See {@link #assertAnnotations()}
   */
  public static void assertField(
      Class c, String fieldName, Class... annotationClasses) {
    try {
      assertAnnotations(
        Arrays.asList(annotationClasses)
        , Arrays.asList(c.getDeclaredField(fieldName).getAnnotations())
      );
    } catch (NoSuchFieldException nsfe) {
      throw new AssertionError(nsfe);
    }
  }

  /**
   * @param c Class
   * @param getterName Name of a getter in the class c
   * @param annotationClasses Annotations linked to the getter getterName
   * See {@link #assertAnnotations()}
   */
  public static void assertGetter(
      Class c, String getterName, Class...annotationClasses) {
    try {
      assertAnnotations(
        Arrays.asList(annotationClasses)
        , Arrays.asList(c.getDeclaredMethod(getterName).getAnnotations())
      );
    } catch (NoSuchMethodException nsfe) {
      throw new AssertionError(nsfe);
    }
  }
}
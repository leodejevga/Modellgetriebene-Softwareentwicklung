/**
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.tests;

import com.google.inject.Inject;
import mdd.uni.petrinet.petrinet.Petrinet;
import mdd.uni.petrinet.tests.PetrinetInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(PetrinetInjectorProvider.class)
@SuppressWarnings("all")
public class PetrinetParsingTest {
  @Inject
  private ParseHelper<Petrinet> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final Petrinet result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

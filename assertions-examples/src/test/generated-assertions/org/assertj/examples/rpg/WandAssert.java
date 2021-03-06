package org.assertj.examples.rpg;

/**
 * {@link Wand} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractWandAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class WandAssert extends AbstractWandAssert<WandAssert, Wand> {

  /**
   * Creates a new <code>{@link WandAssert}</code> to make assertions on actual Wand.
   * @param actual the Wand we want to make assertions on.
   */
  public WandAssert(Wand actual) {
    super(actual, WandAssert.class);
  }

  /**
   * An entry point for WandAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myWand)</code> and get specific assertion with code completion.
   * @param actual the Wand we want to make assertions on.
   * @return a new <code>{@link WandAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static WandAssert assertThat(Wand actual) {
    return new WandAssert(actual);
  }
}

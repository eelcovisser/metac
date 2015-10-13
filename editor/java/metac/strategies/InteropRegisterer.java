package metac.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

/**
 * Helper class for {@link java_strategy_0_0}.
 */
public class InteropRegisterer extends JavaInteropRegisterer {

  public InteropRegisterer() {
    super(new Strategy[] {
        java_strategy_0_0.instance,
        path_join_0_1.instance,
        bitmask_0_0.instance
      }
    );
  }
}

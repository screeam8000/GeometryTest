import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.Random;

public class SomeRule implements TestRule {

    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {

                Random random = new Random();
                Rectangle rectangle = new Rectangle(random.nextDouble(), random.nextDouble());

                System.out.println("before ");
                base.evaluate();
                System.out.println("after ");
            }
        };
    }
}
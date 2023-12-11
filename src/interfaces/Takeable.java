package lab3.interfaces;

import lab3.environment.Thing;

public interface Takeable {
    void take(Thing thing, String... reason);
}
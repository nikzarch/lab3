package interfaces;

import environment.Thing;

public interface Containable {
    void add(Thing thing);
    void remove();
}
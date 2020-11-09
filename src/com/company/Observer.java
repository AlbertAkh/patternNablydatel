package com.company;

public interface Observer {
    public void update(float temp, float humidity, float pressure); //temp, humidate, pressure это состояние, передаваемые наблюдателям при изминении состояния субъекта

    //данный интерфейс реалтзуется всеми наблюдателями, таком образом, все наблюдатели должны реализовать метод update()
}

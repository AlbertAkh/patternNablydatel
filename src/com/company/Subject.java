package com.company;

public interface Subject {
        public void registerObserver(Observer o);   //оба метода получают в аргументе реализацию Observer
        public void removeObserver(Observer o);     //(регистрируемый или исключаемый наблюдатель)
        public void notifyObservers();
}


package gof.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // * 싱글톤 패턴 구현 방법을 깨트리는 방법
        // 1. 리플렉션 사용하기
        Settings settings = Settings.INSTANCE;

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings == settings1);

        // 2. 직렬화 & 역직렬화 사용하기

    }
}

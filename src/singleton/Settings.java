package singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    /**
     * 1. synchronized
     * 단, lock 을 걸기 때문에 성능의 저하가 있음
     */
//    private static Settings instance;
//
//    private Settings() {
//    }
//
//    public static synchronized Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

    /**
     * 2. eager initialization
     */
//    private static final Settings INSTANCE = new Settings();
//
//    private Settings() {}
//
//    public static  Settings getInstance() {
//        return INSTANCE;
//    }

    /**
     * 3. Double checked locking
     */
//    private static volatile Settings instance;
//
//    private Settings() {
//    }
//
//    public static Settings getInstance() {
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 4. Static inner 클래스 사용하기
     */
    private Settings() { }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // 역직렬화 방지
    protected Object readResolve() {
        return getInstance();
    }
}

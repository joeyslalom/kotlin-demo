package github.joeyslalom.howto._01_bean.java;

public class Bean {
    private final String name;
    private final int age;

    public Bean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

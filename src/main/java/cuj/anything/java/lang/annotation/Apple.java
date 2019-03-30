package cuj.anything.java.lang.annotation;

/**
 * @Auther: cujamin
 * @Date: 2019/2/19 12:54
 * @Description:
 */
//@KakaConfiguration(value = "cuj.basic.di.annotation")
public class Apple {
    @FruitName(value = "Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1,name = "123",address = "456")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleName='" + appleName + '\'' +
                ", appleColor='" + appleColor + '\'' +
                ", appleProvider='" + appleProvider + '\'' +
                '}';
    }
}

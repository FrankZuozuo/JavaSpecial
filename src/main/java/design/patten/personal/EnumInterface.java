package design.patten.personal;

/**
 * @author Created by 谭健 on 2018/3/23 0023. 星期五. 13:44.
 * © All Rights Reserved.
 */
public class EnumInterface {


    public static void main(String[] args) {


        test();
    }


    private static void test() {

        for (Food meat : MeatEnum.values()) {
            System.out.println(meat.getName() + ":" + meat.getFullName());
        }

        for (Food vegetable : VegetableEnum.values()) {
            System.out.println(vegetable.getName() + ":" + vegetable.getFullName());
        }

        System.out.println(getFoodName(VegetableEnum.CARROT));

    }


    /*
     * 你使用枚举对食物进行分组，可以达到分类组织食物的目的
     * 但是同时你希望不同的枚举类之间仍然具备食物类型
     * 比如，你对肉类进行枚举，但是同时又希望他具备食物的特性
     * 这样便与你对食物进行分类管理，而又具备扩展性 ---- 你的业务扩展，你新增了饮料
     * 这样做，你就没有必要修改接口设计，或者处于把全部食物放到一个超大的枚举类的尴尬局面
     */
    private static String getFoodName(Food food) {
        return food.getName() + ":" + food.getFullName();
    }

    // 食物接口
    private interface Food {

        String getFullName();

        String getName();

    }

    // 肉类枚举
    private enum MeatEnum implements Food {

        BEEF("牛肉"),
        PORK("猪肉");

        private String fullName;

        MeatEnum(String fullName) {
            this.fullName = fullName;
        }

        @Override
        public String getFullName() {
            return fullName;
        }

        @Override
        public String getName() {
            return name();
        }


    }


    // 蔬菜枚举
    private enum VegetableEnum implements Food {


        CABBAGE("白菜"),
        CARROT("胡萝卜");

        private String fullName;

        VegetableEnum(String fullName) {
            this.fullName = fullName;
        }

        @Override
        public String getFullName() {
            return fullName;
        }

        @Override
        public String getName() {
            return name();
        }
    }
}

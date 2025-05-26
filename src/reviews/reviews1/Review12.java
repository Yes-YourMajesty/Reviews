package reviews.reviews1;

public class Review12 {
    public static void main(String[] args) {
        int age = 19;
        if (0 <= age && age <= 17) {
            System.out.println("未成年");
        } else if (18 <= age && age <= 64) {
            System.out.println("成人");
        } else if (65 <= age) {
            System.out.println("高齢者");
        }else{
            System.out.println("無効な年齢です。");
        }
    }
}

package d_16_4_18;

/**
 * Created by hengjiang on 16/4/27.
 */
public class Test_Reload {
    public Test_Reload() {
    }

    void TType(int i) {
        System.out.print("this is int\n");
    }

    void TType(String i) {
        System.out.println("this is string");
    }

    public static void main(String[] args) {
        Test_Reload t = new Test_Reload();
        t.TType(9);
        Test_Reload t1 = new Test_Reload();
        t1.TType("Jiang Heng");
    }
}
package zhujie;

/**
 * javadoc
 * @author fengjinqi
 * @version 1.0
 */
public class DemoAnno {
    /**
     * 加法参数
     * @param a
     * @param b
     * @return
     */
    public static int add(int a,int...b){
        for (int i = 0; i < b.length; i++) {
            a+=b[i];
        }
        return a;
    }
    public void get(){
        System.out.println("==============");
    }
    public static void main(String[] args) {
        System.out.println(add(1,2,3,5));
    }
}

package zhujie;
@SuppressWarnings("all")//压制警告
public class DemoDeprecated {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public  void show(){
        //此注解用过告诉此方法有缺陷
    }

    public  void show1(){
        //代替show
    }
    @MyAnno(value = 23,n = "65",strs = {"43","4"})
    public void demo(){
        show();
    }
}

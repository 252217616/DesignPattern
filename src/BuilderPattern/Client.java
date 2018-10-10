package BuilderPattern;

import BuilderPattern.bean.BMWModel;
import BuilderPattern.bean.BenzModel;
import BuilderPattern.builder.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BenzModel aBenz = director.getAbenzModel();
        aBenz.run();
        BenzModel bBenz = director.getBbenzModel();
        bBenz.run();
        BMWModel aBmw = director.getABMWModel();
        aBmw.run();
        BMWModel bBmw = director.getBBMWModel();
        bBmw.run();
    }
}

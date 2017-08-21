package tansformer;

/**
 * Created by samuel.shao on 3/24/2017.
 */
public interface TxPlanTransformer {

    A transform(C c);
}

class TxPlanTransformerImpl implements TxPlanTransformer {

    @Override
    public A transform(C c) {
        return transformc(c);
    }

    public B transformc(C c) {
        return new B();
    }
}


class A {

}

class C {

}

class B extends A {

}

public class derivedGen<T, U> extends superGen<T> {
    U dob;

    public derivedGen(T ob1, U ob2) {
        super(ob1);
        dob = ob2;
    }

    public U getDob() {
        return dob;
    }
}

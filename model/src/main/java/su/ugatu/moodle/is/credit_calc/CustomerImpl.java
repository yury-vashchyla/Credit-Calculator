package su.ugatu.moodle.is.credit_calc;

/**
 * User: Rinat
 * Date: 13.01.14
 * Time: 23:52
 */
public class CustomerImpl implements Customer {
    private Integer age;
    private Sex sex;

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public Customer setSex(final Sex sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public Customer setAge(final Integer age) {
        this.age = age;
        return this;
    }
}

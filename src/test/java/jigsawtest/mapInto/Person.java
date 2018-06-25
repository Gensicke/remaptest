// Generated by delombok at Thu Jun 14 14:59:06 CEST 2018
package jigsawtest.mapInto;

import java.util.List;

public class Person {
  private Integer age;
  private String forename;
  private String lastname;
  private List<Address> addresses;


  @SuppressWarnings("all")
  public static class PersonBuilder {
    @SuppressWarnings("all")
    private Integer age;
    @SuppressWarnings("all")
    private String forename;
    @SuppressWarnings("all")
    private String lastname;
    @SuppressWarnings("all")
    private List<Address> addresses;

    @SuppressWarnings("all")
    PersonBuilder() {
    }

    @SuppressWarnings("all")
    public PersonBuilder age(final Integer age) {
      this.age = age;
      return this;
    }

    @SuppressWarnings("all")
    public PersonBuilder forename(final String forename) {
      this.forename = forename;
      return this;
    }

    @SuppressWarnings("all")
    public PersonBuilder lastname(final String lastname) {
      this.lastname = lastname;
      return this;
    }

    @SuppressWarnings("all")
    public PersonBuilder addresses(final List<Address> addresses) {
      this.addresses = addresses;
      return this;
    }

    @SuppressWarnings("all")
    public Person build() {
      return new Person(age, forename, lastname, addresses);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "Person.PersonBuilder(age=" + this.age + ", forename=" + this.forename + ", lastname=" + this.lastname + ", addresses=" + this.addresses + ")";
    }
  }

  @SuppressWarnings("all")
  public static PersonBuilder builder() {
    return new PersonBuilder();
  }

  @SuppressWarnings("all")
  public Person() {
  }

  @SuppressWarnings("all")
  public Person(final Integer age, final String forename, final String lastname, final List<Address> addresses) {
    this.age = age;
    this.forename = forename;
    this.lastname = lastname;
    this.addresses = addresses;
  }

  @SuppressWarnings("all")
  public Integer getAge() {
    return this.age;
  }

  @SuppressWarnings("all")
  public String getForename() {
    return this.forename;
  }

  @SuppressWarnings("all")
  public String getLastname() {
    return this.lastname;
  }

  @SuppressWarnings("all")
  public List<Address> getAddresses() {
    return this.addresses;
  }

  @SuppressWarnings("all")
  public void setAge(final Integer age) {
    this.age = age;
  }

  @SuppressWarnings("all")
  public void setForename(final String forename) {
    this.forename = forename;
  }

  @SuppressWarnings("all")
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }

  @SuppressWarnings("all")
  public void setAddresses(final List<Address> addresses) {
    this.addresses = addresses;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Person)) return false;
    final Person other = (Person) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$age = this.getAge();
    final Object other$age = other.getAge();
    if (this$age == null ? other$age != null : !this$age.equals(other$age)) return false;
    final Object this$forename = this.getForename();
    final Object other$forename = other.getForename();
    if (this$forename == null ? other$forename != null : !this$forename.equals(other$forename)) return false;
    final Object this$lastname = this.getLastname();
    final Object other$lastname = other.getLastname();
    if (this$lastname == null ? other$lastname != null : !this$lastname.equals(other$lastname)) return false;
    final Object this$addresses = this.getAddresses();
    final Object other$addresses = other.getAddresses();
    if (this$addresses == null ? other$addresses != null : !this$addresses.equals(other$addresses)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof Person;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $age = this.getAge();
    result = result * PRIME + ($age == null ? 43 : $age.hashCode());
    final Object $forename = this.getForename();
    result = result * PRIME + ($forename == null ? 43 : $forename.hashCode());
    final Object $lastname = this.getLastname();
    result = result * PRIME + ($lastname == null ? 43 : $lastname.hashCode());
    final Object $addresses = this.getAddresses();
    result = result * PRIME + ($addresses == null ? 43 : $addresses.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "Person(age=" + this.getAge() + ", forename=" + this.getForename() + ", lastname=" + this.getLastname() + ", addresses=" + this.getAddresses() + ")";
  }
}

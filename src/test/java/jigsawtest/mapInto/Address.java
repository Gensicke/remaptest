// Generated by delombok at Thu Jun 14 14:59:06 CEST 2018
package jigsawtest.mapInto;

public class Address {
  private Integer houseNumber;
  private String street;
  private String city;


  @SuppressWarnings("all")
  public static class AddressBuilder {
    @SuppressWarnings("all")
    private Integer houseNumber;
    @SuppressWarnings("all")
    private String street;
    @SuppressWarnings("all")
    private String city;

    @SuppressWarnings("all")
    AddressBuilder() {
    }

    @SuppressWarnings("all")
    public AddressBuilder houseNumber(final Integer houseNumber) {
      this.houseNumber = houseNumber;
      return this;
    }

    @SuppressWarnings("all")
    public AddressBuilder street(final String street) {
      this.street = street;
      return this;
    }

    @SuppressWarnings("all")
    public AddressBuilder city(final String city) {
      this.city = city;
      return this;
    }

    @SuppressWarnings("all")
    public Address build() {
      return new Address(houseNumber, street, city);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "Address.AddressBuilder(houseNumber=" + this.houseNumber + ", street=" + this.street + ", city=" + this.city + ")";
    }
  }

  @SuppressWarnings("all")
  public static AddressBuilder builder() {
    return new AddressBuilder();
  }

  @SuppressWarnings("all")
  public Address() {
  }

  @SuppressWarnings("all")
  public Address(final Integer houseNumber, final String street, final String city) {
    this.houseNumber = houseNumber;
    this.street = street;
    this.city = city;
  }

  @SuppressWarnings("all")
  public Integer getHouseNumber() {
    return this.houseNumber;
  }

  @SuppressWarnings("all")
  public String getStreet() {
    return this.street;
  }

  @SuppressWarnings("all")
  public String getCity() {
    return this.city;
  }

  @SuppressWarnings("all")
  public void setHouseNumber(final Integer houseNumber) {
    this.houseNumber = houseNumber;
  }

  @SuppressWarnings("all")
  public void setStreet(final String street) {
    this.street = street;
  }

  @SuppressWarnings("all")
  public void setCity(final String city) {
    this.city = city;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Address)) return false;
    final Address other = (Address) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$houseNumber = this.getHouseNumber();
    final Object other$houseNumber = other.getHouseNumber();
    if (this$houseNumber == null ? other$houseNumber != null : !this$houseNumber.equals(other$houseNumber)) return false;
    final Object this$street = this.getStreet();
    final Object other$street = other.getStreet();
    if (this$street == null ? other$street != null : !this$street.equals(other$street)) return false;
    final Object this$city = this.getCity();
    final Object other$city = other.getCity();
    if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof Address;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $houseNumber = this.getHouseNumber();
    result = result * PRIME + ($houseNumber == null ? 43 : $houseNumber.hashCode());
    final Object $street = this.getStreet();
    result = result * PRIME + ($street == null ? 43 : $street.hashCode());
    final Object $city = this.getCity();
    result = result * PRIME + ($city == null ? 43 : $city.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "Address(houseNumber=" + this.getHouseNumber() + ", street=" + this.getStreet() + ", city=" + this.getCity() + ")";
  }
}

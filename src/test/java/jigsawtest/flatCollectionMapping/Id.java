// Generated by delombok at Thu Jun 14 14:59:06 CEST 2018
package jigsawtest.flatCollectionMapping;

public class Id {
  private Long id;


  @SuppressWarnings("all")
  public static class IdBuilder {
    @SuppressWarnings("all")
    private Long id;

    @SuppressWarnings("all")
    IdBuilder() {
    }

    @SuppressWarnings("all")
    public IdBuilder id(final Long id) {
      this.id = id;
      return this;
    }

    @SuppressWarnings("all")
    public Id build() {
      return new Id(id);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "Id.IdBuilder(id=" + this.id + ")";
    }
  }

  @SuppressWarnings("all")
  public static IdBuilder builder() {
    return new IdBuilder();
  }

  @SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  @SuppressWarnings("all")
  public void setId(final Long id) {
    this.id = id;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Id)) return false;
    final Id other = (Id) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof Id;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "Id(id=" + this.getId() + ")";
  }

  @SuppressWarnings("all")
  public Id() {
  }

  @SuppressWarnings("all")
  public Id(final Long id) {
    this.id = id;
  }
}

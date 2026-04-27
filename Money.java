// Money.java

class Money {
  final int value;
  Money(int value) {
    this.value = value;
  }

  Money add(Money ob) {
    return new Money (this.value + ob.value);
  }

  Money minus(Money ob) {
    return new Money (this.value - ob.value);
  }
}
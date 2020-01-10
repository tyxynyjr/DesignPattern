# Design Pattern

- [Design Pattern](#design-pattern)
  - [Strategy Pattern](#strategy-pattern)

Design pattern learning for a noob.

Design pattern is not only about code reuse, it is more about experience reuse.
A good system must be flexible, reusable and scalable, which can be realized
through OOP + Design Pattern.

## Strategy Pattern

Strategy pattern defines a bunch of algorithms and encapsulate them accordingly,
which can be replaced by each other. It makes the change of the algorithm
independent from that uses the algorithm.

* Inheritance: not suitable for those behaviors that vary from instance to
  instance
* Encapsulation
* Composition: more composition instead of inheritance
* Polymorphism
* Programming against interface / abstract class instead of the realization
  (e.g. hard-coded instance initiation): a `setter` method can make the class
  more dynamic

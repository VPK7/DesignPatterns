1. Abstract desing pattern is another layer on the top of factory pattern, it is a factory of factories


Abstract Factory provides interfaces for creating families of related or dependent objects without specifying their concrete classes.
Client software creates a concrete implementation of the abstract factory and then uses the generic interfaces to create the concrete objects that are part of the family of objects.
The client does not know or care which concrete objects it gets from each of these concrete factories since it uses only the generic interfaces of their products.
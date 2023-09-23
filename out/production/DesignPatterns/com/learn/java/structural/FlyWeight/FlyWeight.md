Flyweight pattern is one of the structural design patterns as this pattern provides ways to decrease object count thus improving
application required objects structure. Flyweight pattern is used when we need to create a large number of similar objects (say 10^5).
One important feature of flyweight objects is that they are immutable. This means that they cannot be modified once they have been
constructed.

Why do we care for number of objects in our program?
->Less number of objects reduces the memory usage, and it manages to keep us away from errors related to memory like
java.lang.OutOfMemoryError.
->Although creating an object in Java is really fast, we can still reduce the execution time of our program by sharing objects.

In Flyweight pattern we use a HashMap that stores reference to the object which have already been created, every object is associated
with a key. Now when a client wants to create an object, he simply has to pass a key associated with it and
if the object has already been created we simply get the reference to that object else it creates a new object and then returns
it reference to the client.

Intrinsic and Extrinsic States

To understand Intrinsic and Extrinsic state, let us consider an example.

Suppose in a text editor when we enter a character, an object of Character class is created, the attributes of the Character
class are {name, font, size}. We do not need to create an object every time client enters a character since letter ‘B’
is no different from another ‘B’ . If client again types a ‘B’ we simply return the object which we have already created before.
Now all these are intrinsic states (name, font, size), since they can be shared among the different objects as they are similar to
each other.

Now we add to more attributes to the Character class, they are row and column. They specify the position of a character in the
document. Now these attributes will not be similar even for same characters, since no two characters will have the same position
in a document, these states are termed as extrinsic states, and they can’t be shared among objects.

Implementation : We implement the creation of Terrorists and Counter Terrorists In the game of Counter Strike.
So we have 2 classes one for Terrorist(T) and other for Counter Terrorist(CT).
Whenever a player asks for a weapon we assign him the asked weapon.
In the mission, terrorist’s task is to plant a bomb while the counter terrorists have to diffuse the bomb.

Why to use Flyweight Design Pattern in this example? Here we use the Fly Weight design pattern, since here we need to reduce the
object count for players. Now we have n number of players playing CS 1.6, if we do not follow the Fly Weight Design Pattern then
we will have to create n number of objects, one for each player. But now we will only have to create 2 objects one for terrorists
and other for counter terrorists, we will reuse then again and again whenever required.

Intrinsic State : Here ‘task’ is an intrinsic state for both types of players, since this is always same for T’s/CT’s.
We can have some other states like their color or any other properties which are similar for all the Terrorists/Counter Terrorists
in their respective Terrorists/Counter Terrorists class.

Extrinsic State : Weapon is an extrinsic state since each player can carry any weapon of his/her choice.
Weapon need to be passed as a parameter by the client itself.

![](C:\Users\Admin\Desktop\dpatterns_pics\flyweight.jpg)
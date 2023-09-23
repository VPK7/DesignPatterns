A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically.

In the implementation of this pattern, we prefer composition over an inheritance –
so that we can reduce the overhead of subclassing again and again for each decorating element. 
The recursion involved with this design can be used to decorate our object as many times as we require.

Suppose we have a Christmas tree object and we want to decorate it. The decoration does not change the object itself;
it’s just that in addition to the Christmas tree, we're adding some decoration items like garland, tinsel, tree-topper, bubble lights, etc.:

![](C:\Users\Admin\Desktop\dpatterns_pics\8poz64T.jpg)
[Main](../../README.md)
# Head First Design Patterns

## Design Principals
* Identify parts of the application that vary and separate them from what stays the same.
* Program to an interface not an implementation.
* Composition over inheritance.

## ULM for Duck mini simulator
![Alt text](ChapterOneDucks.png)
This is the first look at using interfaces to make the code more flexible to changes.
Any methods or attributes that could vary from subclass to subclass was separated out from the attributes that stay the same.

* Quack
* Fly

Both of these could be different depending on the type of duck subclass being created.  Rubber ducks cannot normally fly unless you strap a rocket to their backs.

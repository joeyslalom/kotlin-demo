
Kotlin Demo inspired by
* https://www.youtube.com/watch?v=6P20npkvcb8
* https://github.com/abreslav/introduction-to-kotlin

01 classes
* Kotlin in inspired by many languages - including Java - and supports many ways of programming
* Although you can reproduce many patterns in Kotlin you are already familiar with, it can be improved dramatically
* Kotlin and Java live together in a project
* IntelliJ has a convenient Java to Kotlin converter (demo)
* In addition to reducing boilerplate, Kotlin makes classes conceptually more lightweight -> easier to use! (demo)

02 properties & delegates
* Kotlin has an interesting approach - it leans heavily on its standard library rather than machinery in the language itself
* Coroutines is an example - it only added one keyword (suspend), and most of the implementation is the library
* Delegation is another - this also allows the application to encaspulate database access, validation logic, etc (demo)

03 functions
* Java forces you to put all methods inside a class
* Singletons can be declared with `object` (demo)
* Functions can be top-level, supports default parameters, named parameters (demo)
* Extension functions, extension properties (demo)

04 idioms (demo)
* Code example of traversing a hierarchy with containers and leaf elements
* private helper functions can be included as local functions, useful with recursion
* the outer function can provide variables available in the closure
* IDE can help find useless code, Kotlin has smart casts
* `when` is helpful flow construct
* sealed classes can represent the entire hierarchy so the compiler can know when all cases are covered

05 expressions (demo)
* prefer val over var
* leverage kotlin library functions 
* scope functions - e.g., `with`
* builders mapOf(), Pair (infix to)
* deconstruct fields (kotlin library functions on top of java's stdlib)
* `if` is an expressions
* `when` also an expression
* remove the noise; noise is harmful to the brain
* null-safe operator `?.`
* elvis operator `?:`, not just a default, can also return
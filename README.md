# ce08 A Great Inheritance 

> I fully expected to find a Constable in the kitchen, waiting to take me up. 
> But not only was there no Constable there, but no discovery had yet been made of the robbery.
> **--_Great Expectations_ by Charles Dickens**

This class exercise explores how to utilize inheritance in Java to create new classes
that are directly based on existing ones, with an emphasis on code reuse and design
implications. It also revists how to commit and view changes to a local Git repository.

## Prerequisite Knowledge

* A basic understanding of inheritance in Java.
* LDC Textbook Ch. 8 (Inheritance)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce08`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce08.git
   ```

1. **[ALL GROUP MEMBERS]**
   If you did not setup your Git username and email on Nike when workin on `cs1302-ce06`,
   then please revist that exercise and follow the instructions presented there.

1. Change into the `cs1302-ce08` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```
   
   For each Java file under the `src` subdirectory, fill out a table similar to the following:
   
   | Name of the Java file | Interface or Class? | Fully Qualified Name (FQN) | Depends On |
   |-----------------------|---------------------|----------------------------|------------|
   |-----------------------|---------------------|----------------------------|------------|
   |-----------------------|---------------------|----------------------------|------------|
   |-----------------------|---------------------|----------------------------|------------|

   The "Depends On" column should list any Java types under the `cs1302.ce08` package that the file
   is dependent upon. 
   
1. Make sure you are in the `cs1302-ce08` directory.
   Individually compile each `.java` specifying `bin` as the default package location for compiled code.
   Only specify the class path option when absolutely necessary.
   You may need to create the `bin` directory if it does not already exist.
   Write down the commands that you used in the order that you used them.
   
1. Inspect the source code provided with the exercise. For each of the `.java` files, list in your notes
   the signature of each method explicitly written in that file.

1. Generate the API documentation website for all of the code in the `cs1302` package
   into the `doc` directory. You may need to create the `doc` directory if it does not already exist.
   Host the documentation on Nike using `cs1302-ce08-doc` as the name for your symbolic link. Write
   the full URL of your API documentation website in your notes.
   
1. For each of the classed listed on the API documentation website, list in your notes
   the signature of each method given in the .java files that are **not** included in the API documentation website.
   
1. Why are some methods in the source code not listed on the API documentation website?

**CHECKPOINT**

1. In your notes, recreate the following table:

   | Reference Type | Object Type | Valid? (Guess) | Valid? (Actual) | Explain |
   |----------------|-------------|----------------|-----------------|---------|
   | `Shape`        | `Shape`     |||
   | `Shape`        | `Circle`    |||
   | `Shape`        | `Ellipse`   |||
   | `Circle`       | `Shape`     |||
   | `Circle`       | `Ellipse`   |||
   | `Circle`       | `Circle`    |||
   | `Ellipse`      | `Shape`     |||
   | `Ellipse`      | `Circle`    |||
   | `Ellipse`      | `Ellipse`   |||

   Create a `ShapeDriver.java` program in the `cs1302.driver` package. In the `main` method of 
   `ShapeDriver.java`, do the following steps for each row in the table:
   
   1. Declare a reference variable called `obj` with the type denoted in the **Reference Type** column.
   1. On the same line, create an object of the type denoted in the **Object Type** column using `new` and an appropriate constructor call and assign it to `obj`.
   1. Make an educated guess as to whether or not the line will successfully compile. Note this in the **Valid? (Guess)** column of your table.
   1. Save the file, then commit your change using Git (replace with an appropriate message):
   
      ```
      $ git commit -am "Some short desription of file changes."
      ```
      
   1. Attempt to compile `ShapeDriver.java`. Note whether it compiled in the **Valid? (Actual)** column of your table.
   1. Now for the most important part! In the **Explain** column of your table, explain why the statement is valid or invalid.
      If the statement is invalid, do not simply copy the error message provided by the compiler--do your best to explain it
      in your own words.
   1. Delete the line of code before proceeding to the next row.

**CHECKPOINT**

1. In your notes, recreate the following table:

   | Reference Type | Object Type | Method Call                | Valid? (Guess) | Valid? (Actual) |Explain|
   |----------------|-------------|----------------------------|----------------|-----------------|-------|
   | `Shape`        | `Ellipse`   | `getPerimeter()`           |||
   | `Ellipse`      | `Circle`    | `getName()`                |||
   | `Ellipse`      | `Circle`    | `getSemiMajorAxisLength()` |||
   | `Shape`        | `Ellipse`   | `getSemiMinorAxisLength()` |||
   | `Shape`        | `Ellipse`   | `setName()`                |||   
   | `Ellipse`      | `Ellipse`   | `getDiameter()`            |||
   | `Shape`        | `Circle`    | `getRadius()`              |||
   | `Ellipse`      | `Circle`    | `getCircumference()`       |||
   | `Circle`       | `Circle`    | `getPerimeter()`            |||

   In the `main` method of `ShapeDriver.java`, do the following steps for each row in the table:
   
   1. Declare a reference variable called `obj` with the type denoted in the **Reference Type** column.
   1. On the same line, create an object of the type denoted in the **Object Type** column using `new` and an 
      appropriate constructor call and assign it to `obj`.
   1. On the next line, call the method listed in the **Method Call** column using `obj` as the calling object. 
      If the method has a return type other than `void`, then simply assign it to a new variable of the appropriate type.
   1. Make an educated guess as to whether or not the two lines of that you added code will successfully compile. 
      Note this in the **Valid? (Guess)** column of your table.
   1. Save the file, and attempt to recompile it. Note whether it compiled in the **Valid? (Actual)** column of your table.
   1. Now for the most important part! In the **Explain** column of your table, explain why the statement is valid or invalid.
      If the statement is invalid, do not simply copy the error message provided by the compiler--do your best to explain it
      in your own words. If the statement is valid, give the fully qualified name (FQN) of the class containing the implementation
      for the method.
   1. Delete the two lines of code before proceeding to the next row.
   
**CHECKPOINT**
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>

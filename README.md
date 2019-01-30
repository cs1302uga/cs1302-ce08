# ce08 A Great Inheritance 

> I fully expected to find a Constable in the kitchen, waiting to take me up. 
> But not only was there no Constable there, but no discovery had yet been made of the robbery.
> **--_Great Expectations_ by Charles Dickens**

This class exercise explores how to utilize inheritance in Java to create new classes
that are directly based on existing ones, with an emphasis on code reuse and design
implications. It also revists how to commit and view changes to a local Git repository.

## Prerequisite Knowledge

* A basic understanding of inheritance in Java.
* LDC Textbook Ch. ?? (Inheritance)

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
   the please revist that exercise and follow the instructions presented there.

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

   The "Depends On" column should list any Java types under the `cs1302.ce07` package that the file
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

1. Create a `ShapeDriver.java` program in the `cs1302.driver` package. In the `main` method of 
   `ShapeDriver.java`, declare reference type variables using the type given in the table below. For
   each reference variable, assign to it an object of the object type given in the table.  For example, 
   If the table says `Circle` for the object type and `Ellipse` as the reference type, you would add
   something like `Circle c = new Ellipse();` making sure to properly call the constructor on the
   object type.  For each of these lines, write if the line is valid and explain why or why not.
   Write details for the explanation.
  
   | Reference Type | Object Type | Valid or Invalid? | Explain |
   |----------------|-------------|-------------------|---------|
   |Shape|Shape|||
   |Shape|Circle|||
   |Shape|Ellipse|||
   |Circle|Shape|||
   |Circle|Ellipse|||
   |Circle|Circle|||
   |Ellipse|Shape|||
   |Ellipse|Circle|||
   |Ellipse|Ellipse|||

1. In `ShapeDriver.java`, remove any declarations/instantiations added in the previous question. Add a 
   line to test the method calls in the table below given the reference and object types. While exact
   parameters are not given, you should assume that the method is called correctly. If a method
   call is invalid for a given reference/object type combination, say why it is invalid. If the method
   call is valid, give the fully qualified name (FQN) of the implementing class.
   
   | Reference Type | Object Type | Method Call| Valid or Invalid? |Explain|
   |----------------|-------------|------------|-------------------|-------|
   |Ellipse|Ellipse|getPerimeter()|||
   |Ellipse|Ellipse|getCircumference()|||
   |Shape|Circle|getDiameter()|||
   |Shape|Circle|getName()|||
   |Shape|Circle|setName()|||
   |Ellipse|Circle|getSemiMajorAxisLength()|||
   |Ellipse|Circle|getRadius()|||
   |Ellipse|Circle|getPerimeter()|||
   |Shape|Ellipse|getArea()|||
   

**CHECKPOINT**

1. 

1. 1. Make sure you are in the `cs1302-ce08` directory.
   Use Git to commit your source code changes to your local copy of the exercise repository.
   If you did not remember how to do this, then revisit your notes for `cs1302-ce06`.
   
**CHECKPOINT**
    
<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>

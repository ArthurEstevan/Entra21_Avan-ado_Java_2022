# _Dates_

## _What is a Dates?_

> Manipulating dates in Java has always been a chore. In Java 1.0 there was only the Date class, which was cumbersome to use and didn't work well with internationalization. With the release of Java 1.1 came the abstract class Calendar, with many more features, but with mutability and questionable design decisions.
>
> As of Java 8, there is a new date API available in the java.time package. This API is an excellent addition to the standard Java libraries and has been in development since 2007.
>
> One of the main concepts of this new API is the separation of how temporal data is interpreted into two categories: that of computers and that of humans.

# _Annotations_

## _What is a Annotations?_

> To define an annotation in Java code, we use the at sign (@) followed by its name. Depending on the annotation category, you may need to add data to it, in the form of name=value pairs.
>
> There are three categories of annotations:
>
> - Marker annotations – are those that do not have members. They are identified by name only, without additional data. For example, @Override is a placeholder annotation;
>
> - Single-valued annotations – are similar to the previous ones, however, they have a single member, called a value. They are represented by the annotation name and a name=value pair, or simply with the value, in parentheses. In other words, when the annotation has a single member, it is only necessary to inform the value, in addition to the name of the annotation. For example, @MyAnnotation(“value”) is a syntax example of this type of annotation;
>
> - Complete annotations – are those that have multiple members. Therefore, in this type, we must use the full syntax for each name=value pair. In this case, each pair is informed separated from the other by a comma. For example, @Version(major=1, minor=0, micro=0) is a case of full annotation.

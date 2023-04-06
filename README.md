## Java Variables

## Contents

* [Creator](https://github.com/csalguera/java-variables#creator)
* [CountComment](https://github.com/csalguera/java-variables#countcomment)
* [MarketShare](https://github.com/csalguera/java-variables#marketshare)
* [Booleans](https://github.com/csalguera/java-variables#booleans)
* [Char](https://github.com/csalguera/java-variables#char)
* [Song](https://github.com/csalguera/java-variables#song)
* [Mess](https://github.com/csalguera/java-variables#mess)
* [BadNames](https://github.com/csalguera/java-variables#badnames)
* [MyProfile](https://github.com/csalguera/java-variables#myprofile)

## Creator

```
public class Creator {
  public static void main(String[] args) {
    String name = "James Gosling"
    int yearCreated = 1995; 
  }
}
```

In ```Creator.java```, we have defined some variables related to James Gosling, the creator of Java.

Inside ```main()```, use ```System.out.println()``` to print out the variable name.

Use the same command to print out ```yearCreated```.

## CountComment

```
// This is the class declaration
public class CountComment {
  // This is the main method that runs when you compile
  public static void main(String[] args) {
    // This is where you will define your variable

    // This is where you will print your variable

  }

  // This is the end of the class
}

// This is outside the class
```

The file ```CountComment.java``` has a number of comments in it.

In your head, count the number of comments. Then, inside the ```main() method```, declare a variable called ```numComments``` that holds how many comments you counted.

Print out ```numComments```.

## MarketShare

```
public class MarketShare {
  public static void main(String[] args) {
    
  }
}
```

As of 2016, Android has ```81.7``` percent of the market share for mobile operating systems. Create a variable called ```androidShare``` that holds this percentage as a ```double```.

Print out androidShare to the console.

## Booleans

```
public class Booleans {
  public static void main(String[] args) {

  }
}
```

Create a variable called ```intsCanHoldDecimals```. Set it to ```true``` if the ```int type``` can hold a decimal number. Set it to ```false``` if the ```int type``` cannot do this.

Print out your ```intsCanHoldDecimals``` variable.

## Char

```
public class Char {
	public static void main(String[] args) {   

	}
}
```

Create a variable called expectedGrade of type char.

Fill it with a single letter, representing the grade you think you would get in a graded Java course where the grades A, B, C, D and F are possible.

Print out your expectedGrade variable!

## Song

```
public class Song {
  public static void main(String[] args) {
    
  }
}
```

Create a variable called ```openingLyrics``` that has a value of: ```Yesterday, all my troubles seemed so far away```

Call ```System.out.println()``` to print out ```openingLyrics```.

## Mess

```
public class Mess {
	public static void main(String[] args) {   
		String year = 2001;
    double title = "Shrek";
    int genre = 'C';
    boolean runtime = 1.58;
    char isPG = true;
	}
}
```

In the ```Mess.java``` file, we have declared a bunch of ```variables``` with the wrong ```type```. Try to ```compile``` the file using the command:

```
javac Mess.java
```

Change the ```types``` of the ```variables``` so that they correspond with the ```type``` of the assignment ```values```.

For example, ```year``` is assigned ```2001```, so it should be an ```int```.

```Compile``` the file again. Look at how it compiles with no errors now!

## BadNames

```
public class BadNames {
	public static void main(String[] args) {   
		String 1stName = "Samira";
    String blah = "Smith";
    String .com = "samira@google.com";
    int salaryexpectation = 100000;
    int year_of_birth = 1955;
    
    System.out.println("The program runs!");
	}
}
```

In the ```BadNames.java``` file, we declared ```variables``` with confusing names. ```Run``` the file and look at the error messages you get when trying to ```compile```.

Some of these ```variable``` names are illegal! Change the ones that are preventing the file from compiling.

## MyProfile

```
public class MyProfile {
  public static void main(String[] args) {

  }
}
```

The file ```MyProfile.java``` contains a ```class``` that represents your hiring profile as presented to potential employers.

In the ```main() method```, create a ```variable``` called ```name``` that holds your name, as a ```sequence of characters```.

Create a ```variable``` called ```age``` that holds your age as a ```whole number```.

Create a ```variable``` called ```desiredSalary``` that holds your desired salary per year to a precision of two ```decimal``` points.

Create a ```variable``` called ```gender``` that holds a ```single character```, m (male), f (female), n (for none), or o (for other).

Create a ```variable``` called ```lookingForJob``` that holds whether or not you are currently open to job offers.
# JAVA Notes

**_(Course : udemy - Java Programming Masterclass for Software Developers)_**

## _Hello World Program_

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

## _Data Types_ -

### _Primitive Data Types_

| TYPE                                                                | SIZE                    | RANGE                                                                   |
| ------------------------------------------------------------------- | ----------------------- | ----------------------------------------------------------------------- |
| **_Byte_** - Stores Integer.                                        | 1 Byte                  | -128 to 127                                                             |
| **_Short_** - Stores Integer.                                       | 2 Bytes                 | -32,768 to 32,767                                                       |
| **_Int_** - Stores Integer.                                         | 4 Bytes                 | -2,147,483,648 to 2,147,483, 647                                        |
| **_Long_** - Stores Integer.                                        | 8 bytes                 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807                 |
| **_Float_** - Stores floating point number.                         | 4 bytes                 | approximately ±3.40282347E+38F (6-7 significant decimal digits)         |
| **_Double_** - Stores floating point number but has more precision. | 8 bytes                 | approximately ±1.79769313486231570E+308 (15 significant decimal digits) |
| **_Char_** - Stores single character.                               | 2 Bytes                 | 0 to 65,536 (unsigned)                                                  |
| **_Boolean_** - Stores true/false value.                            | not precisely defined\* | true or false                                                           |

### _Non-primitive Datatype_

**`String`** - String is a datatype in Java which is not a primitive type. It actually is a class. A string is a sequence of characters.

Strings are immutable. whenever we concatenate or perform any operations on strings a new string in created and the old one is discarded.

### Operators -

#### `Arithmetic`

```java
/*ADDITION*/
int add = 5 + 1; // addition operator
System.out.println("5 + 1 = " + add); // 5 + 1 = 6

add += 8; // Short-hand operator for addition | Same as : add = add + 8
System.out.println("6 + 8 = "+ add); // 6 + 8 = 14

add++; // increment operator | same as : add = add + 1
System.out.println("14 + 1 = "+ add); // 14 + 1 = 15

/*MULTIPLICATION*/

int multiply = 6 * 2; // multiplication operator
System.out.println("6 * 2 = " + multiply); // 6 * 2 = 12

multiply *= 4; // Short-hand operator for multiplication | Same as : multiply = multiply * 4
System.out.println("12 * 4 = " + multiply);

/*SUBTRACTION*/

int subt = 5 - 1; // Subtraction operator
System.out.println("5 - 1 = " + subt); // 5 - 1 = 4

subt -= 8; // Short-hand operator for subtraction | Same as : subt = subt + 8
System.out.println("4 - 8 = " + subt); // 4 - 8 = -4

subt--; // decrement operator | same as : subt = subt - 1
System.out.println("-4 - 1 = " + subt); // -4 - 1 = -5

/*DIVISION*/

int div = 6 / 2; // Division operator
System.out.println("6 /2 = " + div); // 6 / 2 = 3

div /= 4; // Short-hand operator for Division | Same as : div = div * 4
System.out.println("3 / 4 = " + div); // 3 / 4 = 0 | integer division
```

_`Note : + operator is also used for string concatination.`_

#### `Relational`

```java
/* EQUAL TO (==) */
boolean equalTo = 5==6; // false
System.out.println(equalTo);

/* NOT EQUAL TO (!=) */
boolean notEqual = 5 != 4; // true
System.out.println(notEqual);

/* GREATER THAN (>) */
boolean greater = 6 > 2; // true
System.out.println(greater);

/* GREATER THAN OR EQUAL TO (>=) */
boolean greaterEqual = 5 >= 5; // true
System.out.println(greaterEqual);

/* LESSER THAN (<) */
boolean lesser = 8 < 10; // true
System.out.println(lesser);

/* LESSER THAN OR EQUAL TO */
boolean lesserEqual = 8 <= 8; // true
System.out.println(lesserEqual);
```

#### `Logical`

```java
/* OR (||) */
boolean thisOrThat = 50 > 100 || 45 < 50; // true
System.out.println(thisOrThat);

/* AND (&&) */
boolean thisAndThat = 50 > 100 && 45 < 50; // false
System.out.println(thisAndThat);

/* NOT (!) */
boolean notThis = !(50 > 100); // true
System.out.println(notThis);
```

#### `Ternary Operator (?:)`

Its a short hand for if-else statement

```java
double number1 = 20.0;
double number2 = 80.0;
double addAndMultiply = (number1 + number2) * 100;
double remainder = addAndMultiply%40;
boolean checkRemainder = remainder == 0 ? true :  false;
System.out.println(checkRemainder); // true
```

#### Java Operator Precedence Table

Larger number means higher precedence.
|Precedence|Operator|Type|Associativity|
|-----|-----|-----|-----|
|15|()|Parentheses|Left to Right|
|15|[]|Array subscript|Left to Right|
|15|.|Member selection|Left to Right|
|||||
|14|++|Unary post-increment|Right to Left|
|14|--|Unary post-decrement|Right to Left|
|||||
|13|++|Unary pre-increment|Right to Left|
|13|--|Unary pre-decrement|Right to Left|
|13|+|Unary plus|Right to Left|
|13|-|Unary minus|Right to Left|
|13|!|Unary logical negation|Right to Left|
|13|~|Unary bitwise complement|Right to Left|
|13|(_type_)|Unary type cast|Right to Left|
|||||
|12|_|Multiplication|Left to right|
|12|/|Division|Left to right|
|12|%|Modulus|Left to right|
|||||
|11|+|Addidion|Left to Right|
|11|-|Subtraction|Left to Right|
|||||
|10|<<|Bitwise left shift|Left to Right|
|10|>>|Bitwise right shift with sign extension|Left to Right|
|10|>>>|Bitwise right shift with zero extension|Left to Right|
|||||
|9|<|Relational less than|Left to right|
|9|<=|Relational less than or equal|Left to right|
|9|>|Relational greater than|Left to right|
|9|>=|Relational greater than or equal|Left to right|
|9|instanceof|Type comparison (objects only)|Left to right|
|||||
|8|==|Relational is equal to|Left to right|
|8|!=|Relational is not equal to|Left to right|
|||||
|7|&|Bitwise AND|Left to right|
|||||
|6|^|Bitwise exclusive OR|Left to right|
|||||
|5|`|`|Bitwise inclusive OR|Left to right|
|||||
|4|&&|Logical AND|Left to right|
|||||
|3|`||`|Logical OR|Left to right|
|||||
|2|? :|Ternary conditional|Right to left|
|||||
|1|=|Assignment|Right to left|
|1|+=|Addition Assignment|Right to left|
|1|-=|Subtraction Assignment|Right to left|
|1|_=|Multiplication Assignment|Right to left|
|1|/=|Division Assignment|Right to left|
|1|%=|Modulus Assignment|Right to left|

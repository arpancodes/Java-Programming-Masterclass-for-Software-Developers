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
int add = 5 + 1; // addition operator
add += 8; // Short-hand operator for addition | Same as : add = add + 8
add++; // increment operator | same as : add = add + 1

int multiply = 6 * 2; // multiplication operator
multiply *= 4; // Short-hand operator for multiplication | Same as : multiply = multiply * 4

int subt = 5 - 1; // Subtraction operator
subt -= 8; // Short-hand operator for subtraction | Same as : subt = subt + 8
subt--; // decrement operator | same as : subt = subt - 1

int div = 6 / 2; // Division operator
div /= 4; // Short-hand operator for Division | Same as : div = div * 4
```

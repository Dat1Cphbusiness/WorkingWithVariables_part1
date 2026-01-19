# Level2: Operators & Expressions

## Level2 fokuserer på:
- Arithmetic operators (+, -, *, /, %)
- String concatenation (+)
- Operator precedence (rækkefølge)
- Type coercion (int + double)
- Integer division vs decimal division
- Modulo operator (% - rest/remainder)
- Compound assignment (+=, -=, *=, /=)
- Combining numbers and strings

---

## Begrebsgennemgang

### Arithmetic Operators (Regneartsoperatorer)

**Addition (+)** - lægge sammen:
```java
int apples = 5;
int oranges = 3;
int totalFruit = apples + oranges;  // 8
```

**Subtraction (-)** - trække fra:
```java
int money = 100;
int spent = 35;
int remaining = money - spent;  // 65
```

**Multiplication (*)** - gange:
```java
int pricePerPizza = 50;
int numberOfPizzas = 3;
int totalCost = pricePerPizza * numberOfPizzas;  // 150
```

**Division (/)** - dividere:
```java
int totalCandy = 20;
int kids = 4;
int candyPerKid = totalCandy / kids;  // 5
```

**Modulo (%)** - rest/remainder:
```java
int totalCandy = 23;
int kids = 4;
int leftover = totalCandy % kids;  // 3 (23 ÷ 4 = 5 med rest 3)
```

### String Concatenation (Sammenkædning)

**Plus (+) med Strings** - sæt sammen:
```java
String firstName = "Anna";
String lastName = "Jensen";
String fullName = firstName + " " + lastName;  // "Anna Jensen"
```

### StringBuilder

**StringBuilder** - byg tekst stykke for stykke:
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();  // "Hello World"
```

Strings i Java er *immutable* (uforanderlige). Når du bruger `+` til at sætte Strings sammen, oprettes der faktisk en ny String hver gang. Ved mange sammenkædninger bliver det ineffektivt.

StringBuilder holder på én buffer, som du kan tilføje til uden at oprette nye objekter. Det er hurtigere og bruger mindre hukommelse – især i loops eller når du bygger lange tekster.

**Combining numbers and strings:**
```java
int age = 25;
String message = "Age: " + age;  // "Age: 25"
```

**VIGTIGT - Rækkefølge betyder noget:**
```java
System.out.println("Sum: " + 5 + 3);     // "Sum: 53" (string concat!)
System.out.println("Sum: " + (5 + 3));   // "Sum: 8" (math first!)
```

### Integer Division vs Decimal Division

**Integer division** (begge er int):
```java
int a = 7;
int b = 2;
int result = a / b;  // 3 (ikke 3.5! - decimaler ryger væk)
```

**Decimal division** (mindst én er double):
```java
double a = 7.0;
int b = 2;
double result = a / b;  // 3.5 (korrekt decimal resultat)
```

**Force decimal division:**
```java
int a = 7;
int b = 2;
double result = (double) a / b;  // 3.5 (cast til double)
```

### Modulo Operator (%) - Praktiske Eksempler

**Even or odd check:**
```java
int number = 7;
int remainder = number % 2;
if (remainder == 0) {
    System.out.println("Even");  // Lige tal
} else {
    System.out.println("Odd");   // Ulige tal
}
```

**Cycling through values:**
```java
int day = 23;
int dayOfWeek = day % 7;  // 0-6 (cycles through week)
```

**Get leftovers:**
```java
int cookies = 23;
int people = 5;
int cookiesEach = cookies / people;    // 4 (hver person)
int leftover = cookies % people;       // 3 (til overs)
```

### Operator Precedence (Rækkefølge)

Ligesom i matematik, har operators en rækkefølge:

1. **Parentheses ()** - først
2. **Multiplication *, Division /, Modulo %** - derefter
3. **Addition +, Subtraction -** - sidst

**Eksempel:**
```java
int result = 5 + 3 * 2;      // 11 (3*2 først = 6, så 5+6 = 11)
int result = (5 + 3) * 2;    // 16 (5+3 først = 8, så 8*2 = 16)
```

**Brug parenteser for at være tydelig:**
```java
// Uklart
int x = a + b * c / d - e;

// Klart
int x = (a + ((b * c) / d)) - e;
```

### Type Coercion (Type Konvertering)

Når du blander int og double, bliver resultatet double:

```java
int wholeNumber = 5;
double decimal = 2.5;
double result = wholeNumber + decimal;  // 7.5 (becomes double)
```

**Automatisk conversion:**
```java
int a = 10;
double b = a;  // OK - int bliver til double automatisk
```

**Manual conversion (casting):**
```java
double a = 10.7;
int b = (int) a;  // 10 - mister decimaler
```

### Compound Assignment Operators

**Shorthand for common patterns:**

```java
int score = 100;

// Long form
score = score + 10;

// Short form (compound assignment)
score += 10;  // Same as score = score + 10
```

**Alle compound operators:**
```java
int value = 10;

value += 5;   // value = value + 5;  → 15
value -= 3;   // value = value - 3;  → 12
value *= 2;   // value = value * 2;  → 24
value /= 4;   // value = value / 4;  → 6
value %= 4;   // value = value % 4;  → 2
```

**Med doubles:**
```java
double price = 100.0;
price *= 1.25;  // Add 25% markup → 125.0
```

### Common Mistakes

**1. Integer division surprise:**
```java
int a = 5;
int b = 2;
double result = a / b;  // 2.0 (ikke 2.5!)
// Fix:
double result = (double) a / b;  // 2.5
```

**2. String concatenation vs addition:**
```java
System.out.println(5 + 3);        // 8 (addition)
System.out.println("5" + "3");    // "53" (string concat)
System.out.println("5" + 3);      // "53" (3 bliver til string)
System.out.println(5 + 3 + " kr"); // "8 kr" (math first, then concat)
```

**3. Parentheses forgotten:**
```java
double average = sum / count * 100;  // WRONG order!
double average = (sum / count) * 100; // Correct
```

**Skriv din kode i Main.java i testLevel2() metoden.**

---

## Tips
- Brug parenteser når du er i tvivl om rækkefølge
- int / int = int (mister decimaler)
- Brug (double) for at force decimal division
- % giver remainder/rest (godt til even/odd, cycling)
- String + anything = String
- += er shorthand for = ... +
- Test calculations med små tal først
- Al din kode skal placeres inde i `testLevel2()` metoden mellem tuborgklammerne `{}`

---

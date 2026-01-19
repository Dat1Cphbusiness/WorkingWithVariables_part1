# Opgaver: Variable Basics & Data Types

- [ ] [Del A: Declaration & Initialization](#del-a-declaration--initialization)
- [ ] [Del B: Working with int](#del-b-working-with-int)
- [ ] [Del C: Working with double](#del-c-working-with-double)
- [ ] [Del D: Working with boolean](#del-d-working-with-boolean)
- [ ] [Del E: Working with char](#del-e-working-with-char)
- [ ] [Del F: Working with String](#del-f-working-with-string)
- [ ] [Del G: Working with Arrays (Sneak Peek)](#del-g-working-with-arrays-sneak-peek)
- [ ] [Del H: Mixed Types](#del-h-mixed-types)
- [ ] [Refleksionsspørgsmål](#refleksionsspørgsmål)

## Del A: Declaration & Initialization

### Opgave 1.1: Din første variabel
📖 [Se forklaring: Declaration & Initialization](../concepts/level1.md#declaration-vs-initialization)

**Opgave:**
1. Lav en klasse i src folderen. Du bestemmer navnet på klassen.
2. Skriv en main metode i klassen.
3. Erklær en int variabel kaldet `myAge`
4. Initialiser den til din alder
5. Print variablen

**Forventet Output:** (eksempel)
```
25
```

---

I de følgende opgaver fylder du bare på i main metoden.

### Opgave 1.2: Declaration og initialization separat

**Opgave:**

Erklær en int variabel `score` uden at initialisere den.  
På næste linje, tildel værdien 100 til `score`.  
Udskriv score.

<details>
<summary>Hjælp</summary>
<detail>

1. `int score;`
2. `score = 100;`
3. `System.out.println(score);`

</detail>
</details>

**Forventet Output:**
```
100
```

---

### Opgave 1.3: Declaration på én linje

**Opgave:**

Erklær og initialiser en double variabel `price` til 49.99 på én linje.  
Udskriv price.

<details>
<summary>Hjælp</summary>
<detail>

1. `double price = 49.99;`
2. `System.out.println(price);`

</detail>
</details>

**Forventet Output:**
```
49.99
```

---

### Opgave 1.4: Multiple variables
📖 [Se forklaring: Primitive Data Types](../concepts/level1.md#data-types)

**Opgave:**

Erklær og initialiser tre variabler: en int `quantity` (fx. 5), en double `pricePerItem` (fx. 12.50) og en boolean `inStock` (fx. true).  
Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `int quantity = 5;`
2. `double pricePerItem = 12.50;`
3. `boolean inStock = true;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
5
12.5
true
```

---

### Opgave 1.5: Char variable

**Opgave:**

Erklær en char variabel `grade` og initialiser den til 'A'.  
Udskriv grade.

<details>
<summary>Hjælp</summary>
<detail>

1. `char grade = 'A';`
2. `System.out.println(grade);`

</detail>
</details>

**Forventet Output:**
```
A
```

---

## Del B: Working with int

### Opgave 1.6: Int operations

**Opgave:**

Erklær en int variabel `number` med værdien 10.  
Udskriv number.  
Tildel number en ny værdi: 20.  
Udskriv number igen.

<details>
<summary>Hjælp</summary>
<detail>

1. `int number = 10;`
2. `System.out.println(number);`
3. `number = 20;`
4. `System.out.println(number);`

</detail>
</details>

**Forventet Output:**
```
10
20
```

---

### Opgave 1.7: Flere int variabler

**Opgave:**

Erklær tre int variabler: `age` (fx. 25), `year` (fx. 2026) og `quantity` (fx. 42).  
Udskriv alle tre på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `int age = 25;`
2. `int year = 2026;`
3. `int quantity = 42;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
25
2026
42
```

---

### Opgave 1.8: Updating int
📖 [Se forklaring: Reassignment](../concepts/level1.md#reassignment)

**Opgave:**

Erklær en int variabel `counter` med værdien 0.  
Udskriv counter.  
Tildel counter værdien 1.  
Udskriv counter.  
Tildel counter værdien 6.  
Udskriv counter.

<details>
<summary>Hjælp</summary>
<detail>

1. `int counter = 0;`
2. `System.out.println(counter);`
3. `counter = 1;`
4. `System.out.println(counter);`
5. `counter = 6;`
6. `System.out.println(counter);`

</detail>
</details>

**Forventet Output:**
```
0
1
6
```

---

### Opgave 1.9: Int med negative tal

**Opgave:**

Erklær en int variabel `temperature` med værdien -5.  
Udskriv temperature.  
Tildel temperature værdien 10.  
Udskriv temperature.

<details>
<summary>Hjælp</summary>
<detail>

1. `int temperature = -5;`
2. `System.out.println(temperature);`
3. `temperature = 10;`
4. `System.out.println(temperature);`

</detail>
</details>

**Forventet Output:**
```
-5
10
```

---

### Opgave 1.10: Int variabel navngivning

**Opgave:**

Erklær tre int variabler med beskrivende navne for: antal studerende (fx. 28), antal sider i en bog (fx. 350) og antal dage i en måned (fx. 30).  
Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `int studentCount = 28;`
2. `int pageCount = 350;`
3. `int daysInMonth = 30;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
28
350
30
```

---

## Del C: Working with double

### Opgave 1.11: Double operations

**Opgave:**

Erklær en double variabel `price` med værdien 19.99.  
Udskriv price.  
Tildel price værdien 24.99.  
Udskriv price.

<details>
<summary>Hjælp</summary>
<detail>

1. `double price = 19.99;`
2. `System.out.println(price);`
3. `price = 24.99;`
4. `System.out.println(price);`

</detail>
</details>

**Forventet Output:**
```
19.99
24.99
```

---

### Opgave 1.12: Flere double variabler

**Opgave:**

Erklær tre double variabler: `height` (fx. 1.75), `weight` (fx. 68.5) og `temperature` (fx. 36.6).  
Udskriv alle tre på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `double height = 1.75;`
2. `double weight = 68.5;`
3. `double temperature = 36.6;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
1.75
68.5
36.6
```

---

### Opgave 1.13: Int to double
📖 [Se forklaring: Type Conversion](../concepts/level1.md#type-conversion)

**Opgave:**

Erklær en int variabel `wholeNumber` med værdien 10.  
Erklær en double variabel `decimalNumber` og tildel den værdien af wholeNumber.  
Udskriv decimalNumber og bemærk at den bliver 10.0.

<details>
<summary>Hjælp</summary>
<detail>

1. `int wholeNumber = 10;`
2. `double decimalNumber = wholeNumber;`
3. `System.out.println(decimalNumber);`

</detail>
</details>

**Forventet Output:**
```
10.0
```

---

### Opgave 1.14: Double til int (casting)

**Opgave:**

Erklær en double variabel `price` med værdien 19.99.  
Erklær en int variabel `roundedPrice` og tildel den værdien af price ved at caste med (int).  
Udskriv begge og bemærk at decimalerne forsvinder.

<details>
<summary>Hjælp</summary>
<detail>

1. `double price = 19.99;`
2. `int roundedPrice = (int) price;`
3. Print begge

</detail>
</details>

**Forventet Output:**
```
19.99
19
```

---

### Opgave 1.15: Precision loss

**Opgave:**

Erklær en double variabel `exactValue` med værdien 99.99.  
Erklær en int variabel `wholeValue` og cast exactValue til int.  
Udskriv begge for at se forskellen.

<details>
<summary>Hjælp</summary>
<detail>

1. `double exactValue = 99.99;`
2. `int wholeValue = (int) exactValue;`
3. Print begge

</detail>
</details>

**Forventet Output:**
```
99.99
99
```

---

## Del D: Working with boolean

### Opgave 1.16: Boolean basics

**Opgave:**

Erklær en boolean variabel `isRaining` med værdien true.  
Udskriv isRaining.  
Tildel isRaining værdien false.  
Udskriv isRaining.

<details>
<summary>Hjælp</summary>
<detail>

1. `boolean isRaining = true;`
2. `System.out.println(isRaining);`
3. `isRaining = false;`
4. `System.out.println(isRaining);`

</detail>
</details>

**Forventet Output:**
```
true
false
```

---

### Opgave 1.17: Multiple booleans

**Opgave:**

Erklær tre boolean variabler: `hasDiscount` (true), `isPremium` (false) og `isActive` (true).  
Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `boolean hasDiscount = true;`
2. `boolean isPremium = false;`
3. `boolean isActive = true;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
true
false
true
```

---

### Opgave 1.18: Boolean naming
📖 [Se forklaring: Variable Naming Conventions](../concepts/level1.md#variable-naming-conventions)

**Opgave:**

Erklær booleans med passende navne og værdier for:
- En der indikerer om en person er student (true)
- En der indikerer om en butik er åben (false)
- En der indikerer om en ordre er completed (true)

Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `boolean isStudent = true;`
2. `boolean isOpen = false;`
3. `boolean isCompleted = true;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
true
false
true
```

---

### Opgave 1.19: Boolean toggle

**Opgave:**

Erklær en boolean variabel `isEnabled` med værdien false.  
Udskriv isEnabled.  
Tildel isEnabled værdien true.  
Udskriv isEnabled.  
Tildel isEnabled værdien false.  
Udskriv isEnabled.

<details>
<summary>Hjælp</summary>
<detail>

1. `boolean isEnabled = false;`
2. `System.out.println(isEnabled);`
3. `isEnabled = true;`
4. `System.out.println(isEnabled);`
5. `isEnabled = false;`
6. `System.out.println(isEnabled);`

</detail>
</details>

**Forventet Output:**
```
false
true
false
```

---

### Opgave 1.20: Boolean i kontekst

**Opgave:**

Forestil dig et login-system. Erklær booleans for: om brugeren er logget ind (true), om brugeren har admin-rettigheder (false) og om kontoen er verificeret (true).  
Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `boolean isLoggedIn = true;`
2. `boolean isAdmin = false;`
3. `boolean isVerified = true;`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
true
false
true
```

---

## Del E: Working with char

### Opgave 1.21: Char basics

**Opgave:**

Erklær en char variabel `initial` med værdien 'M'.  
Udskriv initial.  
Tildel initial værdien 'K'.  
Udskriv initial.

<details>
<summary>Hjælp</summary>
<detail>

1. `char initial = 'M';`
2. `System.out.println(initial);`
3. `initial = 'K';`
4. `System.out.println(initial);`

</detail>
</details>

**Forventet Output:**
```
M
K
```

---

### Opgave 1.22: Multiple chars

**Opgave:**

Erklær tre char variabler: `gradeA` ('A'), `gradeB` ('B') og `gradeC` ('C').  
Udskriv alle tre på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `char gradeA = 'A';`
2. `char gradeB = 'B';`
3. `char gradeC = 'C';`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
A
B
C
```

---

### Opgave 1.23: Char symbols

**Opgave:**

Erklær tre char variabler med symboler: `star` ('*'), `plus` ('+') og `dollar` ('$').  
Udskriv alle tre.

<details>
<summary>Hjælp</summary>
<detail>

1. `char star = '*';`
2. `char plus = '+';`
3. `char dollar = '$';`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
*
+
$
```

---

### Opgave 1.24: Char numbers

**Opgave:**

Erklær en char variabel `digit` med værdien '5'.  
Udskriv digit.  
Tildel digit værdien '9'.  
Udskriv digit.

<details>
<summary>Hjælp</summary>
<detail>

1. `char digit = '5';`
2. `System.out.println(digit);`
3. `digit = '9';`
4. `System.out.println(digit);`

</detail>
</details>

**Forventet Output:**
```
5
9
```

---

### Opgave 1.25: Char vs String

**Opgave:**

Erklær en char variabel `singleLetter` med værdien 'A' (bemærk: single quotes).  
Erklær en String variabel `singleLetterString` med værdien "A" (bemærk: double quotes).  
Udskriv begge – outputtet ser ens ud, men typerne er forskellige!

<details>
<summary>Hjælp</summary>
<detail>

1. `char singleLetter = 'A';`
2. `String singleLetterString = "A";`
3. Print begge

</detail>
</details>

**Forventet Output:**
```
A
A
```

---

## Del F: Working with String

### Opgave 1.26: String basics
📖 [Se forklaring: String](../concepts/level1.md#5-string---tekst)

**Opgave:**

Erklær en String variabel `name` med værdien "Anna".  
Udskriv name.

<details>
<summary>Hjælp</summary>
<detail>

1. `String name = "Anna";`
2. `System.out.println(name);`

</detail>
</details>

**Forventet Output:**
```
Anna
```

---

### Opgave 1.27: String reassignment

**Opgave:**

Erklær en String variabel `city` med værdien "Copenhagen".  
Udskriv city.  
Tildel city værdien "Aarhus".  
Udskriv city.

<details>
<summary>Hjælp</summary>
<detail>

1. `String city = "Copenhagen";`
2. `System.out.println(city);`
3. `city = "Aarhus";`
4. `System.out.println(city);`

</detail>
</details>

**Forventet Output:**
```
Copenhagen
Aarhus
```

---

### Opgave 1.28: Multiple Strings

**Opgave:**

Erklær tre String variabler: `firstName` (fx. "Anna"), `lastName` (fx. "Jensen") og `country` (fx. "Denmark").  
Udskriv alle tre på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String firstName = "Anna";`
2. `String lastName = "Jensen";`
3. `String country = "Denmark";`
4. Print alle tre

</detail>
</details>

**Forventet Output:**
```
Anna
Jensen
Denmark
```

---

### Opgave 1.29: Tom String

**Opgave:**

Erklær en String variabel `emptyText` med en tom streng "".  
Erklær en String variabel `greeting` med værdien "Hello".  
Udskriv begge (bemærk at den tomme streng ikke viser noget).

<details>
<summary>Hjælp</summary>
<detail>

1. `String emptyText = "";`
2. `String greeting = "Hello";`
3. Print begge

</detail>
</details>

**Forventet Output:**
```

Hello
```

---

### Opgave 1.30: String med tal

**Opgave:**

Erklær en String variabel `phoneNumber` med værdien "12345678".  
Erklær en String variabel `zipCode` med værdien "2100".  
Udskriv begge – selvom de ser ud som tal, er de tekst!

<details>
<summary>Hjælp</summary>
<detail>

1. `String phoneNumber = "12345678";`
2. `String zipCode = "2100";`
3. Print begge

</detail>
</details>

**Forventet Output:**
```
12345678
2100
```

---

### Opgave 1.31: String med mellemrum og tegn

**Opgave:**

Erklær en String variabel `sentence` med værdien "Hello, World!".  
Erklær en String variabel `address` med værdien "Main Street 42".  
Udskriv begge.

<details>
<summary>Hjælp</summary>
<detail>

1. `String sentence = "Hello, World!";`
2. `String address = "Main Street 42";`
3. Print begge

</detail>
</details>

**Forventet Output:**
```
Hello, World!
Main Street 42
```

---

### Opgave 1.32: String length, charAt og indexOf

**Opgave:**

Erklær en String variabel `word` med værdien "Hello".  
Udskriv længden af word ved at bruge `word.length()`.  
Udskriv det første tegn ved at bruge `word.charAt(0)`.  
Udskriv det sidste tegn ved at bruge `word.charAt(4)`.  
Udskriv positionen af bogstavet 'e' ved at bruge `word.indexOf('e')`.

<details>
<summary>Hjælp</summary>
<detail>

1. `String word = "Hello";`
2. `System.out.println(word.length());`
3. `System.out.println(word.charAt(0));`
4. `System.out.println(word.charAt(4));`
5. `System.out.println(word.indexOf('e'));`

</detail>
</details>

**Forventet Output:**
```
5
H
o
1
```

---

## Del G: Working with Arrays (Sneak Peek)

### Opgave 1.33: Int array
📖 [Se forklaring: Arrays](../concepts/level1.md#sneak-peek-arrays)

**Opgave:**

Erklær et int array `scores` med værdierne {100, 85, 92, 78}.  
Udskriv det første element (indeks 0).  
Udskriv det tredje element (indeks 2).

<details>
<summary>Hjælp</summary>
<detail>

1. `int[] scores = {100, 85, 92, 78};`
2. `System.out.println(scores[0]);`
3. `System.out.println(scores[2]);`

</detail>
</details>

**Forventet Output:**
```
100
92
```

---

### Opgave 1.34: String array

**Opgave:**

Erklær et String array `names` med værdierne {"Anna", "Bo", "Carl"}.  
Udskriv det første navn (indeks 0).  
Udskriv det sidste navn (indeks 2).

<details>
<summary>Hjælp</summary>
<detail>

1. `String[] names = {"Anna", "Bo", "Carl"};`
2. `System.out.println(names[0]);`
3. `System.out.println(names[2]);`

</detail>
</details>

**Forventet Output:**
```
Anna
Carl
```

---

### Opgave 1.35: Array length

**Opgave:**

Erklær et double array `prices` med værdierne {19.99, 24.50, 9.95, 14.99, 29.99}.  
Udskriv arrayets længde ved at bruge `prices.length` (bemærk: ingen parenteser!).  
Udskriv det første og sidste element.

<details>
<summary>Hjælp</summary>
<detail>

1. `double[] prices = {19.99, 24.50, 9.95, 14.99, 29.99};`
2. `System.out.println(prices.length);`
3. `System.out.println(prices[0]);`
4. `System.out.println(prices[4]);`

</detail>
</details>

**Forventet Output:**
```
5
19.99
29.99
```

---

## Del H: Mixed Types

### Opgave 1.36: Forskellige typer sammen

**Opgave:**

Erklær en variabel af hver type med passende værdier:
- String `productName` (fx. "Laptop")
- int `quantity` (fx. 3)
- double `price` (fx. 7999.95)
- boolean `inStock` (fx. true)
- char `category` (fx. 'E' for Electronics)

Udskriv alle fem på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String productName = "Laptop";`
2. `int quantity = 3;`
3. `double price = 7999.95;`
4. `boolean inStock = true;`
5. `char category = 'E';`
6. Print alle fem

</detail>
</details>

**Forventet Output:**
```
Laptop
3
7999.95
true
E
```

---

### Opgave 1.37: Person data

**Opgave:**

Erklær variabler der beskriver en person:
- String `name` (fx. "Maria")
- int `age` (fx. 28)
- double `height` (fx. 1.72)
- boolean `isStudent` (fx. false)
- char `bloodType` (fx. 'A')

Udskriv alle fem på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String name = "Maria";`
2. `int age = 28;`
3. `double height = 1.72;`
4. `boolean isStudent = false;`
5. `char bloodType = 'A';`
6. Print alle fem

</detail>
</details>

**Forventet Output:**
```
Maria
28
1.72
false
A
```

---

### Opgave 1.38: Spil karakter

**Opgave:**

Erklær variabler der beskriver en spilkarakter:
- String `characterName` (fx. "Knight")
- int `health` (fx. 100)
- int `level` (fx. 5)
- double `speed` (fx. 2.5)
- boolean `isAlive` (fx. true)

Udskriv alle fem på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String characterName = "Knight";`
2. `int health = 100;`
3. `int level = 5;`
4. `double speed = 2.5;`
5. `boolean isAlive = true;`
6. Print alle fem

</detail>
</details>

**Forventet Output:**
```
Knight
100
5
2.5
true
```

---

### Opgave 1.39: Vejr data

**Opgave:**

Erklær variabler der beskriver vejret:
- String `city` (fx. "Copenhagen")
- double `temperature` (fx. 18.5)
- int `humidity` (fx. 65)
- boolean `isRaining` (fx. false)
- char `windDirection` (fx. 'N' for North)

Udskriv alle fem på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String city = "Copenhagen";`
2. `double temperature = 18.5;`
3. `int humidity = 65;`
4. `boolean isRaining = false;`
5. `char windDirection = 'N';`
6. Print alle fem

</detail>
</details>

**Forventet Output:**
```
Copenhagen
18.5
65
false
N
```

---

### Opgave 1.40: Bog data

**Opgave:**

Erklær variabler der beskriver en bog:
- String `title` (fx. "Java Programming")
- String `author` (fx. "James Gosling")
- int `pages` (fx. 450)
- double `price` (fx. 299.95)
- boolean `isAvailable` (fx. true)

Udskriv alle fem på separate linjer.

<details>
<summary>Hjælp</summary>
<detail>

1. `String title = "Java Programming";`
2. `String author = "James Gosling";`
3. `int pages = 450;`
4. `double price = 299.95;`
5. `boolean isAvailable = true;`
6. Print alle fem

</detail>
</details>

**Forventet Output:**
```
Java Programming
James Gosling
450
299.95
true
```

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem declaration og initialization?
2. Hvilke data typer har du arbejdet med?
3. Hvornår bruger du int vs double?
4. Hvad er forskellen mellem char og String?
5. Hvad betyder det at en boolean kun kan være true eller false?
6. Hvad sker der når du caster double til int?
7. Hvorfor er det vigtigt at give variabler meningsfulde navne?
8. Hvad er et array, og hvordan læser du et element fra det?
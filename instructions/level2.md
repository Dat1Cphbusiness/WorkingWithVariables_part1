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

**Tag udgangspunkt i klasserne PriceCalculator, GroupSplitter, og TextBuilder.**  
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

## Del A: Basic Arithmetic (+, -, *, /)

### Opgave 2.1: Addition - Sammenlægning
**Opgave:** 

Erklær en variabel til at holde et beløb som du har(fx. 50 kr), en variabel til at holde et beløb som din ven har.
og en tredje variabel til at holde summen af de to.

Udskriv summen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `myMoney = 50`
2. Erklær int `friendMoney = 30`
3. Erklær int `totalMoney = myMoney + friendMoney`
4. Print `totalMoney`

</detail>
</details>

**Forventet Output:**
```
80
```

---

### Opgave 2.2: Subtraction - Penge tilbage
**Opgave:** 

Erklær en variable til at holde et tal for hvor mange penge du har(fx. 200 kr), en variabel til at holde et tal for prisen på en kop kaffe (fx. 35 kr), 
og en tredje variabel for hvor mange penge der er tilbage efter du har købt kaffen.

Udskriv resultatet.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `wallet = 200`
2. Erklær int `coffeePrice = 35`
3. Erklær int `moneyLeft = wallet - coffeePrice`
4. Print `moneyLeft`
</detail>
</details>

**Forventet Output:**
```
165
```

---

### Opgave 2.3: Multiplication - Køb flere
**Opgave:**

Erklær en variable til at holde prisen på en cookie (fx. 12 kr), en anden variabel der holder på antallet af cookies (fx. 5), 
og en tredje variabel til at holde den samlede pris hvis man skal købe det antal cookies.  
Udskriv den samlede pris.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `pricePerCookie = 12`
2. Erklær int `numberOfCookies = 5`
3. Erklær int `totalCost = pricePerCookie * numberOfCookies`
4. Print `totalCost`
   </detail>
</details>

**Forventet Output:**
```
60
```

---

### Opgave 2.4: Division - Dele lige

**Opgave:**

Erklær en variabel til at holde et antal pizza slices (fx. 12), en anden variabel til at holder på antallet af venner der skal have pizza (fx. 3),
og en tredje variabel til den samlede pris af det angivne antal cookies.  
Udskriv hvor mange pizza slices hver ven kan få.



<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `totalSlices = 12` (pizza slices)
2. Erklær int `friends = 3`
3. Erklær int `slicesPerPerson = totalSlices / friends`
4. Print `slicesPerPerson`

   </detail>
</details>

**Forventet Output:**
```
4
```

---

### Opgave 2.5: All operators - Restaurant regning
**Opgave:** 

Erklær 3 variable til prisen for hver af de 3 ting i en burgermenu (fx. burger, fries og drink).  
Erklær en variable for den samlede pris for de 3 ting, en anden for hvad kunden har betalt (fx.200 kr), en tredje der holder hvad kunden skal have tilbage.  
Udskriv den samlede pris og hvor meget kunden skal have tilbage.

<details>
<summary>Hjælp</summary>
<detail>
1. Erklær int `burger = 75`
2. Erklær int `fries = 30`
3. Erklær int `drink = 25`
4. Erklær int `total = burger + fries + drink`
5. Erklær int `paid = 200`
6. Erklær int `change = paid - total`
7. Print `total` og `change`
   </detail>
</details>

**Forventet Output:**
```
130
70
```

---

## Del B: Integer Division vs Decimal Division

### Opgave 2.6: Integer division problem
**Opgave:** 


Erklær variable for et antal cookies (fx. 10) og et antal personer der skal dele dem (fx.3).  
Erklær en variable for hvor mange cookies hver person får (brug division).  
Udskriv resultatet og læg mærke til at svaret er 3 og ikke 3.333... – dette er fordi integer division afrunder nedad.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `cookies = 10`
2. Erklær int `people = 3`
3. Erklær int `cookiesEach = cookies / people`
4. Print `cookiesEach`

</detail>
</details>

**Forventet Output:**
```
3
```

---

### Opgave 2.7: Force decimal division
**Opgave:** 

Erklær variable for en samlet score (fx. 85) og et antal tests (fx. 4).  
Erklær en double-variable for gennemsnittet – husk at caste til double for at få decimaler.  
Udskriv gennemsnittet.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `totalScore = 85`
2. Erklær int `numberOfTests = 4`
3. Erklær double `average = (double) totalScore / numberOfTests`
4. Print `average`
</detail>
</details>

**Forventet Output:**
```
21.25
```

---

### Opgave 2.8: Split bill fairly
**Opgave:**

Erklær en double-variable for den samlede regning (fx. 235.50) og en int-variable for antal personer der skal dele (fx. 4).  
Erklær en double-variable for beløbet pr. person.  
Udskriv beløbet pr. person.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær double `billTotal = 235.50`
2. Erklær int `diners = 4`
3. Erklær double `perPerson = billTotal / diners`
4. Print `perPerson`
   </detail>
</details>

**Forventet Output:**
```
58.875
```

---

### Opgave 2.9: Price per item
**Opgave:**

Erklær en double-variable for prisen på en pakke (fx. 49.90) og en int-variable for antal ting i pakken (fx. 6).  
Erklær en double-variable for prisen pr. ting.  
Udskriv prisen pr. ting.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær double `packagePrice = 49.90`
2. Erklær int `itemsInPackage = 6`
3. Erklær double `pricePerItem = packagePrice / itemsInPackage`
4. Print `pricePerItem`
   </detail>
</details>

**Forventet Output:**
```
8.316666666666666
```

---

### Opgave 2.10: Division with object
**Opgave:**

Erklær en variable for den samlede regning (fx. 500.0) og en variable for antal personer der skal dele (fx. 5).  
Erklær en variable for hvad hver person skal betale.  
Udskriv beløbet pr. person.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær double `totalBill = 500.0`
2. Erklær int `people = 5`
3. Erklær double `eachPays = totalBill / people`
4. Print `eachPays`
   </detail>
</details>

**Forventet Output:**
```
100.0
```

---

## Del C: Modulo Operator (%)

### Opgave 2.11: Find leftovers
**Opgave:** 

Erklær variable for et antal stykker slik (fx. 23) og et antal børn (fx. 5).  
Erklær en variable for hvor mange stykker slik hvert barn får (brug division).  
Erklær en variable for hvor mange stykker slik der er til overs (brug modulo).  
Udskriv begge resultater.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `candy = 23`
2. Erklær int `kids = 5`
3. Erklær int `candyEach = candy / kids`
4. Erklær int `leftover = candy % kids`
5. Print `candyEach` og `leftover`
   </detail>
</details>

**Forventet Output:**
```
4
3
```

---

### Opgave 2.12: Even or odd
**Opgave:**
Erklær en variable for et tal (fx. 17).  
Erklær en variable for resten når tallet divideres med 2 (brug modulo).  
Hvis resten er 0, udskriv "Even", ellers udskriv "Odd".

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `number = 17`
2. Erklær int `remainder = number % 2`
3. Hvis `remainder == 0`, print "Even", ellers print "Odd"
   </detail>
</details>

**Forventet Output:**
```
Odd
```

---

### Opgave 2.13: Modulo with object
**Opgave:** 

Erklær variable for antal pizzastykker (fx. 15) og antal personer (fx. 4).  
Erklær en variable for hvor mange stykker hver person får (brug division).  
Erklær en variable for hvor mange stykker der er til overs (brug modulo).  
Udskriv begge resultater.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `pizzaSlices = 15`
2. Erklær int `people = 4`
3. Erklær int `slicesEach = pizzaSlices / people`
4. Erklær int `leftover = pizzaSlices % people`
5. Print `slicesEach` og `leftover`
   </detail>
</details>

**Forventet Output:**
```
3
3
```

---

### Opgave 2.14: Which turn is it?
**Opgave:** 

Erklær variable for det samlede antal ture (fx. 17) og antal spillere (fx. 4).  
Erklær en variable for hvilken spiller der har turen (brug modulo – spillerne er nummereret 0, 1, 2, 3).  
Udskriv hvilken spillers tur det er.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `totalTurns = 17`
2. Erklær int `numberOfPlayers = 4`
3. Erklær int `currentPlayer = totalTurns % numberOfPlayers`
4. Print "Player " + currentPlayer + "'s turn"
   </detail>
</details>

**Forventet Output:**
```
Player 1's turn
```

---

### Opgave 2.15: Day of week cycling
**Opgave:** 

Erklær en variable for et dagnummer (fx. 25).  
Erklær en variable for hvilken ugedag det svarer til (brug modulo med 7 – hvor 0=Mandag, 1=Tirsdag, osv.).  
Udskriv ugedagen som et tal.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `dayNumber = 25`
2. Erklær int `dayOfWeek = dayNumber % 7`
3. Print `dayOfWeek`
   </detail>
</details>

**Forventet Output:**
```
4
```

---

## Del D: Operator Precedence (Rækkefølge)

### Opgave 2.16: Multiplication before addition
**Opgave:** 

Erklær en variable for resultatet af `5 + 3 * 2` (uden parenteser).  
Erklær en variable for resultatet af `(5 + 3) * 2` (med parenteser).  
Udskriv begge resultater og læg mærke til forskellen – multiplikation udføres før addition, medmindre parenteser ændrer rækkefølgen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `result1 = 5 + 3 * 2`
2. Erklær int `result2 = (5 + 3) * 2`
3. Print `result1` og `result2`
   </detail>
</details>

**Forventet Output:**
```
11
16
```

---

### Opgave 2.17: Clear with parentheses
**Opgave:** 

Erklær variable for en basispris (fx. 100), et antal (fx. 3) og en rabat (fx. 20).  
Erklær en variable for den samlede pris: først ganges prisen med antal, derefter trækkes rabatten fra.  
Udskriv den samlede pris.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `basePrice = 100`
2. Erklær int `quantity = 3`
3. Erklær int `discount = 20`
4. Erklær int `total = (basePrice * quantity) - discount`
5. Print `total`
   </detail>
</details>


**Forventet Output:**
```
280
```

---

### Opgave 2.18: Average calculation
**Opgave:** 

**Opgave:**

Erklær variable for tre testresultater (fx. 80, 90 og 85).  
Erklær en double-variable for gennemsnittet – husk at dividere med 3.0 for at få et decimaltal.  
Udskriv gennemsnittet.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `test1 = 80`
2. Erklær int `test2 = 90`
3. Erklær int `test3 = 85`
4. Erklær double `average = (test1 + test2 + test3) / 3.0`
5. Print `average`
   </detail>
</details>

**Forventet Output:**
```
85.0
```

---

### Opgave 2.19: Complex expression
**Opgave:** 

Erklær tre variable (fx. a = 10, b = 5, c = 2).  
Erklær en variable for resultatet af `a + b * c - 4`.  
Udskriv resultatet og overvej hvilken rækkefølge operationerne udføres i.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `a = 10`
2. Erklær int `b = 5`
3. Erklær int `c = 2`
4. Erklær int `result = a + b * c - 4`
5. Print `result`
   </detail>
</details>

**Forventet Output:**
```
16
```
(b*c først = 10, så 10+10-4 = 16)

---

### Opgave 2.20: Percentage calculation

**Opgave:** 

Erklær variable for en pris (fx. 200.0) og en rabatprocent (fx. 15.0).  
Erklær en variable for rabatbeløbet – beregn det ved at gange prisen med procenten divideret med 100.  
Erklær en variable for den endelige pris efter rabat.  
Udskriv den endelige pris.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær double `price = 200.0`
2. Erklær double `discountPercent = 15.0`
3. Erklær double `discountAmount = price * (discountPercent / 100.0)`
4. Erklær double `finalPrice = price - discountAmount`
5. Print `finalPrice`
   </detail>
</details>

**Forventet Output:**
```
170.0
```

---

## Del E: String Concatenation

### Opgave 2.1: Combine strings
**Opgave:** 

Erklær variable for et fornavn (fx. "Anna") og et efternavn (fx. "Hansen").  
Erklær en variable for det fulde navn ved at sætte fornavn og efternavn sammen med et mellemrum imellem.  
Udskriv det fulde navn.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær String `firstName = "Anna"`
2. Erklær String `lastName = "Hansen"`
3. Erklær String `fullName = firstName + " " + lastName`
4. Print `fullName`
   </detail>
</details>

**Forventet Output:**
```
Anna Hansen
```

---

### Opgave 2.22: String + number
**Opgave:** 

Erklær en variable for en alder (fx. 25).  
Erklær en String-variable for en besked der kombinerer tekst og alderen.  
Udskriv beskeden.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `age = 25`
2. Erklær String `message = "You are " + age + " years old"`
3. Print `message`
   </detail>
</details>


**Forventet Output:**
```
You are 25 years old
```

---

### Opgave 2.23: Build address
**Opgave:** 

Erklær variable for et gadenavn (fx. "Halfdansgade"), et husnummer (fx. 42) og en by (fx. "København").  
Erklær en String-variable for den samlede adresse ved at kombinere alle dele med passende tegnsætning.  
Udskriv adressen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær String `street = "Halfdansgade"`
2. Erklær int `number = 42`
3. Erklær String `city = "København"`
4. Erklær String `address = street + " " + number + ", " + city`
5. Print `address`
   </detail>
</details>

**Forventet Output:**
```
Halfdansgade 42, København
```

---

### Opgave 2.24: Watch order of operations
**Opgave:** 

Erklær to variable (fx. a = 5 og b = 3).  
Udskriv "Sum: " + a + b og se hvad der sker.  
Udskriv "Sum: " + (a + b) og læg mærke til forskellen – uden parenteser sammenkædes tallene som tekst, med parenteser udføres additionen først.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `a = 5`
2. Erklær int `b = 3`
3. Print "Sum: " + a + b
4. Print "Sum: " + (a + b)
   </detail>
</details>


**Forventet Output:**
```
Sum: 53
Sum: 8
```

---

### Opgave 2.25: TextBuilder object
**Opgave:** 
1. Opret en TextBuilder med initial text "Hello"
2. append(" ")
3. append("World")
4. Print getCurrentText()

**Forventet Output:**
```
Hello World
```

---

## Del F: Compound Assignment

### Opgave 2.26: Using +=
**Opgave:** 

Erklær en variable for en score (fx. 100).  
Udskriv scoren.  
Læg 50 til scoren ved at bruge += operatoren og udskriv igen.  
Læg 25 til scoren og udskriv igen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `score = 100`
2. Print `score`
3. `score += 50`
4. Print `score`
5. `score += 25`
6. Print `score`
   </detail>
</details>

**Forventet Output:**
```
100
150
175
```

---

### Opgave 2.27: Using -=
**Opgave:** 

Erklær en variable for liv/health (fx. 100).  
Træk 15 fra ved at bruge -= operatoren (spilleren tager skade) og udskriv.  
Træk 20 mere fra (mere skade) og udskriv igen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `health = 100`
2. `health -= 15`
3. Print `health`
4. `health -= 20`
5. Print `health`
   </detail>
</details>


**Forventet Output:**
```
85
65
```

---

### Opgave 2.28: Using *=
**Opgave:** 

Erklær en variable for en pris (fx. 50.0).  
Udskriv prisen.  
Fordobl prisen ved at bruge *= operatoren og udskriv igen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær double `price = 50.0`
2. Print `price`
3. `price *= 2`
4. Print `price`
   </detail>
</details>

**Forventet Output:**
```
50.0
100.0
```

---

### Opgave 2.29: Increment og decrement med 1
**Opgave:**

Erklær en variable for en tæller (fx. 10).  
Udskriv tælleren.  
Brug ++ operatoren til at øge tælleren med 1 og udskriv igen.  
Brug -- operatoren til at mindske tælleren med 1 og udskriv igen.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `counter = 10`
2. Print `counter`
3. `counter++`
4. Print `counter`
5. `counter--`
6. Print `counter`
   </detail>
</details>

**Forventet Output:**
```
10
11
10
```

---

### Opgave 2.30: All compound operators
**Opgave:** 

Erklær en variable for et tal (fx. 10).  
Læg 5 til ved at bruge += og udskriv.  
Træk 3 fra ved at bruge -= og udskriv.  
Øg med 1 ved at bruge ++ og udskriv.  
Mindsk med 1 ved at bruge -- og udskriv.

<details>
<summary>Hjælp</summary>
<detail>

1. Erklær int `number = 10`
2. `number += 5`, print `number`
3. `number -= 3`, print `number`
4. `number++`, print `number`
5. `number--`, print `number`
   </detail>
</details>

**Forventet Output:**
```
15
12
13
12
```

---

## Del G: Real-World Scenarios

### Opgave 2.31: Shopping cart
**Opgave:** 
1. Opret en PriceCalculator: "SuperMarket"
2. Erklær double `item1` = 25.50
3. Erklær double `item2` = 15.00
4. Erklær double `item3` = 30.00
5. Erklær double `subtotal` = item1 + item2 + item3
6. Erklær double `withTax` = addTax(subtotal, 25.0)
7. Print subtotal og withTax

**Forventet Output:**
```
70.5
88.125
```

---

### Opgave 2.32: Split restaurant bill
**Opgave:** 
1. Opret en GroupSplitter: "Dinner", 4
2. Erklær double `foodTotal` = 450.0
3. Erklær double `drinks` = 120.0
4. Erklær double `tip` = 50.0
5. Erklær double `grandTotal` = foodTotal + drinks + tip
6. Erklær double `perPerson` = splitBill(grandTotal)
7. Print perPerson

**Forventet Output:**
```
155.0
```

---

### Opgave 2.33: Discount calculation
**Opgave:** 
1. Opret en PriceCalculator: "Store"
2. Erklær double `originalPrice` = 300.0
3. Erklær double `discounted` = applyDiscount(originalPrice, 20.0)
4. Erklær double `finalPrice` = addTax(discounted, 25.0)
5. Print alle tre prices

**Forventet Output:**
```
300.0
240.0
300.0
```

---

### Opgave 2.34: Party planning
**Opgave:** 
Planlæg en fest:
1. Erklær int `guests` = 15
2. Erklær int `cupcakes` = 40
3. Erklær int `cupcakesPerPerson` = cupcakes / guests
4. Erklær int `leftover` = cupcakes % guests
5. Print "Each guest gets " + cupcakesPerPerson + " cupcakes"
6. Print leftover + " cupcakes left over"

**Forventet Output:**
```
Each guest gets 2 cupcakes
10 cupcakes left over
```

---

### Opgave 2.35: Build greeting message
**Opgave:** 
1. Opret en TextBuilder
2. Erklær String `name` = "Anna"
3. Erklær int `age` = 25
4. append("Hello, ")
5. append(name)
6. append("! ")
7. append("You are ")
8. append(age + "")  (convert int to string)
9. append(" years old.")
10. Print getCurrentText()

**Forventet Output:**
```
Hello, Anna! You are 25 years old.
```

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem int division og double division?
2. Hvornår skal du bruge parenteser i calculations?
3. Hvad giver modulo (%) operator dig?
4. Hvordan kombinerer du strings og numbers?
5. Hvad sker der hvis du skriver "5" + 3 vs 5 + 3?
6. Hvorfor er += mere praktisk end = ... + ?
7. Hvordan tvinger du decimal division med int variables?

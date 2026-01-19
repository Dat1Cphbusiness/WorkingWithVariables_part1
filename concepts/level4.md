# Level 4: Array[]

## Level 4 fokuserer på:
- Array som datatype
- Array declaration og initialization
- Array literal syntax
- Accessing elements med index
- Array length property
- Zero-based indexing
- Forskellige array typer (int[], double[], String[], boolean[])
- Arrays holder multiple værdier af SAMME type

---

## Begrebsgennemgang

### Hvad er en Array?

En **array** er en variabel der kan gemme **flere værdier** af samme type.

**Uden array:**
```java
int score1 = 85;
int score2 = 92;
int score3 = 78;
int score4 = 88;
int score5 = 95;
```

**Med array:**
```java
int[] scores = {85, 92, 78, 88, 95};
```

**Fordele:**
- Gemmer mange værdier i én variabel
- Organiseret og struktureret
- Lettere at arbejde med mange værdier

### Array Declaration

**Syntax:**
```java
datatype[] variabelNavn;
```

**Eksempler:**
```java
int[] numbers;        // Array af integers
double[] prices;      // Array af doubles
String[] names;       // Array af Strings
boolean[] flags;      // Array af booleans
```

**Vigtigt:** `[]` betyder "array af"
- `int[]` = "array af integers"
- `String[]` = "array af Strings"

### Array Initialization - Literal Syntax

**Array literal** - du specificerer værdierne direkte:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

**Syntax:**
- Brug `{ }` tuborgklammer
- Komma mellem værdier
- Alle værdier skal være samme type

**Eksempler:**
```java
int[] ages = {25, 30, 22, 35};
double[] prices = {19.99, 29.99, 9.99};
String[] names = {"Anna", "Bob", "Carl"};
boolean[] flags = {true, false, true};
```

### Declaration + Initialization på én linje

**Anbefalet måde:**
```java
int[] numbers = {1, 2, 3, 4, 5};
String[] colors = {"Red", "Green", "Blue"};
double[] temps = {18.5, 22.0, 19.5};
```

**Også muligt - separate linjer:**
```java
int[] numbers;
numbers = new int[]{1, 2, 3, 4, 5};
```

**Men simplest er at gøre det på én linje!**

### Accessing Array Elements

Få adgang til individuelle elementer med **index**:

```java
int[] scores = {85, 92, 78, 88, 95};

int firstScore = scores[0];   // 85
int secondScore = scores[1];  // 92
int thirdScore = scores[2];   // 78
```

**Syntax:**
```java
arrayNavn[index]
```

- Brug `[ ]` firkantede parenteser
- Index starter ved **0** (ikke 1!)

### Zero-Based Indexing

**Meget vigtigt:** Arrays starter ved index **0**!

```java
String[] days = {"Monday", "Tuesday", "Wednesday"};

days[0]  →  "Monday"     // Første element
days[1]  →  "Tuesday"    // Andet element
days[2]  →  "Wednesday"  // Tredje element
```

**Index mapping:**
| Element | Index | Værdi |
|---------|-------|-------|
| 1st | 0 | "Monday" |
| 2nd | 1 | "Tuesday" |
| 3rd | 2 | "Wednesday" |

### Array Length

Hver array har en **length** property:

```java
int[] numbers = {10, 20, 30, 40, 50};
int size = numbers.length;  // 5
```

**Vigtigt:**
- `.length` er en property (ikke en metode!)
- Ingen parenteser: `array.length` ✅
- Ikke: `array.length()` ❌

**Eksempler:**
```java
String[] names = {"Anna", "Bob", "Carl", "Diana"};
int count = names.length;  // 4

double[] prices = {19.99, 29.99};
int howMany = prices.length;  // 2
```

### Last Element

**Sidste element index** = `length - 1`

```java
int[] numbers = {10, 20, 30, 40, 50};
// Length: 5
// Indices: 0, 1, 2, 3, 4
// Last index: 4 (which is length - 1)

int lastNumber = numbers[4];
// eller
int lastNumber = numbers[numbers.length - 1];  // 50
```

**Hvorfor length - 1?**
- Array med 5 elementer
- Indices: 0, 1, 2, 3, 4
- Sidste index er 4 (ikke 5!)

### Array Types

Arrays kan være af enhver datatype:

**Primitive types:**
```java
int[] ages = {25, 30, 35};
double[] prices = {9.99, 19.99, 29.99};
boolean[] answers = {true, false, true, true};
char[] grades = {'A', 'B', 'C'};
```

**Reference types:**
```java
String[] names = {"Anna", "Bob", "Carl"};
String[] cities = {"Copenhagen", "Aarhus", "Odense"};
```

### All Elements Must Be Same Type

**VIGTIGT:** Alle elementer i et array skal være **samme type**!

```java
// KORREKT - alle er int
int[] numbers = {10, 20, 30};

// FORKERT - blandet typer
int[] mixed = {10, "hello", true};  // ERROR!
```

**Hvis du har forskellige typer data:**
- Lav separate arrays
- Eller brug en klasse/object (lærer senere)

### Empty Arrays

Du kan lave tomme arrays (fyldes senere):

```java
int[] numbers = new int[5];     // 5 elementer, alle 0
String[] names = new String[3]; // 3 elementer, alle null
```

**Men i dette level:**
- Vi fokuserer på array literals
- Arrays med værdier fra start

### Array Examples

**Shopping list:**
```java
String[] items = {"Milk", "Bread", "Eggs", "Butter"};
double[] prices = {12.50, 15.00, 25.00, 18.50};
```

**Test scores:**
```java
int[] scores = {85, 92, 78, 88, 95, 73, 90};
```

**Week days:**
```java
String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
```

**Temperature readings:**
```java
double[] temps = {18.5, 19.0, 21.5, 20.0, 22.5, 19.5, 18.0};
```

---

## Tips
- Arrays starter ved index 0, ikke 1
- Sidste element er ved index `length - 1`
- Brug `array.length` for at få antallet af elementer
- Alle elementer skal være samme type
- Brug beskrivende navne (plural form er godt)
- `int[] numbers` ikke `int[] number`
- Al din kode skal placeres inde i `testLevel4()` metoden mellem tuborgklammerne `{}`

---
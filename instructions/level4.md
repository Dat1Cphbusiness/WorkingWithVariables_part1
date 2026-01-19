# Level 4 Opgaver: Array[]


## Indhold

- [Del A: Array Declaration and Initialization](#del-a-array-declaration-and-initialization)
- [Del B: Accessing Elements](#del-b-accessing-elements)
- [Del C: Array Length](#del-c-array-length)
- [Del D: Different Array Types](#del-d-different-array-types)
- [Del E: Zero-Based Indexing](#del-e-zero-based-indexing)
- [Del F: Working with Arrays](#del-f-working-with-arrays)
- [Refleksionsspørgsmål](#refleksionsspørgsmål)

---

## Del A: Array Declaration and Initialization

### Opgave 4.1: Dit første array
📖 [Se forklaring: Hvad er en Array?](#hvad-er-en-array)

**Opgave:** 
Erklær et int array med navn `numbers` og værdierne 10, 20, 30.

| <!-- --> | <!-- --> |
|----------|----------|
| Din array declaration | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30};
```
</details>

---

### Opgave 4.2: String array
**Opgave:** 
Erklær et String array med navn `names` og værdierne "Anna", "Bob", "Carl".

| <!-- --> | <!-- --> |
|----------|----------|
| Din array declaration | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl"};
```
</details>

---

### Opgave 4.3: Double array
**Opgave:** 
Erklær et double array med navn `prices` og værdierne 19.99, 29.99, 9.99.

| <!-- --> | <!-- --> |
|----------|----------|
| Din array declaration | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
double[] prices = {19.99, 29.99, 9.99};
```
</details>

---

### Opgave 4.4: Boolean array
**Opgave:** 
Erklær et boolean array med navn `flags` og værdierne true, false, true, true.

| <!-- --> | <!-- --> |
|----------|----------|
| Din array declaration | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
boolean[] flags = {true, false, true, true};
```
</details>

---

### Opgave 4.5: Days array
**Opgave:** 
Erklær et String array med ugedagene: "Monday", "Tuesday", "Wednesday", "Thursday", "Friday".

| <!-- --> | <!-- --> |
|----------|----------|
| Din array declaration | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
```
</details>

---

## Del B: Accessing Elements

### Opgave 4.6: Access first element
📖 [Se forklaring: Accessing Array Elements](#accessing-array-elements)

**Scenario:** 
Du har: `int[] scores = {85, 92, 78, 88};`

**Opgave:** 
Erklær en variabel `firstScore` og tildel den første værdi fra arrayet.

| <!-- --> | <!-- --> |
|----------|----------|
| Array declaration | <input type="text" size="40"> |
| Access first element | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
int[] scores = {85, 92, 78, 88};
int firstScore = scores[0];  // 85
```
</details>

---

### Opgave 4.7: Access specific elements
**Scenario:** 
Du har: `String[] colors = {"Red", "Green", "Blue", "Yellow"};`

**Opgave:** 
Hent det 2. og 4. element (husk zero-based indexing!).

| <!-- --> | <!-- --> |
|----------|----------|
| Second element | <input type="text" size="30"> |
| Fourth element | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
String[] colors = {"Red", "Green", "Blue", "Yellow"};
String secondColor = colors[1];   // "Green"
String fourthColor = colors[3];   // "Yellow"
```
</details>

---

### Opgave 4.8: Access and use
**Scenario:** 
Du har: `double[] prices = {15.50, 22.00, 8.75};`

**Opgave:** 
Hent de to første priser og beregn deres sum.

| <!-- --> | <!-- --> |
|----------|----------|
| First price | <input type="text" size="30"> |
| Second price | <input type="text" size="30"> |
| Sum | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
double[] prices = {15.50, 22.00, 8.75};
double firstPrice = prices[0];   // 15.50
double secondPrice = prices[1];  // 22.00
double sum = firstPrice + secondPrice;  // 37.50
```
</details>

---

### Opgave 4.9: Multiple accesses
**Scenario:** 
Du har: `int[] numbers = {10, 20, 30, 40, 50};`

**Opgave:** 
Print første, tredje og femte element.

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[0]);  // 10
System.out.println(numbers[2]);  // 30
System.out.println(numbers[4]);  // 50
```
</details>

---

### Opgave 4.10: Access for calculation
**Scenario:** 
Du har: `int[] ages = {25, 30, 22, 35, 28};`

**Opgave:** 
Beregn gennemsnittet af de første tre aldre.

<details>
<summary>Se svar</summary>

```java
int[] ages = {25, 30, 22, 35, 28};
int sum = ages[0] + ages[1] + ages[2];  // 77
double average = sum / 3.0;  // 25.67
```
</details>

---

## Del C: Array Length

### Opgave 4.11: Get array length
📖 [Se forklaring: Array Length](#array-length)

**Scenario:** 
Du har: `String[] names = {"Anna", "Bob", "Carl", "Diana"};`

**Opgave:** 
Find antallet af elementer i arrayet.

| <!-- --> | <!-- --> |
|----------|----------|
| Array length | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl", "Diana"};
int count = names.length;  // 4
```
</details>

---

### Opgave 4.12: Length property
**Opgave:** 
Erklær arrays og find deres længde:

| Array | Length |
|-------|--------|
| `int[] scores = {85, 92, 78};` | <input type="text" size="10"> |
| `String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};` | <input type="text" size="10"> |
| `double[] temps = {18.5, 22.0};` | <input type="text" size="10"> |

<details>
<summary>Se svar</summary>

```java
int[] scores = {85, 92, 78};
int scoreCount = scores.length;  // 3

String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
int dayCount = days.length;  // 5

double[] temps = {18.5, 22.0};
int tempCount = temps.length;  // 2
```
</details>

---

### Opgave 4.13: Last element using length
📖 [Se forklaring: Last Element](#last-element)

**Scenario:** 
Du har: `int[] numbers = {10, 20, 30, 40, 50};`

**Opgave:** 
Få det sidste element ved at bruge `.length`

| <!-- --> | <!-- --> |
|----------|----------|
| Last element expression | <input type="text" size="40"> |
| Værdi af sidste element | <input type="text" size="10"> |

<details>
<summary>Se svar</summary>

```java
int[] numbers = {10, 20, 30, 40, 50};
int lastNumber = numbers[numbers.length - 1];  // 50
```
</details>

---

### Opgave 4.14: Length in calculation
**Scenario:** 
Du har: `double[] prices = {15.50, 22.00, 8.75, 12.50};`

**Opgave:** 
Beregn total sum af ALLE priser uden at hardcode antal elementer.

<details>
<summary>Se svar</summary>

```java
double[] prices = {15.50, 22.00, 8.75, 12.50};
double total = 0.0;

// Manual addition af alle elementer
total = prices[0] + prices[1] + prices[2] + prices[3];  // 58.75

// Kan også print antal
System.out.println("Total items: " + prices.length);  // 4
```
</details>

---

### Opgave 4.15: First and last
**Scenario:** 
Du har: `String[] months = {"January", "February", "March", "April", "May"};`

**Opgave:** 
Hent første og sidste måned.

| <!-- --> | <!-- --> |
|----------|----------|
| First month | <input type="text" size="30"> |
| Last month | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
String[] months = {"January", "February", "March", "April", "May"};
String firstMonth = months[0];  // "January"
String lastMonth = months[months.length - 1];  // "May"
```
</details>

---

## Del D: Different Array Types

### Opgave 4.16: Multiple arrays
**Opgave:** 
Erklær følgende arrays:

| Array type | Values |
|------------|--------|
| int[] ages | 18, 25, 30, 45 |
| String[] cities | "Copenhagen", "Aarhus", "Odense" |
| double[] temperatures | 18.5, 22.0, 19.5 |
| boolean[] isActive | true, true, false |

<details>
<summary>Se svar</summary>

```java
int[] ages = {18, 25, 30, 45};
String[] cities = {"Copenhagen", "Aarhus", "Odense"};
double[] temperatures = {18.5, 22.0, 19.5};
boolean[] isActive = {true, true, false};
```
</details>

---

### Opgave 4.17: Student data
**Scenario:** 
En klasse har 4 studerende. Track deres data:

**Opgave:** 
Erklær arrays for:

| Data | Array |
|------|-------|
| Navne: "Anna", "Bob", "Carl", "Diana" | <input type="text" size="50"> |
| Aldre: 22, 24, 23, 25 | <input type="text" size="40"> |
| Aktiv status: true, true, false, true | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

```java
String[] studentNames = {"Anna", "Bob", "Carl", "Diana"};
int[] studentAges = {22, 24, 23, 25};
boolean[] isActive = {true, true, false, true};
```
</details>

---

### Opgave 4.18: Product catalog
**Scenario:** 
En butik har produkter.

**Opgave:** 
Erklær arrays for 3 produkter:

| Data | Values |
|------|--------|
| Product names | "Laptop", "Mouse", "Keyboard" |
| Prices | 7999.99, 249.99, 499.99 |
| In stock | true, false, true |

<details>
<summary>Se svar</summary>

```java
String[] productNames = {"Laptop", "Mouse", "Keyboard"};
double[] productPrices = {7999.99, 249.99, 499.99};
boolean[] inStock = {true, false, true};
```
</details>

---

### Opgave 4.19: Week temperatures
**Scenario:** 
Track temperatur for hver dag i ugen.

**Opgave:** 
Erklær to arrays:

| <!-- --> | <!-- --> |
|----------|----------|
| Dage (7 dage) | <input type="text" size="60"> |
| Temperaturer: 18.5, 19.0, 21.5, 20.0, 22.5, 19.5, 18.0 | <input type="text" size="50"> |

<details>
<summary>Se svar</summary>

```java
String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
double[] temperatures = {18.5, 19.0, 21.5, 20.0, 22.5, 19.5, 18.0};
```
</details>

---

### Opgave 4.20: Complete dataset
**Scenario:** 
En restaurant menu.

**Opgave:** 
Erklær arrays for 5 menu items:

<details>
<summary>Se svar</summary>

```java
String[] dishNames = {"Pizza", "Burger", "Salad", "Pasta", "Steak"};
double[] dishPrices = {89.00, 95.00, 65.00, 79.00, 145.00};
boolean[] isVegetarian = {false, false, true, false, false};
int[] calories = {850, 750, 250, 600, 900};
```
</details>

---

## Del E: Zero-Based Indexing

### Opgave 4.21: Understanding indices
📖 [Se forklaring: Zero-Based Indexing](#zero-based-indexing)

**Opgave:** 
Givet: `String[] colors = {"Red", "Green", "Blue", "Yellow"};`

Udfyld tabellen:

| Element | Index | Værdi |
|---------|-------|-------|
| 1st | <input type="text" size="5"> | <input type="text" size="15"> |
| 2nd | <input type="text" size="5"> | <input type="text" size="15"> |
| 3rd | <input type="text" size="5"> | <input type="text" size="15"> |
| 4th | <input type="text" size="5"> | <input type="text" size="15"> |

<details>
<summary>Se svar</summary>

| Element | Index | Værdi |
|---------|-------|-------|
| 1st | 0 | "Red" |
| 2nd | 1 | "Green" |
| 3rd | 2 | "Blue" |
| 4th | 3 | "Yellow" |
</details>

---

### Opgave 4.22: Find the index
**Opgave:** 
Givet: `int[] numbers = {100, 200, 300, 400, 500, 600};`

Hvilket index har disse værdier?

| Værdi | Index |
|-------|-------|
| 100 | <input type="text" size="5"> |
| 300 | <input type="text" size="5"> |
| 500 | <input type="text" size="5"> |
| 600 | <input type="text" size="5"> |

<details>
<summary>Se svar</summary>

| Værdi | Index |
|-------|-------|
| 100 | 0 |
| 300 | 2 |
| 500 | 4 |
| 600 | 5 |
</details>

---

### Opgave 4.23: Common mistakes
**Opgave:** 
Hvad er forkert her?

```java
String[] days = {"Mon", "Tue", "Wed"};
String firstDay = days[1];  // ???
```

| <!-- --> | <!-- --> |
|----------|----------|
| Hvad får firstDay? | <input type="text" size="20"> |
| Hvad er fejlen? | <input type="text" size="40"> |
| Korrekt kode | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

- `firstDay` får værdien `"Tue"` (ikke `"Mon"`!)
- Fejl: Første element er index 0, ikke 1
- Korrekt: `String firstDay = days[0];`
</details>

---

### Opgave 4.24: Last index
**Opgave:** 
Givet et array med 8 elementer.

| Spørgsmål | Svar |
|-----------|------|
| Hvad er første index? | <input type="text" size="5"> |
| Hvad er sidste index? | <input type="text" size="5"> |
| Hvad er array.length? | <input type="text" size="5"> |

<details>
<summary>Se svar</summary>

| Spørgsmål | Svar |
|-----------|------|
| Første index | 0 |
| Sidste index | 7 |
| array.length | 8 |

**Regel:** Sidste index = length - 1
</details>

---

### Opgave 4.25: Index range
**Opgave:** 
Du har: `double[] prices = {9.99, 19.99, 29.99, 39.99, 49.99};`

| <!-- --> | <!-- --> |
|----------|----------|
| Antal elementer (length) | <input type="text" size="5"> |
| Valid index range | <input type="text" size="20"> |
| Første valid index | <input type="text" size="5"> |
| Sidste valid index | <input type="text" size="5"> |

<details>
<summary>Se svar</summary>

- Length: 5
- Valid range: 0 til 4
- Første valid: 0
- Sidste valid: 4

**Husk:** Array med 5 elementer har indices 0, 1, 2, 3, 4
</details>

---

## Del F: Working with Arrays

### Opgave 4.26: Shopping cart
**Scenario:** 
Du har en shopping cart med 3 items.

**Opgave:** 
Erklær arrays og beregn total pris:

<details>
<summary>Se svar</summary>

```java
String[] items = {"Milk", "Bread", "Eggs"};
double[] prices = {12.50, 15.00, 25.00};

double total = prices[0] + prices[1] + prices[2];  // 52.50

System.out.println("Items: " + items.length);
System.out.println("Total: " + total);
```
</details>

---

### Opgave 4.27: Student grades
**Scenario:** 
En student har 4 eksamenskarakterer: 85, 92, 78, 88.

**Opgave:** 
Erklær array, beregn sum og gennemsnit.

<details>
<summary>Se svar</summary>

```java
int[] grades = {85, 92, 78, 88};

int sum = grades[0] + grades[1] + grades[2] + grades[3];  // 343
double average = sum / 4.0;  // 85.75

System.out.println("Number of exams: " + grades.length);
System.out.println("Average: " + average);
```
</details>

---

### Opgave 4.28: Temperature analysis
**Scenario:** 
Dagens temperaturer: 18.5, 22.0, 24.5, 21.0, 19.5.

**Opgave:** 
Find første, sidste og "midterste" (index 2) temperatur.

<details>
<summary>Se svar</summary>

```java
double[] temperatures = {18.5, 22.0, 24.5, 21.0, 19.5};

double firstTemp = temperatures[0];  // 18.5
double middleTemp = temperatures[2];  // 24.5
double lastTemp = temperatures[temperatures.length - 1];  // 19.5

System.out.println("First: " + firstTemp);
System.out.println("Middle: " + middleTemp);
System.out.println("Last: " + lastTemp);
```
</details>

---

### Opgave 4.29: Product comparison
**Scenario:** 
Sammenlign to produkter.

**Opgave:** 
Du har arrays for 3 produkter. Find det billigste og dyreste (bare første 3 elementer).

<details>
<summary>Se svar</summary>

```java
String[] products = {"Laptop", "Mouse", "Keyboard"};
double[] prices = {7999.99, 249.99, 499.99};

// Manually check first 3
double cheapest = prices[1];  // Mouse: 249.99
double mostExpensive = prices[0];  // Laptop: 7999.99

System.out.println("Cheapest: " + products[1] + " at " + cheapest);
System.out.println("Most expensive: " + products[0] + " at " + mostExpensive);
```
</details>

---

### Opgave 4.30: Complete data management
**Scenario:** 
En lille virksomhed tracker 5 medarbejdere.

**Opgave:** 
Erklær arrays for:
- Navne: "Anna", "Bob", "Carl", "Diana", "Eva"
- Aldre: 28, 35, 42, 30, 38
- Salary (kr): 45000, 52000, 58000, 48000, 51000
- Full-time: true, true, false, true, true

Find:
1. Antal medarbejdere
2. Første og sidste medarbejder navn
3. Gennemsnitsalder af første 3 medarbejdere
4. Total salary af alle medarbejdere

<details>
<summary>Se svar</summary>

```java
String[] names = {"Anna", "Bob", "Carl", "Diana", "Eva"};
int[] ages = {28, 35, 42, 30, 38};
double[] salaries = {45000, 52000, 58000, 48000, 51000};
boolean[] isFullTime = {true, true, false, true, true};

// 1. Antal medarbejdere
int employeeCount = names.length;  // 5

// 2. Første og sidste navn
String firstName = names[0];  // "Anna"
String lastName = names[names.length - 1];  // "Eva"

// 3. Gennemsnitsalder af første 3
int ageSum = ages[0] + ages[1] + ages[2];  // 105
double avgAge = ageSum / 3.0;  // 35.0

// 4. Total salary
double totalSalary = salaries[0] + salaries[1] + salaries[2] + 
                     salaries[3] + salaries[4];  // 254000

System.out.println("Employees: " + employeeCount);
System.out.println("First: " + firstName + ", Last: " + lastName);
System.out.println("Avg age (first 3): " + avgAge);
System.out.println("Total salary: " + totalSalary);
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvad er forskellen mellem en variabel og et array?
2. Hvorfor starter arrays ved index 0?
3. Hvad er forskellen mellem `array.length` og sidste index?
4. Hvordan får du det sidste element i et array?
5. Kan et array indeholde forskellige datatyper?
6. Hvad betyder `int[]` vs bare `int`?
7. Hvorfor er det vigtigt at bruge beskrivende array navne?
8. Hvad sker der hvis du prøver at tilgå index 5 i et array med length 5?

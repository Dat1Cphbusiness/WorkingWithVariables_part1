# Level 3 Opgaver: Variable Naming



### Indhold

- [Del A: Basic Naming Practice](#del-a-basic-naming-practice)
- [Del B: Identifying Bad Names](#del-b-identifying-bad-names)
- [Del C: Boolean Naming](#del-c-boolean-naming)
- [Del D: Context-Aware Naming](#del-d-context-aware-naming)
- [Del E: Min/Max and Previous/Current Patterns](#del-e-minmax-and-previouscurrent-patterns)
- [Del F: Real-World Naming Scenarios](#del-f-real-world-naming-scenarios)
- [Refleksionsspørgsmål](#refleksionsspørgsmål)


## Del A: Basic Naming Practice

### Opgave 3.1: Navngiv en alder variabel

**Scenario:** Du skal gemme en persons alder (heltal)

**Opgave:** 
Vælg ALLE de navne der er acceptable (god praksis):

- [ ] `a`
- [ ] `age`
- [ ] `personAge`
- [ ] `userAge`
- [ ]  `x`
- [ ] `theAge`

<details>
<summary>Se svar</summary>

- `a` - **NEJ** (enkeltbogstav, ikke beskrivende)
- `age` - **JA** (acceptabelt, kort men klart)
- `personAge` - **JA** (godt, beskrivende)
- `userAge` - **JA** (godt, beskrivende)
- `x` - **NEJ** (enkeltbogstav, meningsløs)
- `theAge` - **NEJ** (unødvendig "the", ikke idiomatisk)

**Bedste valg:** `personAge` eller `userAge` (mest beskrivende)
</details>

---

### Opgave 3.2: Navngiv en pris variabel
**Scenario:** Du skal gemme prisen på et produkt (decimal tal med kroner)

**Opgave:** 
Erklær en variabel med et GODT navn og initialiser til 99.99

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn og værdi | <input type="text" size="30"> |

**Hint:** Brug camelCase, vær beskrivende

<details>
<summary>Se svar</summary>

```java
double productPrice = 99.99;
```
eller
```java
double price = 99.99;
```

Begge er acceptable. `productPrice` er mere specifik.
</details>

---

### Opgave 3.3: Navngiv en boolean
**Scenario:** Du skal tracke om en bruger er logget ind

**Opgave:** 
Erklær en boolean med et GODT navn og initialiser til true

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn og værdi | <input type="text" size="30"> |

**Hint:** Boolean navne starter typisk med is/has/can

<details>
<summary>Se svar</summary>

```java
boolean isLoggedIn = true;
```

Andre acceptable navne:
- `boolean loggedIn = true;` (OK, men `is` præfix er bedre)
- `boolean userLoggedIn = true;` (OK, men lidt langt)
</details>

---

### Opgave 3.4: Navngiv en counter
**Scenario:** Du skal tælle antallet af studerende i en klasse

**Opgave:** 
Erklær en int variabel med et GODT navn og initialiser til 0

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn og værdi | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int studentCount = 0;
```
eller
```java
int numberOfStudents = 0;
```

Begge er gode. `studentCount` er mere koncis, `numberOfStudents` er mere eksplicit.
</details>

---

### Opgave 3.5: Navngiv en String
**Scenario:** Du skal gemme et brugernavn

**Opgave:** 
Erklær en String variabel med et GODT navn og initialiser til "anna"

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn og værdi | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
String userName = "anna";
```
eller
```java
String username = "anna";
```

Begge er acceptable. `userName` følger camelCase bedre.
</details>

---

## Del B: Identifying Bad Names

### Opgave 3.6: Find de dårlige navne
**Opgave:** 
Identificer hvad der er galt med disse navne:

| Variabelnavn | Hvad er galt? |
|--------------|---------------|
| `int a = 25;` | <input type="text" size="40"> |
| `double prc = 99.99;` | <input type="text" size="40"> |
| `boolean b = true;` | <input type="text" size="40"> |
| `String usrnm = "test";` | <input type="text" size="40"> |
| `int num_students = 30;` | <input type="text" size="40"> |

<details>
<summary>Se svar</summary>

- `a` - Enkeltbogstav, ikke beskrivende
- `prc` - Forkortelse, uklar betydning
- `b` - Enkeltbogstav, ikke beskrivende
- `usrnm` - Forkortelse, uklar (burde være `userName`)
- `num_students` - Bruger underscore i stedet for camelCase (burde være `numStudents` eller `studentCount`)
</details>

---

### Opgave 3.7: Ret de dårlige navne
**Opgave:** 
Omdøb disse variable til GODE navne:

| Dårligt navn | Hvad det repræsenterer | Dit bedre navn |
|--------------|------------------------|----------------|
| `int x = 30;` | Alder | <input type="text" size="25"> |
| `double p = 199.99;` | Pris | <input type="text" size="25"> |
| `boolean f = false;` | Om user er aktiv | <input type="text" size="25"> |
| `String n = "Anna";` | Bruger's navn | <input type="text" size="25"> |

<details>
<summary>Se svar</summary>

```java
int age = 30;
double price = 199.99;
boolean isActive = false;
String userName = "Anna";
```
</details>

---

### Opgave 3.8: camelCase praksis
**Opgave:** 
Ret disse navne så de følger camelCase:

| Forkert navn | Korrekt camelCase |
|--------------|-------------------|
| `int max_age = 150;` | <input type="text" size="25"> |
| `double product_price = 50.0;` | <input type="text" size="25"> |
| `boolean is_logged_in = true;` | <input type="text" size="25"> |
| `String user_name = "bob";` | <input type="text" size="25"> |

<details>
<summary>Se svar</summary>

```java
int maxAge = 150;
double productPrice = 50.0;
boolean isLoggedIn = true;
String userName = "bob";
```
</details>

---

### Opgave 3.9: For lange navne
**Opgave:** 
Forkort disse navne (hold dem beskrivende):

| For langt navn | Kortere, men stadig beskrivende |
|----------------|--------------------------------|
| `int theCurrentNumberOfStudentsInTheClass = 25;` | <input type="text" size="30"> |
| `double theTotalPriceIncludingTaxAndShipping = 299.99;` | <input type="text" size="30"> |
| `boolean isTheUserCurrentlyLoggedIntoTheSystem = true;` | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int studentCount = 25;
double totalPrice = 299.99;
boolean isLoggedIn = true;
```
</details>

---

### Opgave 3.10: For korte navne
**Opgave:** 
Gør disse navne mere beskrivende:

| For kort navn | Hvad det betyder | Bedre navn |
|---------------|------------------|------------|
| `int c = 10;` | Counter af items | <input type="text" size="25"> |
| `double p = 50;` | Pris per item | <input type="text" size="25"> |
| `boolean f = true;` | Er valid | <input type="text" size="25"> |

<details>
<summary>Se svar</summary>

```java
int itemCount = 10;
double pricePerItem = 50;
boolean isValid = true;
```
</details>

---

## Del C: Boolean Naming

### Opgave 3.11: Boolean med is prefix
**Scenario:** Tracker om et nummer er lige (even)

**Opgave:** 
Erklær en boolean med et GODT navn

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
boolean isEven = true;
```
</details>

---

### Opgave 3.12: Boolean med has prefix
**Scenario:** Tracker om en user har admin rettigheder

**Opgave:** 
Erklær en boolean med et GODT navn

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
boolean hasAdminRights = true;
```
eller
```java
boolean hasPermission = true;
```
</details>

---

### Opgave 3.13: Boolean med can prefix
**Scenario:** Tracker om en user kan redigere

**Opgave:** 
Erklær en boolean med et GODT navn

| <!-- --> | <!-- --> |
|----------|----------|
| Dit variabelnavn | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
boolean canEdit = true;
```
</details>

---

### Opgave 3.14: Multiple boolean scenarios
**Opgave:** 
Navngiv boolean variable for disse scenarios:

| Scenario | Dit variabelnavn |
|----------|------------------|
| Tracker om password er korrekt | <input type="text" size="30"> |
| Tracker om form har fejl | <input type="text" size="30"> |
| Tracker om user kan delete | <input type="text" size="30"> |
| Tracker om data er loaded | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
boolean isPasswordCorrect = true;
boolean hasErrors = false;
boolean canDelete = true;
boolean isLoaded = true;
```
</details>

---

### Opgave 3.15: Boolean anti-patterns
**Opgave:** 
Ret disse boolean navne:

| Dårligt navn | Bedre navn |
|--------------|------------|
| `boolean active = true;` (Mangler is) | <input type="text" size="30"> |
| `boolean status = false;` (Ikke boolean-agtigt) | <input type="text" size="30"> |
| `boolean flag = true;` (For generisk) | <input type="text" size="30"> |
| `boolean check = false;` (For generisk) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
boolean isActive = true;
boolean isOnline = false;
boolean isValid = true;
boolean isComplete = false;
```
</details>

---

## Del D: Context-Aware Naming

### Opgave 3.16: Shopping context
**Scenario:** Shopping cart system

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Total pris | <input type="text" size="30"> |
| Antal items i kurv | <input type="text" size="30"> |
| Om brugeren har discount code | <input type="text" size="30"> |
| Shipping cost | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
double totalPrice = 0.0;
int itemCount = 0;
boolean hasDiscountCode = false;
double shippingCost = 25.0;
```
</details>

---

### Opgave 3.17: User profile context
**Scenario:** User profile system

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| User's fornavn | <input type="text" size="30"> |
| User's efternavn | <input type="text" size="30"> |
| User's email | <input type="text" size="30"> |
| User's alder | <input type="text" size="30"> |
| Om profile er complete | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
String firstName = "Anna";
String lastName = "Jensen";
String email = "anna@example.com";
int age = 25;
boolean isProfileComplete = true;
```
</details>

---

### Opgave 3.18: Game context
**Scenario:** Simple game

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Player's score | <input type="text" size="30"> |
| Player's health (0-100) | <input type="text" size="30"> |
| Om game er paused | <input type="text" size="30"> |
| Current level nummer | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int playerScore = 0;
int playerHealth = 100;
boolean isPaused = false;
int currentLevel = 1;
```
</details>

---

### Opgave 3.19: Temperature tracking
**Scenario:** Weather system

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Current temperature i celsius | <input type="text" size="30"> |
| Max temperature today | <input type="text" size="30"> |
| Min temperature today | <input type="text" size="30"> |
| Om det regner | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
double currentTemperature = 22.5;
double maxTemperature = 25.0;
double minTemperature = 18.0;
boolean isRaining = false;
```
</details>

---

### Opgave 3.20: Bank account context
**Scenario:** Bank account system

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Account balance | <input type="text" size="30"> |
| Monthly fee | <input type="text" size="30"> |
| Om account er active | <input type="text" size="30"> |
| Antal transactions denne måned | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
double accountBalance = 5000.0;
double monthlyFee = 25.0;
boolean isActive = true;
int transactionCount = 12;
```
</details>

---

## Del E: Min/Max and Previous/Current Patterns

### Opgave 3.21: Min and max pattern
**Scenario:** Age restrictions

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Minimum alder (0) | <input type="text" size="30"> |
| Maximum alder (150) | <input type="text" size="30"> |
| En persons alder (25) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int minAge = 0;
int maxAge = 150;
int personAge = 25;
```
</details>

---

### Opgave 3.22: Previous and current pattern
**Scenario:** Price tracking

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Tidligere pris (199.99) | <input type="text" size="30"> |
| Nuværende pris (149.99) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
double previousPrice = 199.99;
double currentPrice = 149.99;
```
eller
```java
double oldPrice = 199.99;
double newPrice = 149.99;
```
</details>

---

### Opgave 3.23: Start and end pattern
**Scenario:** Event time

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Start tid (9) | <input type="text" size="30"> |
| Slut tid (17) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int startTime = 9;
int endTime = 17;
```
</details>

---

### Opgave 3.24: First and last pattern
**Scenario:** Array navigation

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| First index i array (0) | <input type="text" size="30"> |
| Last index i array (9) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int firstIndex = 0;
int lastIndex = 9;
```
</details>

---

### Opgave 3.25: Best/worst pattern
**Scenario:** Score tracking

**Opgave:** 
Navngiv variable til at gemme:

| <!-- --> | <!-- --> |
|----------|----------|
| Bedste score (100) | <input type="text" size="30"> |
| Værste score (45) | <input type="text" size="30"> |
| Gennemsnits score (75.5) | <input type="text" size="30"> |

<details>
<summary>Se svar</summary>

```java
int bestScore = 100;
int worstScore = 45;
double averageScore = 75.5;
```
</details>

---

## Del F: Real-World Naming Scenarios

### Opgave 3.26: E-commerce product
**Scenario:** Product information system

**Opgave:** 
Erklær og initialiser variable med GODE navne til:

| <!-- --> | Værdi | Dit variabelnavn og værdi |
|----------|-------|---------------------------|
| Product name | "Laptop" | <input type="text" size="35"> |
| Product price | 7999.99 | <input type="text" size="35"> |
| In stock | true | <input type="text" size="35"> |
| Stock quantity | 15 | <input type="text" size="35"> |
| Discount percent | 10.0 | <input type="text" size="35"> |
| Category | "Electronics" | <input type="text" size="35"> |

<details>
<summary>Se svar</summary>

```java
String productName = "Laptop";
double productPrice = 7999.99;
boolean inStock = true;
int stockQuantity = 15;
double discountPercent = 10.0;
String category = "Electronics";
```
</details>

---

### Opgave 3.27: Student grade system
**Scenario:** Track student grades

**Opgave:** 
Erklær og initialiser variable med GODE navne til:

| <!-- --> | Værdi | Dit variabelnavn og værdi |
|----------|-------|---------------------------|
| Student name | "Anna" | <input type="text" size="35"> |
| Test score | 85 | <input type="text" size="35"> |
| Homework score | 92 | <input type="text" size="35"> |
| Final grade (average) | 88.5 | <input type="text" size="35"> |
| Passed course | true | <input type="text" size="35"> |

<details>
<summary>Se svar</summary>

```java
String studentName = "Anna";
int testScore = 85;
int homeworkScore = 92;
double finalGrade = 88.5;
boolean passedCourse = true;
```
</details>

---

### Opgave 3.28: Booking system
**Scenario:** Hotel room booking

**Opgave:** 
Erklær og initialiser variable med GODE navne til:

| <!-- --> | Værdi | Dit variabelnavn og værdi |
|----------|-------|---------------------------|
| Guest name | "Peter Hansen" | <input type="text" size="35"> |
| Room number | 204 | <input type="text" size="35"> |
| Number of nights | 3 | <input type="text" size="35"> |
| Price per night | 899.00 | <input type="text" size="35"> |
| Has breakfast | true | <input type="text" size="35"> |
| Total cost | 2697.00 | <input type="text" size="35"> |

<details>
<summary>Se svar</summary>

```java
String guestName = "Peter Hansen";
int roomNumber = 204;
int numberOfNights = 3;
double pricePerNight = 899.00;
boolean hasBreakfast = true;
double totalCost = 2697.00;
```
</details>

---

### Opgave 3.29: Fitness tracker
**Scenario:** Daily activity tracking

**Opgave:** 
Erklær og initialiser variable med GODE navne til:

| <!-- --> | Værdi | Dit variabelnavn og værdi |
|----------|-------|---------------------------|
| Steps walked today | 8547 | <input type="text" size="35"> |
| Goal steps | 10000 | <input type="text" size="35"> |
| Distance in km | 6.2 | <input type="text" size="35"> |
| Calories burned | 420 | <input type="text" size="35"> |
| Goal reached | false | <input type="text" size="35"> |

<details>
<summary>Se svar</summary>

```java
int stepsToday = 8547;
int goalSteps = 10000;
double distanceKm = 6.2;
int caloriesBurned = 420;
boolean goalReached = false;
```
</details>

---

### Opgave 3.30: Complete naming exercise
**Scenario:** Library system - track book information

**Opgave:** 
Erklær variable med PERFEKTE navne til at gemme:

| <!-- --> | Dit variabelnavn |
|----------|------------------|
| Book title | <input type="text" size="35"> |
| Author name | <input type="text" size="35"> |
| ISBN number | <input type="text" size="35"> |
| Number of pages | <input type="text" size="35"> |
| Is available for borrowing | <input type="text" size="35"> |
| Current borrower (if any) | <input type="text" size="35"> |
| Due date | <input type="text" size="35"> |
| Fine amount if overdue | <input type="text" size="35"> |
| Is bestseller | <input type="text" size="35"> |
| Rating (0.0-5.0) | <input type="text" size="35"> |

Fokuser på at vælge de BEDST mulige navne!

<details>
<summary>Se svar</summary>

```java
String bookTitle = "Java Programming";
String authorName = "John Smith";
String isbn = "978-0-123456-78-9";
int numberOfPages = 456;
boolean isAvailable = true;
String currentBorrower = "";
String dueDate = "2026-02-01";
double fineAmount = 0.0;
boolean isBestseller = true;
double rating = 4.5;
```
</details>

---

## Refleksionsspørgsmål

Efter du har løst opgaverne, tænk over:
1. Hvorfor er beskrivende variabelnavne vigtige?
2. Hvad er camelCase og hvorfor bruger vi det?
3. Hvornår er det OK at bruge korte navne (som `i`)?
4. Hvorfor skal boolean variable starte med is/has/can?
5. Hvad er problemet med forkortelser i variabelnavne?
6. Hvordan finder du balance mellem for korte og for lange navne?
7. Hvordan hjælper context dig med at vælge gode navne?
8. Hvad gør et variabelnavn "godt"?

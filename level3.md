# Level 3: Variable Naming

## Level 3 fokuserer på:
- Vælge gode variabelnavne
- Naming conventions
- Beskrivende vs kryptiske navne
- camelCase konvention
- Undgå dårlige navne
- Navngivning baseret på formål
- Læsbarhed og forståelighed
- Common naming patterns



---

### Gå direkte til opgaver

- [Del A](#del-a-basic-naming-practice)
- [Del B](#del-b-identifying-bad-names)
- [Del C](#del-c-boolean-naming)
- [Del D](#del-d-context-aware-naming)
- [Del E](#del-e-minmax-and-previouscurrent-patterns)
- [Del F](#del-f-real-world-naming-scenarios)
---

## Begrebsgennemgang

### Hvorfor Er Gode Navne Vigtige?

Kode bliver læst meget mere end den bliver skrevet. Gode variabelnavne gør koden:
- **Lettere at forstå** - Andre (og du selv senere) kan se hvad variablen bruges til
- **Mindre fejltilbøjelig** - Klare navne reducerer forvirring
- **Nemmere at vedligeholde** - Logikken bliver tydelig

**Dårligt navn:**
```java
int x = 25;  // Hvad er x?
```

**Godt navn:**
```java
int userAge = 25;  // Klart - det er brugerens alder
```

### Naming Conventions

**camelCase** - Standard for variable i Java:
- Start med lille bogstav
- Hvert nyt ord starter med stort bogstav
- Ingen mellemrum eller underscore

**Eksempler:**
```java
int age;                    // Enkelt ord
int userAge;                // To ord
int maxTemperature;         // To ord
int numberOfStudents;       // Flere ord
double pricePerItem;        // Flere ord
boolean isLoggedIn;         // Med præfix
```

### Beskrivende Navne

Navne skal beskrive **HVAD** variablen indeholder:

```java
// DÅRLIGE navne - kryptiske
int a;
double x;
String s;
boolean b;

// GODE navne - beskrivende
int studentAge;
double productPrice;
String userName;
boolean isActive;
```

### Undgå Enkeltbogstaver

Undgå enkeltbogstaver (undtagen loop counters):

```java
// DÅRLIGT
int a = 25;
double p = 99.99;

// GODT
int age = 25;
double price = 99.99;

// OK i loops
for (int i = 0; i < 10; i++) {
    // i er acceptabelt her
}
```

### Brug Navne Der Afslører Formål

Navne skal fortælle **HVORFOR** variablen eksisterer:

```java
// Uklart formål
int count;        // Count af hvad?
double value;     // Hvilken værdi?

// Klart formål
int studentCount;
double totalPrice;
int maxAttempts;
double discountPercent;
```

### Boolean Naming Pattern

Booleans bør starte med is/has/can:

```java
boolean isActive;        // Er den aktiv?
boolean hasPermission;   // Har den tilladelse?
boolean canEdit;         // Kan den redigeres?
boolean isComplete;      // Er den færdig?
boolean hasErrors;       // Har den fejl?
```

### Counter og Index Naming

Tællere og indices har common patterns:

```java
int count;              // Generic counter
int studentCount;       // Count af studerende
int itemCount;          // Count af items

int index;              // Generic index
int currentIndex;       // Nuværende position
int startIndex;         // Start position
```

### Velkendte Forkortelser

Undgå forkortelser med mindre de er velkendte:

```java
// DÅRLIGT - uklar forkortelse
int numStud;
double prc;
String usrNm;

// GODT - beskrivende
int numberOfStudents;
double price;
String userName;

// OK - velkendt forkortelse
int maxAge;     // max er velkendt
int minPrice;   // min er velkendt
```

### Length vs Clarity

Find balance mellem længde og klarhed:

```java
// FOR KORT - uklar
int n;
double p;

// FOR LANGT - besværlig
int theCurrentNumberOfStudentsInTheClass;
double theTotalPriceIncludingTaxAndShipping;

// PASSER - klar og præcis
int studentCount;
double totalPrice;
```

### Contexten Betyder Noget

I en specifik context kan kortere navne være OK:

```java
// I en Person class
class Person {
    String name;    // OK - tydeligt at det er person's name
    int age;        // OK - tydeligt at det er person's age
}

// I main kode - mere specifik
String personName;
int personAge;
```

### Common Patterns

**Tællere:**
```java
int count;
int total;
int sum;
```

**Min/Max:**
```java
int minAge;
int maxAge;
double minPrice;
double maxPrice;
```

**Previous/Current:**
```java
int previousValue;
int currentValue;
double oldPrice;
double newPrice;
```

**Temporary:**
```java
int temp;           // OK for meget kortvarig brug
int tempValue;      // Bedre
```

**Boolean flags:**
```java
boolean isFound;
boolean isValid;
boolean hasData;
boolean canAccess;
```

### Navngivningsproces

Når du skal navngive en variabel:

1. **Hvad indeholder den?** (Tal, tekst, sand/falsk)
2. **Hvad repræsenterer den?** (Alder, pris, navn)
3. **Hvad er dens formål?** (Tælle, gemme, tracke)
4. **Kombiner til beskrivende navn** (studentCount, productPrice)

**Eksempel:**
- Indeholder: int
- Repræsenterer: antal studerende
- Formål: tælle hvor mange studerende der er
- Navn: `studentCount` eller `numberOfStudents`

### Gode vs Dårlige Navne - Eksempler

**Scenario: Gemme en persons alder**
```java
int a;              // DÅRLIGT - kryptisk
int x;              // DÅRLIGT - meningsløs
int number;         // DÅRLIGT - for generisk
int pers_age;       // DÅRLIGT - ikke camelCase
int theAgeOfThePerson;  // DÅRLIGT - for langt
int age;            // OK - men kunne være mere specifik
int personAge;      // GODT - klar og præcis
int userAge;        // GODT - hvis det er en bruger
```

**Scenario: Tracke om noget er aktivt**
```java
boolean b;          // DÅRLIGT - kryptisk
boolean active;     // OK - men mangler is
boolean status;     // DÅRLIGT - ikke boolean-agtigt
boolean isActive;   // GODT - klar boolean
```

**Tag udgangspunkt i klassen DataScenario.**  
**Skriv din kode i Main.java i testLevel3() metoden.**

---

## Tips
- Brug beskrivende navne der afslører formål
- Følg camelCase konvention
- Boolean navne starter med is/has/can
- Undgå enkeltbogstaver (undtagen loop counters)
- Undgå forkortelser
- Tænk på fremtidigt dig selv der skal læse koden
- Hvis du tøver over navnet, er det sandsynligvis ikke godt nok
- Al din kode skal placeres inde i `testLevel3()` metoden mellem tuborgklammerne `{}`

---

## Del A: Basic Naming Practice

### Opgave 3.1: Navngiv en alder variabel
📖 [Se forklaring: Beskrivende Navne](#beskrivende-navne)

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
<summary> Se svar</summary>
 <detail><code>age, personAge, userAge</code> (alle er OK, men <code>personAge/userAge</code> er mest beskrivende) </detail>
</details>



---

### Opgave 3.2: Navngiv en pris variabel
**Scenario:** Du skal gemme prisen på et produkt (decimal tal med kroner)

**Opgave:** 
Erklær en variabel med et GODT navn og initialiser til 99.99

**Hint:** Brug camelCase, vær beskrivende



<details>
<summary> Se eksempel løsning </summary>
<detail>
<code>
double productPrice = 99.99; // eller
double price = 99.99;
</code></detail>
</details>

---

### Opgave 3.3: Navngiv en boolean
**Scenario:** Du skal tracke om en bruger er logget ind

**Opgave:** 
Erklær en boolean med et GODT navn og initialiser til true

**Hint:** Boolean navne starter typisk med is/has/can


<details>
<summary> Se svar</summary>
 <detail><code>boolean isLoggedIn = true;</code>  </detail>
</details>



---

### Opgave 3.4: Navngiv en counter
**Scenario:** Du skal tælle antallet af studerende i en klasse

**Opgave:** 
Erklær en int variabel med et GODT navn og initialiser til 0



<details>
<summary> Se svar</summary>
 <detail><code>java
int studentCount = 0;
// eller
int numberOfStudents = 0;
</code> </detail>
</details>





---

### Opgave 3.5: Navngiv en String
**Scenario:** Du skal gemme et brugernavn

**Opgave:** 
Erklær en String variabel med et GODT navn og initialiser til "anna"

<details>
<summary> Se svar</summary>
 <detail><code>
String userName = "anna";
// eller
String username = "anna";
</code></detail>
</details>
---

## Del B: Identifying Bad Names

### Opgave 3.6: Find de dårlige navne
**Opgave:** 
Identificer hvad der er galt med disse navne:

```java
int a = 25;
double prc = 99.99;
boolean b = true;
String usrnm = "test";
int num_students = 30;
```

<details>
<summary> Se svar</summary>
 <detail>

- `a`- Enkeltbogstav, ikke beskrivende
- `prc` - Forkortelse, uklar
- `b` - Enkeltbogstav, ikke beskrivende
- `usrnm` - Forkortelse, uklar
- `num_students` - Bruger underscore i stedet for camelCase

</detail>
</details>

---

### Opgave 3.7: Ret de dårlige navne
**Opgave:** 
Omdøb disse variable til GODE navne:

```java
int x = 30;              // Repræsenterer alder
double p = 199.99;       // Repræsenterer pris
boolean f = false;       // Tracker om user er aktiv
String n = "Anna";       // Bruger's navn
```

**Eksempel løsning:**

<details>
<summary> Se svar</summary>
 <detail>

```java
int age = 30;
double price = 199.99;
boolean isActive = false;
String userName = "Anna";
```
</detail>
</details>

---

### Opgave 3.8: camelCase praksis
**Opgave:** 
Ret disse navne så de følger camelCase:

```java
int max_age = 150;
double product_price = 50.0;
boolean is_logged_in = true;
String user_name = "bob";
```


<details>
<summary> Se svar</summary>
 <detail>

```java
int maxAge = 150;
double productPrice = 50.0;
boolean isLoggedIn = true;
String userName = "bob";
```

</detail>
</details>
---

### Opgave 3.9: For lange navne
**Opgave:** 
Forkort disse navne (hold dem beskrivende):

```java
int theCurrentNumberOfStudentsInTheClass = 25;
double theTotalPriceIncludingTaxAndShipping = 299.99;
boolean isTheUserCurrentlyLoggedIntoTheSystem = true;
```

<details>
<summary> Se svar</summary>
 <detail>

```java
int studentCount = 25;
double totalPrice = 299.99;
boolean isLoggedIn = true;
```

</detail>
</details>
---

### Opgave 3.10: For korte navne
**Opgave:** 
Gør disse navne mere beskrivende:

```java
int c = 10;      // Counter af items
double p = 50;   // Pris per item
boolean f = true; // Er valid
```

<details>
<summary> Se svar</summary>
 <detail>

```java
int itemCount = 10;
double pricePerItem = 50;
boolean isValid = true;
```
</detail>
</details>
---

## Del C: Boolean Naming

### Opgave 3.11: Boolean med is prefix
**Scenario:** Tracker om et nummer er lige (even)

**Opgave:** 
Erklær en boolean med et GODT navn

<details>
<summary> Se svar</summary>
 <detail>

```java
boolean isEven = true;
```
</detail>
</details>
---

### Opgave 3.12: Boolean med has prefix
**Scenario:** Tracker om en user har admin rettigheder

**Opgave:** 
Erklær en boolean med et GODT navn

<details>
<summary> Se svar</summary>
 <detail>

```java
boolean hasAdminRights = true;
// eller
boolean hasPermission = true;
```
</detail>
</details>

---

### Opgave 3.13: Boolean med can prefix
**Scenario:** Tracker om en user kan redigere

**Opgave:** 
Erklær en boolean med et GODT navn

<details>
<summary> Se svar</summary>
 <detail>

```java
boolean canEdit = true;
```
</detail>
</details>
---

### Opgave 3.14: Multiple boolean scenarios
**Opgave:** 
Navngiv boolean variable for disse scenarios:
1. Tracker om password er korrekt
2. Tracker om form har fejl
3. Tracker om user kan delete
4. Tracker om data er loaded

<details>
<summary> Se svar</summary>
 <detail>

```java
boolean isPasswordCorrect = true;
boolean hasErrors = false;
boolean canDelete = true;
boolean isLoaded = true;
```
</detail>
</details>
---

### Opgave 3.15: Boolean anti-patterns
**Opgave:** 
Ret disse boolean navne:

```java
boolean active = true;       // Mangler is
boolean status = false;      // Ikke boolean-agtigt
boolean flag = true;         // For generisk
boolean check = false;       // For generisk
```
 <input type="text">
 <input type="text">
 <input type="text">
 <input type="text">

---

<details>
<summary> Se svar</summary>
 <detail>

```java
boolean isActive = true;
boolean isOnline = false;
boolean isValid = true;
boolean isComplete = false;
```
</detail>
</details>
---

## Del D: Context-Aware Naming

### Opgave 3.16: Shopping context
**Scenario:** Shopping cart system

**Opgave:** 
Navngiv variable til at gemme:


| <!-- --> | <!-- --> |
|----------|----------|
| Total pris | <input type="text">|
| Antal items i kurv | <input type="text">|
Om brugeren har discount code | <input type="text">|
|Shipping cost |  <input type="text">|


<details>
<summary> Se svar</summary>
 <detail>

```java
double totalPrice = 0.0;
int itemCount = 0;
boolean hasDiscountCode = false;
double shippingCost = 25.0;
```
</detail>
</details>

---

### Opgave 3.17: User profile context
**Scenario:** User profile system

**Opgave:** 
Navngiv variable til at gemme:
1. User's fornavn
2. User's efternavn
3. User's email
4. User's alder
5. Om profile er complete

**Eksempel løsning:**
```java
String firstName = "Anna";
String lastName = "Jensen";
String email = "anna@example.com";
int age = 25;
boolean isProfileComplete = true;
```

---

### Opgave 3.18: Game context
**Scenario:** Simple game

**Opgave:** 
Navngiv variable til at gemme:
1. Player's score
2. Player's health (0-100)
3. Om game er paused
4. Current level nummer

**Eksempel løsning:**
```java
int playerScore = 0;
int playerHealth = 100;
boolean isPaused = false;
int currentLevel = 1;
```

---

### Opgave 3.19: Temperature tracking
**Scenario:** Weather system

**Opgave:** 
Navngiv variable til at gemme:
1. Current temperature i celsius
2. Max temperature today
3. Min temperature today
4. Om det regner

**Eksempel løsning:**
```java
double currentTemperature = 22.5;
double maxTemperature = 25.0;
double minTemperature = 18.0;
boolean isRaining = false;
```

---

### Opgave 3.20: Bank account context
**Scenario:** Bank account system

**Opgave:** 
Navngiv variable til at gemme:
1. Account balance
2. Monthly fee
3. Om account er active
4. Antal transactions denne måned

**Eksempel løsning:**
```java
double accountBalance = 5000.0;
double monthlyFee = 25.0;
boolean isActive = true;
int transactionCount = 12;
```

---

## Del E: Min/Max and Previous/Current Patterns

### Opgave 3.21: Min and max pattern
**Scenario:** Age restrictions

**Opgave:** 
Navngiv variable til at gemme:
1. Minimum alder (0)
2. Maximum alder (150)
3. En persons alder (25)

**Eksempel løsning:**
```java
int minAge = 0;
int maxAge = 150;
int personAge = 25;
```

---

### Opgave 3.22: Previous and current pattern
**Scenario:** Price tracking

**Opgave:** 
Navngiv variable til at gemme:
1. Tidligere pris (199.99)
2. Nuværende pris (149.99)

**Eksempel løsning:**
```java
double previousPrice = 199.99;
double currentPrice = 149.99;
// eller
double oldPrice = 199.99;
double newPrice = 149.99;
```

---

### Opgave 3.23: Start and end pattern
**Scenario:** Event time

**Opgave:** 
Navngiv variable til at gemme:
1. Start tid (9)
2. Slut tid (17)

**Eksempel løsning:**
```java
int startTime = 9;
int endTime = 17;
```

---

### Opgave 3.24: First and last pattern
**Scenario:** Array navigation

**Opgave:** 
Navngiv variable til at gemme:
1. First index i array (0)
2. Last index i array (9)

**Eksempel løsning:**
```java
int firstIndex = 0;
int lastIndex = 9;
```

---

### Opgave 3.25: Best/worst pattern
**Scenario:** Score tracking

**Opgave:** 
Navngiv variable til at gemme:
1. Bedste score (100)
2. Værste score (45)
3. Gennemsnits score (75.5)

**Eksempel løsning:**
```java
int bestScore = 100;
int worstScore = 45;
double averageScore = 75.5;
```

---

## Del F: Real-World Naming Scenarios

### Opgave 3.26: E-commerce product
**Scenario:** Product information system

**Opgave:** 
Erklær og initialiser variable med GODE navne til:
1. Product name: "Laptop"
2. Product price: 7999.99
3. In stock: true
4. Stock quantity: 15
5. Discount percent: 10.0
6. Category: "Electronics"

**Eksempel løsning:**
```java
String productName = "Laptop";
double productPrice = 7999.99;
boolean inStock = true;
int stockQuantity = 15;
double discountPercent = 10.0;
String category = "Electronics";
```

---

### Opgave 3.27: Student grade system
**Scenario:** Track student grades

**Opgave:** 
Erklær og initialiser variable med GODE navne til:
1. Student name: "Anna"
2. Test score: 85
3. Homework score: 92
4. Final grade (average): 88.5
5. Passed course: true

**Eksempel løsning:**
```java
String studentName = "Anna";
int testScore = 85;
int homeworkScore = 92;
double finalGrade = 88.5;
boolean passedCourse = true;
```

---

### Opgave 3.28: Booking system
**Scenario:** Hotel room booking

**Opgave:** 
Erklær og initialiser variable med GODE navne til:
1. Guest name: "Peter Hansen"
2. Room number: 204
3. Number of nights: 3
4. Price per night: 899.00
5. Has breakfast: true
6. Total cost: 2697.00

**Eksempel løsning:**
```java
String guestName = "Peter Hansen";
int roomNumber = 204;
int numberOfNights = 3;
double pricePerNight = 899.00;
boolean hasBreakfast = true;
double totalCost = 2697.00;
```

---

### Opgave 3.29: Fitness tracker
**Scenario:** Daily activity tracking

**Opgave:** 
Erklær og initialiser variable med GODE navne til:
1. Steps walked today: 8547
2. Goal steps: 10000
3. Distance in km: 6.2
4. Calories burned: 420
5. Goal reached: false

**Eksempel løsning:**
```java
int stepsToday = 8547;
int goalSteps = 10000;
double distanceKm = 6.2;
int caloriesBurned = 420;
boolean goalReached = false;
```

---

### Opgave 3.30: Complete naming exercise
**Scenario:** Library system - track book information

**Opgave:** 
Erklær variable med PERFEKTE navne til at gemme:
1. Book title
2. Author name
3. ISBN number
4. Number of pages
5. Is available for borrowing
6. Current borrower (if any)
7. Due date
8. Fine amount if overdue
9. Is bestseller
10. Rating (0.0-5.0)

Fokuser på at vælge de BEDST mulige navne!

**Eksempel løsning:**
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

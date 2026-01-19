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

### Vermeide Forkortelser

Undgå forkortelser med mindre de er velkendte:

```java
// DÅRLIGT - uklar forkortelse
int numStud;
double prc;
String usrNm;

// GODT - fuld ord
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
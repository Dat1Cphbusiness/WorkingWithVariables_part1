# Level 1: Variable Basics & Data Types

## Level 1 fokuserer på:
- Variable declaration (erklæring)
- Variable initialization (initialisering)
- Variable assignment (tildeling)
- Primitive data types (int, double, boolean, char)
- String (reference type, men bruges som primitiv)
- Type compatibility
- Constants (final)
- Variable naming conventions
- Reassignment
- Sneak peek: Arrays

---

## Begrebsgennemgang

### Hvad er en Variabel?
En **variabel** er en navngivet beholder der kan holde en værdi. Du kan tænke på det som en æske med et navn på, hvor du kan lægge ting i.
```java
int age;           // Erklærer en variabel kaldet "age"
age = 25;          // Tilføjer værdien 25 til variablen

String name;       // Erklærer en variabel kaldet "name"
name = "Anna";     // Tilføjer værdien "Anna" til variablen
```

### Declaration vs Initialization

**Declaration** (erklæring) - Opretter variablen:
```java
int age;           // Variablen eksisterer, men har ingen værdi
String name;       // Variablen eksisterer, men har ingen værdi
```

**Initialization** (initialisering) - Giver første værdi:
```java
age = 25;          // Nu har age værdien 25
name = "Anna";     // Nu har name værdien "Anna"
```

**Declaration + Initialization** - Begge på én gang:
```java
int age = 25;           // Opretter OG giver værdi
String name = "Anna";   // Opretter OG giver værdi
```

### Assignment (Tildeling)
Du kan **ændre** værdien af en variabel:
```java
int age = 25;      // Først er age 25
age = 26;          // Nu er age 26
age = 30;          // Nu er age 30

String city = "Copenhagen";   // Først er city "Copenhagen"
city = "Aarhus";              // Nu er city "Aarhus"
```

### Data Types

Java har flere typer data. Vi fokuserer på disse:

#### 1. **int** - Hele tal
```java
int age = 25;
int quantity = 100;
int temperature = -5;
```

#### 2. **double** - Decimaltal
```java
double price = 19.99;
double height = 1.75;
double temperature = 36.5;
```

#### 3. **boolean** - true eller false
```java
boolean isStudent = true;
boolean isRaining = false;
boolean hasDiscount = true;
```

#### 4. **char** - Enkelt tegn
```java
char grade = 'A';
char initial = 'M';
char symbol = '@';
```

**Vigtigt:** char bruger single quotes `'A'`, ikke double quotes `"A"`

#### 5. **String** - Tekst
```java
String name = "Anna";
String city = "Copenhagen";
String message = "Hello, World!";
```

**Vigtigt:** String bruger double quotes `"tekst"`, ikke single quotes. String starter med stort S – det er teknisk set ikke en primitiv type, men en klasse. I praksis bruger vi den næsten som en primitiv.

### Variable Naming Conventions

**Gode navne:**
```java
int age;              // Beskrivende
double totalPrice;    // camelCase for flere ord
boolean isActive;     // boolean starter ofte med "is"
int studentCount;     // Tydeligt hvad den tæller
String firstName;     // Beskrivende for tekstdata
String errorMessage;  // Tydeligt hvad teksten indeholder
```

**Dårlige navne:**
```java
int a;               // For kort, ikke beskrivende
int TotalPrice;      // Skal ikke starte med stort bogstav
int total_price;     // Brug camelCase, ikke underscore
String s;            // Ikke beskrivende
```

**Regler:**
- Start med lille bogstav
- Brug camelCase for flere ord (firstWord, secondWord)
- Være beskrivende (age er bedre end a, name er bedre end s)
- Ingen mellemrum eller specialtegn (undtagen _)

### Type Compatibility

Du kan IKKE blande typer uden at være opmærksom:
```java
int age = 25;
age = 25.5;           // FEJL! Kan ikke putte double i int
age = "twenty-five";  // FEJL! Kan ikke putte String i int

double price = 19.99;
price = 20;           // OK! int kan automatisk blive til double

String name = "Anna";
name = 42;            // FEJL! Kan ikke putte int i String
```

### Type Conversion

**int til double** (automatisk):
```java
int whole = 10;
double decimal = whole;  // decimal bliver 10.0
```

**double til int** (manuel - mister decimaler):
```java
double decimal = 10.75;
int whole = (int) decimal;  // whole bliver 10 (mister .75)
```

**Tal til String:**
```java
int age = 25;
String ageText = String.valueOf(age);    // ageText bliver "25"
String ageText2 = "" + age;              // Alternativ måde
```

**String til tal:**
```java
String input = "42";
int number = Integer.parseInt(input);    // number bliver 42

String priceText = "19.99";
double price = Double.parseDouble(priceText);  // price bliver 19.99
```

### Constants (final)
En **constant** er en variabel der IKKE kan ændres:
```java
final int MAX_AGE = 100;
MAX_AGE = 101;  // FEJL! Kan ikke ændre en final variabel

final String GREETING = "Hello";
GREETING = "Hi";  // FEJL! Kan ikke ændre en final variabel
```

**Naming convention for constants:**
- ALLE_STORE_BOGSTAVER
- Underscore mellem ord
```java
final double PI = 3.14159;
final int MAX_STUDENTS = 30;
final boolean DEBUG_MODE = true;
final String DEFAULT_LANGUAGE = "Danish";
```

### Reassignment
Du kan ændre værdien af en variabel (hvis den ikke er final):
```java
int score = 100;
System.out.println(score);  // 100

score = 200;
System.out.println(score);  // 200

score = score + 50;         // Brug gammel værdi til at beregne ny
System.out.println(score);  // 250

String greeting = "Hello";
System.out.println(greeting);  // Hello

greeting = "Hi";
System.out.println(greeting);  // Hi

greeting = greeting + "!";     // Brug gammel værdi til at bygge ny
System.out.println(greeting);  // Hi!
```

### Sneak Peek: Arrays

Alle variablerne ovenfor holder én enkelt værdi. Men hvad hvis du vil gemme flere værdier sammen – fx en liste af scores eller navne?

Det kan du med **arrays**:
```java
int[] scores = {100, 85, 92, 78};        // Fire tal i én variabel
String[] names = {"Anna", "Bo", "Carl"}; // Tre navne i én variabel
```

Du tilgår de enkelte værdier med et indeks (starter ved 0):
```java
System.out.println(scores[0]);   // 100 (første element)
System.out.println(scores[2]);   // 92 (tredje element)
System.out.println(names[1]);    // "Bo" (andet element)
```

Arrays har en fast størrelse og deres egen syntax. Vi dækker dem i detaljer på en separat side.

---

## Tips
- Erklær variabler med meningsfulde navne
- Initialiser variabler før du bruger dem
- int for hele tal, double for decimaltal
- boolean for true/false, char for enkelte tegn
- String for tekst (husk stort S og double quotes)
- Brug final for værdier der ikke skal ændres
- camelCase for variable navne
- Print variabler ofte for at se deres værdier

---
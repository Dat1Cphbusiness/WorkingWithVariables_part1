# Getting Started: Dit Første Java Program

For at komme i gang, skal først have downloadet og installeret IntelliJ som er det IDE (Integrated Development Environment), vi bruger til skrive kode i.
[Følg denne guide](https://erhvervsakademikbenhavn.sharepoint.com/:b:/r/sites/cph-Lyngby/Shared%20Documents/4.%20Indhold%20%26%20Niveau/DAT/1.%20sem%20for%C3%A5r%202026/studerende/Uge%206%20-%20IntelliJ%20-%20installationsvejledning.pdf?csf=1&web=1&e=FyHQuO)

Nu er du klar til at gå igang med at lære de **basale byggesten** i et Java program. På denne side lærer du det mest nødvendige for at komme i gang.



---

## Dit Første Program

I IntelliJ laver du et projekt med en fil kaldet `MyFirstProgram.java` med denne kode:

```java
String message = "hello world";

void main() {
    System.out.println(message);
}
```

**Output når du kører programmet:**
```
hello world
```

Lad os forstå hver del!

---

## De Vigtigste Koncepter

### 1. Statements og Semikolon (;)

Et **statement** er en instruktion til computeren. Hver statement slutter med `;` (semikolon).

```java
String message = "hello world";    // Statement 1 - slutter med ;
System.out.println(message);    // Statement 2 - slutter med ;
```

**Tænk på `;` som et punktum i en sætning** - det markerer afslutningen.

**Forkert (mangler semikolon):**
```java
String message = "hello world"     // ERROR - mangler ;
System.out.println(message)    // ERROR - mangler ;
```

**Korrekt:**
```java
String message = "hello world";    // ✓
System.out.println(message);    // ✓
```

---

### 2. Curly Brackets { }

**Curly brackets** `{ }` (krølleparenteser) definerer en **blok** af kode.

```java
void main() {
    // Alt her inde er INDE I main-blokken
    System.out.println(message);
}
```

**Regler:**
- `{` starter en blok
- `}` slutter en blok
- Kode inde i blokken er "grupperet sammen"

**Eksempel:**
```java
void main() {              // Start main-blok
    String name = "Anna";
    int age = 25;
    System.out.println(name);
    System.out.println(age);
}                          // Slut main-blok
```

**Alt mellem `{` og `}` hører til main-metoden.**

---

### 3. main() Metoden

`void main()` er **programets startpunkt**. Det er her dit program starter.

```java
void main() {
    // Dit program starter HER
    System.out.println("Hello World");
}
```

**Hvad betyder det?**
- `void` = metoden returnerer ingen værdi (lærer du mere om senere)
- `main` = navnet på metoden
- `()` = ingen parametre (lige nu)
- `{ }` = metodens kode

**Vigtigt:** Når du trykker "Run" i IntelliJ, kører Java automatisk `main()` metoden.

---

### 4. Variabler Uden For main()

Du kan definere variabler **uden for** main-metoden:

```java
String message = "hello world";    // Defineret UDEN FOR main

void main() {
    System.out.println(message);    // Brugt INDE I main
}
```

**Dette virker fordi:**
- `message` er tilgængelig for hele klassen
- `main()` kan bruge `message`

**Scope regel (simpel version):**
- Variabler uden for `main()` kan bruges inde i `main()`
- Du lærer mere om scope i Variables Set 3

---

## Komplet Eksempel Med Forklaring

```java
String greeting = "Velkommen";    // Statement - slutter med ;
int number = 42;                  // Statement - slutter med ;

void main() {                     // main starter - åbner {
    System.out.println(greeting); // Statement - slutter med ;
    System.out.println(number);   // Statement - slutter med ;
}                                 // main slutter - lukker }
```

**Output:**
```
Velkommen
42
```

**Forklaring linje for linje:**
1. Definer String variabel `greeting` - slutter med `;`
2. Definer int variabel `number` - slutter med `;`
3. Start `main()` metoden - åbner `{`
4. Print greeting - slutter med `;`
5. Print number - slutter med `;`
6. Slut `main()` metoden - lukker `}`

---

## Husk Disse Regler

✅ **Hver statement slutter med `;`**
```java
String name = "Bob";    // ✓
int age = 30;           // ✓
```

✅ **Curly brackets `{ }` grupperer kode**
```java
void main() {
    // Kode her
}
```

✅ **main() er hvor programmet starter**
```java
void main() {
    System.out.println("Starter her!");
}
```

✅ **Variabler uden for main() kan bruges inde i main()**
```java
String message = "hello world";

void main() {
    System.out.println(message);    // Virker!
}
```

---

## Almindelige Fejl

### Fejl 1: Manglende semikolon
```java
String name = "Anna"     // ✗ ERROR
System.out.println(name) // ✗ ERROR
```

**Fix:**
```java
String name = "Anna";    // ✓
System.out.println(name);    // ✓
```

### Fejl 2: Manglende curly bracket
```java
void main() {
    System.out.println("Hello");
// ✗ Mangler }
```

**Fix:**
```java
void main() {
    System.out.println("Hello");
}    // ✓
```

### Fejl 3: Kode uden for main()
```java
String name = "Bob";
System.out.println(name);    // ✗ Denne linje er UDEN FOR main!

void main() {
    // Tom
}
```

**Fix:**
```java
String name = "Bob";

void main() {
    System.out.println(name);    // ✓ Nu er den INDE I main
}
```

---

## Prøv Selv

**Opgave:** Lav dit første program i IntelliJ:

1. Opret fil: `MyFirstProgram.java`
2. Skriv:
```java
String myName = "DIT NAVN HER";
int myAge = 20;

void main() {
    System.out.println(myName);
    System.out.println(myAge);
}
```
3. Tryk "Run"
4. Se output i konsollen!

---


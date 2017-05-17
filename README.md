# Formation Exercices
Exercices simples pour pratiquer les bases du langage Java.

## Table des matières :
- [Exercice 1](#exercice-1)
- [Exercice 2](#exercice-2)
- [Exercice 3](#exercice-3)
- [Exercice 4](#exercice-4)
- [Exercice 5](#exercice-5)
- [Exercice 6](#exercice-6)
- [Exercice 7](#exercice-7)
- [Exercice 8](#exercice-8)
- [Exercice 9](#exercice-9)
- [Exercice 10](#exercice-10)
- [Exercice 11](#exercice-11)
- [Exercice 12](#exercice-12)


## Exercice 1

Ecrivez un programme Java qui répond aux contraintes suivantes :
- Le programme doit demander à l'utilisateur de saisir un nombre
- Tant que l'utilisateur ne saisi pas 'exit' :
  - Analyser la saisie et vérifier qu'elle correspond à un nombre entier
    - Si c'est ok, afficher des informations sur le nombre saisi
      - Afficher si le nombre est positif, négatif ou zéro
      - Afficher si le nombre est pair ou impair (zéro est pair)
    - Si ce n'est pas le cas, afficher un message d'erreur
- Si 'exit' a été saisi, quitter le programme

## Exercice 2

Une petite entreprise de produits chimiques souhaite informatiser la gestion du calcul du salaires de ses employés. Cet exercice a pour but la réflexion et la pratique autour des problématiques de programmation orientées objets. En effet afin permettre à cette entreprise d'informatiser le calcul des salaires, il faut tout d'abord construire une hierarchie d'objets permettant de représenter ses salariés.

Lors de votre entretien avec le directeur, vous notez les contraintes suivantes :
- Tout employé est caractérisé par son nom, son prénom, son âge, et sa date d'entrée en service
- Tout employé a un salaire mensuel calculé selon le poste qu'il occupe dans l'entreprise
- Les types d'employés
  - Vendeur : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 400€
  - Représentant : Son salaire est calculé avec 20% du chiffre d'affaire qu'il a effectué dans le mois, plus une prime fixe de 800€
  - Producteur : Son salaire est calculé avec le nombre d'unités produites dans le mois multiplié par un taux fixe de 5€
  - Manutentionnaire : Son salaire est calculé avec le nombre d'heures effectuées dans le mois multiplié par un taux fixe de 65€
- Certains employés des secteurs production et manutention sont appelés à manipuler des produits dangereux
  - Une prime fixe de 200€ est ajoutée à leur salaire mensuel
- Le programme doit permettre de gérer une collection d'employés à partir de laquelle on peut afficher de détails des salaires de chaque employés, mais aussi le salaire moyen.

Le code suivant doit permettre de tester le programme :
```java
public class Main {
  public static void main(final String[] args) {
    final Staff myEmployees = new Staff();
    myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
    myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
    myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
    myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
    myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
    myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));
    
    myEmployees.displaySalaries();
    myEmployees.displayAverageSalary();
  }
}
```

## Exercice 3

Regardez les classes du package fr.formation.exo3 et essayez de prédire l'affichage que doit donner l'exécution de la méthode `main()` dans la classe `Alphabet`. Une attention particulière devra être portée sur le polymorphisme utilisé dans la hierarchie des classes `A`, `B` et `C`, qui démontre une situation de "shadowing" entre `B.b` et `C.b`.

## Exercice 4

Dans la classe `ErreurMethodes` ci-dessous, les méthodes `methode1` à `methode8` comportent chacune __une erreur__ de syntaxe. Trouvez ces erreurs en utilisant vos connaissances de la syntaxe du langage Java.

Si vous sollicitez l'aide du compilateur pour trouver les erreurs, sachez qu'il aura de la peine avec ce type de programme où il y a beaucoup d'erreurs de structure. Il peut vous montrer la ligne approximative où se trouve une erreur, mais la solution proposée n'est pas toujours correcte, la liste des erreurs n'est pas toujours complète et les erreurs ne sont pas présentées dans le bon ordre. Dans ce genre de situation, utilisez surtout votre bon sens et vos propres connaissances de la syntaxe de Java.

```java
class ErreursMethodes {

  public static void main (String[] args) {
    int i1 = methode1();
    int i2 = methode2();
    int i3 = methode3();
    int i4 = methode4();
    methode5();
    methode6();
    methode7();
    methode8();
  }

  static int methode1 {
    int a = 0;
    System.out.println("Méthode 1");
    return a;
  }

  static int methode2 () {
    int a = 0;
    i1 = 10;
    System.out.println("Méthode 2");
    return a;
  }

  static int methode3 () {
    int a = 0;
    System.out.println("Méthode 3");
  }

  static int methode4 () {
    String a = "0";
    System.out.println("Méthode 4");
    return a;
  }

  static void methode5 () {
    double a = 0;
    System.out.println("Méthode 5");
    return a;
  }

  static methode6 () {
    double a = 0;
    System.out.println("Méthode 6");
    return a;
  }

  static void methode7 () {
    int a = 0;
    double b = 5.5;
    methodeSansErreur(a);
    System.out.println("Méthode 7");
  }

  static void methode8 () {
    int a = 0;
    String b = "5.5";
    methodeSansErreur(a, b);
    System.out.println("Méthode 8");
  }

  static void methodeSansErreur (int a, double b) {
    // Cette méthode ne fait rien du tout
  }
}
```

## Exercice 5

Enoncé à venir...

## Exercice 6

Ecrire un programme java capable de demander la saisie de la longueur et la largeur d'un rectangle, puis d'afficher les valeurs de périmètre et d'air de ce rectangle.

Exemple du résultat de l'exécution :
```
Entrez la largeur: ...
Entrez la hauteur: ...
Surface ('s/S') ou perimètre ('p/P') ?: ...
La surface est ...
```
Les méthodes du programme devront être bien séparées, de manière à respecter l'exemple suivant :
```java
public static void main(String args[]) {
  double width = readInput("Largeur ?");
  double length = readInput("Hauteur ?");
  
  boolean inputsOk = testInputs(width, length);
  if (inputsOk) {
    calculate(width, length);
  } else {
    displayError();
  }
}
```

## Exercice 7

Implémentez un algorithme vous permettant de permuter les valeurs de deux variables.

Exemple d'exécution:
```
Entrez x: 1
Entrez y: 2
Avant permutation:
x: 1
y: 2
Après permutation:
x: 2
y: 1
```

## Exercice 8

Expliquez pourquoi les résultats obtenus par les classes `Moyenne1` et `Moyenne2` sont différents.

```java
class Moyenne1 {
  public static void main(String[] args) {
    double noteProgrammation = 6.0;
    double noteAlgebre = 5.0;
    System.out.println("Ma moyenne est " + (noteProgrammation++ + noteAlgebre) / 2.0 );
  }
}

class Moyenne2 {
  public static void main(String[] args) {
    double noteProgrammation = 6.0;
    double noteAlgebre = 5.0;
    System.out.println("Ma moyenne est " + (++noteProgrammation + noteAlgebre) / 2.0 );
  }
}
```
## Exercice 9

Écrivez un petit programme Java, Degre3.java, vous permettant d&#39;évaluer un polynôme du3ème degré de la forme:
`((a+b)/2)x^3 + (a+b)^2x^2 + a + b + c`

Exemple d'exécution:
```
Entrez a (int) : 1
Entrez b (int) : 2
Entrez c (int) : 3
Entrez x (double) : 3.5
La valeur du polynôme est : 180.5625
```
Utilisez `Math.pow(a, b)` pour calculer des puissances.

## Exercice 10

Expliquez pourquoi le résultat à l'affichage du programme ci-dessous est toujours "China blue" et non "China blue Express".

```java
class ConcatIncorrecte {
  public static void main(String[] args) {
    String s = "China Blue";
    System.out.println(s);
    concat(s, " Express");
    System.out.println(s);
  }

  public static void concat(String s, String s2) {
    s +=s2;
  }
}
```

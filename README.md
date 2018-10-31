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

### Partie 1
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

Résultat attendu :
```
Liste des salaires des employés :
	L'employé Pierre Business a un salaire de 6400 €
	L'employé Léon Ventout a un salaire de 4800 €
	L'employé Yves Ahalouest a un salaire de 5000 €
	L'employé Jeanne Stoktout a un salaire de 2925 €
	L'employé Jean Flippe a un salaire de 5200 €
	L'employé Al Abordage a un salaire de 3125 €

Valeur du salaire moyen : 4575 €
```

### Partie 2
Lorsque vous montrez au directeur le résultat de votre programme permettant d'afficher les salaires, il est content mais il y a un problème... Il a oublié de vous parler du fait que la societé travaille avec des indépendants, et leur factures doivent entrer en compte dans le calcul des salaires.

Vous récupérez les informations suivantes sur les indépendants :
- Ils sont caractérisés par un nom et un numéro SIREN, ainsi qu'une liste de facture pour le mois courant
- L'équivalent de leur salaire se calcul avec la somme des factures qui lui sont associées
- Une facture est caractérisée par une date, une somme en euros, et un libellé représentant la nature de la prestation
- Les factures dont le libellé commence par "Frais de déplacement - " ne doivent pas être prises en compte dans le calcul du salaire d'un indépendant

A la fin de votre entretien, vous récupérez une information supplémentaire de dernière minute. Le directeur aimerait avoir l'affichage du nom complet de l'employé lors de l'affichage de son salaire, et si il est indépendant, cela doit être facilement reconnaissable.

Exemple:
- Employé salarié -> getNom() -> "Employé Jean Rigol : xxxx €"
- Employé indépendant -> getNom() -> "Indépendant Jean Peplu : xxxx €"

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
`((a+b)/2)x^3 + (a+b)^2 * x^2 + a + b + c`

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

## Exercice 11

Votre grand-mère possède une superbe collection d'ustensiles anciens ayant beaucoup de valeur, et elle aimerait pouvoir les référencer et connaître leurs valeurs. Pour ce faire, vous lui proposez d'écrire un programme Java.

Comme votre grand-mère ne veut pas mettre les deux pieds dans le plat et écrire du code Java, vous lui demandez de lister ses ustensile dans le tableau suivant : [Liste des ustensiles de grand-mère](https://docs.google.com/spreadsheets/d/1ld0-jUgQ4Jc05Ax4vGoskXoKPumqUOBdSlePqdf8nDM/edit#gid=0). Votre programme Java devra donc lire ce fichier pour acquérir les données nécessaire à l'exécution du programme.

### Partie 1 : Définir les objets représentant les ustensiles

Pour commencer, il faut réfléchir à la hierarchie d'objets permettant de représenter les différents ustensiles. Vous avez les informations suivantes sur ceux-ci :
- Tout ustensile possède une année de fabrication
- La valeur de l'ustensile se calcul comme suit :
  - S'il a été fabriqué il y a moins de 50 ans, il ne vaut rien (0)
  - S'il a été fabriqué il y a plus de 50 ans, sa valeur est égale à `anneeCourante - anneeFabrication - 50`
  - Les assiettes carrés sont particulière car plus rare, leur valeur est de 5 fois sa valeur si elle était ronde
- Une assiette est un type d'ustensile et peut être de forme carré ou ronde
  - Une assiette ronde a un rayon qui permet de calculer sa surface
  - Une assiette carré a une cote qui permet de calculer sa surface
- Une cuillère a une longueur

### Partie 2 : Lire un fichier de type tableur

Le document comportant les données est un "spreadsheet" en ligne qui est lisible par une [API Java spéciale](https://developers.google.com/sheets/api/quickstart/java), mais nous allons préférer pratiquer la lecture d'un fichier CSV (Comma Separated Values) qui ne nécessite pas de librairie supplémentaire.

Une fois sur le document google de la liste des ustensiles, vous pouvez faire un export CSV depuis le menu Fichier->Télécharger au format->Valeurs séparées par des virgules. Une fois le fichier CSV ajouté à votre projet, il faut maintenant écrire le code Java permettant de le lire et d'analyser ("parsing") les données.

Aide :
- Pour lire un fichier, on a besoin d'un objet Java qui représente un flux d'entrée (`java.io.InputStream`)
  - On distingue deux moyens principaux :
    - Par le système `new java.io.File(path)` puis `new java.io.FileInputStream(path)`
    - Par le classpath `java.lang.ClassLoader.getResourceAsStream(path)`. A vous de choisir la méthode la plus adaptée dans ce projet. N'oubliez pas que le fichier est sensé évoluer au fur et à mesure que votre grand-mère les référence.
  - Il faut ensuite utiliser un objet qui hérite de la classe abstraite `java.io.Reader` afin de lire dans le flux
    - Selon le type de flux que vous avez récupéré, il faut utiliser l'objet reader adapté
  - On encapsule ensuite le reader dans une classe un peu plus avancée permettant de lire des lignes complètes dans le flux : `java.io.BufferedReader`
- Il faut ensuite transformer ces données récupérées pour chaque ligne sous forme de chaînes de caractères (`java.util.List<String>`)
  - Chaque ligne récupérée dans le fichier correspond à un objet d'ustensile
  - Chaque colonne de la ligne est séparée par le caractère ','. Il faut donc utiliser la méthode `java.lang.String.split()`
  - La colonne type permet de déterminer quelle classe utiliser
  
 ### Partie 3 : Afficher les données demandées
 
 Votre grand-mère aimerait avoir les informations suivantes lorsqu'elle lance le programme :
 - Le nombre total de cuillères
 - La surface totale de toutes les assiettes
   - Pour une assiette ronde : `Math.PI * rayon * rayon`
   - Pour une assiette carré : `cote * cote`
 - La valeur totale de tous les ustensiles
 
 Exemple de résultat d'exécution :
 ```
Il y a 2 cuillères.
Surface totale des assiettes : 344.63961941597415
Valeur totale de la collection : 395.0
```

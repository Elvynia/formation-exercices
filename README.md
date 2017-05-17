# Formation Exercices
Exercices simples pour pratiquer les bases du langage Java.

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

Regardez les classes du package fr.formation.exo3 et essayez de prédire l'affichage que doit donner l'exécution de la méthode ```main()``` dans la classe ```Alphabet```. Une attention particulière devra être portée sur le polymorphisme utilisé dans la hierarchie des classes ```A```, ```B``` et ```C```, qui démontre une situation de "shadowing" entre ```B.b``` et ```C.b```.

## Exercice 4

Dans la classe ```ErreurMethodes``` ci-dessous, les méthodes ```methode1``` à ```methode8``` comportent chacune __une erreur__ de syntaxe. Trouvez ces erreurs en utilisant vos connaissances de la syntaxe du langage Java.

Si vous sollicitez l&#39;aide du compilateur pour trouver les erreurs, sachez qu&#39;il aura de la peine avec ce type de programme où il y a beaucoup d&#39;erreurs de structure. Il peut vous montrer la ligne approximative où se trouve une erreur, mais la solution proposée n&#39;est pas toujours correcte, la liste des erreurs n&#39;est pas toujours complète et les erreurs ne sont pas présentées dans le bon ordre. Dans ce genre de situation, utilisez surtout votre bon sens et vos propres connaissances de la syntaxe de Java.

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
    System.out.println(&quot;Méthode 1&quot;);
    return a;
  }

  static int methode2 () {
    int a = 0;
    i1 = 10;
    System.out.println(&quot;Méthode 2&quot;);
    return a;
  }

  static int methode3 () {
    int a = 0;
    System.out.println(&quot;Méthode 3&quot;);
  }

  static int methode4 () {
    String a = &quot;0&quot;;
    System.out.println(&quot;Méthode 4&quot;);
    return a;
  }

  static void methode5 () {
    double a = 0;
    System.out.println(&quot;Méthode 5&quot;);
    return a;
  }

  static methode6 () {
    double a = 0;
    System.out.println(&quot;Méthode 6&quot;);
    return a;
  }

  static void methode7 () {
    int a = 0;
    double b = 5.5;
    methodeSansErreur(a);
    System.out.println(&quot;Méthode 7&quot;);
  }

  static void methode8 () {
    int a = 0;
    String b = &quot;5.5&quot;;
    methodeSansErreur(a, b);
    System.out.println(&quot;Méthode 8&quot;);
  }

  static void methodeSansErreur (int a, double b) {
    // Cette méthode ne fait rien du tout
  }
}
```

# Formation Exercices
Exercices simples pour pratiquer les bases du langage Java.

## Table des matières :
- [Exercice 1](#exercice-1)
- [Exercice 2](#exercice-2)

## Exercice 1

Ecrivez un programme Typescript qui répond aux contraintes suivantes :
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
```typescript
import { Staff } from './staff';
import { Salesman } from './salesman';
import { Representant } from './representant';
import { Producer, ProducerWithRisk } from './producer';
import { Wharehouseman, WharehousemanWithRisk } from './wharehouseman';

let myEmployees: Staff = new Staff();
myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));

myEmployees.displaySalaries();
myEmployees.displayAverageSalary();
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

## Exercice 3

Votre grand-mère possède une superbe collection d'ustensiles anciens ayant beaucoup de valeur, et elle aimerait pouvoir les référencer et connaître leurs valeurs. Pour ce faire, vous lui proposez d'écrire un programme TypeScript.

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

 ### Partie 2 : Afficher les données demandées
 
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

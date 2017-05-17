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

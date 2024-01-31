Objectifs
=========

L'objectif de ce projet est de vous faire construire un interpréteur
et un pretty-printer pour un language simple. Ce projet permet ainsi
de mettre en pratique bon nombre de concepts abordés lors de la partie
front-end du compilateur.

Ainsi, seront abordés:
  - La définition d'un parseur et d'un lexeur au travers d'antlr
  - La mise en place d'un AST pour représenter les différents éléments du langage
  - La mise en place d'un pretty-printer permettant de s'assurer que les étapes de parsing
  - La mise en place d'un interpreter permettant d'interpréter le code fourni en entrée
  - La mise en place de test et le packaging de l'application

Afin de vous aider dans le démarrage du projet, nous vous donnons un
exercie simple utilisant antlr permettant de faire une calculatrice.

N.B: La mise en place de l'interpréteur et du pretty-printer peuvent
se faire au moyen d'un visiteur. Néanmoins, nous préférons un projet
fonctionnel plutôt qu'un projet buttant sur l'implémentation dudit
visiteur.

Règles d'évaluation
===================

La notation se fait selon la grille suivante, lue de façon flexible.  Par
"flexible" comprendre que dans le cas d'un investissement manifeste mais avec
des défauts, nous serons cléments ; en revanche, s'attendre à une notation
sévère sur un rendu mal fini.

## tarball correcte (1pt)
Une tarball tigger-FOO.tar.bz2 (ou tigger-FOO.zip)  où FOO est le nom du chef de groupe.  Quand on
ouvre cette tarball, elle fabrique un répertoire tigger-FOO dans lequel sont
tous les fichiers.  Je ne veux pas de fichiers qui traîntent à côté de la
tarball, ni de répertoire de nom différent.

Cette tarball doit contenir un fichier README.txt qui détaille les membres du
groupe, puis explique le rendu (qu'est-ce qui est fait, quelles sont les
difficultés rencontrées, les originalités, éventuellement les problèmes
bloquants etc.)

## make marche (1pt)
Je dois pouvoir compiler le projet sur une machine linux sans difficulté, en
ligne de commande.

## make check marche (1pt)
Il doit y avoir une batterie de tests non ridicule.  Il doit y avoir des tests
positifs (le programme donné à votre tigger est correct et se comporte comme
attendu), mais aussi des tests négatifs (vérification de détection d'erreurs).

## les entiers avec les bonnes priorités (2pt)
Toute l'arithmétique (les binaires +, -, *, /, et les unaires +, -),
et la comparaisons (=, <>, <=, <, >=, >).  Les parenthèses aussi bien sûr.

## une primitive `print_int` (1pt)
Introduire le support d'une fonction prédéfinie "print_int", qui prend un unique
argument, et l'affiche sur stdout.

    print_int(1+2*3)
    => 7

A se stade, l'exécution d'un programme consiste en l'affichage du source
(pretty_print), puis l'affichage du résultat (eval).

Ne cherchez pas à faire une calculatrice interactive, faites un
interpréteur par lot : lire un fichier en entier, le pretty-printer,
puis l'évaluer.

## Booleens: (1 pt)
Ajout des constantes trues false et des opérateurs booleens | et &.
Ajout d'une primitive print_bool

## support de if-then-else (2pt)
Des expressions telles que `if 1 then 2 else 3`, `if if 0 then 1 else 2 then 1+2
else 2+3` doivent fonctionner.  Noter que dans ce dernier cas, c'est bien le
`2+3` qui est "sous" le `else` : les opérations sont plus prioritaires que les
structures de contrôle.

## support des sequences (1pt)

on veut avoir une sequence d'expressions qui contient une liste
d'expressions parenthésées, et séparées par des ';' avec la syntaxe:
(e1;
 e2;
 e3)

La valeur de retour d'une séquence est celle de sa dernière expression
(ici e3).


## support des chaînes de caractères (3pt)
Ajout des primitive print_string, concat, string_of_int
La concaténation (`"foo" + "bar"` donne "foobar").

----------------------------------------------------------------------

## support des variables et des scopes (1pt pretty-print, 4pt bind)
Attention, au dela de ce point, ne plus chercher à ressembler à une
calculatrice.

La syntaxe est la suivante :

    let foo = 1 in
    let bar = 1 + foo in
    in foo * bar

## Affectation (1pt)

La structure `let i = 1 in` n'est pas une affectation, c'est une
déclaration/définition de la variable `i`.  Si l'on s'arrêtait ici, nous aurions
les variables "pures" des langages fonctionnels, i.e., des variables constantes,
ou des abréviations pour des expressions complexes en quelque sorte.

Notre langage est impératif, on veut désormais pouvoir changer la valeur d'une
variable.  Ajouter le support de `i = 42`, `i = i + 1`, etc.

## support de while (2pt)

Dans l'exemple suivant, outre le pretty-printing (toujours obligatoire),
l'évaluation conduira à l'affichage de 1, 2, 3, et 4.

    let i = 1 in
      while i < 5 do
        (print(i), i = i + 1)
    end

## support de for (1pt)

L'exemple suivante affiche `2, 3, 1`.

    let i = 1 in
      for i = 2 to 3 do print(i),
      print(i)
    end

Celui-ci est correct, mais n'affiche rien

    for i = 2 to 1 do print(i)

L'exemple suivant est incorrect.

    (for i = 1 to 2 do i, print(i))

## and beyond
Votre imagination est la seule limite, les extensions
que vous proposerez, et la façon dont elles sont implémentées pourront
vous apporter des points en plus.

----------------------------------------------------------------------
## Clarté, Lisibilité du code:

Il est possible/probable d'avoir des malus liés à la propreté du code en cas de:

- ligne de code trop longue (> 80 char)
- méthode trop grande
- classe trop grande
- code inutile
- code inefficace
- code trop fragile/succeptible d'échouer au moindre changement
- code compliqué et mal commenté
- ...

----------------------------------------------------------------------
## Par ou commencer?

- Assurez vous que le Makefile fonctionne
- Lisez le fichier src/Tigger.java
- Lisez le fichier Samples Samples/u01-1.tig
- executez la commande ./tig.sh Samples/u01-1.tig
- Explorez le code fourni. Identifiez le contenu des trois packages: ast, frontend et grammar.
- Remplissez les fixme des classes src/ast/ASTbinaryOperation et src/frontend/TigListener
- Executez la commande ./tig.sh Samples/u09-1.tig
- A vous de jouer
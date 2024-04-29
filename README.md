# Introduction

Ceci est un projet de programmation d'interpréteur de code, écrit en **Java** à l'aide de **ANTLR**.
Ce langage implémente les fonctionnalités de base que l'on peut trouver dans la plupart des autres langages de programmation.
Ce langage, au typage faible, a comme objectif de permettre d'écrire du code très concis, avec une flexibilité des types et des opérations. <br>


Projet par :
- Oussama SOUDASSI
- Clément HAMON
- Anthinéa CAMMAN

---

Types
=========


### Entiers (int)
Les entiers se forment via une simple suite de chiffres.
Ex : `5` ; `19837982` ; `004`

Opérations entre entiers :
- Addition `a + b` -> int
- Soustraction `a - b` -> int
- Multiplication `a * b` -> int
- Division `a / b` -> int
- Modulo `a % b` -> int
- Puissance `a ** b` -> int
- Égalité `a == b` -> bool
- Inégalité `a != b` -> bool
- Strict supérieur `a > b` -> bool
- Supérieur ou égal `a >= b` -> bool
- Strict inférieur `a < b` -> bool
- Inférieur ou égal `a <= b` -> bool

Les entiers peuvent également être mis au négatif : `!a` ou explicitement indiqués au positif : `+a`

### Chaînes de caractères (str)
Les chaînes de caractères (String) sont formées à partir de guillemets doubles uniquement.
Ex : `"AZERTY"` ; `"Hello World`

Opérations entre une chaîne de caractère et **n'importe quel type**, l'autre opérande sera converti en string :
- Concaténation `a + b` -> str
- Substitution `a - b` -> str

La substitution ne peut se produire que lorsque le contenu de `b` est égal à la fin du contenu de `a`, sinon le résultat est la première opérande sans modification.
Ex : `"Hello_50" - 50` retourne `"Hello_"`
Cette opération atypique pourrait simplifier certaines instructions dans le code.

- Égalité `a == b` -> bool
- Inégalité `a != b` -> bool

Ce choix de faire que ces opérations puissent se faire avec n'importe quel types s'inspire des facilités d'utilisations de certains langages comme le Python.

Opération uniquement entre un string et entier :
- Duplication `a * b` -> str

Ex : `"Bla" * 5` donne `"BlaBlaBlaBlaBla"`

### Booléens (bool)
Les booléens peuvent s'écrire `true` et `false` mais ils ont également une forme simplifiée `T` et `F`.

Les booléens peuvent être inversés en étant précédés par le symbole `!`.
Ex : `!(4 < 5)` donne `false`.

Opérations entre booléens :
- Logique OU `a + b` -> bool
- Logique ET `a * b` -> bool
- Égalité `a == b` -> bool
- Inégalité `a != b` -> bool

La plupart des autres langages utilisent `|` et `&` pour les opérations logiques, bien que cela aurait été facile d'ajouter ces opérantes, les symboles `+` et `*` ont été choisis puisque la notation avec ces symboles est utilisée dans certains secteurs tels que l'électronique pour représenter des circuits logiques.
Cela libère ces symboles pour théoriquement d'autres utilités dans le langage.

Opération uniquement entre un booléen et entier :
- Mise à nul `a * b` -> int

L'annulation retourne 0 si le bool est à false, et retourne l'entier si le bool est à true.
Cette syntaxe est utile dans les codes ou il y a besoin d'ajouter ou non une valeur à une opération en fonction d'une condition spécifique, elle peut remplacer des blocs de condition.
Exemple pour du code qui empêche une variable de prendre une valeur négative : `b = a * (a < 0)`
Cela permet une syntaxe très concise pour un cas assez fréquent dans certains codes.

Opération uniquement entre un booléen et string :
- Effacement `a * b` -> str

Dans le cas d'un string, cela retourne soit le string tel qu'il est si true, et un string vide si false.

Syntaxes spéciales
=========

## Expressions groupées et cast
Des parenthèses peuvent être utilisées dans les expressions pour former un groupe et indiquer un ordre de priorité des opérations.
Ex : `2 * (5  + 10)`

Les groupes peuvent également servir à faire des cast de variables d'un type vers un autre, indiquant le type en préfixe.
Ex : `int("10") + 1` donne bien 11.
Les types sont : `int`, `str` et `bool`.

- Cast un entier vers bool donnera true si l'entier est supérieur à 0, false sinon.
- Cast un booléen en entier donnera 0 ou 1.
- Cast un string vers bool ou int interprétera la valeur littérale.

Un échec aux cast lance un `ValueException`.

## Print
Ce langage utilise une syntaxe atypique pour faire un affichage, n'importe quelle expression précédée du symbole `$` sera affiché, avec sa forme littérale suivie de son résultat.
Ex : `$(1 + 1)` affiche `(1 + 1) => 2`

Ce print renvoie également le résultat qu'il vient d'afficher, permettant d'être insérer lui-même dans des expressions.
Le choix de la forme de ce print est pour en faire un puissant outil de debug, en effet il suffit d'insérer un seul caractère de pouvoir afficher ce que l'on veut de n'importe quelle instruction du code, et savoir où cet affichage s'est produit, sans avoir à insérer de nouvelles lignes.

## Conditions
Les conditions if-then-else sont implémentées de manière assez classique. La partie `else` étant optionel.
Ex : `if a > 10 then $"10+" else $a`
Les conditions retournent soit null, soit la dernière expression exécutée.
Les conditions prennent un bool ou un entier. Dans le cas d'un entier, l'entier est interprété à true s'il est supérieur à 0.

## Boucle while
Les boucles while sont également implémentées de manière assez classique.
Ex :
```ps
while a do {
    $a;
    a = a / 2;
}
```
Les règles spécifiques sont similaires au `if`.

## Boucle for
Les boucles for sont du pur sucre syntaxique sur les boucles while.
La variable utilisée pour l'incrémentation n'existe que au scope du contenu de la boucle.
Le mot-clé `to` indique à la variable d'incrémenter jusqu'à cette valeur **inclue**.
Ex :
```ps
for i = 30 to 35 do {
    $i
}
```
Pour afficher les nombres de 30 à 35 inclus.
La boucle for fonctionne également sans avoir à explicitement écrire l'affectation, la variable sera alors assignée à 0 par défaut.
Ex :
```ps
for i to 20 do {
    $i
}
```

Séquences et variables
=========

Les séquences d'expressions sont toujours encadrées par des accolades `{` `}` (même le sommet du programme) et les expressions sont séparées par des `;`.
Les séquences retournent la dernière variable affectée.

Les affectations se font via l'opérateur `=` de manière similaire au Python et retournent elle-même la valeur affectée.

Chaque séquence définit son propre scope, à la fin d'un scope les variables déclarées à l'intérieur de celles-ci uniquement sont détruites.

Ex :
```ps
{
    a = 4;
    b = 5;
    {
        {
            c = {
                d = e = f = 10;
                $e;
                a = a ** 2;
                f
            }
            $c;
        }
    }
    $a;
}
```

En cas de tentative de récupérer une variable qui n'existe pas, le programme lance une erreur `VariableException`.

Fonctions
=========
Les fonctions ont la syntaxe suivantes `fn ID(arg0,...,argn) expr`.
Avant d'expliquer en détail leur fonctionnement, penchons nous sur un example complet
qui reprend en plus quelques-unes des fonctionnalités déjà discutées.
```ps
fn add(a,b) {
    a + b
}

fn fibo(a) {
    x = 0;
    y = 1;
    ret = 0
    if (a < 1) then {
        ret = 0;
    }
    else {
        if (a == 1) then {
            ret = 1
        }
        else {
            for j = 0 to a-2 do {
                temp = add(x,y);
                x    = y;
                y    = temp;
            }
            y
        }
    }
}

{
    a = 12;
    
    for i = 0 to a do {
        $fibo(i);
    }
}

```
L'exécution de ce code affiche sur la console les `a` premier nombres de la suite de fibonacci.<br>
Une fonction à au moins zero arguments, et au plus autant que tolérés par la mémoire.
Les fonctions sont enregistrées **en début du code** c'est à dire qu'une fois une expression 
est appelé on ne peut enregistrer une autre fonction. <br>
Une fonction n'est enregistrée que lorsque l'entièreté de son code est 
lu *(ie identifiant + arguments + corps)*, donc essayer d'appeler la fonction à l'intérieur de son corps même (recursivité) lève une exception `FunctionCallException`, même exception levée si une fonction
est appelée sans qu'elle ne soit enregistrée.<br>
`fibo(i)` correspond à l'appel de la fonction `fibo` avec `i` comme paramètre. La passage d'un nombre invalide de paramètres lève la même exception que précédemment, avec un message coorrespondant.

Problèmes rencontrés
=========

Le projet s'est globalement déroulé sans trop de problème, à l'exception de l'implémentation des variables ou l'implémentation initiale était une HashMap vers les noeuds AST plutôt que leur contenu ce qui a énormément complexifié le système d'évaluation.
Finalement, un système de HashMap de mémoire de type `Object` a été beaucoup plus simple.

Il y a eu une mauvaise estimation de la charge de travail vers la fin, ce qui a mené a un retard.
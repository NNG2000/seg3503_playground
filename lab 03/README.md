
Pour ce laboratoire, nous allons tester en boîte blanche quelques applications pour atteindre différents niveaux de couverture (ex : (couverture des instructions, couverture des branches, couverture des conditions, et couverture des conditions des branches).

## Partie 1 - Computation System


### Instructions pour exécuter le programme et le tester

Afin d'exécuter le site d'enregistrement et de le tester sur UBUNTU 18.04 ou dans la plupart des shells bash, il suffit de télécharger/cloner le dépôt et d'ouvrir l'invite de commande .
CD dans le dossier "computation" à l'intérieur du référentiel. 

1. Ensuite, vous pouvez taper les commandes suivantes pour exécuter le code de test et l'analyse de couverture :

``bash
./bin/jacoco
```
2. Ouvrez le fichier index.html situé à computation/report/index.html dans n'importe quel navigateur pour visualiser l'analyse de couverture.

### Modifications des tests et du code pour obtenir une couverture complète

Après avoir écrit quelques tests pour les fonctions de soustraction, de division et d'addition, ainsi que modifié le code qui était inaccessible dans catchException, nous avons pu obtenir une couverture complète de l'application.

### RESULTATS

![image](assets/computation_test_coverage.jpg)


### Partie 2 - Date

Pour la deuxième partie du laboratoire, on nous demande d'écrire quelques tests afin d'obtenir une meilleure couverture de l'application et idéalement 100% des branches/conditions.


### Instructions pour exécuter le programme et les tests

Afin d'exécuter le site d'enregistrement et de le tester sur UBUNTU 18.04 ou dans la plupart des shells bash, il suffit de télécharger/cloner le dépôt et d'ouvrir l'invite de commande .
CD dans le dossier "date" à l'intérieur du référentiel. 

1. Ensuite, vous pouvez taper les commandes suivantes pour exécuter le code de test et l'analyse de couverture :

``bash
./bin/jacoco
```
2. Ouvrez le fichier index.html situé à date/report/index.html dans n'importe quel navigateur pour voir l'analyse de couverture.


### Ajout de tests.

Après avoir modifié certains des tests et essayé d'atteindre autant de branches que possible, je n'ai pu obtenir qu'une couverture de 98%. Il n'y avait qu'une seule branche/condition manquante quelque part dans la méthode setMonth comme nous pouvons le voir ci-dessous :

![image](assets/date_coverage.jpg)
![image](assets/EndOfMonth_original_coverage.jpg)

J'ai donc essayé de décomposer les branches pour voir si je pouvais trouver où était l'erreur, mais je n'ai toujours pas réussi à trouver la branche manquante :

Décomposer en branches

```java
if (day>31){//Branch/Condition #1
    if (day ==30){ //Branch/Condition #2
        if (isThirtyDayMonth()){//Branch/Condition #3
            if (month == 2){   //Branch/Condition #4 
                if ((day==29 &&leap) || (day ==28 && !leap)){    // 8 branches
                    if (day==29){ //Branch/Condition #5 
                        if (leap){   //Branch/Condition #6
                        }else{ //!leap
                            //Branch/Condition #7
                    }else{ //day  != 29
                        //Branch/Condition #8
                    } 

                    if day==28 //Branch/Condition #9
                        if !leap{   //Branch/Condition #10

                        }else{
                            //Branch/Condition #11
                        }
                    }else{
                        //Branch/Condition #12
                    }        
                }else{
                     // Junction point
                }
            }else{ //month!= 2
                //Branch/Condition #13
            }
        }else{ //!isEndOfMonth()
            //Branch/Condition #14
        }
    }else{ //(day !=30)
        //Branch/Condition #15
    }
}else{//day <= 31
    //Branch #16
} 

```


## Est-il possible d'obtenir une couverture de 100% ?

Je crois qu'ici il n'a pas été possible d'obtenir une couverture à 100% des branches/conditions car il y a des branches équivalentes qui prennent probablement le dessus sur les autres branches et les rendent inaccessibles .

Nous devrons modifier le code de "Date.java"pour tenter de le simplifier.



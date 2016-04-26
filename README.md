#WriterInterceptor vs ContainerResponseFilter

La principale différence entre les intercepteurs et les filtres revient à leur scope d’action.

Les filtres que ce soit en lecture ou en écriture interviennent dans le même process que la réponse et/ou la lecture.

Alors que les intercepteurs intervienne après le rendu ou avant l’appel de la méthode de lecture.

L'utilisation d'un binding naming permet de selectionner plus finement l'impact du filtre ou de l'intercepteur.


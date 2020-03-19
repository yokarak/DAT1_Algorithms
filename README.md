# Algortimernes kompleksitet 
Datamatikerstudiet i Næstved, 2. semester, 2020

Der er ikke noget mere irriterende, end langsomme it-systemer. Derfor vil vi som programmører tilstræbe altid at optimere vores algoritmer således, at de performer optimalt.

Vi bruger BigO-notationen til at beskrive algoritmernes kompleksitet ift. eksekveringstid eller resurseforbrug. 

- O(1) algoritmer giver det hurtigste resultat (konstant kompleksitet)
- O(logN) algoritmer er meget hurtige, ekskekveringstid øges kun lidt hvis N øges (logaritmisk kompleksitet)
- O(N) algoritmer er hurtige, men tager længere tid jo større N er (linær kompleksitet) 
- O(N^2) jo større N er, jo langsommere er disse algoritmer   
- O(N!) don't go there

Jeres algoritmer skal have mindst muligt algoritmisk kompleksitet, hvis I vil lave gode, responsive systemer, men det er ikke altid muligt at undgå komplekse beregninger. Det er derfor det tager en hel nat eller flere dage at beregne vejrsystemer eller thermodynamik. 

# Om java-klassene i dette projekt
Vi skal måle, hvor lang tid det det tager at gennemføre forskellige algoritmer. Jeg har udviklet et par hjælpeklasser til det: 

1. En hjælpeklasse, som kan måle kodeeksekveringstid (MyTimer.start(), MyTimer.stop())
2. Mål tiden på en kompliceret algoritme (se i Kompliceret klasse)
3. Afprøv, om du kan presse din PC til det yderste, ved at tilføje kompleksitet.
3. Implementer 3 forskellige algoritmer (bogens kapitel 23 Sorting, eller fra din aflevering) og mål eksekveringstid

God arbejdslyst, András

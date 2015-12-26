# Tärningsspel i Android

I denna uppgift skall du bygga en androidapplikation för ett tärningsspel. Du väljer själv vilket spel som skall implementeras, hur användaren interagerar med det och hur det ska se ut. För inspiration kan man exempelvis titta på www.spelregler.org/50-tarningsspel men givetvis får man ta andra eller hitta på egna. Uppgiften finns i två versioner där den ena kräver lite mer än den andra (utökad och grund). Du väljer den som passar dina allmänna programmeringsförkunskaper bäst men beakta att de skiljer sig åt i bedömning. Dvs. möjlighet att nå kunskapskrav. Uppgiften baseras mycket på att implementera något eget med hjälp av [att följa en guide och allmänna kodexempel](https://developer.android.com/training/basics/firstapp/index.html). Dra nytta av slides, tidigare övningsuppgifter, utdelat material och andra resurser på nätet.

##Grundkrav
* Kod [redovisas kontinuerligt på Github](https://www.londonappdeveloper.com/how-to-use-git-hub-with-android-studio/) genom att göra en fork av repot android-dice-game som finns i vår organisation.
* Applikationen skall stödja API Level 16 och uppåt.
* Källkoden skall vara väl kommenterad enligt [javadoc](https://en.wikipedia.org/wiki/Javadoc).
* Koden skall vara indelad i klasser av lämplig storlek och ansvar.
* En enklare "How to play" skall finnas för den som inte kan spelets regler.
* När man klarar spelet eller vinner så skall användaren informeras om detta.
* Applikationen skall vara på engelska.
* En tillhörande skriftlig rapport lämnas in via lärplattformen och skall innehålla
 * En kort beskrivning av spelets regler.
 * Några bilder på spelets användargränssnitt
 * Ett UML-klassdiagram med en tillhörande text som kort förklarar programmets struktur.
 * En reflektion kring vad som var svårt med uppgiften samt vad som skulle kunna förbättrats med applikationen.

## Utökade krav
* Samtliga krav angivna i grundkraven
* Applikationen skall även stödja svenska.
* Applikationen skall stödja olika skärmstorlekar.
* Applikationen skall hantera rotation av enheten utan att tappa information.
* Spelet skall vara av sådan karaktär att någon form av highscore kan räknas (tid? poäng? antal slag?) och denna skall sparas i en SQLite databas.

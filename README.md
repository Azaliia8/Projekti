# Projektin nimi

Tiimi: Aitanova Azaliia, Karppinen-van Drongelen Riikka, Kumar Tejinder, Nguyen Khoa, Paajaste Maximus, Regnér Joel

## Johdanto

Tässä projektissa toteutetaan lipunmyyntijärjestelmä nimeltä TicketGuru. Järjestelmän asiakas on lipputoimisto, joka myy lippuja erilaisiin tapahtumiin fyysisessä myyntipisteessään. Järjestelmä on tarkoitettu lipunmyyjien käyttöön sekä tapahtumien ovella tapahtuvaan lipuntarkastukseen.

TicketGuru-järjestelmän avulla lipputoimisto voi määritellä järjestelmään myytävät tapahtumat ja hallita niihin liittyvää lipunmyyntiä. Lipunmyyjä myy lippuja järjestelmän kautta ja tulostaa ne asiakkaalle myyntipisteessä. Ennakkomyynnin päätyttyä jäljelle jääneet liput voidaan tulostaa ovella myytäviksi. Jokaisessa lipussa on yksilöllinen ja helposti tarkastettava koodi, jonka avulla lippu voidaan tapahtuman ovella merkitä käytetyksi ja estää väärinkäyttö.

Projektin ensisijainen käyttäjä on lipunmyyjä, ja järjestelmä on suunniteltu sujuvaan ja nopeaan käyttöön myyntitilanteessa. Järjestelmän jatkokehityksenä on tarkoitus toteuttaa verkkokauppa, jonka kautta loppuasiakkaat voivat ostaa lippuja itse, mutta tämä ominaisuus ei kuulu projektin nykyiseen toteutukseen.

### Toteutus- ja toimintaympäristö

TicketGuru toteutetaan selainpohjaisena sovelluksena. Palvelinpuolen toteutus tehdään Java Spring Boot -kehystä käyttäen. Palvelin tarjoaa järjestelmän toiminnot REST-rajapinnan kautta ja vastaa sovelluksen liiketoimintalogiikasta, lipunmyyntiin liittyvistä toiminnoista sekä tiedon käsittelystä ja tallennuksesta. Järjestelmä käyttää tietokantaa tapahtumien, lippujen ja myyntitietojen tallentamiseen.

Käyttöliittymä toteutetaan web-teknologioilla, ja sitä käytetään ensisijaisesti lipunmyyntipisteen työasemalla, kuten pöytäkoneella tai kannettavalla tietokoneella. Järjestelmä tukee myös lipuntarkastusta tapahtuman ovella, jossa lipuissa olevat koodit tarkastetaan ja merkitään käytetyiksi.

Projektin päättyessä valmiina on toimiva lipunmyyntijärjestelmä, jolla voidaan:

- Määritellä ja hallita tapahtumia
- Myydä ja tulostaa lippuja
- Tarkastaa ja merkitä liput käytetyiksi tapahtuman ovella

## Järjestelmän määrittely

## Käyttäjäryhmät (roolit)

Lipunmyyjä
* Myy lippuja asiakkaille myyntipisteessä
* Tulostaa liput
* Näkee tapahtumien lipputilanteen

Ovitarkastaja
* Tarkistaa lipun koodin
* Merkitsee lipun käytetyksi
* Näkee lipun voimassaolon

Ylläpitäjä (Admin)
* Luo ja hallinnoi tapahtumia
* Määrittää lipputyypit ja hinnat
* Hallitsee käyttäjiä
* Tarkastelee myyntitietoja

## Käyttäjätarinat
Lipunmyyjä
* Lipunmyyjänä haluan myydä lipun asiakkaalle, jotta asiakas pääsee tapahtumaan.
* Lipunmyyjänä haluan tulostaa lipun, jotta asiakas saa fyysisen lipun.
* Lipunmyyjänä haluan nähdä jäljellä olevat liput, jotta voin seurata myyntitilannetta.

Ovitarkastaja
* Ovitarkastajana haluan skannata lipun koodin, jotta voin tarkistaa lipun aitouden.
* Ovitarkastajana haluan merkitä lipun käytetyksi, jotta samaa lippua ei voi käyttää uudelleen.

Ylläpitäjä
* Adminina haluan luoda tapahtumia, jotta lippuja voidaan myydä eri tapahtumiin.
* Adminina haluan määrittää lipun hinnat, jotta myynti voidaan hinnoitella oikein.




## Käyttöliittymä

Esitetään käyttöliittymän tärkeimmät (vain ne!) näkymät sekä niiden väliset siirtymät käyttöliittymäkaaviona. 

Jos näkymän tarkoitus ei ole itsestään selvä, se pitää kuvata lyhyesti.
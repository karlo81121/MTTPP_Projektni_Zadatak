# Projektni zadatak iz kolegija Metode i tehnike testiranja programske podrške

U ovom projektnom zadatku korištena je Katalon Recorder ekstenzija unutar Google Chrome preglednika za snimanje testova/koraka unutar web aplikacije koja se zove Tricentis Demo Webshop (http://demowebshop.tricentis.com/). Na web aplikaciji su testirane njene osnovne funkcionalnosti kao što su:

- dodavanje proizvoda na listu za usporedbu
- dodavanje proizvoda u košaricu
- dovršavanje kupovine određenog proizvoda (eng. Checkout)
- odabir konfiguracije proizvoda prije njegovog dodavanja u košaricu
- pregled proizvoda na stranici (grid ili lista)
- pregled broja proizvoda po stranici
- soritranje proizvoda na stranici (pr. Price Low to High)
- prijava korisnika u sustav
- odjavljivanje korisnika iz sustava
- pretraživanje određenih proizvoda na stranici

Izgled Katalon Recorder Workspace-a:

![image](https://user-images.githubusercontent.com/88043093/154732180-b2e60ee0-c08e-46f3-b1b5-63c47641be0c.png)

Izgled jednog snimljenog testa:

![image](https://user-images.githubusercontent.com/88043093/154732243-88b4dc37-4791-4a14-a1e5-32c5c16c4902.png)

Unutar samog Katalon Recorder-a moguće je snimiti korake određenog testa te ga pokrenuti nakon svih snimljenih koraka. Računalo će tada automatski prikazati korake izvedbe snimljenog testa. Nakon snimljenih svih testova (10), korištenjem Export naredbe unutar ekstenzije, testovi su eksportani kao Java testovi (WebDriver + testNG). Za kreiranje i pokretanje testova korišten je program IntelliJ IDEA. Unutar njega kreirane su klase za svaki pojedini test te ručno konfigurirana datoteka testng.xml u kojoj se nalaze class elementi sa atributima koji sadrže imena prethodno navedenih klasa:

![image](https://user-images.githubusercontent.com/88043093/154730760-f9f9776d-27bc-4e0d-8967-a78854214373.png)

Projektno stablo unutar IntelliJ programa: 

![image](https://user-images.githubusercontent.com/88043093/154730903-67e5bf71-a7cc-46ab-896b-00a2c1d51591.png)

Unutar projekta je također korišten Web Driver koji je u ovom slučaju geckodriver koji se koristi s Mozilla Firefox preglednikom. Unutar samih testnig klasa bilo je potrebno upisati putanju do web driver-a kako bi program mogao s njim raditi te kreirati novu njegovu instancu (new FirefoxDriver()). 

Korišten je i testNG, framework/okvir za testiranje baziran na JUnit i NUnit okvirima ali on uvodi neke nove funkcionalnosti koje ga čine moćnijim i lakšim za korištenje.

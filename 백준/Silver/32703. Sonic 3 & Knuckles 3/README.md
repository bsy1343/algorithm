# [Silver IV] Sonic 3 & Knuckles 3 - 32703

[문제 링크](https://www.acmicpc.net/problem/32703)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 19, 정답 비율: 70.370%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Vaatleme lihtsustatud versiooni konsoolimängu <em>Sonic 3 &amp; Knuckles</em><sup>1</sup> lisatasemetest.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32703.%E2%80%85Sonic%E2%80%853%E2%80%85%26%E2%80%85Knuckles%E2%80%853/da8f1604.png" data-original-src="https://boja.mercury.kr/assets/problem/32703-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>Sonic liigub $N \times M$ ruudustikus. Igal sammul võib ta astuda ühe ruudu võrra paremale, vasakule, üles või alla, aga mitte ruudustikust välja. Sonic ei saa teha 180-kraadilist pööret: kui ta astub ruudu võrra vasakule, ei saa ta järgmise sammuga astuda ruudu võrra paremale ega vastupidi; samuti ei saa sammule üles vahetult järgneda samm alla ega vastupidi.</p>

<p>Igal ruudul võib olla üks järgmistest objektidest:</p>

<ul>
	<li><em>Valge pall</em>: Sonic ei saa sellele ruudule astuda.</li>
	<li><em>Punane pall</em>: Sonic ei saa sellele ruudule astuda.</li>
	<li><em>Sinine pall</em>: kui Sonic astub sellele ruudule ja sealt ära, muutub pall punaseks.</li>
</ul>

<p>Lisaks kehtib täiendav reegel: kui mingil hetkel tekib olukord, kus ruudustikus on omavahel servapidi ühendatud sinistest pallidest koosnev aukudeta sidususkomponent, kus on vähemalt üks sinine pall ja mis on igast suunast (sh. nurkapidi) vahetult punaste ja/või valgete pallidega ümbritsetud, siis kaovad ära kõik selles komponendis olevad sinised pallid ja kõik selle komponendi vahetud punased naabrid (sh. nurkapidi naabrid), aga mitte valged naabrid. Seda kontrollitakse pärast seda, kui Sonic on ruudult lahkunud (ja potentsiaalselt ruudul olev sinine pall punaseks muutunud), aga enne seda, kui ta järgmisele ruudule saabunud on. Kui mitu sellist sidususkomponenti tekib korraga, siis tehakse ka kõik pallide eemaldamised korraga.</p>

<p>Kohe, kui kõik sinised pallid on ruudustikult kadunud, kaovad ruudustikult ka kõik muud pallid ja mäng on võidetud. Sinu ülesanne ongi leida käikude jada, millega mäng võita.</p>

<p>Parema arusaamise eesmärgil teeme läbi mõned näited Sonicu liikumisest. Sonicu asukohta tähistab must täpp. Read on indekseeritud alates ühest ülevalt alla, veerud alates ühest vasakult paremale. Näiteks $(3, 4)$ tähistab kolmandal real ja neljandas veerus olevat ruutu.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32703.%E2%80%85Sonic%E2%80%853%E2%80%85%26%E2%80%85Knuckles%E2%80%853/d4132d44.png" data-original-src="https://boja.mercury.kr/assets/problem/32703-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 573px; height: 50px;"></p>

<p>Esiteks teeb Sonic kolm sammu paremale. Iga kord, kui Sonic lahkub sinise palliga ruudult, muutub see pall punaseks. Pärast kolmanda sammu tegemist astub Sonic ruudule $(1, 4)$, kus on sinine pall. Seejärel astub ta alla. Kohe, kui Sonic ruudult lahkub, muutub selles ruudus olev sinine pall punaseks. Siis ei ole ruudustikus enam ühtki sinist palli. Seega on mäng võidetud ja kaovad ka kõik muud pallid. Seega on ruut $(2, 4)$ tühi hetkeks, kui Sonic sinna astub.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32703.%E2%80%85Sonic%E2%80%853%E2%80%85%26%E2%80%85Knuckles%E2%80%853/15458d2b.png" data-original-src="https://boja.mercury.kr/assets/problem/32703-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 424px; height: 150px;"></p>

<p>Alguses asub Sonic ruudul $(3, 2)$, kus on sinine pall. Ta astub sealt alla ja pall ruudul $(3, 2)$ muutub punaseks. Kuigi pallid $(3, 4)$, $(4, 2)$, $(4, 3)$, $(4, 4)$, $(5, 2)$, $(5, 3)$ ja $(5, 4)$ moodustavad servapidi ühendatud siniste pallide sidususkomponendi, ei kao veel ühtki palli ära, kuna sidususkomponent pole igast suunast punaste või valgete pallidega ümbritsetud: ruudul $(4, 2)$ on nurkapidi naaber $(3, 1)$, mis on tühi.</p>

<p>Seejärel astub Sonic paremale ja pall ruudul $(4, 2)$ muutub punaseks. Nüüd moodustavad mõned sinised pallid servapidi ühendatud komponendi (joonisel ümbritsetud punktiirjoonega), mis on igalt poolt punaste ja valgete pallidega ümbritsetud. Kaovad ära kõik komponendi pallid ja nende vahetud punased (sh. nurkapidi) naabrid. Alles aga jäävad valged pallid, näiteks ruudul $(6, 3)$. Samuti jääb alles näiteks ruudul $(1, 3)$ olev punane pall, kuna too ei ole moodustatud komponendis oleva palli vahetu naaber.</p>

<p>Mäng siiski veel võidetud ei ole, kuna alles on jäänud ka sinine pall ruudul $(2, 1)$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32703.%E2%80%85Sonic%E2%80%853%E2%80%85%26%E2%80%85Knuckles%E2%80%853/0222ec5c.png" data-original-src="https://boja.mercury.kr/assets/problem/32703-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 225px; height: 100px;"></p>

<p>Alguses asub Sonic ruudul $(2, 2)$, kus on sinine pall. Ta astub sealt alla ja ruudul $(2, 2)$ olev sinine pall muutub punaseks. Kuna pallid ruutudel $(3, 2)$ ja $(2, 3)$ ei ole omavahel servapidi ühendatud, ei moodusta nad ühist komponenti, vaid kumbki omaette komponendi. Midagi ära aga ei kao, sest ruut $(3, 2)$ ei ole igast suunast ümbritsetud punaste ja valgete pallidega: ruut $(3, 2)$ on nurkapidi ühendatud ruuduga $(2, 3)$, kus ei ole punane ega valge, vaid sinine pall.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32703.%E2%80%85Sonic%E2%80%853%E2%80%85%26%E2%80%85Knuckles%E2%80%853/bb9d0cc4.png" data-original-src="https://boja.mercury.kr/assets/problem/32703-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 572px; height: 75px;"></p>

<p>Alguses asub Sonic ruudul $(1, 3)$, kus on sinine pall. Ta astub sealt kaks korda alla ja pallid ruutudel $(1, 3)$ ja $(2, 3)$ muutuvad punaseks. Nüüd astub Sonic ruudult $(3, 3)$ vasakule. Pall ruudul $(3, 3)$ muutub punaseks. Nüüd moodustab sinine pall ruudul $(2, 2)$ komponendi, mis on igalt poolt punaste pallidega ümbritsetud. Samaaegselt moodustab aga ka sinine pall ruudul $(2, 4)$ komponendi, mis on igalt poolt punaste pallidega ümbritsetud. Mõlemad sinised pallid ja kõik neid ümbritsevad punased pallid eemaldatakse samaaegselt.</p>

<hr>
<p><sup>1</sup>Sega 1994. Mänguga tutvumine ei ole ülesande lahendamiseks vajalik. Mõned detailid võivad ülesande ja tegeliku mängu vahel erineda.</p>

### 입력

<p>Sisendfaili esimesel real on kaks täisarvu $N$ ja $M$ ($1 \le N, M \le 400$), vastavalt ruudustiku ridade ja veergude arv.</p>

<p>Järgneb $N$ rida, millest igaühel on $M$ sümbolist koosnev sõne. Sõne iga sümbol on üks järgmistest: <code>.</code> (tühi ruut), <code>S</code> (Sonicu lähtekoht), <code>\#</code> (valge pall), <code>x</code> (punane pall), <code>o</code> (sinine pall). Sonicu lähtekoht on tühi ruut. Sümbol <code>S</code> esineb ruudustikus täpselt ühe korra.</p>

### 출력

<p>Väljundfaili kirjutada üks sõne, mis kirjeldab Sonicu teekonda. Sõne peab koosnema sümbolitest <code>L</code>, <code>R</code>, <code>U</code> ja <code>D</code>, mis tähistavad vastavalt liikumist ühe ruudu võrra vasakule, paremale, üles ja alla. Sõne pikkus ei tohi ületada $10^6$ sümbolit.</p>

<p>Juhime tähelepanu, et sammude arvu minimeerimine ei ole vajalik.</p>

### 힌트

<p>Esimesed kaks näidet ühtivad esimese ja teise tekstis toodud näitega. Kolmas näide on laiendatud versioon tekstis toodud neljandast näitest.</p>
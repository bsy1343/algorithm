# [Platinum III] Brutalna Birtija - 26294

[문제 링크](https://www.acmicpc.net/problem/26294)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

조합론, 다이나믹 프로그래밍, 구현, 수학

### 문제 설명

<p>Fakultet elektrotehnike i računarstva (lat. <em>Facultas electrotechnicae et rei computatoriae</em>), jedan je od najcjenjenijih i najorganiziranijih fakulteta Sveučili&scaron;ta u Zagrebu. Prostire se kroz vi&scaron;e od 38 000 četvornih metara, a čine ga zgrada A koju krase prostrane učionice opremeljene <s>modernim</s> računalima, zgrada B u kojoj su skriptarnica i aparati za kavu, zgrada C koju rijetki mogu savladati bez kori&scaron;tenja dizala, zgrada D koju krase predivni auditoriji te bijela i siva vijećnica, i konačno zgrada E koju krase birtije.</p>

<p>Mladi Vito novopečeni je FER-ovac. Odgovorno dolazi na svako predavanje, ruku diže vje&scaron;to i zna se da postat će ne&scaron;to. Međutim, primijetio je da dobar dio njegovih kolega ipak ne razmi&scaron;lja na taj način, te da većinu dana vise po birtijama. Dok on glavu razbija integralima, njegovi kolege nikako da se odluče u koju će birtiju otići. Toliko ih je puta u nevjerici promatrao da je uspio matematički modelirati njihovo pona&scaron;anje.</p>

<p><strong>Vitina slutnja</strong>: Razgovor skupa studenata čiji je konačan cilj odabir lokacije za ispijanje alkoholnih pića možemo modelirati na sljedeći način:</p>

<ul>
	<li>Najprije će barem jedan student snažno izraziti mi&scaron;ljenje oblika: &ldquo;Buraz, birtija X je brutalna, ajmo tamo!&rdquo;. Odnosno, neprazan podskup (dominantnih) studenata efektivno će uložti po jedan glas da se ide u specifičnu birtiju. Pritom, vi&scaron;e od jednog studenta može uložiti glas za odlazak u istu birtiju. Zanimljivo je da će svaka birtija dobiti barem jedan glas.</li>
	<li>Preostali će studenti, jedan po jedan, svoje mi&scaron;ljenje izraziti u obliku: &ldquo;Ma meni ti je buraz u pravilu svejedno, al ak ba&scaron; moram glasat, glasat ću za X.&rdquo;. Pritom, svaki je od ovih studenata pod pritiskom okoline, a način na koji glasa možemo modelirati probabilistički. Preciznije, student će za neku birtiju glasati s vjerojatno&scaron;ću koja je jednaka broju dosada&scaron;njih glasova za tu birtiju podijeljenom ukupnim brojem dosada&scaron;njih glasova.</li>
	<li>Konačno, nakon &scaron;to su svi studenti izrazili svoje mi&scaron;ljenje, grupa će posjetiti onu birtiju koja je dobila najvi&scaron;e glasova. Ako ima vi&scaron;e takvih, odabrat će neku od njih s jednakom vjerojatno&scaron;ću.</li>
</ul>

<p>Da bi se uvjerio u ispravnost svog modela, Vito je odlučio napisati program koji će na temelju broja studenata u grupi, broja birtija u E zgradi te glasova dominantnih studenata, odrediti za svaku birtiju koja je vjerojatnost da će grupa tamo zavr&scaron;iti.</p>

<p>Budući da je tek upisao FER, jo&scaron; se hrva s osnovama programiranja i zapeo je na učitavanju brojeva. Možete li mu pomoći?</p>

### 입력

<p>U prvom je retku prirodan broj T (1 &le; T &le; 120), broj scenarija koje va&scaron; program treba obraditi.</p>

<p>Svaki je scenarij opisan dvama retcima.</p>

<p>U prvom su retku scenarija prirodni brojevi n (1 &le; n &le; 5) i k (n &le; k &le; 50), koji redom predstavljaju broj birtija u E zgradi i ukupan broj studenata u grupi.</p>

<p>U drugom retku scenarija je n prirodnih brojeva, pri čemu i-ti broj označava broj dominantnih studenata koji su glasali za i-tu birtiju. Suma svih brojeva u ovom retku bit će manja ili jednaka k.</p>

### 출력

<p>Za svaki scenarij potrebno je ispisati n redaka koji sadrže vjerojatnost da će grupa otići u i-tu birtiju.</p>

<p>Svaki redak potrebno je ispisati u obliku <code>birtija x: p %</code>, gdje je x redni broj birtije iz ulaza, a p decimalan broj zaokružen na <strong>točno</strong> dvije decimale nakon decimalne točke. Primijetite da se između broja p i znaka za postotak nalazi jedan znak razmaka.</p>

### 힌트

<p>U prvom scenariju svaka je birtija dobila točno po jedan glas te su svi studenti u grupi dominantni. Dakle, grupa će u svaku od birtija otići s jednakom vjerojatno&scaron;ću od 25%.</p>

<p>U drugom scenariju će jedini student koji nije dominantan odabrati prvu birtiju s vjerojatno&scaron;ću 3/5, dok če drugu, odnosno treću birtiju odabrati s vjerojatno&scaron;ću 1/5. Ipak, neovisno o tome &scaron;to taj student odabere, birtija pod brojem 1 će na kraju imati najveći broj glasova.</p>
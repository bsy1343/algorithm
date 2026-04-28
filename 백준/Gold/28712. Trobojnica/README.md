# [Gold IV] Trobojnica - 28712

[문제 링크](https://www.acmicpc.net/problem/28712)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 20, 맞힌 사람: 15, 정답 비율: 78.947%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p><em>Moje zastave uvijek su iste boje... crveno-bijelo-plave.</em></p>

<p>Fifi voli bojati zastave sa zanimljivim svojstvima. Nakon &scaron;to je navio alarm za sljedeći dan, odlučio je prije spavanja obojati jo&scaron; jednu zastavu.</p>

<p>Njegova zastava ima visinu $n$ i &scaron;irinu $m$, a polje u $i$-tom retku i $j$-tom stupcu ima sklonost $c_{i,j}$ crvenoj boji, $b_{i,j}$ bijeloj boji, i $p_{i,j}$ plavoj boji.</p>

<p>Fifi boja zastavu stupac po stupac: najprije oboji nekoliko polja u crvenu boju, zatim nekoliko u bijelu boju, a ostatak u plavu boju, točno tim redom gledano s vrha stupca prema dnu. Svaki stupac mora imati barem po jedno polje crvene, bijele i plave boje.</p>

<p>Pritom želi maksimizirati ostvarene sklonosti, tj. želi da je sljedeći zbroj najveći mogući:</p>

<ul>
	<li>Ako je polje u $i$-tom retku $j$-tog stupca obojano u crvenu boju, tada se ukupna ostvarena sklonost povećava za $c_{i,j}$.</li>
	<li>Ako je polje u $i$-tom retku $j$-tog stupca obojano u bijelu boju, tada se ukupna ostvarena sklonost povećava za $b_{i,j}$.</li>
	<li>Ako je polje u $i$-tom retku $j$-tog stupca obojano u plavu boju, tada se ukupna ostvarena sklonost povećava za $p_{i,j}$.</li>
</ul>

<p>Odredite maksimalnu ostvarenu sklonost.</p>

### 입력

<p>U prvom retku su prirodni brojevi $n$ i $m$ ($3 &le; n &le; 2\,500$, $1 &le; m &le; 2\,500$), visina i &scaron;irina zastave.</p>

<p>Slijedi $n$ redatka po $m$ cijelih brojeva $c_{i,j}$ ($0 &le; c_{i,j} &le; 1\,000$), gdje $c_{i,j}$ predstavlja sklonost crvenoj boji polja u $i$-tom retku i $j$-tom stupcu.</p>

<p>Slijedi $n$ redatka po $m$ cijelih brojeva $b_{i,j}$ ($0 &le; b_{i,j} &le; 1\,000$), gdje $b_{i,j}$ predstavlja sklonost bijeloj boji polja u $i$-tom retku i $j$-tom stupcu.</p>

<p>Slijedi $n$ redatka po $m$ cijelih brojeva $p_{i,j}$ ($0 &le; p_{i,j} &le; 1\,000$), gdje $p_{i,j}$ predstavlja sklonost plavoj boji polja u $i$-tom retku i $j$-tom stupcu.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;ite traženi broj.</p>

### 힌트

<p>Poja&scaron;njenja probnih primjera: Lijevo je prikaz bojanja zastave prvog probnom prijema, u sredini drugog probnog prijema, i desno trećeg probnog primjera.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28712.%E2%80%85Trobojnica/a57ba6d4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/28712.%E2%80%85Trobojnica/a57ba6d4.png" data-original-src="https://upload.acmicpc.net/d1875ad1-ec3c-46e6-8268-61463615b7ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 469px; height: 200px;" /></p>
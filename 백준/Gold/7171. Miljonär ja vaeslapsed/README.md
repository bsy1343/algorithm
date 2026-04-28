# [Gold IV] Miljonär ja vaeslapsed - 7171

[문제 링크](https://www.acmicpc.net/problem/7171)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Dickensi-aegsel Inglismaal elas miljonär Mortimer. Temaga samas linnas asusid kolm lastekodu, kus elasid vaeslapsed, kellele Mortimer tavatses jõulukinke teha.</p>

<p>Kinkide jagamise protseduur oli järgmine:</p>

<ol>
	<li>Iga vaeslaps saab oma lastekodust korvi, millega ta kingi järele läheb.</li>
	<li>Mortimer viskab kingitusi järjest laste sekka, mida nood oma korvidega püüavad.</li>
	<li>Iga kingitus püütakse alati kinni.</li>
	<li>Lapsed saavad kingitusi kätte juhuslikult, kuid tõenäosus, et konkreetne laps kingituse kätte saab, on võrdeline tema korvisuu pindalaga.</li>
	<li>Sama lastekodu lastel on sama suurusega korvid.</li>
	<li>Kui mõni laps saab kingituse kätte, läheb ta sellega kohe lastekodusse tagasi ja rohkem püüdmises ei osale.</li>
	<li>Lapsi võib olla rohkem kui kingitusi :(</li>
</ol>

<p>Igal kingitusel on väärtus. Leida iga lastekodu kohta, milline on selle kodu laste poolt saadud kingituste väärtuste keskmine eeldatav summa.</p>

### 입력

<p>Tekstifailis on antud:</p>

<ol>
	<li>Esimesel real kaks täisarvu 0 &le; L<sub>1</sub> &le; 100 ja 1 &le; K<sub>1</sub> &le; 100, mis tähistavad esimese lastekodu laste arvu ning korvi pindala.</li>
	<li>Teisel real kaks täisarvu 0 &le; L<sub>2</sub> &le; 100 ja 1 &le; K<sub>2</sub> &le; 100, mis tähistavad teise lastekodu laste arvu ning korvi pindala.</li>
	<li>Kolmandal real kaks täisarvu 0 &le; L<sub>3</sub> &le; 100 ja 1 &le; K<sub>3</sub> &le; 100, mis tähistavad kolmanda lastekodu laste arvu ning korvi pindala.</li>
	<li>Neljandal real on kingituste arv 1 &le; N &le; L<sub>1</sub> + L<sub>2</sub> + L<sub>3</sub>.</li>
	<li>&Uuml;lejäänud N real on kingituste väärtused (täisarvud vahemikus 1 . . . 1 000). Mortimer viskab kingitusi täpselt antud järjekorras.</li>
</ol>

### 출력

<p>Tekstifaili väljastada kolm reaalarvu (täpsusega vähemalt 0,0001), mis vastavad saadud kinkide väärtuste keskmisele eeldatavale summale.</p>
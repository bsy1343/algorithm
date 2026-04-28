# [Silver III] Kalėdų senelis - 30076

[문제 링크](https://www.acmicpc.net/problem/30076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 14, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>Greitai Kalėdos. Elniai jau pakinkyti ir Kalėdų senelis beveik pasiruo&scaron;ęs traukti į kelionę, tik dovanos dar nesukrautos.</p>

<p>Nors rogėse telpa be galo daug dovanų, bet sunkias roges tempiantis kinkinys greitai pavargsta, todėl dovanų reikia krauti kiek galima mažiau.</p>

<p>Tai žinodami nyk&scaron;tukai Kalėdų senelio ma&scaron;rute ant namų stogų įrengė dovanų slėptuves.</p>

<p>Kalėdų senelis gali pasikrauti dovanų savo trobelėje (t.y. pradiniame ta&scaron;ke), o taip pat bet kurioje slėptuvėje.</p>

<p>Žinodami, kiek vaikų turi aplankyti Kalėdų senelis, patarkite, kiek dovanų jam reikia įkrauti į roges savo trobelėje bei kiekvienoje slėptuvėje, kad jų kiekis rogėse visada būtų kuo mažesnis.</p>

<p>Keliaudamas Kalėdų senelis:</p>

<ul>
	<li>lanko vaikus namų numerių didėjimo tvarka, pradėdamas nuo pirmojo;</li>
	<li>negali apgręžti rogių atgal iki neaplanko visų vaikų;</li>
	<li>jei ant namo stogo yra įrengta slėptuvė, jis pirma joje pasipildo roges dovanų, o tuomet ne&scaron;a dovaną tame name gyvenančiam vaikui.</li>
</ul>

<p>Visi vaikai gyvena skirtinguose namuose ir kiekvienam jų atne&scaron; vieną dovaną.</p>

### 입력

<p>Pirmojoje eilutėje pateikti du sveikieji skaičiai:</p>

<ul>
	<li>$N$ &ndash; vaikų skaičius;</li>
	<li>$M$ &ndash; dovanų slėptuvių skaičius.</li>
</ul>

<p>Kitose $M$ eilučių pateikta po du skaičius:</p>

<ul>
	<li>$K_i$ &ndash; ant kelinto vaiko namo stogo įrengta slėptuvė. Duomenys pateikti $K_i$ didėjimo tvarka;</li>
	<li>$Z_i$ &ndash; dovanų skaičius &scaron;iame sandėlyje.</li>
</ul>

<p>Pradiniame ta&scaron;ke yra Kalėdų senelio trobelė, joje yra be galo daug dovanų.</p>

### 출력

<p>I&scaron;veskite $M + 1$ skaičių skirtingose eilutėse. Pirmojoje eilutėje nurodykite, kiek dovanų reikia įsidėti prie&scaron; pradedant kelionę. Kitose $M$ eilučių i&scaron;veskite, kiek dovanų reikia pasikrauti kiekvienoje slėptuvėje (rezultatai pateikiami ta tvarka, kokia slėptuvės pateiktos pradiniuose duomenyse).</p>

### 제한

<ul>
	<li>$1 &le; N &le; 10\,000$</li>
	<li>$0 &le; M &le; N$</li>
	<li>$1 &le; K_1 &lt; \dots &lt; K_i &lt; K_{i+1} &lt; \dots &lt; K_M &le; N$</li>
	<li>$1 &le; Z_i &le; 10\,000$</li>
</ul>
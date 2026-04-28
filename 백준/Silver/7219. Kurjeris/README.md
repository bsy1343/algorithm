# [Silver V] Kurjeris - 7219

[문제 링크](https://www.acmicpc.net/problem/7219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 51, 맞힌 사람: 35, 정답 비율: 63.636%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Artėjant Kalėdoms, Bitlandijos siuntinių kompanija Bitzon turi neįprastai daug darbo.</p>

<p>Bitlandijoje yra N miestų, kuriuos jungia vienas bendras greitkelis. Į Rytus nuo pirmojo miesto įsikūręs kompanijos Bitzon sandėlis. Atstumas nuo Bitzon sandėlio iki pirmojo miesto yra m<sub>1</sub> laiko vienetų, nuo pirmojo iki antrojo miestų &ndash; m<sub>2</sub> laiko vienetų, ir taip toliau, kaip pavaizduota iliustracijoje:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7219.%E2%80%85Kurjeris/d3af0a58.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/7219.%E2%80%85Kurjeris/d3af0a58.png" data-original-src="https://upload.acmicpc.net/4f5cb26d-9d2f-498f-a239-d12c24f753ea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 479px; height: 68px;" /></p>

<p>Į sandėlį kiekvieną dieną atveža krūvą siuntinių, kuriuos kurjeris turi i&scaron;vežioti. Kiekvienam siuntiniui nurodytas adresas (miesto numeris) ir laikas, kada siuntinys turi būti pristatytas. Siuntinius kurjeris gali pristatyti anksčiau negu numatyta, bet būtinai ne vėliau nei nurodytu laiku.</p>

<p>Kurjeris i&scaron;vyksta i&scaron; sandėlio ryte (laikysime &scaron;į momentą laiku 0), ir važinėja i&scaron; vieno miesto į kitą pristatinėdamas siuntinius.</p>

<p>&Scaron;iame uždavinyje laikysime, kad siuntinio pristatymas laiko neužima, tiktai važiavimas nuo vieno miesto iki kito.</p>

<p>Žinomas siuntinių sąra&scaron;as, kuriuos kurjeris turi pristatyti. Raskite:</p>

<ol>
	<li>Ar kurjeris suspės pristatyti visus siuntinius nepavėluodamas.</li>
	<li>Per kiek mažiausiai laiko kurjeris sugebės pristatyti visus siuntinius ir sugrįžti į sandėlį.</li>
</ol>

### 입력

<p>Pirmoje eilutėje įra&scaron;ytas miestų skaičius N. Antroje eilutėje įra&scaron;yta N sveikųjų skaičių &ndash; atstumai m<sub>1</sub>, m<sub>2</sub>, . . . , m<sub>N</sub>. Trečioje eilutėje įra&scaron;ytas siuntinių skaičius K.</p>

<p>Galiausiai seka K eilučių, apra&scaron;ančių visus siuntinius. Kiekvienoje i&scaron; &scaron;ių eilučių pateikta po du sveikuosius skaičius: miesto numeris a<sub>i</sub> (1 &le; a<sub>i</sub> &le; N), kur siuntinys turi būti pristatytas, ir vėliausias galimas pristatymo laikas t<sub>i</sub>.</p>

<p>Laikykite, kad kurjeris i&scaron;vyksta i&scaron; sandėlio laiku 0. Į tą patį miestą gali būti pristatomas daugiau negu vienas siuntinys. Kurjeris siuntinius gali pristatyti bet kuria tvarka (bet nevėluodamas).</p>

### 출력

<p>I&scaron;veskite vienintelį sveiką skaičių &ndash; per kiek mažiausiai laiko įmanoma pristatyti visus siuntinius ir sugrįžti į sandėlį. Jeigu bent vieno siuntinio neįmanoma pristatyti laiku &ndash; i&scaron;veskite &minus;1.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10 000</li>
	<li>1 &le; m<sub>i</sub> &le; 100</li>
	<li>1 &le; K &le; 1000</li>
	<li>1 &le; t<sub>i</sub> &le; 1 000 000.</li>
</ul>
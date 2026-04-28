# [Silver IV] Kartingas - 7222

[문제 링크](https://www.acmicpc.net/problem/7222)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 33, 맞힌 사람: 29, 정답 비율: 42.029%

### 분류

구현, 정렬

### 문제 설명

<p>Vytautas Kalėdų proga gavo naują k&#39;artą ir nori jį i&scaron;bandyti ilgoje ir tiesioje kartingo trasoje.</p>

<p>Trasą kartas pradeda su pilnu kuro baku. Nuvažiuodamas vieną kilometrą kartas sunaudoja vieną litrą kuro. Kartas važiuoja tiesiai, kol bake yra kuro. Kuro baką galima pripildyti iki pilno bet kurioje degalų stotelėje.</p>

<p>Trasoje yra N stotelių, kurių i-toji stovi p<sub>i</sub> kilometrų nuo trasos pradžios.</p>

<p>Padėkite Vytautui apskaičiuoti, kokios mažiausios talpos kuro bako jam reikia, kad jam pavyktų nuvažiuoti bent K kilometrų.</p>

### 입력

<p>Pirmojoje įvesties eilutėje pateikti du sveikieji teigiami skaičiai &ndash; stotelių skaičius N ir norimų nuvažiuoti kilometrų skaičius K.</p>

<p>Antrojoje įvesties eilutėje pateikta N sveikųjų teigiamų skaičių &ndash; i-tasis jų žymi i-tosios stotelės atstumą nuo trasos pradžios kilometrais. Stotelių pozicijas Vytautas gavo i&scaron; kelininkų, kurie jas pateikė kažkokia, tik jiems žinoma, tvarka &ndash; t. y. pozicijos nebūtinai bus i&scaron;rikiuotos.</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; minimalios bako talpos dydį litrais, su kuria Vytautui pavyktų nuvažiuoti bent K kilometrų.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>1 &le; K, p<sub>1</sub>, p<sub>2</sub>, . . . p<sub>N</sub> &le; 1 000 000 000</li>
	<li>ties tam tikru kilometru gali būti daugiau nei viena stotelė.</li>
</ul>
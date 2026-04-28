# [Platinum IV] Girlianda - 30279

[문제 링크](https://www.acmicpc.net/problem/30279)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색, 트리, 너비 우선 탐색, 비트마스킹, 홀짝성

### 문제 설명

<p>Linas dovanų gavo neįprastą girliandą. &Scaron;i girlianda sudaryta i&scaron; N tarpusavyje sujungtų lempučių. Visos lemputės yra sujungtos į vieną bendrą tinklą, o tinkle ciklų nėra. Tiesiogiai sujungtas lemputes vadinsime kaimyninėmis.</p>

<p>Pradiniu momentu, t.y. įjungus girliandą į elektros tinklą (t = 0), kai kurios lemputės &scaron;viečia, o kai kurios &ndash; ne. Tuomet, kiekvieną sekundę įjungtų lempučių konfigūracija keičiasi. Laiko momentu t kiekviena lemputė yra arba įjungiama, arba i&scaron;jungiama pagal tokią taisyklę:</p>

<ul>
	<li>Lemputė ne&scaron;vies, jeigu t &minus; 1 momentu ji turėjo bent vieną kaimyninę lemputę, kuri ne&scaron;vietė;</li>
	<li>Kitu atveju, lemputė &scaron;vies.</li>
</ul>

<p>Linui parūpo sužinoti, per kiek sekundžių po įjungimo į elektros tinklą visos girliandos lemputės užges.</p>

### 입력

<p>Pirmoje eilutėje pateikiamas vienas sveikasis skaičius N &ndash; girliandos lempučių kiekis.</p>

<p>Antroje eilutėje pateikta N &minus; 1 sveikųjų skaičių p<sub>i</sub> (2 &le; i &le; N, p<sub>i</sub> &lt; i). Skaičius p<sub>i</sub> nusako, kad i-toji lemputė yra prijungta prie p<sub>i</sub>-tosios.</p>

<p>Trečioje eilutėje pateikta N sveikųjų skaičių s<sub>i</sub> (1 &le; i &le; N). Jei s<sub>i</sub> = 1, lemputė i nuliniu laiko momentu &scaron;viečia, o jei s<sub>i</sub> = 0 &mdash; ne&scaron;viečia.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; mažiausią sekundžių kiekį, po kurio visos girliandos lemputės bus i&scaron;jungtos. Jeigu taip niekada neįvyks, i&scaron;veskite &minus;1.</p>

### 제한

<ul>
	<li>2 &le; N &le; 500 000</li>
</ul>
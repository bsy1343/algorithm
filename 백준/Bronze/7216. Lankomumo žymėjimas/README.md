# [Bronze I] Lankomumo žymėjimas - 7216

[문제 링크](https://www.acmicpc.net/problem/7216)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 82, 맞힌 사람: 59, 정답 비율: 92.188%

### 분류

구현, 애드 혹, 시뮬레이션

### 문제 설명

<p>Mokytoja Neringa sugalvojo naują patikrinimo, ar visi mokiniai susirinko į pamokas, būdą. Neringos klasėje yra N mokinių, ir kiekvienam mokiniui Neringa patikėjo įsiminti vieno kito mokinio vardą.</p>

<p>Kiekvieną dieną prie&scaron; pamokas Neringa atsitiktinai pasirenka vieną mokinį ir pakviečia vardu. Pakviestasis mokinys tuomet pakviečia jam priskirtą mokinį vardu, &scaron;is pasako jam priskirto mokinio vardą, ir t.t., iki kol kažkuris mokinys vėl pasako Neringos pakviesto mokinio vardą.</p>

<p>Neringa pasirūpino (nurodydama kam kieno vardą įsiminti), kad jei klasėje yra visi mokiniai, tai tokiu būdu kviečiant mokinius, būtinai bus pakviestas kiekvienas mokinys.</p>

<p>Raskite, kuris mokinys atsilieps paskutinis, jei susirinks visi mokiniai.</p>

### 입력

<p>Pirmoje eilutėje pateikti du teigiami sveikieji skaičiai &ndash; mokinių skaičius N ir Neringos pakviesto mokinio numeris k.</p>

<p>Antroje eilutėje pateikta N sveikųjų teigiamų skaičių a<sub>i</sub> (1 &le; i &le; N): i-ajam mokiniui priskirto mokinio numeris.</p>

### 출력

<p>I&scaron;veskite vieną skaičių - paskutinio atsiliepusio mokinio numerį.</p>

### 제한

<ul>
	<li>1 &le; N, k &le; 1 000</li>
	<li>1 &le; a<sub>i</sub> &le; N visiems i.</li>
	<li>Visi ai skirtingi.</li>
</ul>
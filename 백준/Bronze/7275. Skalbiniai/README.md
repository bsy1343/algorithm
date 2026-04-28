# [Bronze II] Skalbiniai - 7275

[문제 링크](https://www.acmicpc.net/problem/7275)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 83, 맞힌 사람: 79, 정답 비율: 90.805%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Tomas nemėgsta skalbti drabužių, nors ir turi skalbimo ma&scaron;iną. Kartais, kai Tomas nusprendžia i&scaron;skalbti drabužius, jų jis turi tiek daug, kad jie visi netelpa į ma&scaron;iną, ir jam tenka skalbti kelis kartus i&scaron; eilės.</p>

<p>Taip pat, Tomas žino, kad kartu skalbimo ma&scaron;inoje galima skalbti tik tam tikrų spalvų drabužius. Tuomet sakome, kad drabužių spalvos priklauso vienai drabužių grupei. Kiekviena spalva priklauso lygiai vienai drabužių grupei.</p>

<p>Skalbimo ma&scaron;inoje vienu metu negalima skalbti daugiau nei M drabužių. Žinodami, kurių spalvų drabužius galima skalbti kartu, padėkite Tomui suskaičiuoti, kiek skalbimų jis turės atlikti, kad i&scaron;skalbtų visus drabužius.</p>

### 입력

<p>Pirmoje eilutėje pateikti trys sveikieji skaičiai: N &ndash; drabužių spalvų kiekis, K &ndash; skirtingų drabužių grupių skaičius ir M &ndash; skalbimo ma&scaron;inos talpa.</p>

<p>Tolesnėse K eilučių pateiktas sveikasis skaičius G<sub>i</sub>, nurodantis kiek skirtingų drabužių spalvų yra i-toje grupėje ir dar G<sub>i</sub> skaičių &ndash; nurodančių kurios drabužių spalvos priklauso i-tai grupei.</p>

<p>Kitoje eilutėje pateikta N sveikųjų skaičių D<sub>i</sub>, nurodančių kiek i-tosios spalvos drabužių Tomas turi.</p>

<p>Drabužių spalvos žymimos sveikaisiais skaičiais nuo 1 iki N.</p>

### 출력

<p>I&scaron;veskite vieną sveikajį skaičių &ndash; skalbimų, kuriuos turės Tomas atlikti, skaičių.</p>

### 제한

<ul>
	<li>1 &le; K &le; N &le; 1 000</li>
	<li>1 &le; M &le; 1 000 000</li>
	<li>0 &le; D<sub>i</sub> &le; 1 000</li>
</ul>
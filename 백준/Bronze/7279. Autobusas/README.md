# [Bronze III] Autobusas - 7279

[문제 링크](https://www.acmicpc.net/problem/7279)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 379, 정답: 327, 맞힌 사람: 288, 정답 비율: 85.714%

### 분류

구현

### 문제 설명

<p>Autubuso mar&scaron;rutą sudaro N stotelių. Į pirmą stotelę autobusas atvažiuoja tiesiai i&scaron; parko, todėl jis visuomet būna tu&scaron;čias. Toliau kiekvienoje stotelėje į autobusą įlipa ir i&scaron;lipa kažkiek keleivių.</p>

<p>Keleiviai mėgsta sėdėti, tad jeigu autobuse yra laisvų sėdimų vietų &ndash; keleiviai atsisės, o stovės tik tada, kai nebus nei vienos laisvos sėdimos vietos. I&scaron; viso autobuse yra K sėdimų vietų.</p>

<p>Jums žinoma, kiek kiekvienoje stotelėje įlips ir i&scaron;lips keleivių. Raskite, kiek daugiausiai keleivių vienu metu turės stovėti autobuse.</p>

### 입력

<p>Pirmoje eilutėje pateikti du sveikieji skaičiai N ir K. N yra stotelių skaičius autobuso mar&scaron;rute, o K &ndash; sėdimų vietų skaičius autobuse.</p>

<p>Tolesnėse N eilučių pateikta po du skaičius a<sub>i</sub> ir b<sub>i</sub>. a<sub>i</sub> &ndash; tai stotelėje įlipsiančių keleivių skaičius, o b<sub>i</sub> &ndash; i&scaron;lipsiančių keleivių skaičius.</p>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; kiek daugiausiai keleivių turės stovėti autobuse vienu metu.</p>

### 제한

<ul>
	<li>2 &le; N &le; 1 000</li>
	<li>0 &le; a<sub>i</sub>, b<sub>i</sub>, K &le; 1 000</li>
</ul>
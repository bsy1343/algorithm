# [Gold III] Superjunaci - 25148

[문제 링크](https://www.acmicpc.net/problem/25148)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 스택

### 문제 설명

<p>Uz jednu dugačku ulicu na Manhattanu poredano je N nebodera raznih visina. Na vrhovima nekih nebodera nalaze se superjunaci koji imaju tajne velike moći.</p>

<p>Smatramo da superjunak s nebodera visine A metara može skočiti na drugi neboder samo ako je visina svih nebodera između tih dvaju nebodera (uključujući i neboder na koji skače) manja ili jednaka A metara. Neboder nazivamo nedostupnim ako niti jedan superjunak ne može skočiti na njega.</p>

<p>Poznate su visine nebodera i pozicije superjunaka. Odredi i ispi&scaron;i:</p>

<ol>
	<li>broj nedostupnih nebodera,</li>
	<li>koliko najvi&scaron;e superjunaka možemo ukloniti tako da broj nedostupnih nebodera ostane isti.</li>
</ol>

### 입력

<p>U prvom redu nalazi se prirodan broj N (1 &le; N &le; 300 000).</p>

<p>U drugom redu nalazi se N prirodnih brojeva manjih od 1 000 000 (i-ti broj označava visinu i-tog nebodera).</p>

<p>U trećem redu nalazi se N brojeva 0 ili 1. Ako je i-ti broj jednak 1 onda se superjunak nalazi na vrhu itog nebodera, a inače se ne nalazi.</p>

### 출력

<p>U prvi redak ispi&scaron;i odgovor na prvo pitanje iz teksta zadatka. U drugi redak ispi&scaron;i odgovor na drugo pitanje iz teksta zadatka.</p>

### 힌트

<p>Poja&scaron;njenje prvog test podatka: Jedini superjunak nalazi se na vrhu drugog nebodera koji ima visinu 3. On može skočiti na svoj neboder i neboder visine 1. Ne može skočiti na neboder visine 2 jer se između njih nalazi neboder visine 4.</p>

<p>Poja&scaron;njenje drugog test primjera: Jedini nedostupan neboder je neboder visine 5. Ako uklonimo superjunaka sa drugog nebodera onda bi prvi i drugi neboder postali nedostupni, a ako uklonimo superjunaka sa petog nebodera onda bi četvrti i peti neboder postali nedostupni, tako da ne možemo ukloniti niti jednog superjunaka, a da broj nedostupnih nebodera ostane isti.</p>

<p>Poja&scaron;njenje trećeg test primjera: Ako uklonimo superjunake sa 5. i 7. nebodera broj nedostupnih nebodera bi ostao 2. Primijetite da se sa nebodera visine 4 može skočiti na neboder visine 2 iako se između njih nalazi neboder visine 3.</p>
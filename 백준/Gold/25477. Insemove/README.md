# [Gold IV] Insemove - 25477

[문제 링크](https://www.acmicpc.net/problem/25477)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 18, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

자료 구조, 그리디 알고리즘, 해 구성하기, 우선순위 큐

### 문제 설명

<p>Dokoni programeri Tresni i Evomer od zabave kreiraju i razgrađuju niz brojeva. U početku bija&scaron;e prazan niz. Tresni Evomeru izdaje naredbe oblika:</p>

<ul>
	<li>&ldquo;ubaci broj $X$ u niz brojeva&rdquo;;</li>
	<li>&ldquo;izbaci broj iz niza brojeva&rdquo;.</li>
</ul>

<p>Evomer, kada čuje naredbu za ubacivanje, broj $X$ može ubaciti na početak ili na kraj niza, a kada čuje naredbu za izbacivanje, onda mora izbaciti broj koji je na početku niza.</p>

<p>Naredbe za izbacivanje mogu doći samo kada niz nije prazan.</p>

<p>Cilj ovog neobičnog ubijanja dosade je maksimizirati sumu izbačenih brojeva. Zabavi se i ti!</p>

### 입력

<p>U prvom retku je prirodan broj $N$ ($2 &le; N &le; 200\,000$), broj izdanih naredbi.</p>

<p>U sljedećih $N$ redaka su naredbe redom kojim ih je Tresni izdavao Evomeru. Naredba ubacivanja je oblika UBACI $X$ ($1 &le; X &le; 100\,000$), a naredba izbacivanja je oblika IZBACI.</p>

<p>Uvijek će postojati barem jedna naredba izbacivanja.</p>

### 출력

<p>U prvi redak ispi&scaron;i najveću moguću sumu izbačenih brojeva iz teksta zadatka.</p>

<p>U drugi redak ispi&scaron;i riječ sastavljenu od slova &lsquo;<code>P</code>&rsquo; i &lsquo;<code>K</code>&rsquo;, koji predstavljaju pozicije na koje je Evomer redom ubacivao brojeve u niz. &lsquo;<code>P</code>&rsquo; znači da je Evomer broj ubacio na početak, a &lsquo;<code>K</code>&rsquo; na kraj niza.</p>

<p>Ako postoji vi&scaron;e mogućih rje&scaron;enja, ispi&scaron;i bilo koje.</p>
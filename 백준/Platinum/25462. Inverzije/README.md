# [Platinum I] Inverzije - 25462

[문제 링크](https://www.acmicpc.net/problem/25462)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 191, 정답: 121, 맞힌 사람: 78, 정답 비율: 66.667%

### 분류

자료 구조, 세그먼트 트리, 오프라인 쿼리, mo's

### 문제 설명

<p>Neka je zadana permutacija $P$ duljine $N$. Permutacija duljine $N$ je niz čiji su elementi različiti prirodni brojevi od $1$ do $N$. Broj inverzija neke permutacije je broj parova $(i, j)$ takvih da je $1 &le; i &lt; j &le; N$ i $P_i &gt; P_j$.</p>

<p>Isto tako, broj inverzija permutacija $P$ na intervalu od a do b je broj parova $(i, j)$ takvih da je $a &le; i &lt; j &le; b$ i $P_i &gt; P_j$.</p>

<p>Tvoj zadatak je da za zadanu permutaciju $P$ i $M$ zadanih intervala odredi&scaron; broj inverzija na svakom od njih.</p>

### 입력

<p>U prvom su retku prirodni brojevi $N$ ($1 &le; N &le; 100\,000$) i $M$ ($1 &le; M &le; 100\,000$), brojevi iz teksta zadatka.</p>

<p>U drugom retku je $N$ različitih prirodnih brojeva $P_i$ ($1 &le; P_i &le; N$).</p>

<p>U sljedećih $M$ redaka su prirodni brojevi $a_i$ i $b_i$ ($1 &le; a_i &le; b_i &le; N$), granice intervala čiji broj inverzija tražimo.</p>

### 출력

<p>Za svaki od $M$ intervala ispi&scaron;i broj inverzija permutacije $P$ unutar njega.</p>

### 힌트

<p>Opis prvog probnog primjera: Na intervalu od $2$. do $3$. elementa nema inverzija jer je $3&lt;5$. Interval od $1$. do $5$. elementa je zapravo cijeli niz. Inverzije su u tom slučaju parovi elemenata s indeksima $(1, 2)$, $(1, 4)$, $(1, 5)$, $(2, 4)$, $(2, 5)$, $(3, 4)$ i $(3, 5)$.</p>
# [Gold III] Interval - 28588

[문제 링크](https://www.acmicpc.net/problem/28588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

이분 탐색, 값 / 좌표 압축, 파싱, 누적 합, 문자열

### 문제 설명

<p>Niz uzastopnih prirodnih brojeva između dva zadana prirodna broja $A$ i $B$ gdje je $A &le; B$ nazivamo intervalom i označavamo s $(A, B)$. Ako su brojevi $A$ i/ili $B$ uključeni u niz, tada umjesto oble zagrade koristimo uglatu zagradu. Promotrimo četiri moguća slučaja:</p>

<ul>
	<li>$(A, B)$ &ndash; svi prirodni brojevi $X$ za koje vrijedi $A &lt; X &lt; B$</li>
	<li>$[A, B)$ &ndash; svi prirodni brojevi $X$ za koje vrijedi $A &le; X &lt; B$</li>
	<li>$(A, B]$ &ndash; svi prirodni brojevi $X$ za koje vrijedi $A &lt; X &le; B$</li>
	<li>$[A, B]$ - svi prirodni brojevi $X$ za koje vrijedi $A &le; X &le; B$.</li>
</ul>

<p>Neka su zadana dva niza intervala. Odredi i ispi&scaron;i zbroj svih prirodnih brojeva koji se nalaze u prvom nizu intervala, a ne nalaze u drugom nizu.</p>

### 입력

<p>U prvom je retku niz intervala odvojenih zarezom i bez dodatnih razmaka. Svaki prirodan broj nalazit će se u najvi&scaron;e jednom od intervala i u svakom intervalu će se nalaziti barem jedan prirodan broj.</p>

<p>U drugom je retku niz intervala odvojenih zarezom i bez dodatnih razmaka. Svaki prirodan broj nalazit će se u najvi&scaron;e jednom od intervala i u svakom intervalu će se nalaziti barem jedan prirodan broj.</p>

<p>Broj intervala u svakom od redaka neće biti veći od $10^5$, a najveći prirodan broj obuhvaćen nekim od zadanih intervala neće biti veći od $10^9$.</p>

### 출력

<p>U prvi redak ispi&scaron;i traženi zbroj iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: Prirodni brojevi koji se nalaze u prvom nizu intervala, a ne nalaze u drugom su: $2$, $8$, $11$ i $12$. Zbroj je $33$.</p>
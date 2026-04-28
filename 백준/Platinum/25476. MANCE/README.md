# [Platinum III] MANCE - 25476

[문제 링크](https://www.acmicpc.net/problem/25476)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

다이나믹 프로그래밍, 문자열, KMP

### 문제 설명

<p>Programski jezik MANCE vrlo je jednostavan. Jedine <strong>dvije naredbe</strong> su:</p>

<ul>
	<li>ISPISI slovo: ispisuje odabrano slovo na ekran;</li>
	<li>PETLJA x { blok_naredbi }: x puta ponavlja blok naredbi koji se sastoji samo od naredbi ispisivanja, a može biti i prazan.</li>
</ul>

<p>Primjerice, program od četiri naredbe: PETLJA 2 { ISPISI &lsquo;K&rsquo; ISPISI &lsquo;O&rsquo; } ISPISI &lsquo;S&rsquo; ispisuje riječ KOKOS.</p>

<p>Zadana je riječ. Koji je <strong>najmanji broj naredbi</strong> programskog jezika MANCE potreban za ispisati ju?</p>

### 입력

<p>U prvom je retku riječ sastavljena od najvi&scaron;e 5000 velikih slova engleske abecede.</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i traženi najmanji broj iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera:</p>

<p>PETLJA 4 { ISPISI &lsquo;H&rsquo; ISPISI &lsquo;A&rsquo; }</p>

<p>Opis drugog probnog primjera:</p>

<p>PETLJA 2 { ISPISI &lsquo;B&rsquo; ISPISI &lsquo;L&rsquo; ISPISI &lsquo;A&rsquo; } PETLJA 3 { ISPISI &lsquo;A&rsquo; } PETLJA 2 { ISPISI &lsquo;B&rsquo; ISPISI &lsquo;L&rsquo; ISPISI &lsquo;A&rsquo; ISPISI &lsquo;A&rsquo; }</p>
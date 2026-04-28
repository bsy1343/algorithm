# [Gold II] Aia värvimine - 29866

[문제 링크](https://www.acmicpc.net/problem/29866)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 5, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

구현, 정렬, 스위핑

### 문제 설명

<p>Tom Sawyer on j&auml;lle suure pahandusega hakkama saanud ning t&auml;di Polly tahab saata teda aeda v&auml;rvima. Kuna Tomi ja tema pahade s&otilde;prade aiad on k&otilde;ik juba &uuml;le v&auml;rvitud, ja m&otilde;ned isegi korduvalt, tuleb n&uuml;&uuml;d v&auml;rvida nende naabrite aedu.</p>

<p>T&auml;naval, kus Tom elab, paiknevad majad &uuml;hel pool t&auml;navat ning on nummerdatud j&auml;rjestikuste t&auml;isarvudega alates $1$-st. T&auml;di Polly otsustab lasta &uuml;le v&auml;rvida k&otilde;igi nende majade aiad, mis paiknevad &uuml;limalt kaugusel $K$ Tomi v&otilde;i m&otilde;ne tema s&otilde;bra majast.</p>

### 입력

<p>Sisendi esimesel real on t&auml;isarv $K$ ($1 \le K \le 10^7$) ja teisel real juba v&auml;rvitud aedade arv $N$ ($1 \le N \le 10^5$). J&auml;rgmisel $N$ real on juba v&auml;rvitud aedade majanumbrid $M_i$, iga number eraldi real ($1 \le M_i &lt; 2^{63} - K$).</p>

### 출력

<p>V&auml;ljastada kasvavalt j&auml;rjestatud loetelu majanumbritest, mille aiad on veel v&auml;rvimata ja mis pole v&auml;rvitud aedadest kaugemal kui $K$. Kuna loetelu v&otilde;ib olla p&auml;ris pikk, v&auml;ljastade see pakitult: kahe v&otilde;i enama j&auml;rjestikuse majanumbri asemel v&auml;ljastada &uuml;hele reale esimene number, kaks punkti ja viimane number.</p>
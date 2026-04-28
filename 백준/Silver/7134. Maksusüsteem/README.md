# [Silver II] Maksusüsteem - 7134

[문제 링크](https://www.acmicpc.net/problem/7134)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 17, 맞힌 사람: 14, 정답 비율: 41.176%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>Umeerikas otsustati hiljuti minna &uuml;le astmelisele tulumaksus&uuml;steemile, mis koonseb $N$ maksu\-kategooriast (nummerdatud $1 \ldots N$). Igal kategoorial on maksustatava sissetuleku maht $C_i$ ja maksuprotsent $P_i$. Maksude maksmine k&auml;ib j&auml;rgmise s&uuml;steemiga: isik maksab oma aastasest sissetulekust esimese $C_1$ euro pealt $P_1$ protsenti, j&auml;rgmise $C_2$ euro pealt $P_2$ protsenti jne. On teada, et $C_N = \infty$, ehk kogu sissetulek on maksustatud.</p>

<p>Kirjutada programm, mis arvutab $M$ kliendile nende sissetulekutele vastavad maksusummad.</p>

### 입력

<p>Tekstifaili esimesel real on maksukategooriate arv $N$ ($1 \le N \le 10^5$). Teisel real on $N - 1$ t&auml;isarvu $C_i$ ($1 \le C_i \le 10^9$), kusjuures $C_N = \infty$ pole sisendis antud. Kolmandal real on $N$ t&auml;isarvu $P_i$ ($0 \le P_i \le 100$). Neljandal real on klientide arv $M$ ($1 \le M \le 10^5$). J&auml;rgmisel $M$ real on t&auml;isarvud $S_i$ ($0 \le S_i \le 10^9$), iga&uuml;ks eraldi real.</p>

### 출력

<p>Tekstifaili v&auml;ljastada t&auml;pselt $M$ rida, $i.$ reale sissetuleku $S_i$ pealt makstav maksusumma. Summades v&auml;ljastada t&auml;pselt kaks kohta p&auml;rast koma.</p>
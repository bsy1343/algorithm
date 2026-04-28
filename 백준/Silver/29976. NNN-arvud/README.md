# [Silver I] NNN-arvud - 29976

[문제 링크](https://www.acmicpc.net/problem/29976)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 11, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

백트래킹, 런타임 전의 전처리

### 문제 설명

<p>Me oleme harjunud kirjutama arve k&uuml;mnends&uuml;steemis. Kui me kirjutame <code>123</code>, siis tegelikult t&auml;histab see avaldist $1 \cdot 10^2 + 2 \cdot 10 + 3$.</p>

<p>&Uuml;ldisemalt on $N$-s&uuml;steemis kasutusel numbrid v&auml;&auml;rtustega $0$ kuni $N-1$ ja kirjutis $abc$ t&auml;histab avaldist $a \cdot N^2 + b \cdot N + c$. Kui $N &gt; 10$, kasutatakse $9$ j&auml;rel numbritena suuri ladina t&auml;hti ASCII kooditabeli j&auml;rjestuses (<code>A</code> = 10, <code>B</code> = 11, $\dots$, <code>Z</code> = 35). N&auml;iteks 16-s&uuml;steemi arv <code>F1</code> t&auml;hendab avaldist $15 \cdot 16 + 1$, mille v&auml;&auml;rtus 10-s&uuml;steemis kirjutatuna on muidugi $241$.</p>

<p>Nimetame $N$-kohaliseks NNN-arvuks sellist $N$-s&uuml;steemi arvu, mille &uuml;heliste kohal on numbri $1$ esinemiste arv selles arvus, k&uuml;mneliste kohal numbri $2$ esinemiste arv jne. Arvu vasakpoolseim number on nullide arv.</p>

### 입력

<p>Tekstifaili ainsal real on (k&uuml;mnends&uuml;steemis) t&auml;isarv $N$ ($2 \le N \le 36$).</p>

### 출력

<p>Tekstifaili v&auml;ljastada kasvavas j&auml;rjestuses k&otilde;ik $N$-kohalised NNN-arvud, iga&uuml;ks eraldi reale. Kui selliseid ei leidu, v&auml;ljastada faili ainsale reale tekst <code>EI OLE</code>.</p>
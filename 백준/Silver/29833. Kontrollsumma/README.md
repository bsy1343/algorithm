# [Silver II] Kontrollsumma - 29833

[문제 링크](https://www.acmicpc.net/problem/29833)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 9, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

애드 혹

### 문제 설명

<p>Kontrollsummad aitavad tuvastada vigu andmete edastamisel v&otilde;i sisestamisel. Selleks on leiutatud palju erinevaid algoritme. Siin &uuml;lesandes vaatame &uuml;hte lihtsaimat neist: arvujada $(A_1, A_2, \ldots)$ kontrollsumma on $$(A_1 \cdot K_1 + A_2 \cdot K_2 + \ldots + A_N \cdot K_N + A_{N+1} \cdot K_1 + \ldots) \bmod 10,$$ kus $K_1, K_2, \ldots, K_N$ on mingid konstandid. Pane t&auml;hele, et jada $K$ k&auml;sitletakse perioodilisena: kui $A$ pikkus &uuml;letab $K$ pikkust, kasutatakse $K$ elemente algusest peale uuesti. Kui $A$ on l&uuml;hem, siis j&auml;&auml;vad m&otilde;ned $K$ elemendid lihtsalt kasutamata.</p>

<p>Juku leidis s&uuml;steemi, mis kasutab eelkirjeldatud kontrollsummat. Aga ta ei tea, milline on selles s&uuml;steemis jada $K$ pikkus $N$ v&otilde;i selle elementide $K_i$ v&auml;&auml;rtused. Ta teab ainult, et $N \le 1\,000$ ja $1 \le K_i \le 9$. Juku saab teha s&uuml;steemile p&auml;ringuid. Iga p&auml;ring on mingi arvujada ja s&uuml;steem annab vastuseks selle jada kontrollsumma. Juku klaviatuuril on klahv 0 natuke katki ja seet&otilde;ttu on seda numbrit raskem sisestada. Sellep&auml;rast sooviks ta p&auml;ringutes numbrit 0 mitte kasutada.</p>

<p>Kirjuta Jukule programm, mis leiab jada $K$ pikkuse ja selle elementide v&auml;&auml;rtused. $K$ perioodilisuse t&otilde;ttu on v&otilde;imalike vastuseid l&otilde;pmata palju; v&auml;ljastada neist k&otilde;ige l&uuml;hem.</p>

### 입력



### 출력


# [Gold IV] Mötet - 24192

[문제 링크](https://www.acmicpc.net/problem/24192)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 12, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

정렬, 스위핑

### 문제 설명

<p>En styrelse med $N$ medlemmar planerar att ha ett m&ouml;te. P&aring; grund av det stora antalet styrelseledam&ouml;ter &auml;r det sv&aring;rt att hitta en tid som passar alla, men man vill g&auml;rna att s&aring; m&aring;nga personer som m&ouml;jligt kan vara med p&aring; m&ouml;tet.</p>

<p>Varje ledamot &auml;r tillg&auml;nglig under ett antal olika tidsintervall, d&auml;r varje tidsintervall $[a, b]$ betyder att ledam&ouml;ten kan n&auml;rvara om <strong>m&ouml;tet startar vid n&aring;gon tid</strong> $t$ d&auml;r $a \le t \le b$. Eftersom vissa ledam&ouml;ter &auml;r v&auml;ldigt slarviga med sina kalendrar kan en och samma ledamot r&aring;ka ge dig olika tidsintervall som &ouml;verlappar, t.ex $[1, 3]$ och $[2, 4]$, &auml;ven om det haed r&auml;ckt med ett enda intervall, i detta fall $[1, 4]$.</p>

<p>Ber&auml;kna det st&ouml;rsta antalet ledam&ouml;ter som kan delta p&aring; m&ouml;tet.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($1 \le N \leq 2\cdot 10^5$), antalet ledam&ouml;ter i styrelsen.</p>

<p>D&auml;refter f&ouml;ljer $N$ rader, en f&ouml;r varje styrelseledamot. Den $i$:te raden b&ouml;rjar med antalet tidsintervall $m_i$ ($1 \leq m_i \leq 2\cdot 10^5$) som den $i$:te ledam&ouml;ten kan n&auml;rvara under. Detta f&ouml;ljs av $m_i$ par av heltal, ett f&ouml;r varje intervall. Dessa par $a, b$ ($0 \le a \le b \le 10^9$) representerar intervallet $[a, b]$.</p>

<p>L&aring;t $B=\sum_{i=1}^{N} m_i$ vara summan av antalet tidsintervall som alla ledam&ouml;ter &auml;r tillg&auml;ngliga under. D&aring; g&auml;ller det att $B \leq 2\cdot 10^5$.</p>

### 출력

<p>Skriv ut en rad med ett heltal -- det st&ouml;rsta antalet ledam&ouml;ter som kan delta i m&ouml;tet om starttiden v&auml;ljs optimalt.</p>

### 힌트

<p>I det f&ouml;rsta exemplet kan vi v&auml;lja att starta m&ouml;tet vid tiden $4$, d&aring; ledamot $2$ och $3$ kan delta. Fallet skulle kunna vara med i samtliga testfallsgrupper.</p>

<p>Exempel $2$ och $3$ skulle inte kunna f&ouml;rekomma i testfallsgrupp $2$ eller $3$.</p>
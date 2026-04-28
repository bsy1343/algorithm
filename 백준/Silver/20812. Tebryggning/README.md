# [Silver V] Tebryggning - 20812

[문제 링크](https://www.acmicpc.net/problem/20812)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 44, 맞힌 사람: 37, 정답 비율: 67.273%

### 분류

그리디 알고리즘

### 문제 설명

<p>Egon ska brygga massor av te till $N$ programmeringsolympiadsdeltagare. Han har $K$ p&aring;sar te, alla av olika sorter. P&aring;se $i$ har te f&ouml;r $x_i$ personer. Det &auml;r garanterat att p&aring;sarna sammanlagt r&auml;cker till minst $N$ personer.</p>

<p>Egon t&auml;nker anv&auml;nda bryggkannor som har plats f&ouml;r te till maximalt 10 personer. Eftersom p&aring;sarna &auml;r av olika sort g&aring;r det inte att blanda flera p&aring;sar i samma kanna. Dock kan samma p&aring;se anv&auml;ndas till flera kannor. Hur m&aring;nga kannor m&aring;ste Egon anv&auml;nda?</p>

### 입력

<p>P&aring; den f&ouml;rsta raden st&aring;r tv&aring; heltal $1 \le K \le 10$ och $1 \le N \le 100$ -- antalet tep&aring;sar Egon har och antalet programmeringsolympiadsdeltagare. P&aring; den andra raden st&aring;r $K$ heltal $1 \le x_1, x_2, \dots, x_K \le 100$, antal personer som varje p&aring;se r&auml;cker till.</p>

### 출력

<p>Programmet ska skriva ut ett heltal: det minsta antalet tekannor Egon m&aring;ste anv&auml;nda.&nbsp;</p>

### 힌트

<p>I exempel 1 v&auml;ljer Egon att brygga tv&aring; kannor med f&ouml;rsta tep&aring;sen och tv&aring; kannor med tredje tep&aring;sen. Det ger $20+17$ koppar te, vilket r&auml;cker till de 36 deltagarna.</p>

<p>I exempel 2 &auml;r det optimala att brygga sex kannor med f&ouml;rsta tep&aring;sen, tre kannor med tredje tep&aring;sen och tv&aring; med den fj&auml;rde tep&aring;sen. Det ger $54+30+16$ koppar te, vilket r&auml;cker till de 100 &nbsp;deltagarna.</p>
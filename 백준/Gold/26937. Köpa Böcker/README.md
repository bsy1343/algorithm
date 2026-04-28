# [Gold III] Köpa Böcker - 26937

[문제 링크](https://www.acmicpc.net/problem/26937)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>Du ska k&ouml;pa $N$ b&ouml;cker av olika slag (numrerade fr&aring;n $1$ till $N$) och kollar d&auml;rf&ouml;r runt hos internetbokhandlarna. Varje bok finns hos minst en bokhandel och kan variera i pris mellan de olika bokhandlarna. Dessutom kostar det ett visst belopp i porto att best&auml;lla fr&aring;n varje bokhandel, oavsett hur mycket man best&auml;ller. Skriv ett program som ber&auml;knar det minimala beloppet b&ouml;ckerna kostar dig, inr&auml;knat porto. Du kan best&auml;lla fr&aring;n hur m&aring;nga bokhandlar som helst.</p>

### 입력

<p>F&ouml;rsta raden inneh&aring;ller tv&aring; tal: $N$, antalet b&ouml;cker du ska k&ouml;pa $(1 \le N \le 100$), och $M$, antalet bokhandlar $(1 \le M \le 15)$. D&auml;refter f&ouml;ljer en rad med tv&aring; tal som anger antalet b&ouml;cker $K$ (av de efters&ouml;kta) som finns i f&ouml;rsta bokhandeln, samt portot f&ouml;r denna bokhandel. Detta f&ouml;ljs av $K$ rader inneh&aring;llande tv&aring; tal: numret p&aring; en bok som finns i bokhandeln och dess pris.</p>

<p>Denna information upprepas sedan f&ouml;r &aring;terst&aring;ende bokhandlar. Alla priser och porton anges i hela kronor, och &ouml;verstiger inte $10\,000$. Bokpriser &auml;r alltid positiva, medan portot kan vara gratis i vissa butiker.</p>

### 출력

<p>Programmet ska skriva ut det minimala beloppet b&ouml;ckerna kostar, inr&auml;knat portokostnaden f&ouml;r alla bokhandlar du best&auml;ller fr&aring;n.</p>
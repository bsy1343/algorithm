# [Gold II] Longest increasing pub-sequence - 26961

[문제 링크](https://www.acmicpc.net/problem/26961)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 기하학, 정렬

### 문제 설명

<p>Elise har just b&ouml;rjat p&aring; Stackk&ouml;pings Tekniska H&ouml;gskola (STH), och som en del av mottagningen ordnas en traditionell pubrunda. En pubrunda g&aring;r ut p&aring; att man bes&ouml;ker alla sektionslokaler och dricker n&aring;got p&aring; varje st&auml;lle. Elise och hennes kompisar dricker inte alkohol, men d&auml;remot gillar de att g&aring; l&aring;nga str&auml;ckor. D&auml;rf&ouml;r t&auml;nker de utforma en runda med s&aring; m&aring;nga bes&ouml;k som m&ouml;jligt, s&aring;dan att avst&aring;nden de g&aring;r mellan lokalerna &auml;r strikt &ouml;kande. Din uppgift &auml;r att hitta maximala antalet bes&ouml;k de kan uppn&aring;.</p>

<p>Sektionslokalerna finns p&aring; punkter i planet med heltalskoordinater. Elise och hennes kompisar g&aring;r alltid kortaste avst&aring;ndet mellan tv&aring; lokaler. Avst&aring;ndet &auml;r det vanliga Euklidiska, dvs. $\sqrt{(x_1 - x_2)^2 + (y_1 - y_2)^2}$. De f&aring;r b&ouml;rja vid vilken lokal som helst. Det &auml;r till&aring;tet att bes&ouml;ka samma sektionslokal flera g&aring;nger, och det r&auml;knas som separata bes&ouml;k. D&auml;remot f&aring;r de inte bes&ouml;ka samma st&auml;lle tv&aring; g&aring;nger p&aring; raken.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6dc07ce3-c5a2-42d3-a22a-b2632fa01f62/-/preview/" style="width: 271px; height: 230px;" /></p>

<p style="text-align: center;">Bilden f&ouml;rest&auml;ller Exempel 1. Om du startar vid $(1,0)$ och g&aring;r l&auml;ngs med de r&ouml;da pilarna f&aring;r du en runda med $6$ bes&ouml;k, vilket ocks&aring; &auml;r det maximala antalet.</p>

### 입력

<p>F&ouml;rsta raden inneh&aring;ller ett heltal $N$, antalet sektionslokaler ($2 \leq N \leq 2000$). De f&ouml;ljande $N$ raderna inneh&aring;ller tv&aring; heltal $x_i, y_i$, koordinater f&ouml;r varje sektionslokal ($0 \leq x_i, y_i \leq 10^9$).</p>

### 출력

<p>Skriv ut ett heltal, maximala antalet bes&ouml;k Elise och hennes kompisar kan g&ouml;ra om avst&aring;nden mellan punkterna &auml;r strikt &ouml;kande.</p>
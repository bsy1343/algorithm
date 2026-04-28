# [Silver V] Skattkartan - 20861

[문제 링크](https://www.acmicpc.net/problem/20861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 52, 맞힌 사람: 47, 정답 비율: 78.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Paulina gillar Japan, j&auml;ttemycket. Under en semester i Tokyo bes&ouml;ker hon en n&ouml;jespark d&auml;r det finns en stor labyrint. F&ouml;r att navigera i labyrinten f&aring;r Paulina en skattkarta som hon f&ouml;ljer.</p>

<p>P&aring; skattkartan &auml;r varje ruta markerad med pilar f&ouml;r att visa &aring;t vilket h&aring;ll man ska g&aring; fr&aring;n den rutan.</p>

<p>Paulina b&ouml;rjar alltid i den ruta som befinner sig l&auml;ngst upp till v&auml;nster p&aring; skattkartan, och f&ouml;ljer d&auml;refter pilarna. I labyrinten finns det tv&aring; olika m&aring;l: en bit smaskig laxsushi, samt en l&auml;skig samuraj. Det kan ocks&aring; h&auml;nda att skattkartan leder runt Paulina i en o&auml;ndlig cykel av rutor s&aring; hon aldrig n&aring;r ett m&aring;l.</p>

<p>Kan du hj&auml;lpa Paulina att avg&ouml;ra vilket m&aring;l hon n&aring;r, eller om hon kommer g&aring; runt i all o&auml;ndlighet.</p>

### 입력

<p>Indatan b&ouml;rjar med en rad som inneh&aring;ller antalet rader $R$ ($1 \le R \le 100$)&nbsp;i skattkartan. D&auml;refter f&ouml;ljer en rad som inneh&aring;ller antalet kolumner $C$ ($1 \le C \le 100$) i skattkartan. Slutligen f&ouml;ljer $R$ rader som alla inneh&aring;ller $C$ tecken vardera -- sj&auml;lva skattkartan.</p>

<p>F&ouml;ljande tecken f&ouml;rekommer i skattkartan:</p>

<ul>
	<li>&quot;<code>&lt;</code>&quot; -- ruta med v&auml;nsterpil,</li>
	<li>&quot;<code>&gt;</code>&quot; -- ruta med h&ouml;gerpil,</li>
	<li>&quot;<code>v</code>&quot; -- ruta med ned&aring;tpil,</li>
	<li>&quot;$\wedge$&quot; -- ruta med upp&aring;tpil,</li>
	<li>&quot;<code>A</code>&quot; -- rutan sushin befinner sig p&aring;,</li>
	<li>&quot;<code>B</code>&quot; -- rutan samurajen befinner sig p&aring;.</li>
</ul>

<p>Paulina b&ouml;rjar p&aring; den f&ouml;rsta rutan i den f&ouml;rsta raden av skattkartan. Skattkartan &auml;r konstruerad s&aring; att Paulina aldrig kommer l&auml;mna labyrinten n&auml;r hon f&ouml;ljer pilarna.</p>

### 출력

<p>Ditt program ska skriva ut en enda rad med texten&nbsp;</p>

<ul>
	<li>&quot;<code>sushi</code>&quot; om hon n&aring;r sushin genom att f&ouml;lja pilarna,</li>
	<li>&quot;<code>samuraj</code>&quot; om hon n&aring;r samurajen genom att f&ouml;lja pilarna,</li>
	<li>&quot;<code>cykel</code>&quot; om hon kommer springa runt i all o&auml;ndlighet genom att f&ouml;lja pilarna.</li>
</ul>
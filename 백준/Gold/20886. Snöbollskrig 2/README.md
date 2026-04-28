# [Gold III] Snöbollskrig 2 - 20886

[문제 링크](https://www.acmicpc.net/problem/20886)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

이분 탐색

### 문제 설명

<p>Under IOI har Sverige och Finland sn&ouml;bollskrig mot varandra. Det g&aring;r till p&aring; f&ouml;ljande s&auml;tt:</p>

<ul>
	<li>N&aring;gon av l&auml;nderna, l&aring;t s&auml;ga Finland, tar och kastar en sn&ouml;boll mot det andra.</li>
	<li>Sverige svarar d&aring; med att kasta en <em>&auml;nnu st&ouml;rre</em> sn&ouml;boll tillbaka (i sj&auml;lvf&ouml;rsvar).</li>
	<li>Vilket f&aring;r Finland att ocks&aring; kasta en st&ouml;rre sn&ouml;boll tillbaka.</li>
	<li>... och s&aring; h&aring;ller det p&aring;, &auml;nda till n&aring;got land missar (vilket kan h&auml;nda redan i f&ouml;rsta kastet).</li>
	<li>Allting b&ouml;rjar d&auml;refter om, m&ouml;jligen med en mindre sn&ouml;boll och ett annat land som kastar den.</li>
</ul>

<p>Efter att sn&ouml;bollskriget &auml;r &ouml;ver kommer lagledarna f&ouml;r n&aring;gra av de &ouml;vriga l&auml;nderna till platsen. De ser resterna av kastade sn&ouml;bollar p&aring; marken och blir alldeles f&ouml;rf&auml;rade &ouml;ver m&auml;ngderna. Det h&auml;r ska upp p&aring; n&auml;sta IOI-styrelsem&ouml;te! N&aring;gon f&ouml;resl&aring;r ett svenskt-finskt godisf&ouml;rbud under t&auml;vlingen som straff. Sverige och Finland f&ouml;rsvarar sig: det var ju bara sj&auml;lvf&ouml;rsvar!</p>

<p>Givet storlekarna p&aring; sn&ouml;bollarna som kastats i de olika riktningarna, hur m&aring;nga av dem kan som mest ha kastats i sj&auml;lvf&ouml;rsvar?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; tal $N$ och $M$, $1 \le N,M \le 100\,000$. Den andra raden inneh&aring;ller $N$ tal $a_i$ ($1 \le a_i \le 1\,000\,000$): storlekarna p&aring; sn&ouml;bollarna som Sverige kastade. Den tredje raden inneh&aring;ller $M$ tal $b_i$ ($1 \le b_i \le 1\,000\,000$): storlekarna p&aring; sn&ouml;bollarna som Finland kastade.</p>

<p>B&aring;da sekvenserna kommer att vara givna i stigande ordning.</p>

### 출력

<p>Du ska skriva ut ett tal: antal sn&ouml;bollar som h&ouml;gst kan ha kastats i sj&auml;lvf&ouml;rsvar.</p>

### 힌트

<p>I det f&ouml;rsta exempelfallet s&aring; har Sverige kastat fyra sn&ouml;bollar, av storlek 1, 3, 4 och 5 respektive, och Finland kastat tv&aring; sn&ouml;bollar av storlekar 2 och 3.</p>

<p>Det skulle t.ex. kunna skett genom att Sverige b&ouml;rjade med att kasta en sn&ouml;boll av storlek 1 p&aring; Finland, som i sj&auml;lvf&ouml;rsvar kastar tillbaka en av storlek 2, varav Sverige svarar med en av storlek 3 och missar. Finland kastar d&auml;refter sin kvarvarande sn&ouml;boll av storlek 2, och Sverige svarar med en av storlek 4, och missar igen. Sverige missar &auml;ven med sin sista sn&ouml;boll av storlek 5. Totalt kastades 3 av sn&ouml;bollarna i sj&auml;lvf&ouml;rsvar.</p>

<p>I det andra exempelfallet s&aring; kan ingen av sn&ouml;bollarna ha varit i sj&auml;lvf&ouml;rsvar, eftersom en s&aring;dan sn&ouml;boll m&aring;ste vara st&ouml;rre &auml;n den tidigare.</p>
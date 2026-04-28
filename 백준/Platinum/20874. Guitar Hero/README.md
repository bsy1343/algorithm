# [Platinum IV] Guitar Hero - 20874

[문제 링크](https://www.acmicpc.net/problem/20874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 19, 맞힌 사람: 13, 정답 비율: 40.625%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 두 포인터

### 문제 설명

<p>I PO-juryns 100% originella spel String Instrument Champion visas noter i en l&aring;t som punkter p&aring; en gitarrs str&auml;ngar. Noterna representeras som heltal, d&auml;r heltalet representerar tonh&ouml;jden hos noten. Inga tv&aring; noter spelas samtidigt i n&aring;gon av String Instrument Champion&#39;s l&aring;tar.</p>

<p>En l&aring;t kan inneh&aring;lla m&aring;nga fler noter &auml;n det finns str&auml;ngar p&aring; gitarren. D&auml;rf&ouml;r placerar vi ut noterna p&aring; st&auml;ngarna enligt en viss upps&auml;ttning regler. Det g&aring;r bra ibland, men inte alltid. N&auml;r vi placerar ut noterna p&aring; str&auml;ngarna har vi f&ouml;ljande krav:</p>

<ul>
	<li>Den f&ouml;rsta noten f&aring;r vara p&aring; valfri str&auml;ng.</li>
	<li>Om den senaste noten hade l&auml;gre tonh&ouml;jd &auml;n n&auml;sta not, s&aring; m&aring;ste n&auml;sta not vara p&aring; en h&ouml;gre str&auml;ng.</li>
	<li>Om den senaste noten hade h&ouml;gre tonh&ouml;jd &auml;n n&auml;sta not, s&aring; m&aring;ste n&auml;sta not vara p&aring; en l&auml;gre str&auml;ng.</li>
	<li>Om den senaste noten hade samma tonh&ouml;jd som n&auml;sta not, s&aring; m&aring;ste n&auml;sta not vara p&aring; samma str&auml;ng.</li>
</ul>

<p>Du f&aring;r en l&aring;t med $n$ 1-indexerade toner, och gitarren har $m$ str&auml;ngar. Du f&aring;r ocks&aring; $q$ intervall i l&aring;ten. Ett intervall representeras av heltalen $a$ och $b$, d&auml;r f&ouml;rsta noten i intervallet har index $a$ och sista noten index $b$.</p>

<p>F&ouml;r varje intervall undrar vi nu: &auml;r det m&ouml;jligt att placera ut de noter som &auml;r med i intervallet p&aring; str&auml;ngar s&aring; att kraven &auml;r uppfyllda?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $n$, $m$ och $q$ ($1 \leq n, m, q \leq 10^5$). Den andra raden inneh&aring;ller $n$ heltal $t_i$ ($1 \leq t_i \leq 10^9$). Sen f&ouml;ljer $q$ rader med tv&aring; heltal $a_i$ och $b_i$ vardera ($1 \leq a_i \leq b_i \leq n$).</p>

### 출력

<p>Du ska skriva ut $q$ rader med &quot;ja&quot; eller &quot;nej&quot;, en f&ouml;r varje intervall. Raden ska inneh&aring;lla &quot;ja&quot; om det &auml;r m&ouml;jligt att placera ut noterna i intervallet $a_i$ till $b_i$ s&aring; att kraven &auml;r uppfyllda, annars &quot;nej&quot;.</p>
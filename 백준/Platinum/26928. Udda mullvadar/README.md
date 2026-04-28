# [Platinum I] Udda mullvadar - 26928

[문제 링크](https://www.acmicpc.net/problem/26928)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

수학, 자료 구조, 집합과 맵, 비트마스킹, 해시를 사용한 집합과 맵, 분할 정복

### 문제 설명

<p>Axel har en o&auml;ndlig endimensionell tr&auml;dg&aring;rd som l&ouml;per &ouml;ver tallinjen. Eftersom han inte orkar l&auml;gga f&ouml;r mycket tid p&aring; att sk&ouml;ta om den (en o&auml;ndlig tr&auml;dg&aring;rd kr&auml;ver en hel del tid) s&aring; &auml;r den dock full med mullvadar. N&auml;rmare best&auml;mt s&aring; bor det en mullvad p&aring; varje position $x$, d&auml;r $x$ &auml;r ett heltal (&auml;ven negativa heltal). Vi kallar mullvaden p&aring; position $x$ f&ouml;r $m_x$.</p>

<p>Detta st&ouml;r inte Axel s&aring; l&auml;nge mullvadarna &auml;r lugna och h&aring;ller sig i sina bon, men d&aring; och d&aring; s&aring; f&aring;r mullvadarna f&ouml;r sig att b&ouml;rja festa och allting sp&aring;rar ur. En mullvadsfest g&aring;r till p&aring; f&ouml;ljande s&auml;tt:</p>

<ol>
	<li>Vid tid $t=0$ startar n&aring;gra mullvadar festen genom att sticka upp sina huvuden ovanf&ouml;r marken och dansa p&aring; st&auml;llet. Detta r&auml;knas f&ouml;r mullvadar som att vara aktiv i festen.</li>
	<li>F&ouml;r varje tidpunkt $t &gt; 0$ s&aring; best&auml;mmer sig varje mullvad f&ouml;r om de ska vara aktiva eller inte, baserat p&aring; hur festen s&aring;g ut vid tidpunkt $t-1$. Eftersom de gillar udda tal s&aring; kommer mullvad $m_i$ att vara aktiv vid tidpunkt $t$ om det vid tidpunkt $t-1$ var ett udda antal (1 eller 3) aktiva mullvadar i n&auml;rheten. I n&auml;rheten av $m_i$ r&auml;knas dels $m_i$ sj&auml;lv samt dess tv&aring; grannar ett steg till h&ouml;ger respektive v&auml;nster, $m_{i-1}$ och $m_{i+1}$.</li>
</ol>

<p>F&ouml;r att Axel ska hinna stoppa festen i tid beh&ouml;ver han veta hur m&aring;nga mullvadar som kommer vara aktiva vid en viss tid $t$. Hj&auml;lp honom genom att r&auml;kna ut detta.</p>

### 입력

<p>P&aring; f&ouml;rsta raden finns en str&auml;ng best&aring;ende av $N$ tecken som beskriver omr&aring;det d&auml;r festen startar, &quot;<code>A</code>&quot; f&ouml;r en aktiv mullvad och &quot;<code>.</code>&quot; f&ouml;r en inaktiv. Notera att detta bara &auml;r omr&aring;det d&auml;r festen startar, det &auml;r inte garanterat att festen stannar inom detta omr&aring;de. Den andra raden best&aring;r av talet $t$.</p>

### 출력

<p>Skriv ut ett tal p&aring; en rad, antalet aktiva mullvadar vid tid $t$.</p>

### 제한

<ul>
	<li>godtyckligt m&aring;nga mullvadar kan starta festen,</li>
	<li>$1 \leq N \leq 100$</li>
	<li>$0 \leq t \leq 10^{18}$</li>
</ul>

### 힌트

<p>Nedan f&ouml;ljer en illustration av en exempelfest (Exempelindata 1):</p>

<ul>
	<li>$t=0$: <code>..A.AAA..</code></li>
	<li>$t=1$: <code>.AA..A.A.</code></li>
	<li>$t=2$: <code>A..AAA.AA</code></li>
</ul>
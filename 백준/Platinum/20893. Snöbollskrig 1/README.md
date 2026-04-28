# [Platinum V] Snöbollskrig 1 - 20893

[문제 링크](https://www.acmicpc.net/problem/20893)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>I en <a href="https://sv.wikipedia.org/wiki/Graf_(grafteori)">oriktad</a>, viktad graf&nbsp;med $N$ noder leker $L$ l&auml;nder sn&ouml;bollskrig under IOI. I b&ouml;rjan har varje land ett fort i n&aring;gon nod.</p>

<p>Vid tid $0$ b&ouml;rjar varje land ge sig ut p&aring; sn&ouml;bollskrig. Sn&ouml;bollskrig fungerar s&aring;h&auml;r:</p>

<ul>
	<li>Om ett land &auml;ger ett fort beger sig t&auml;vlanden fr&aring;n landet ut l&auml;ngs alla kanter fr&aring;n fortet, alla med samma hastigheter.</li>
	<li>Om tv&aring; l&auml;nder m&ouml;ts l&auml;ngs en kant stannar l&auml;nderna och krigar (f&ouml;r alltid).</li>
	<li>Om tv&aring; l&auml;nder m&ouml;ts i en nod stannar l&auml;nderna och krigar (f&ouml;r alltid).</li>
	<li>Om ett land n&aring;r en nod d&auml;r l&auml;nder redan krigar, g&aring;r det med i kriget.</li>
	<li>Om ett land n&aring;r en nod f&ouml;re n&aring;got annat land bygger det landet ett fort i noden, och beger sig d&auml;refter ut l&auml;ngs kanterna fr&aring;n noden enligt regel 1.</li>
</ul>

<p>Notera att reglerna medf&ouml;r att h&ouml;gst ett land kan ha ett fort i en viss nod. Om tv&aring; l&auml;nder kommer till en nod samtidigt kommer de deltagare som kom till noden stanna d&auml;r och kriga o&auml;ndligt l&auml;nge, utan att bege sig vidare.</p>

<p>Avg&ouml;r vilka par av l&auml;nder som kommer kriga mot varandra.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $N,L,M$ ($2 \le N \le 100\,000, 2 \le L \le 50, 1 \le M \le 100\,000$): antal noder, antal l&auml;nder och antal kanter i grafen, respektive. D&auml;refter f&ouml;ljer $L$ rader med heltal, som s&auml;ger vilken nod varje lands startbas &auml;r p&aring;. Sist f&ouml;ljer $M$ rader med vardera tre heltal $a, b, w$ ($0 \le a,b &lt; N, a \neq b, 1 \le w \le 2\,000$). Detta betyder att det finns en (oriktad) kant mellan noder $a$ och $b$ (noll-indexerade), av l&auml;ngd $w$.</p>

<p>Det kommer h&ouml;gst finnas en kant mellan varje par av noder, och inga tv&aring; l&auml;nder kommer att starta p&aring; samma nod.</p>

### 출력

<p>F&ouml;r varje par av l&auml;nder $a, b$ som krigar ska du skriva ut en rad <code>a b</code>, d&auml;r $a &lt; b$ och l&auml;nderna indexeras fr&aring;n 0. Dessa ska skrivas ut i sorterad ordning, sorterat efter det f&ouml;rsta indexet f&ouml;rst. Om exempelvis $L = 3$ och alla tre l&auml;nder krigar ska du skriva ut:</p>

<pre>
0 1
0 2
1 2</pre>
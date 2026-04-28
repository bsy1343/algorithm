# [Silver IV] Vandrarhem - 26890

[문제 링크](https://www.acmicpc.net/problem/26890)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 40, 맞힌 사람: 30, 정답 비율: 69.767%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Arash ska anordna en onsitefinal f&ouml;r PO, Potatisskalarolympiaden. Det kommer att komma $N$ deltagare och Arash ska nu boka boende f&ouml;r de t&auml;vlande. Arash har siktat in sig p&aring; ett n&auml;rliggande vandrarhem f&ouml;r att boka b&auml;ddplatserna som beh&ouml;vs.</p>

<p>Det finns $M$ typer av b&auml;ddar. F&ouml;r en given b&auml;ddtyp $i$ s&aring; kostar en b&auml;dd $c_i$ kronor och det finns $b_i$ tillg&auml;ngliga b&auml;ddar av den typen. Vandrarhemmet har inga nuvarande bokningar, s&aring; det &auml;r fritt fram att boka s&aring; mycket som beh&ouml;vs.</p>

<p>Den svenska potatisskalarolympiaden &auml;r inte s&aring; duktiga p&aring; matematik, och beh&ouml;ver nu din hj&auml;lp. De vill veta den minimala m&ouml;jliga kostnaden f&ouml;r att boka de b&auml;ddar som beh&ouml;vs p&aring; vandrarhemmet. Kan du hj&auml;lpa dem?</p>

### 입력

<p>F&ouml;rsta raden best&aring;r av tv&aring; heltal, antalet deltagare $N$ ($1 \leq N \leq 100$) samt antalet b&auml;ddtyper $M$ ($1 \leq M \leq 5$). Sedan f&ouml;ljer $M$ rader, vardera med talen $c_i$ ($100 \leq c_i \leq 1000$) och $b_i$ ($1 \leq b_i \leq 100$) som beskrivet ovan.</p>

<p>Det kommer alltid finnas b&auml;ddar s&aring; det r&auml;cker f&ouml;r alla deltagare.</p>

### 출력

<p>Skriv ut ett heltal p&aring; en rad: den minsta m&ouml;jliga kostnaden f&ouml;r den svenska Potatisskalarolympiaden att hyra p&aring; vandrarhemmet f&ouml;r en natt.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 100, 1 \leq M \leq 5, 100 \leq c_i \le 1000, 1 \leq b_i \leq 100$</li>
</ul>

### 힌트

<p>L&aring;t oss f&ouml;rklara det f&ouml;rsta indataexemplet. Du k&ouml;per slut p&aring; de $8$ billigaste b&auml;ddarna f&ouml;r en total kostnad p&aring; $2400$, sedan k&ouml;per du tv&aring; av de lite dyrare b&auml;ddarna f&ouml;r en total kostnad p&aring; $1000$. Slutpriset blir $3400$.</p>
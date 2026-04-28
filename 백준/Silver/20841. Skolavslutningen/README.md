# [Silver III] Skolavslutningen - 20841

[문제 링크](https://www.acmicpc.net/problem/20841)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 23, 맞힌 사람: 19, 정답 비율: 32.759%

### 분류

그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>Skolledningen har st&ouml;tt p&aring; ett problem med den kommande skolavslutningen, ett problem som de hoppas att du kan hj&auml;lpa dem att l&ouml;sa. Under skolavslutningen kommer eleverna st&aring; uppst&auml;llda i $N$ rader med $M$ elever i varje. Ledningen vill att avslutningen ska vara s&aring; f&auml;rgglad som m&ouml;jligt och kommer d&auml;rf&ouml;r att dela ut hattar i olika f&auml;rger till eleverna.</p>

<p>F&ouml;r att uppst&auml;llningen ska se fin ut &auml;r det viktigt att alla elever i samma kolumn har samma hattf&auml;rg. F&ouml;r att ingen ska k&auml;nna sig utanf&ouml;r &auml;r det ocks&aring; viktigt att alla elever i samma klass har samma hattf&auml;rg. Rad och kolumn f&ouml;r varje elev &auml;r redan best&auml;mt, men inte hattf&auml;rg. Ledningen beh&ouml;ver din hj&auml;lp med att tilldela hattf&auml;rger till eleverna s&aring; att avslutningen blir s&aring; f&auml;rgglad som m&ouml;jligt.</p>

<p>Skriv ett program som, givet hur eleverna kommer vara uppst&auml;llda p&aring; avslutningen, ber&auml;knar det maximala antalet unika hattf&auml;rger som kan tilldelas eleverna.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $N$, $M$ ($1 \leq N, M \leq 700$) och $K$ ($1 \leq K \leq 26$) -- antalet rader, antalet kolumner och antalet klasser.</p>

<p>De f&ouml;ljande $N$ raderna har $M$ tecken i varje och beskriver hur eleverna kommer vara uppst&auml;llda p&aring; avslutningen. Tecknet p&aring; rad $i$, kolumn $j$ &auml;r en stor bokstav mellan <code>A</code> och den $K$:e bokstaven i alfabetet -- den klass som eleven p&aring; rad $i$, kolumn $j$ g&aring;r i. Det finns garanterat minst en elev fr&aring;n varje klass.</p>

### 출력

<p>Skriv ut ett heltal -- det maximala antalet unika hattf&auml;rger som kan tilldelas eleverna s&aring; att alla elever i samma kolumn, respektive samma klass, har samma hattf&auml;rg.</p>

### 힌트

<p>I f&ouml;rsta exempelfallet st&aring;r en fr&aring;n klass A och en fr&aring;n klass B i den andra kolumnen. D&aring; b&aring;da dessa elever m&aring;ste ha samma f&auml;rg p&aring; hatten m&aring;ste hela klass A ha samma f&auml;rg som hela klass B. Slutsatsen &auml;r att alla elever p&aring; avslutningen m&aring;ste ha samma f&auml;rg, vilket g&ouml;r att svaret blir $1$.</p>

<p>I andra exempelfallet m&aring;ste klass A och B ha samma f&auml;rg, d&aring; det finns en elev fr&aring;n vardera av dessa tv&aring; klasser i den f&ouml;rsta kolumnen. Klass C kan d&auml;remot f&aring; en annan f&auml;rg p&aring; sina hattar. Svaret blir d&aring; $2$.</p>

<p>I det tredje exempelfallet kan vi ge varje klass varsin f&auml;rg, eftersom det inte f&ouml;rekommer tv&aring; elever fr&aring;n olika klasser i samma kolumn. Svaret blir $3$</p>

<p>I det sista exempelfallet kan vi tilldela alla elever fr&aring;n klass A, B och C en f&auml;rg, och alla elever fr&aring;n klass D och E en annan f&auml;rg. Svaret blir $2$.</p>
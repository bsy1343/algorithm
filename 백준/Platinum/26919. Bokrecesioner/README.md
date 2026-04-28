# [Platinum III] Bokrecesioner - 26919

[문제 링크](https://www.acmicpc.net/problem/26919)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

다이나믹 프로그래밍, 그래프 이론, 해 구성하기, 방향 비순환 그래프, 위상 정렬, 강한 연결 요소

### 문제 설명

<p>En bokrecensent har l&auml;st $N$ b&ouml;cker som ska recenseras. Varje recension ska avslutas med att boken tilldelas ett betyg p&aring; en skala fr&aring;n $1$ till $M$. Det kan vara sv&aring;rt att direkt v&auml;lja ett absolut betyg f&ouml;r varje bok, s&aring; bokrecensenten tycker att det &auml;r mycket enklare att j&auml;mf&ouml;ra tv&aring; b&ouml;cker i taget med varandra och beskriva vilken av dem som &auml;r b&auml;st.</p>

<p>Bokrecensenten har numrerat b&ouml;cker med heltal fr&aring;n $1$ till $N$ och vill nu best&auml;mma deras betyg $a_1, a_2, \dots , a_N$. F&ouml;r att g&ouml;ra det har bokrecensenten gjort $R$ j&auml;mf&ouml;relser som beskriver relationen mellan $a_i$ och $a_j$, f&ouml;r n&aring;gra b&ouml;cker $i, j$.</p>

<p>Bokrecensenten &auml;r n&ouml;jd med vilken betygs&auml;ttning som helst, s&aring; l&auml;nge alla krav fr&aring;n j&auml;mf&ouml;relserna &auml;r uppfyllda. Hj&auml;lp bokrecensenten att hitta en s&aring;dan betygs&auml;ttning.</p>

### 입력

<p>F&ouml;rsta raden best&aring;r av tre heltal, $N$ ($1 \leq N \leq 100\,000$), $M$ ($1 \leq M \leq 100\,000$), $R$ ($1 \leq R \leq 500\,000$) -- antalet b&ouml;cker, h&ouml;gsta m&ouml;jliga betyget och antalet j&auml;mf&ouml;relser.</p>

<p>Sedan f&ouml;ljer $R$ rader med relationer som ska vara uppfyllda. Varje s&aring;dan rad har formatet &quot;<code>&lt;i&gt; &lt;relation&gt; &lt;j&gt;</code>&quot;, som beskriver relationen mellan $a_i$ och $a_j$. $i$ och $j$ &auml;r heltal mellan $1$ och $N$, $i \neq j$. Relationen $r$ &auml;r n&aring;gon av str&auml;ngarna &#39;<code>&lt;</code>&#39;, &#39;<code>=</code>&#39;, &#39;<code>&le;</code>&#39;, och detta beskriver just att $a_i$ <code>&lt;relation&gt;</code> $a_j$ m&aring;ste g&auml;lla. Inget par av b&ouml;cker kommer att j&auml;mf&ouml;ras mer &auml;n en g&aring;ng.</p>

### 출력

<p>Skriv ut en lista med heltal $a_1, a_2, \ldots , a_N$ s&aring;dan att alla relationer h&aring;ller, och alla tal &auml;r p&aring; intervallet $[1, M]$. Om det finns flera l&ouml;sningar, skriv ut vilken som helst. Om det &auml;r om&ouml;jligt, skriv ut $-1$.</p>

### 힌트

<p>I det f&ouml;rsta indataexemplet s&aring; &auml;r <code>1 2 1 3 3</code> en giltig l&ouml;sning. Detta kan verifieras genom att se att alla tal ligger p&aring; intervallet $[1, 3]$, och att talen uppfyller de fyra relationerna $a_1 &lt; a_2$, $a_2 &lt; a_4$, $a_3 &lt; a_2$ och $a_2 &lt; a_5$.</p>
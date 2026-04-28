# [Silver V] Hundraelva kronor - 21356

[문제 링크](https://www.acmicpc.net/problem/21356)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 68, 맞힌 사람: 60, 정답 비율: 76.923%

### 분류

그리디 알고리즘

### 문제 설명

<p>I Tumba pappersbruk --- som &auml;r ansvariga f&ouml;r att producera sedlar --- har tryckpressen g&aring;tt s&ouml;nder: den kan nu bara trycka siffran &quot;1&quot;. Att k&ouml;pa en ny tryckpress kostar $N$ kronor men pappersbruket har tyv&auml;rr helt slut p&aring; pengar. Det &auml;r ju dock de sj&auml;lva som trycker sedlar, s&aring; varf&ouml;r inte trycka nya pengar s&aring; att de kan k&ouml;pa den nya maskinen?</p>

<p>Eftersom den trasiga tryckpressen bara kan trycka siffran &quot;1&quot; kan de endast trycka sedlar med val&ouml;rerna 1 krona, 11 kronor, 111 kronor, 1111 kronor, o.s.v.</p>

<p>Pappersbruket undrar nu hur m&aring;nga sedlar de beh&ouml;ver trycka f&ouml;r att kunna betala f&ouml;r den nya tryckpressen. De vill kunna betala med j&auml;mna pengar, d.v.s. exakt $N$ kronor (det &auml;r omoraliskt att trycka upp mer pengar &auml;n de beh&ouml;ver), och vill trycka s&aring; f&aring; sedlar som m&ouml;jligt. Skriv ett program som ber&auml;knar antalet sedlar de m&aring;ste trycka.</p>

### 입력

<p>Ett heltal $N$ ($1 \le N \le 1\,000\,000\,000)$ -- kostnaden i kronor f&ouml;r den nya tryckpressen.</p>

### 출력

<p>Skriv ut ett heltal -- det minsta antalet sedlar som beh&ouml;ver tryckas.</p>

### 힌트

<ul>
	<li>I det f&ouml;rsta exempelfallet kan man anv&auml;nda en 1-kronasedel och tv&aring; 11-kronorssedlar.</li>
	<li>I det andra exempelfallet kan man anv&auml;nda en av varje av 1-, 11-, 111-, 1111-, 11111-kronorssedel.</li>
</ul>
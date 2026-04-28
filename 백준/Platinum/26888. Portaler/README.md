# [Platinum IV] Portaler - 26888

[문제 링크](https://www.acmicpc.net/problem/26888)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 깊이 우선 탐색, 최단 경로, 희소 배열, 강한 연결 요소, 함수형 그래프

### 문제 설명

<p>Det nya f&ouml;retaget Sveriges Portaltrafik vill revolutionera hur svenska pendlare tar sig runt i landet. F&ouml;retaget har lagt fram ett banbrytande f&ouml;rslag p&aring; hur ett portalsystem ska byggas i Sverige, f&ouml;r att ers&auml;tta t&aring;g, flyg och busstrafik med br&auml;nslesn&aring;la portaler. Regeringen har nu f&aring;tt i uppdrag att granska f&ouml;rslaget i detalj, och v&auml;djar till svenska elitprogrammerare om hj&auml;lp. Det &auml;r h&auml;r du kommer in i bilden.</p>

<p>Du har f&aring;tt ta del av en ritning av portalsystemet f&ouml;r att analysera det. Portalsystemet best&aring;r av $N$ portaler utplacerade p&aring; olika platser i landet. Varje portal $a$ har en viss destinationsportal $b$. Det betyder att varje g&aring;ng man g&aring;r in i $a$ s&aring; kommer man ut ur $b$. Notera att man inte n&ouml;dv&auml;ndigtvis kommer tillbaka till $a$ n&auml;r man g&aring;r in i $b$. Sveriges Portaltrafiks nya id&eacute; &auml;r att genom att l&aring;ta resen&auml;rer g&aring; i en portal och sedan upprepade g&aring;nger g&aring; in i portalen man dyker upp vid s&aring; kommer man snabbt kunna ta sig runt i landet.</p>

<p>Regeringen vill nu veta f&ouml;r ett antal givna start- och slutportaler $a$ och $b$ hur m&aring;nga g&aring;nger man beh&ouml;ver g&aring; in i portalen man dyker upp vid f&ouml;r att ta sig fr&aring;n $a$ till $b$ -- eller om det ens &auml;r m&ouml;jligt. F&ouml;r varje s&aring;dan f&ouml;rfr&aring;gning ska du svara med antalet g&aring;nger man beh&ouml;ver g&aring; in i portalerna f&ouml;r att ta sig fr&aring;n $a$ till $b$. Om det &auml;r om&ouml;jligt s&aring; ska du svara $-1$.</p>

<p>Hj&auml;lp regeringen!</p>

### 입력

<p>P&aring; f&ouml;rsta raden i indata st&aring;r heltalet $N$, antalet portaler som kommer att placeras ut i landet. Sedan f&ouml;ljer $N$ rader med tal $1 \le d_i \le N$ som beskriver att portalen p&aring; rad $i$ leder till portal $d_i$. Portalerna &auml;r ett-indexerade (den l&auml;gsta har nummer 1, den h&ouml;gsta har nummer $N$), och kommer i ordning fr&aring;n $1$ till $N$ i indata.</p>

<p>Sedan f&ouml;ljer en rad med ett heltal $Q$, antalet f&ouml;rfr&aring;gningar som du m&aring;ste svara p&aring;. Efter det f&ouml;ljer $Q$ rader med tv&aring; heltal $1 \le s, e \le N$. Dessa tal beskriver nummer p&aring; en startportal $s$ och en slutportal $e$, och ditt uppdrag &auml;r att svara p&aring; hur m&aring;nga g&aring;nger man beh&ouml;ver g&aring; igenom portalerna f&ouml;r att ta sig till $e$ n&auml;r man b&ouml;rjar vid $s$. F&ouml;r varje f&ouml;rfr&aring;gan g&auml;ller $s \neq e$.</p>

### 출력

<p>Du ska skriva ut $Q$ rader, ett tal per f&ouml;rfr&aring;gan: antalet g&aring;nger man beh&ouml;ver g&aring; igenom portalerna f&ouml;r att ta sig fr&aring;n den givna startportalen till slutportalen. Om det &auml;r om&ouml;jligt s&aring; skriver du ut $-1$. Skriv ut svaret f&ouml;r varje f&ouml;rfr&aring;gan p&aring; en separat rad.</p>

### 제한

<ul>
	<li>$ 1 \le N \le 50\,000,\ 1 \le Q \le 70\,000$</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/aef7c7eb-9b51-4de0-913c-c9918ff844b4/-/preview/" style="width: 215px; height: 57px;" /></p>

<p style="text-align: center;">En illustration av Sample Input 1.</p>

<p>N&auml;tverket i exempelfallet ser ut som i figuren. Vi f&aring;r tre stycken f&ouml;rfr&aring;gningar. Den f&ouml;rsta undrar hur m&aring;nga g&aring;nger vi beh&ouml;ver g&aring; in i portalerna n&auml;r vi b&ouml;rjar vid $1$ och vill hamna vid $2$. Eftersom man direkt hamnar vid $2$ n&auml;r man g&aring;r in i $1$ s&aring; &auml;r svaret $1$. F&ouml;r att ta sig fr&aring;n $1$ till $4$ s&aring; kr&auml;vs tre hopp. F&ouml;r den sista f&ouml;rfr&aring;gan &auml;r svaret $-1$, eftersom vi aldrig kan ta oss fr&aring;n $2$ till $5$, oavsett hur l&auml;nge vi g&aring;r igenom portalerna.</p>
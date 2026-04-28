# [Bronze II] Tabbtabbande - 24197

[문제 링크](https://www.acmicpc.net/problem/24197)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 126, 정답: 110, 맞힌 사람: 95, 정답 비율: 89.623%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>N&auml;r man arbetar med en webbl&auml;sare s&aring; h&auml;nder det ofta att man har v&auml;ldigt m&aring;nga tabbar (flikar) &ouml;ppna samtidigt.</p>

<p>Ett vanligt s&auml;tt att navigera mellan dem &auml;r att ctrl-tabba f&ouml;r att g&aring; igenom dem i den ordning som de ligger. Det g&aring;r &auml;ven att ctrl-shift-tabba f&ouml;r att g&aring; igenom dem i omv&auml;nd ordning. Tabbarna kan t&auml;nkas ligga cykliskt, s&aring; det g&aring;r att ctrl-tabba fr&aring;n sista till f&ouml;rsta, och crtl-shift-tabba fr&aring;n f&ouml;rsta till sista tabben.&nbsp;</p>

<p>Just nu har du <em>n</em> tabbar &ouml;ppna, numrerade fr&aring;n $1$ till $n$ i den ordning som de ligger. Fr&aring;n b&ouml;rjan har du tabb $1$ markerad. Givet en sekvens som beskriver vilka tabbar som ska anv&auml;ndas och i vilken ordning, ber&auml;kna hur m&aring;nga g&aring;nger du minst m&aring;ste trycka p&aring; tabb-tangenten f&ouml;r att bes&ouml;ka dem?</p>

### 입력

<p>F&ouml;rst kommer en rad med tv&aring; positiva heltal mindre &auml;n $10$, $n$ och $m$. Sedan f&ouml;ljer en ny rad med $m$ heltal som alla &auml;r mellan $1$ och $n$, inklusive. Tv&aring; intilliggande tal kommer alltid vara olika.</p>

### 출력

<p>Skriv ut ett heltal, minsta antalet g&aring;nger tabbknappen m&aring;ste tryckas p&aring;.</p>
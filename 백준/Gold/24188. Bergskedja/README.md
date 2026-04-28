# [Gold II] Bergskedja - 24188

[문제 링크](https://www.acmicpc.net/problem/24188)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

그래프 이론, 그래프 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Torunn bor i ett bergigt bostadsomr&aring;de som best&aring;r av ett $n \times m$-rutn&auml;t med en tomt i varje ruta. Torunn bor p&aring; rutan l&auml;ngst upp till v&auml;nster i rutn&auml;tet. Tyv&auml;rr har en extra jobbig hyresg&auml;st nyligen flyttat in, s&aring; Torunn har best&auml;mt sig f&ouml;r att s&auml;lja sin bostad och flytta n&aring;gon annanstans. F&ouml;rst m&aring;ste han dock ta reda p&aring; hur mycket bostaden &auml;r v&auml;rd.</p>

<p>Varje ruta i rutn&auml;tet har en h&ouml;jd. Alla h&ouml;jder &auml;r olika, s&aring; l&aring;t oss f&ouml;r enkelhets skull anta att h&ouml;jderna &auml;r $1, 2, 3, \cdots, n\cdot m$. Tomter med h&ouml;gre h&ouml;jd &auml;r v&auml;rda mer p&aring; bostadsmarknaden, s&aring; Torunn vill ta reda p&aring; h&ouml;jden p&aring; sin tomt. Han har d&auml;rf&ouml;r g&aring;tt runt till varje ruta i rutn&auml;tet och kollat hur m&aring;nga angr&auml;nsande rutor som &auml;r l&auml;gre. En ruta anses vara angr&auml;nsande om den delar en sida (rutor som inte ligger l&auml;ngs bostadsomr&aring;dets kant har allts&aring; $4$ angr&auml;nsande rutor).</p>

<p>Skriv ett program som, givet informationen Torunn samlade in, hittar minsta och st&ouml;rsta m&ouml;jliga h&ouml;jd f&ouml;r hennes tomt.</p>

### 입력

<p>F&ouml;rsta raden inneh&aring;ller tv&aring; heltal $n$ och $m$ ($1 \leq n,m \leq 8$), antalet rader och kolumner i rutn&auml;tet.</p>

<p>De f&ouml;ljande $n$ raderna inneh&aring;ller en str&auml;ng av l&auml;ngd $m$ var. Detta rutn&auml;t utg&ouml;r informationen som Torunn samlade in, varje siffra motsvarar allts&aring; antalet angr&auml;nsande rutor som har l&auml;gre h&ouml;jd &auml;n rutan som siffran st&aring;r i. Det &auml;r garanterat att det finns minst ett s&auml;tt att tilldela h&ouml;jderna $1, 2, \cdots, n\cdot m$ till rutorna s&aring; att den insamlade informationen &auml;r korrekt. Notera att v&auml;rdena som samlats in alltid kommer vara mellan $0$ och $4$.</p>

### 출력

<p>Skriv ut tv&aring; heltal, den minsta och den st&ouml;rsta m&ouml;jliga h&ouml;jden p&aring; rutan i &ouml;vre v&auml;nstra h&ouml;rnet.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/656aba3d-b4a6-4823-a5c8-0fa1500da082/-/preview/" style="width: 163px; height: 204px;" /></p>

<p style="text-align: center;">Tv&aring; m&ouml;jliga f&ouml;rdelningar av h&ouml;jder som st&auml;mmer &ouml;verens med exempel $1$.</p>
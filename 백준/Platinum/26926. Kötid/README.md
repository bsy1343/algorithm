# [Platinum IV] Kötid - 26926

[문제 링크](https://www.acmicpc.net/problem/26926)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 1, 정답 비율: 12.500%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 값 / 좌표 압축

### 문제 설명

<p>Du har f&aring;tt jobb p&aring; ett v&auml;lk&auml;nt n&ouml;jesf&auml;lt. Det finns m&aring;nga intressanta problem d&auml;r som beh&ouml;ver l&ouml;sas, men ditt f&ouml;rsta uppdrag &auml;r att f&ouml;rb&auml;ttra informationen till de som k&ouml;ar f&ouml;r berg- och dalbanan. Det b&auml;sta de har nu &auml;r en skylt som s&auml;ger &quot;20 minuters k&ouml; h&auml;rifr&aring;n&quot;, oavsett hur l&aring;ng k&ouml;n &auml;r.</p>

<p>Den enda berg- och dalbanevagnen har plats f&ouml;r $K$ stycken personer och tar 1 minut f&ouml;r att k&ouml;ra ett varv. Av- och p&aring;stigning tar ingen tid. Bes&ouml;kare kommer till k&ouml;n i grupper som inte kan t&auml;nka sig att delas upp mellan flera vagnar. Det h&auml;nder d&auml;rf&ouml;r ibland att en vagn inte fylls helt d&aring; n&auml;stf&ouml;ljande grupp &auml;r f&ouml;r stor. N&auml;r detta sker s&aring; g&ouml;r attraktionsv&auml;rdarna sitt b&auml;sta med att fylla vagnen genom att l&aring;ta n&aring;gon grupp som st&aring;r senare i k&ouml;n g&aring; f&ouml;re. Om det till exempel finns $x$ stycken lediga platser i nuvarande vagn s&aring; letar de upp n&auml;sta grupp i k&ouml;n som har storlek <em>mindre &auml;n eller lika med</em> $x$ och fyller vagnen med den. Denna process upprepas sedan tills dess att ingen mer grupp f&aring;r plats i vagnen. Ditt uppdrag &auml;r att f&ouml;r varje grupp i k&ouml;n r&auml;kna ut hur l&auml;nge de kommer att beh&ouml;va k&ouml;a.</p>

### 입력

<p>P&aring; f&ouml;rsta raden tv&aring; heltal $N$ och $K$, antal grupper i k&ouml;n och antal personer per vagn. P&aring; n&auml;sta rad f&ouml;ljer $N$ stycken heltal $g_i$, $1 \leq g_i \leq K$, storleken p&aring; grupperna i k&ouml;n. Den f&ouml;rsta gruppen i indata &auml;r den som st&aring;r f&ouml;rst i k&ouml;n.</p>

### 출력

<p>Skriv ut en rad med $N$ stycken heltal separerade av mellanslag, k&ouml;tiden f&ouml;r varje grupp.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 10^6$</li>
	<li>$1 \leq K \leq 10^8$</li>
</ul>

### 힌트

<p>L&aring;t oss anta att det st&aring;r tre grupper i k&ouml;, och varje vagn rymmer precis tre personer, och att k&ouml;n i b&ouml;rjan har utseende $[2,2,1]$ (f&ouml;rsta exempelindata). F&ouml;rst blir det f&ouml;rsta gruppens tur att kliva i vagnen. Nu har vagnen en plats kvar, och den sista gruppen i k&ouml;n (best&aring;ende av en person) f&aring;r g&aring; f&ouml;re den andra gruppen, som m&aring;ste v&auml;nta p&aring; n&auml;sta tur. Svaret blir d&aring; att f&ouml;rsta och sista gruppen har 0 k&ouml;tid, och den andra gruppen har 1 enhet k&ouml;tid. Vi skriver allts&aring; ut <code>0 1 0</code>.</p>
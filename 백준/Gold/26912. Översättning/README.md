# [Gold I] Översättning - 26912

[문제 링크](https://www.acmicpc.net/problem/26912)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 집합과 맵, 분리 집합

### 문제 설명

<p>Ett enkelt &ouml;vers&auml;ttningsprogram anv&auml;nds f&ouml;r att &ouml;vers&auml;tta texter mellan tv&aring; olika spr&aring;k, kalla dem $A$ och $B$. Programmet &ouml;vers&auml;tter texten ord f&ouml;r ord enligt en ordlista. N&auml;r ett ord ska &ouml;vers&auml;ttas letar programmet upp den f&ouml;rsta f&ouml;rekomsten av ordet i ordlistan och &ouml;vers&auml;tter enligt den. </p>

<p>Om vi med ett s&aring;dant program &ouml;vers&auml;tter en text fr&aring;n $A$ till $B$ och sedan tillbaka till $A$ &auml;r det inte s&auml;kert att vi f&aring;r tillbaka precis samma text. I den h&auml;r uppgiften ska du upprepa denna procedur tills texten inte &auml;ndrar sig l&auml;ngre. N&auml;rmare best&auml;mt:</p>

<ol>
	<li>L&aring;t $a$ vara en text (en samling ord) i spr&aring;ket $A$.</li>
	<li>&Ouml;vers&auml;tt $a$ fr&aring;n $A$ till $B$, kalla den nya texten $b$.</li>
	<li>&Ouml;vers&auml;tt $b$ fr&aring;n $B$ till $A$, kalla den nya texten $a&#39;$.</li>
	<li>Om $a \not = a&#39;$, b&ouml;rja om fr&aring;n steg 1 med $a&#39;$. Annars &auml;r texten f&auml;rdig&ouml;versatt.</li>
</ol>

<p>Givet en ordlista och en text, skriv ut texten som skapas av ovanst&aring;ende algoritm.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $N$ ($1 \leq N \leq 50\,000$), antalet ord i ordlistan.</p>

<p>Sedan f&ouml;ljer $N$ rader med tv&aring; ord (best&aring;ende av endast tecken <code>a-z</code>, inga mellanslag) p&aring; varje rad som beskriver hur ord ska &ouml;vers&auml;ttas. Ett ord &auml;r maximalt 20 tecken l&aring;ngt. Det f&ouml;rsta ordet &auml;r i spr&aring;ket $A$ och det andra i spr&aring;ket $B$.</p>

<p>Sedan f&ouml;ljer ett heltal $1 \leq M \leq 100\,000$, antalet ord i textstr&auml;ngen som ska &ouml;vers&auml;ttas. Sista raden inneh&aring;ller textstr&auml;ngen som ska &ouml;vers&auml;ttas best&aring;ende av ord separerade av mellanslag. Det &auml;r garanterat att alla ord i texten finns i ordlistan.</p>

### 출력

<p>Skriv ut en enda rad, texten som ges av algoritmen n&auml;r den &auml;r f&auml;rdig.</p>

### 힌트

<p>Algoritmen kommer att &ouml;vers&auml;tta meningen i f&ouml;ljande steg:</p>

<ol>
	<li><code>programmering ar valdigt roligt</code></li>
	<li><code>programmering ar valdigt skoj</code></li>
	<li><code>programmering ar valdigt kul</code></li>
</ol>
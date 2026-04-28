# [Platinum IV] Xorcisten - 26962

[문제 링크](https://www.acmicpc.net/problem/26962)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

비트마스킹

### 문제 설명

<p>Xorcisten Roxanne har en m&auml;rklig f&ouml;rm&aring;ga, hon kan sortera listor v&auml;ldigt snabbt. N&auml;r hon ser en lista av heltal $a_1, a_2, \dots, a_N$ s&aring; kan hon blixtsnabbt hitta ett heltal $X$ s&aring; att $$ a_1 \oplus X \leq a_2 \oplus X \leq \dots \leq a_N \oplus X , $$ d&auml;r $\oplus$ betyder \href{https://en.wikipedia.org/wiki/Bitwise\_operation\#XOR}{bitwise XOR}\footnote{Detta fungerar p&aring; f&ouml;ljande vis: skriv b&aring;da talen i bas 2. Ta nu varje siffra (i ordning minst till h&ouml;gst signifikant) och skriv en nolla om de tv&aring; siffrorna i talen &auml;r lika, och annars en etta. I princip &auml;r detta samma som att utf&ouml;ra addition av talen i bas 2 utan att anv&auml;nda sig av minnessiffror.}. Allt hon beh&ouml;ver g&ouml;ra sen &auml;r att byta ut $a_i$ mot $a_i \oplus x$ och vips, s&aring; &auml;r listan sorterad!</p>

<p>F&ouml;retag anlitar ofta Roxanne f&ouml;r att sortera deras j&auml;ttel&aring;nga listor. Men en dag uppt&auml;ckte Roxanne till sin besvikelse att hennes f&ouml;rm&aring;ga var borta. Din uppgift &auml;r att skriva ett program &aring;t henne s&aring; att hon kan f&aring; beh&aring;lla sitt jobb.</p>

<p>Du f&aring;r givet en lista med icke-negativa heltal $a_1, \dots, a_N$ och $Q$ stycken &auml;ndringar p&aring; formen $p_i, v_i$, som betyder att talet $a_{p_i}$ &auml;ndras till $v_i$. Du ska skriva ut $Q+1$ heltal $c_0, c_1, \dots, c_Q$, d&auml;r $c_i$ &auml;r det minsta icke-negativa heltalet $X$ s&aring; att listan $a_1 \oplus X, \dots, a_N \oplus X$ &auml;r sorterad, efter det att de f&ouml;rsta $i$ &auml;ndringarna har utf&ouml;rts. Om det inte finns n&aring;got s&aring;nt tal $X$, skriv ut $-1$ ist&auml;llet.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($1 \leq N \leq 10^6$) antalet tal i listan.</p>

<p>Den andra raden inneh&aring;ller $N$ heltal $a_1, a_2, \dots, a_N$ ($0 \leq a_i &lt; 2^{30})$, talen i listan.</p>

<p>Den tredje raden inneh&aring;ller ett heltal $Q$ ($0 \leq Q \leq 10^6$), antalet &auml;ndringar.</p>

<p>De f&ouml;ljande $Q$ raderna inneh&aring;ller tv&aring; heltal $p_i$ ($1 \leq p_i \leq N$), och $v_i$ ($0 \leq v_i &lt; 2^{30}$) , vilket inneb&auml;r att talet $a_{p_i}$ &auml;ndras till $v_i$.</p>

### 출력

<p>Du ska skriva ut $Q+1$ rader med heltal, talen $c_0, c_1, \dots, c_Q$. $c_i$ ska vara det minsta m&ouml;jliga talet $x$ som sorterar listan efter det att &auml;ndringarna $1, 2, \dots, i$ har utf&ouml;rts (eller $-1$ om det inte finns n&aring;got s&aring;dant tal $x$).</p>

### 제한

<ul>
	<li>$N, Q \leq 10^6$</li>
	<li>$a_i, v_i &lt; 2^{30}$</li>
</ul>
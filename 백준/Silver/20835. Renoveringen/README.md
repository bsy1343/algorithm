# [Silver IV] Renoveringen - 20835

[문제 링크](https://www.acmicpc.net/problem/20835)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 40, 맞힌 사람: 35, 정답 비율: 89.744%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Johanna h&aring;ller p&aring; att renovera hemma i sin l&auml;genhet. Eftersom Johanna inte gillar att l&auml;mna saker &aring;t slumpen har hon planerat in i detalj precis hur m&aring;nga spikar hon beh&ouml;ver under renoveringen. Totalt sett beh&ouml;ver hon $N$ spikar med l&auml;ngderna $x_1, x_2, \dots, x_N$. I hennes spikl&aring;da har hon $M$ spikar av l&auml;ngderna $y_1, y_2, \dots, y_M$.</p>

<p>Om Johanna beh&ouml;ver en spik med l&auml;ngd $x_i$ kan hon anv&auml;nda en spik med l&auml;ngd $y_j$ om $x_i \le y_j$ eftersom hon kan kapa av den l&auml;ngre spiken tills den &auml;r precis s&aring; l&aring;ng som beh&ouml;vs. D&auml;remot kan hon inte kombinera tv&aring; korta spikar till en l&auml;ngre spik, eller kapa en spik flera g&aring;nger (den har ju bara ett spikhuvud).</p>

<p>Innan Johanna ska b&ouml;rja med renoveringen vill hon veta:</p>

<ul>
	<li>hur m&aring;nga spikar hon beh&ouml;ver k&ouml;pa, och</li>
	<li>vilka l&auml;ngder spikarna hon beh&ouml;ver k&ouml;pa ska ha.</li>
</ul>

<p>Hon vill k&ouml;pa s&aring; f&aring; spikar som m&ouml;jligt, och vill dessutom k&ouml;pa spikar av s&aring; kort total l&auml;ngd som m&ouml;jligt.</p>

### 입력

<p>P&aring; den f&ouml;rsta raden st&aring;r tv&aring; heltal $1 \le N \le 15$ och $1 \le M \le 15$ -- antalet spikar Johanna beh&ouml;ver och antalet spikar Johanna har. P&aring; den andra raden st&aring;r $N$ heltal $1 \le x_1, x_2, \dots, x_N \le 100$, l&auml;ngderna p&aring; de spikar Johanna beh&ouml;ver. P&aring; den tredje raden st&aring;r $M$ heltal $1 \le y_1, y_2, \dots, y_M \le 100$, l&auml;ngderna p&aring; de spikar Johanna har.</p>

### 출력

<p>Programmet ska f&ouml;rst skriva ut ett heltal: det minsta antalet spikar Johanna beh&ouml;ver k&ouml;pa. P&aring; n&auml;sta rad ska programmet skriva ut l&auml;ngderna p&aring; spikarna Johanna ska k&ouml;pa, i stigande ordning.</p>

### 힌트

<p>I exempel 1 uppfyller beh&ouml;ver Johanna bara fylla p&aring; med tre extra spikar av l&auml;ngderna $13$, $28$ och $77$.</p>

<p>I exempel 2 beh&ouml;ver Johanna k&ouml;pa en till spik av l&auml;ngd $11$, och dessutom kapa en spik av l&auml;ngd $100$ till $50$. Hon skulle kunnat k&ouml;pa en spik av l&auml;ngd $50$ och kapa spiken av l&auml;ngd $100$ till l&auml;ngd $11$, men d&aring; beh&ouml;ver hon k&ouml;pa spikar av l&auml;ngre total l&auml;ngd.</p>
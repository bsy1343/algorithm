# [Bronze IV] Affischutskicket - 24183

[문제 링크](https://www.acmicpc.net/problem/24183)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1541, 정답: 1285, 맞힌 사람: 1198, 정답 비율: 86.063%

### 분류

수학, 사칙연산

### 문제 설명

<p>VE OCH FASA! PostNord har f&ouml;r det $1337$:e &aring;ret i rad h&ouml;jt portot, vilket riskerar att br&auml;cka Programmeringsolympiadens budget.</p>

<p>Varje &aring;r skickar PO ut affischer till ca $450$ gymnasieskolor. Ett utskick best&aring;r av tre saker:&nbsp;</p>

<ul>
	<li>ett kuvert av C4-storlek ($229\text{ mm} \times 324\text{ mm}$)</li>
	<li>tv&aring; affischer av A3-storlek ($297\text{ mm} \times 420\text{ mm}$)</li>
	<li>ett informationsblad av A4-storlek ($210\text{ mm} \times 297\text{ mm}$)</li>
</ul>

<p>Det &auml;r mycket viktigt att brevet v&auml;ger h&ouml;gst $50$ gram, eftersom portot annars blir dubbelt s&aring; h&ouml;gt. F&ouml;r att klara denna magiska viktgr&auml;ns kan PO styra &ouml;ver vilken sorts papper som anv&auml;nds f&ouml;r de tre sakerna. Varje sort har en ytvikt (vikt per area) som typiskt anges i $\frac{\text{gram}}{\text{m}^2}$. Notera att kuvertet best&aring;r av <strong>tv&aring; sammanklistrade ark</strong> av C4-storlek, medan ytvikter och ovanst&aring;ende m&aring;tt g&auml;ller f&ouml;r <em>ett ark</em>.</p>

<p>Skriv ett program som r&auml;knar ut den totala vikten f&ouml;r ett brev.</p>

### 입력

<p>Indatan best&aring;r av tre heltal mellan $50$ och $200$, ytvikterna i $\frac{\text{gram}}{\text{m}^2}$ f&ouml;r sorterna som anv&auml;nds till kuvertet, affischerna respektive informationsbladet.</p>

### 출력

<p>Skriv ut ett enda decimaltal: vikten p&aring; ett fullst&auml;ndigt brevutskick i gram. Svaret ska anges med minst $3$ decimalers noggrannhet (d.v.s. vara inom $5 \cdot 10^{-4}$ fr&aring;n r&auml;tt svar).</p>
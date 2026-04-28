# [Bronze II] Kylskåpstransport - 26949

[문제 링크](https://www.acmicpc.net/problem/26949)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 98, 맞힌 사람: 86, 정답 비율: 74.783%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>En fabrik som tillverkar kylsk&aring;p ska leverera ett st&ouml;rre parti med $n, 1 \le n \le 1000$ kylar till en stormarknad. Till sitt f&ouml;rfogande har fabriken tv&aring; bilar.</p>

<ul>
	<li>bil $A$ kostar $p_a$ kr/resa, $500 \le p_a \le 2000$ och kan lasta $k_a, 10 \le k_a \le 50$, kylsk&aring;p &aring;t g&aring;ngen.</li>
	<li>bil $B$ kostar $p_b$ kr/resa, $500 \le p_b \le 2000$ och kan lasta $k_b, 10 \le k_b \le 50$, kylsk&aring;p &aring;t g&aring;ngen.</li>
</ul>

<p>Din uppgift &auml;r nu att skriva ett program som tar emot uppgifter om de fem variablerna ovan och som med hj&auml;lp av dessa best&auml;mmer hur m&aring;nga turer varje bil ska k&ouml;ra f&ouml;r att minimera <em>den totala transportkostnaden</em>.</p>

### 입력

<p>Indata best&aring;r av de fem heltalen $p_a$, $k_a$, $p_b$, $k_b$ och $n$ p&aring; en rad, separerade med ett blanksteg.</p>

### 출력

<p>Utdatan ska best&aring; av tre heltal: antalet turer bil $A$ ska k&ouml;ra, antalet turer bil $B$ ska k&ouml;ra, samt den totala kostnaden i kronor. F&ouml;r alla givna testfall garanteras det att svaret &auml;r unikt.</p>
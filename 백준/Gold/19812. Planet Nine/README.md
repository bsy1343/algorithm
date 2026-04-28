# [Gold III] Planet Nine - 19812

[문제 링크](https://www.acmicpc.net/problem/19812)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 27, 맞힌 사람: 23, 정답 비율: 52.273%

### 분류

해 구성하기, 수학, 정수론

### 문제 설명

<p>Planet Nine is a hypothetical planet in the outer region of the Solar System. Trying to prove the hypothesis of its existence, scientists have built a special device which is able to track astronomical objects. They have set it to observe the hypothetical orbit of the planet.</p>

<p>Scientists are really tight on budget, so the device has only one integer register. Every time an astronomical object is tracked by the device, the value in the register is increased by nine. The device has a special feature: the first digit in the decimal representation of the stored value may occasionally disappear, but only if it is equal to one. If the register stores a number $1$, it can also disappear, leaving $0$ as the new register value.</p>

<p>Let us name the addition of one or several nines --- the operation of the first type, and disappearing of one or several leading digits one --- the operation of the second type.</p>

<p>The register contained the value equal to $a$, and the scientists went for lunch. When they came back, they saw that the register has changed its value to $b$. They are wondering whether the device is broken, and, if not, they want to know the way of transforming $a$ into $b$. The lunch was short, so such a transformation must be no longer than $1000$ operations.</p>

<p>If there is more than one way to get $b$ from $a$, the scientists will be satisfied with any of them.</p>

### 입력

<p>The first line of input contains two integer values $a$ and $b$ ($0 \le a, b \le 10^9$).</p>

### 출력

<p>If the device is broken, print &quot;<code>Broken</code>&quot; in a single line of output.</p>

<p>Otherwise the first line of output should contain the only word &quot;<code>Stable</code>&quot;. The following lines should describe the way of getting $b$ from $a$.</p>

<p>The second line of output should contain a single integer $n$ ($0 \le n \le 1000$) --- the number of operations that happened during the lunch. Note that it is not required to minimize $n$.</p>

<p>Each of the following $n$ lines should describe an operation.</p>

<ul>
	<li>Line &quot;+ $x$&quot;, where $x &gt; 0$, means that $x$ astronomical objects were tracked by the device, and the register value was increased by $9x$.</li>
	<li>Line &nbsp;&quot;- $y$&quot;, where $y &gt; 0$, means that the first $y$ digits disappeared from the register. All of those $y$ digits must be equal to $1$ to perform this operation.</li>
</ul>

<p>After consecutive application of those $n$ operations the value $a$ must change to $b$. Temporary values achieved by applying the first $k$ operations ($0 &lt; k &lt; n$) should not be greater than $10^{18}$.</p>
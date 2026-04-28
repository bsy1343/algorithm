# [Platinum II] Super Dango Maker - 24951

[문제 링크](https://www.acmicpc.net/problem/24951)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 26, 맞힌 사람: 23, 정답 비율: 51.111%

### 분류

분할 정복

### 문제 설명

<p>JOI-kun is a professional confectioner making dangos (Japanese dumplings). In JOI-kun&rsquo;s shop, the colors of dangos are specified. There are $N$ colors of dangos, numbered from $1$ to $N$.</p>

<p>A <strong>beautiful dango stick</strong> is a famous item in JOI-kun&rsquo;s shop. A beautiful dango stick is made of $N$ dangos of <strong>different</strong> colors skewered with a stick.</p>

<p>For each of the $N$ colors, JOI-kun has $M$ dangos of that color. Therefore, JOI-kun has $N &times; M$ dangos in total. These dangos are numbered from $1$ to $N &times; M$. Using these dangos and $M$ sticks, JOI-kun wants to make $M$ beautiful skewered dango sticks.</p>

<p>To avoid a mistake about the colors of the dangos, JOI-kun will use a dango checker. If JOI-kun inputs the indices of some dangos, the dango checker answers the maximum number of beautiful dango sticks he can make using the dangos in the input and sufficiently many sticks.</p>

<p>Using the dango checker several times, JOI-kun wants to divide the $N &times; M$ dangos into $M$ groups. Every group should consist of $N$ dangos, and contain a dango of each color.</p>

<p>JOI-kun wants to divide the $N &times; M$ dangos into $M$ groups using the dango checker at most $50\,000$ times.</p>

<p>Write a program which, given information of the dangos, implements JOI-kun&rsquo;s strategy to divide the dangos into groups using the the dango checker at most $50\,000$ times.</p>

### 입력



### 출력



### 제한

<p>All input data satisfy the following constraints. For the values of $C$, see <strong>Input for the Sample Grader</strong>.</p>

<ul>
	<li>$1 &le; C_i &le; N$ ($1 &le; i &le; N &times; M$).</li>
	<li>For each $j$ ($1 &le; j &le; N$), there are exactly $M$ indices $i$ ($1 &le; i &le; N &times; M$) satisfying $C_i = j$.</li>
	<li>$N$, $M$ are integers.</li>
	<li>$C_i$ ($1 &le; i &le; N &times; M$) is an integer.</li>
</ul>
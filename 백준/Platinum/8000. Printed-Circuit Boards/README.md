# [Platinum II] Printed-Circuit Boards - 8000

[문제 링크](https://www.acmicpc.net/problem/8000)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 재귀, 트리 분할

### 문제 설명

<p>The firm of Bytel starts to produce series-parallel electronic circuits. Each such a circuit consists of electronic units, connections between them, and two power connections. A series-parallel circuit may consist of:</p>

<p>a single unit</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8000.%E2%80%85Printed-Circuit%E2%80%85Boards/d37fc745.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8000/1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:22px; width:111px" /></p>

<p>several smaller series-parallel circuits connected in series</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8000.%E2%80%85Printed-Circuit%E2%80%85Boards/e8c72889.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8000/2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:24px; width:353px" /></p>

<p>two branching units connecting in parallel several smaller series-parallel circuits.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8000.%E2%80%85Printed-Circuit%E2%80%85Boards/347d1739.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8000/3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:178px; width:253px" /></p>

<p>The circuits are assembled on two-sided printed-circuit boards. The problem is to determine which connections should run on the top and which on the bottom side of the board. For technical reasons as many connections as possible should run on the bottom side but to each unit at least one must come from the top side of the board.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the description of a series-parallel circuit,</li>
	<li>computes the minimal number of connections that must run on the top side of the board,</li>
	<li>writes the result.</li>
</ul>

### 입력

<p>From the standard input one should read the description of a series-parallel circuit. The description is in a recursive form:</p>

<ul>
	<li>if the first line of the description contains a capital letter S and a positive integer n (2 &le; n &le; 10,000) separated from each other by a single space, then the circuit being described consists of n smaller circuits connected in series; they are described in the successive lines,</li>
	<li>if the first line of the description contains a capital letter R and a positive integer n (2 &le; n &le; 10,000) separated from each other by a single space, then the circuit being described consists of &nbsp;smaller circuits connected in parallel (by means of two branching units); they are described in the successive lines,</li>
	<li>a line containing only one capital letter X describes a circuit consisting of a single unit only.</li>
</ul>

<p>The total number of letters X occurring in the description of a circuit does not exceed 10,000,000, and the recursive depth of the description does not exceed 500.</p>

### 출력

<p>Your program should write to the standard output. In the first line there should be one integer equal to the minimal number of connections that must run on the top side of the board.</p>
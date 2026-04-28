# [Gold IV] Dimensional Debugging - 25983

[문제 링크](https://www.acmicpc.net/problem/25983)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 49, 정답: 40, 맞힌 사람: 33, 정답 비율: 78.571%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>After struggling with this <em>one</em> problem for <em>days</em>, you have had enough! You are determined to find the bug in your algorithm once and for all! To do so, you will start all over. From scratch. At least you are sure you know the correct answer in the most trivial case: the answer in $(0,0, \dots, 0)$ is $0$.</p>

<p>You will re-solve the problem, which takes $k$ parameters, using $n$ simpler but slower algorithms. Each algorithm has two bounds for every parameter $i$ ($L_i$ and $H_i$). An algorithm is only fast enough to run on inputs $(x_1, \dots, x_k)$ where $x_i \leq H_i$ for all parameters $i$. You are confident the implementation of an algorithm is correct if you can verify its correctness at least once on an input $(x_1, \dots, x_k)$ where $x_i \geq L_i$ for all parameters $i$. To do so, you will need another algorithm that you already proved to be correct and can handle such large inputs, or your knowledge of the answer for $(0,0, \dots, 0)$.</p>

<p>Given a list of algorithms and their bounds, find the number of algorithms you are sure are correctly implemented.</p>

<p>As an example, consider the first sample case shown in Figure D.1 on the left. The first algorithm (red, bottom left) can be used to verify the correctness of the second (yellow, top left) and third (blue, bottom right) algorithms. No algorithm can be used to verify the correctness of the fourth algorithm (grey, top right).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25983.%E2%80%85Dimensional%E2%80%85Debugging/10dad1d5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25983.%E2%80%85Dimensional%E2%80%85Debugging/10dad1d5.png" data-original-src="https://upload.acmicpc.net/ede11962-247a-4b29-8a58-b88a558b12a2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 227px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25983.%E2%80%85Dimensional%E2%80%85Debugging/6acbf3a7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25983.%E2%80%85Dimensional%E2%80%85Debugging/6acbf3a7.png" data-original-src="https://upload.acmicpc.net/fd7c4c07-b40c-4a3d-bdfe-648c3ced514a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 227px;" /></p>

<p style="text-align: center;">Figure D.1: The algorithms to be tested in samples 1 and 2, respectively. The boxes indicate the parameters where an algorithm must be tested, while the lighter background indicates the region where an algorithm can be used to verify other algorithms.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($1\leq n\leq 1000$, $1\leq k\leq 10$), the number of algorithms to test and the number of parameters.</li>
	<li>Then follow $n$ pairs of lines:
	<ul>
		<li>One line with $k$ integers $L_i, \dots, L_k$ ($0\leq L_i \leq 10^9$ for all $i$).</li>
		<li>One line with $k$ integers $H_1, \dots, H_k$ ($0\leq H_i \leq 10^9$ for all $i$).</li>
	</ul>
	</li>
	<li>It is guaranteed that $L_i \leq H_i$ for all $1 \leq i\leq k$.</li>
</ul>

### 출력

<p>Output the number of algorithms of which you can verify the correctness.</p>
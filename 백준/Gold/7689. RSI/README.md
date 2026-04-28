# [Gold III] RSI - 7689

[문제 링크](https://www.acmicpc.net/problem/7689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>You have the goal of becoming the world&rsquo;s fastest two-fingered typist. In this problem, your goal is to optimize the movement of your fingers when typing numeric values in order to ensure that you finish typing a number in the shortest amount of time possible. Your numeric keyboard has the following layout:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7689.%E2%80%85RSI/37482b2f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7689.%E2%80%85RSI/37482b2f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7689/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:76px; width:80px" /></p>

<p>For convenience, we refer to the cells above according to their row and column; hence, the &ldquo;5&rdquo; key is at position (2, 2), and the &ldquo;0&rdquo; key takes up both positions (4, 1) and (4, 2). At time 0, your left pointer finger is on the &ldquo;4&rdquo; key and your right pointer finger is on the &ldquo;5&rdquo; key. During each time interval, each finger may press the key underneath it, move vertically one position, or move horizontally one position. Although both fingers may move simultaneously within a single time interval,</p>

<ul>
	<li>at most one key may be pressed during any given time interval,</li>
	<li>the left pointer finger&rsquo;s column must always be less than the right pointer finger&rsquo;s column at the end of each time interval, and</li>
	<li>both fingers must always be above one of the 10 keys in the diagram at the end of each time interval (e.g., neither finger cannot hover over position (4, 3)).</li>
</ul>

<p>The &ldquo;0&rdquo; key may be pressed by a finger at either positions (4, 1) or (4, 2).</p>

### 입력

<p>The input test file will contain multiple test cases. Each test case consists of a single line containing a string of between 1 and 100 digits. The end-of-file is marked by a line containing the word &ldquo;eof&rdquo; and should not be processed.</p>

### 출력

<p>For each input case, output the minimum number of time units required to type the given digits.</p>

### 힌트

<ul>
	<li>Typing &ldquo;56&rdquo; takes three time units. At time 1, both left and right fingers have moved one position to the right and are on keys &ldquo;5&rdquo; and &ldquo;6&rdquo; respectively. Then, each key is pressed sequentially.</li>
	<li>Typing &ldquo;71&rdquo; takes five time units. During the first two time units, the left finger moves up to the &ldquo;7&rdquo; and presses the key. However, the right finger is not allowed to be in the same column as the left finger, and hence the left finger takes two time units to get to the &ldquo;1&rdquo; key and one time unit to press it.</li>
</ul>
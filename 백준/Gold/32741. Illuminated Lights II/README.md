# [Gold III] Illuminated Lights II - 32741

[문제 링크](https://www.acmicpc.net/problem/32741)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

수학, 조합론

### 문제 설명

<p>There are $n$ lights in a row, all initially deactivated. Some lights, when activated, will illuminate themselves and all lights to their left. The others, when activated, will illuminate themselves and all lights to their right.</p>

<p>This image shows the result of activating the fourth light (and nothing else) in the first sample case. The first four lights are illuminated, and everything else is not.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32741.%E2%80%85Illuminated%E2%80%85Lights%E2%80%85II/e80bd23c.png" data-original-src="https://boja.mercury.kr/assets/problem/32741-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 100px;"></p>

<p>You have <a href="https://rutgers24.kattis.com/contests/rutgers24/problems/illuminatedlights">already figured out</a> the minimum number of lights that need to be activated to illuminate everything, but now, you're wondering how many <em>good</em> subsets of lights exist.</p>

<p>A subset $S$ of the lights is considered <em>good</em> if when you activate the lights in $S$ (and only the lights in $S$), every light on the row is illuminated.</p>

<p>How many <em>good</em> subsets are there? Since the answer may be large, output it modulo $10^9+7$.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the number of lights.</p>

<p>The next line of each test case contains a string $s$ consisting of $n$ characters <code>L</code> and <code>R</code>,  indicating whether the lights are pointed to the left or right.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print a single integer --- the number of <em>good</em> subsets, taken modulo $10^9+7$.</p>

### 힌트

<p>For the second and fourth test cases, the only way to illuminate everything is to activate every light. Therefore, for these cases, the only good subset is the set containing all lights.</p>

<p>For the third test case, as long as either of the two lights is activated, everything will be illuminated. Therefore, the sets $\{1\}$, $\{2\}$, and $\{1, 2\}$ are good.</p>
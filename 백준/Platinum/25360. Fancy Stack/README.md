# [Platinum II] Fancy Stack - 25360

[문제 링크](https://www.acmicpc.net/problem/25360)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 45, 맞힌 사람: 36, 정답 비율: 52.174%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>Little Fiona has a collection of $n$ blocks of various sizes $a_1, a_2, \ldots, a_n$, where $n$ is even. Some of the blocks can be equal in size. She would like to put all these blocks one onto another to form a <em>fancy</em> stack.</p>

<p>Let $b_1, b_2, \ldots, b_n$ be the sizes of blocks in the stack from top to bottom. Since Fiona is using all her blocks, $b_1, b_2, \ldots, b_n$ must be a permutation of $a_1, a_2, \ldots, a_n$. Fiona thinks the stack is <em>fancy</em> if both of the following conditions are satisfied:</p>

<ul>
	<li>The second block is strictly bigger than the first one, and then each block is alternately strictly smaller or strictly bigger than the previous one. Formally, $b_1 &lt; b_2 &gt; b_3 &lt; b_4 &gt; \ldots &gt; b_{n-1} &lt; b_n$.</li>
	<li>The sizes of the blocks on even positions are strictly increasing. Formally, $b_2 &lt; b_4 &lt; b_6 &lt; \ldots &lt; b_n$ (remember that $n$ is even).</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25360.%E2%80%85Fancy%E2%80%85Stack/b72ef709.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25360.%E2%80%85Fancy%E2%80%85Stack/b72ef709.png" data-original-src="https://upload.acmicpc.net/89a545fd-39db-430c-9063-01271e8bf4c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 223px; height: 128px;" /></p>

<p>Two stacks are considered different if their corresponding sequences $b_1, b_2, \ldots, b_n$ differ in at least one position.</p>

<p>Fiona wants to know how many different fancy stacks she can build with all of her blocks. Since large numbers scare Fiona, find this number modulo $998\,244\,353$.</p>

### 입력

<p>Each input contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 2500$). Description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ --- the number of blocks at Fiona&#39;s disposal ($2 \le n \le 5000$; $n$ is even). The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ --- the sizes of the blocks in non-decreasing order ($1 \le a_1 \le a_2 \le \dotsb \le a_n \le n$).</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $5000$.</p>

### 출력

<p>For each test case, print the number of ways to build a fancy stack, modulo $998\,244\,353$.</p>
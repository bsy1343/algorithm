# [Platinum IV] Padel Prize Pursuit - 28594

[문제 링크](https://www.acmicpc.net/problem/28594)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 세그먼트 트리, 트리

### 문제 설명

<p>There are $N$ participants numbered $0$ to $N-1$ competing in a padel tournament held over $M$ days. Exactly one match is held each day. There are $M$ medals handed out in the tournament, a new one for each match. In the match on day $i$ $(0 \le i \le M-1)$, the two participants numbered $x_i$ and $y_i$ are participating. The following happens in the match:</p>

<ol>
	<li>Participant $x_i$ beats participant $y_i$.</li>
	<li>A new medal is given to the winner $x_i$.</li>
	<li>All of the loser&#39;s current medals are given to the winner.</li>
</ol>

<p>On day $M$ (the day after the last match) the prize ceremony is held. At the ceremony, all medals are collected and then each medal is given to the participant that held that medal the longest. Formally, medal $i$ is given to the participant who held medal $i$ for the most nights (not necessarily in a row), as of day $M$. If two or more participants have held a medal for the same number of nights, the medal is given to the participant with the smallest index among them.</p>

<p>Your goal is to determine how many medals each participant is awarded at the prize ceremony.</p>

### 입력

<p>The first line of input contains the integers $N$ and $M$, the number of participants and number of matches.</p>

<p>Then $M$ lines follow. The $i$th of these lines contains two integers $x_i$ and $y_i$, the participants competing on day $i$, where participant $x_i$ beats participant $y_i$.</p>

### 출력

<p>On the single line of output print $N$ integers, the $k$th number denoting the number of medals that participant $k$ has after the prize ceremony.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 200\,000$.</li>
	<li>$1 \leq M \leq 200\,000$.</li>
	<li>$0 \le x_i, y_i \le N-1$ and $x_i \neq y_i$ (for all $0\le i \le M-1$).</li>
</ul>

### 힌트

<p>For the first sample test case, the following illustration shows who held which medals throughout the tournament. When participant 1 loses on the 3rd day, all her medals are given to participant 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28594.%E2%80%85Padel%E2%80%85Prize%E2%80%85Pursuit/9e88ebca.png" data-original-src="https://upload.acmicpc.net/47411c88-f757-448b-acdc-06741a2d3a78/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 350px; height: 193px;" /></p>

<p>The second sample can be seen below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28594.%E2%80%85Padel%E2%80%85Prize%E2%80%85Pursuit/236eb310.png" data-original-src="https://upload.acmicpc.net/d1a69987-f743-4e8e-af17-4f5459000ac2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 700px; height: 261px;" /></p>

<p>After the prize ceremony, participant 0 is given medals 5 and 6, participant 1 is given medals 3 and 4, and participant 2 is given medals 0, 1 and 2.</p>
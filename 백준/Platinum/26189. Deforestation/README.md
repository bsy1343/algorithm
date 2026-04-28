# [Platinum V] Deforestation - 26189

[문제 링크](https://www.acmicpc.net/problem/26189)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 127, 정답: 63, 맞힌 사람: 46, 정답 비율: 56.790%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You want to remove a big tree from your property, but it's too big for you to carry all at once. How many pieces do you have to cut it into if the maximum weight you can carry is $W$?</p>
<p>The tree has a single trunk connected to the ground and can split out into multiple branches. All of those branches can branch out further etc. So each segment of the tree is a continuous mass of wood, which may or may not split out into multiple branches.</p>
<p>You can make cuts at any point on the tree; start, end, or anywhere in the middle of any segment. You can consider branching as an arbitrarily small part of the tree, i.e. you can cut immediately before or after a branch splits off without increasing the weight of the base branch, but it will affect whether the child branches are cut off as a single piece or just one branch is cut off separately. </p>

### 입력

<p>The first line of the input will contain $W$, your carrying capacity.
The next line will continue with the description of the first tree segment; its trunk.</p>
<p>A tree segment description is defined recursively. The first line contains two numbers $M$, weight of the segment, and $N$, number of branches coming out of the segment at its end. This is followed by $N$ tree segment descriptions, describing each one of the branches.</p>

### 출력

<p>Output one number, the number of pieces you have to cut the tree into.</p>

### 제한

<ul>
	<li>$1 \leq W, M \leq 10^9$</li>
	<li>$0 \leq N \leq 10^5$</li>
	<li>Total weight of all tree segments will not exceed $10^9$.</li>
	<li>Total number of segments will not exceed $10^5$.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26189.%E2%80%85Deforestation/6e484897.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26189.%E2%80%85Deforestation/6e484897.png" data-original-src="https://upload.acmicpc.net/b2b1618b-e6f8-4bae-abab-dcf6bdfaf152/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Image shows some possible solutions of sample test cases.</p>
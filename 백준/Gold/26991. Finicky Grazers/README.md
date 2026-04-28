# [Gold III] Finicky Grazers - 26991

[문제 링크](https://www.acmicpc.net/problem/26991)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 15, 맞힌 사람: 11, 정답 비율: 35.484%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John&#39;s N (1 &le; N &le; 10,000) cows (conveniently numbered 1..N) graze in a straight line in their pasture whose length is L+1 (N &le; L &le; 100,000) meters. Every morning, they place themselves at various unique integer locations along that line. FJ has observed that the cows produce more milk when the distance to the other grazing cows is maximized.</p>

<p>Always the enterprising farmer, FJ wants to maximize the distance between each and every pair of neighboring cows by moving the cows to the right or left, but always with integer inter-cow spacing and never changing their order on the line. He spends 1 minute to move a cow 1 meter. When he&#39;s finished, he knows that the distances between every adjacent pair of cows will be one of two integers: D or D+1.</p>

<p>Help FJ to calculate minimum time he needs to arrange the positions of the cows.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and L</li>
	<li>Lines 2..N+1: Line i+1 describes cow i with a single integer (range 0..L) representing the position of a cow; 0 is the left-most position. The list is sorted by position with the smallest position value first.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single line with minimum time FJ needs to arrange the positions of the cows.</li>
</ul>
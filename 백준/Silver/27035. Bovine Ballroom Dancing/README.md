# [Silver V] Bovine Ballroom Dancing - 27035

[문제 링크](https://www.acmicpc.net/problem/27035)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 118, 정답: 106, 맞힌 사람: 94, 정답 비율: 94.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Cows are remarkably bad dancers.  Nonetheless, Farmer John has discovered that graceful cows tend to produce more milk and therefore has enrolled his entire herd cows in a ballroom dance class.  In the first class meeting, the N (1 &le; N &le; 1,000) boy cows (a.k.a. bulls) and N girl cows in the herd must first be paired up into couples.  Two cows make a good couple if they have relatively similar heights (i.e., the difference of their heights is small).  Given the heights of all the cows, your task is to find a pairing-up of the cows that minimizes the total sum of all height differences over all couples.</p>

### 입력

<ul>
	<li>Line 1: The single integer N.</li>
	<li>Lines 2..N+1: Each line contains an integer giving the height of a boy cow.</li>
	<li>Lines N+2..2N+1: Each line contains an integer giving the height of a girl cow.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer giving the sum of height differences in an &quot;optimal&quot;  pairing up of the cows.</li>
</ul>

### 힌트

<p>There are 4 boy cows of heights 2, 8, 5, and 5, and there are 4 girl cows of heights 1, 4, 10, and 7.</p>

<p>The best pairing is as follows (in terms of heights): 2-1 8-10 5-4 5-7. The total sum of height difference for this pairing is 6.</p>
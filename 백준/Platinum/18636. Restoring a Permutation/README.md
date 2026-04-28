# [Platinum III] Restoring a Permutation - 18636

[문제 링크](https://www.acmicpc.net/problem/18636)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 18, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>You are given a positive integer n and two arrays a and b containing n integers each.</p>

<p>You need to find permutation p of length n such that for each i &isin; {1, 2, . . . , n} the following two conditions are satisfied:</p>

<ul>
	<li>the length of longest increasing subsequence of p ending at position i is equal to a<sub>i</sub>,</li>
	<li>the length of longest decreasing subsequence of p starting at position i is equal to b<sub>i</sub>.</li>
</ul>

### 입력

<p>The first line of input contains a positive integer n (1 &le; n &le; 2 &middot; 10<sup>5</sup>), the length of the permutation.</p>

<p>The second line contains n integers a<sub>1</sub>, a<sub>2</sub> . . . , a<sub>n</sub>, where a<sub>i</sub> (1 &le; a<sub>i</sub> &le; n): the length of longest increasing subsequence ending at position i.</p>

<p>The third line contains n integers b<sub>1</sub>, b<sub>2</sub> . . . , b<sub>n</sub>, where b<sub>i</sub> (1 &le; b<sub>i</sub> &le; n): the length of longest decreasing subsequence starting at position i.</p>

### 출력

<p>Print a line containing n space-separated integers p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>: the desired permutation.</p>

<p>It is guaranteed that the answer exists. If there are multiple solutions, you may print any one of them.</p>
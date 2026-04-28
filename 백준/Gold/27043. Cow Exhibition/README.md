# [Gold III] Cow Exhibition - 27043

[문제 링크](https://www.acmicpc.net/problem/27043)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>&quot;Fat and docile, big and dumb, they look so stupid, they aren&#39;t much fun...&quot;</p>

<p>- Cows with Guns by Dana Lyons</p>

<p>The cows want to prove to the public that they are both smart and fun. In order to do this, Bessie has organized an exhibition that will be put on by the cows. She has given each of the N (1 &le; N &le; 100) cows a thorough interview and determined two values for each cow: the smartness Si (-1000 &le; Si &le; 1000) of the cow and the funness Fi (-1000 &le; Fi &le; 1000) of the cow.</p>

<p>Bessie must choose which cows she wants to bring to her exhibition. She believes that the total smartness TS of the group is the sum of the Si&#39;s and, likewise, the total funness TF of the group is the sum of the Fi&#39;s. Bessie wants to maximize the sum of TS and TF, but she also wants both of these values to be non-negative (since she must also show that the cows are well-rounded; a negative TS or TF would ruin this).  Help Bessie maximize the sum of TS and TF without letting either of these values become negative.</p>

### 입력

<ul>
	<li>Line 1: A single integer N, the number of cows</li>
	<li>Lines 2..N+1: Two space-separated integers Si and Fi, respectively the smartness and  funness for each cow.</li>
</ul>

### 출력

<ul>
	<li>Line 1: One integer: the optimal sum of TS and TF such that both TS and TF are  non-negative.  If no subset of the cows has non-negative TS and non- negative TF, print 0.</li>
</ul>

### 힌트

<p>Bessie chooses cows 1, 3, and 4, giving values of TS = -5+6+2 = 3 and TF = 7-3+1 = 5, so 3+5 = 8.  Note that adding cow 2 would improve the value of TS+TF to 10, but the new value of TF would be negative, so it is not allowed.</p>
# [Platinum V] Scales - 26995

[문제 링크](https://www.acmicpc.net/problem/26995)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 35, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

수학, 애드 혹, 이분 탐색, 중간에서 만나기

### 문제 설명

<p>Farmer John has a balance for weighing the cows. He also has a set of N (1 &le; N &le; 1000) weights with known masses (all of which fit in 31 bits) for use on one side of the balance. He places a cow on one side of the balance and then adds weights to the other side until they balance. (FJ cannot put weights on the same side of the balance as the cow, because cows tend to kick weights in his face whenever they can.) The balance has a maximum mass rating and will break if FJ uses more than a certain total mass C (1 &le; C &lt; 2^30) on one side.</p>

<p>The weights have the curious property that when lined up from smallest to biggest, each weight (from the third one on) has at least as much mass as the previous two combined.</p>

<p>FJ wants to determine the maximum mass that he can use his weights to measure exactly. Since the total mass must be no larger than C, he might not be able to put all the weights onto the scale.</p>

<p>Write a program that, given a list of weights and the maximum mass the balance can take, will determine the maximum legal mass that he can weigh exactly.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated positive integers, N and C.</li>
	<li>Lines 2..N+1: Each line contains a single positive integer that is the mass of one weight. The masses are guaranteed to be in non-decreasing order.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the largest mass that can be accurately and safely measured.</li>
</ul>
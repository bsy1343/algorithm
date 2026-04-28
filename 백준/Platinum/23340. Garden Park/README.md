# [Platinum IV] Garden Park - 23340

[문제 링크](https://www.acmicpc.net/problem/23340)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 41, 맞힌 사람: 41, 정답 비율: 51.899%

### 분류

다이나믹 프로그래밍, 정렬, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>In the Garden park, there are n places of interest (numbered from 1 to n) and n &minus; 1 trails (numbered from 1 to n &minus; 1) connecting the places of interest. For every i &isin; {1, 2, ..., n &minus; 1}, trail i has two ends at place a<sub>i</sub> and place b<sub>i</sub>, and the trail does not pass any place of interest except its ends. Moreover, the trails do not have any intersection except the ends.</p>

<p>To protect the garden, visitors may only walk along the trails (in any direction) and inside the places of interest. For any pair of places of interest (x, y) where x &ne;&nbsp;y, there exists a sequence of trails s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>k</sub> satisfying the following conditions.</p>

<ul>
	<li>Place x is an end of trail s<sub>1</sub>.</li>
	<li>Place y is an end of trail s<sub>k</sub>.</li>
	<li>For 1 &le; i &lt; k, trail s<sub>i</sub> and trail s<sub>i+1</sub> have a common end.</li>
	<li>If place z is the common end of trails s<sub>i</sub> and s<sub>i+1</sub> for some i &isin; {1, ..., k &minus; 1}, then z cannot be a common end of any other pairs of trails in s<sub>1</sub>, ..., s<sub>k</sub>.</li>
</ul>

<p>In other words, a visitor move from x to y by walking along the trails s<sub>1</sub>, ..., s<sub>k</sub> without visiting a place of interest twice. Such a sequence is called a simple path from x to y. The administration division of the park plans to host an event in the park. It puts labels on the trails. For trail t, the label on t is an integer ℓ(t), and a visitor can learn ℓ(t) by walking through trail t. A simple path s<sub>1</sub>, ..., s<sub>k</sub> from x to y is with strictly increasing labels if ℓ(s<sub>1</sub>) &lt; ℓ(s<sub>2</sub>) &lt; &middot;&middot;&middot; &lt; ℓ(s<sub>k</sub>). By reporting m distinct simple paths with strictly increasing labels to the administration division, a visitor may win m free tickets for future visits.</p>

<p>Your friend George just visited the park, and learned all labels on the trails. He wants to win free tickets for future visits with you. Please write a program to compute the number of distinct simple paths with strictly increasing labels in the garden park.</p>

### 입력

<p>The first line contains one integers n. The (i + 1)-th line contains three integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>. Trail i connects place a<sub>i</sub> and b<sub>i</sub>, and the label ℓ(i) on trail i is c<sub>i</sub>.</p>

### 출력

<p>Output the number of distinct simple paths with strictly increasing labels in the garden park.</p>

### 제한

<ul>
	<li>1 &le; n &le; 2 &times; 10<sup>5</sup></li>
	<li>1 &le; a<sub>i</sub> &le; n for i &isin; {1, 2, ..., n}.</li>
	<li>1 &le; b<sub>i</sub> &le; n for i &isin; {1, 2, ..., n}.</li>
	<li>0 &le; c<sub>i</sub> &le; 10<sup>9</sup> for i &isin; {1, 2, ..., n}.</li>
	<li>a<sub>i</sub> &ne;&nbsp;b<sub>i</sub> for i &isin; {1, 2, ..., n}.</li>
</ul>
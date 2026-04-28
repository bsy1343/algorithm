# [Platinum III] Beauty Contest - 27046

[문제 링크](https://www.acmicpc.net/problem/27046)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 271, 정답: 196, 맞힌 사람: 177, 정답 비율: 73.140%

### 분류

기하학, 볼록 껍질, 회전하는 캘리퍼스

### 문제 설명

<p>Bessie, Farmer John&#39;s prize cow, has just won first place in a bovine beauty contest, earning the title &#39;Miss Cow World&#39;.  As a result, Bessie will make a tour of N (2 &le; N &le; 50,000) farms around the world in order to spread goodwill between farmers and their cows.  For simplicity, the world will be represented as a two-dimensional plane, where each farm is located at a pair of integer coordinates (x,y), each having a value in the range  -10,000 ... 10,000.  No two farms share the same pair of coordinates.</p>

<p>Even though Bessie travels directly in a straight line between pairs of farms, the distance between some farms can be quite large, so she wants to bring a suitcase full of hay with her so she has enough food to eat on each leg of her journey.  Since Bessie refills her suitcase at every farm she visits, she wants to determine the maximum possible distance she might need to travel so she knows the size of suitcase she must bring. Help Bessie by computing the maximum distance among all pairs of farms.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Two space-separated integers x and y specifying coordinate of each farm</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the squared distance between the pair of farms  that are farthest apart from each other.</li>
</ul>

### 힌트

<p>Farm 1 (0, 0) and farm 3 (1, 1) have the longest distance (square root of 2)</p>
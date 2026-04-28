# [Platinum IV] Barn Expansion - 7039

[문제 링크](https://www.acmicpc.net/problem/7039)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 24, 맞힌 사람: 20, 정답 비율: 50.000%

### 분류

자료 구조, 정렬, 애드 혹, 이분 탐색, 집합과 맵, 스위핑, 트리를 사용한 집합과 맵, 값 / 좌표 압축

### 문제 설명

<p>Farmer John has N (1 &le; N &le;&nbsp;25,000) rectangular barns on his farm, all with sides parallel to the X and Y axes and integer corner coordinates in the range 0..1,000,000. These barns do not overlap although they may share corners and/or sides with other barns.</p>

<p>Since he has extra cows to milk this year, FJ would like to expand some of his barns. A barn has room to expand if it does not share a corner or a wall with any other barn. That is, FJ can expand a barn if all four of its walls can be pushed outward by at least some amount without bumping into another barn. If two barns meet at a corner, neither barn can expand.</p>

<p>Please determine how many barns have room to expand.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Four space-separated integers A, B, C, and D, describing one barn. The lower-left corner of the barn is at (A,B) and the upper right corner is at (C,D).</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of barns that can be expanded.</li>
</ul>

### 힌트

<p>There are 5 barns. The first barn has its lower-left corner at (0,2) and its upper-right corner at (2,7), and so on.</p>

<p>Only two barns can be expanded --- the first two listed in the input. All other barns are each in contact with at least one other barn.</p>
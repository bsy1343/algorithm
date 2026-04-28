# [Gold V] Feeding Seals - 17799

[문제 링크](https://www.acmicpc.net/problem/17799)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 227, 정답: 130, 맞힌 사람: 105, 정답 비율: 62.500%

### 분류

그리디 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>You are in charge of feeding the seals in the Welsh Mountain Zoo. This involves purchasing buckets of fish and allocating them to volunteers to trek into the enclosure and distribute fairly to the blubbery residents.</p>

<p>The buckets of fish are already set out. Each volunteer can be assigned to carry either one or two of these buckets, as long as the combined weight of the buckets is small enough.</p>

<p>How many volunteers will you need to distribute all of the fish in one trip?</p>

### 입력

<ul>
	<li>The first line contains the number of buckets to be delivered, n (1 &le; n &le; 10<sup>5</sup>), and the integer carrying capacity of a volunteer, c (1 &le; c &le; 10<sup>9</sup>).</li>
	<li>The second line contains the integer weights of each of the n buckets, w<sub>1</sub> . . . w<sub>n</sub> (1 &le; w &le; c).</li>
</ul>

### 출력

<p>Output the minimum number of volunteers required to deliver all of the buckets of fish.</p>
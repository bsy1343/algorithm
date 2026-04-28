# [Platinum III] Steady Cow Assignment - 26979

[문제 링크](https://www.acmicpc.net/problem/26979)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 20, 맞힌 사람: 12, 정답 비율: 42.857%

### 분류

브루트포스 알고리즘, 최대 유량, 그래프 이론

### 문제 설명

<p>Farmer John&#39;s N (1 &le; N &le; 1000) cows each reside in one of B (1 &le; B &le; 20) barns which, of course, have limited capacity. Some cows really like their current barn, and some are not so happy.</p>

<p>FJ would like to rearrange the cows such that the cows are as equally happy as possible, even if that means all the cows hate their assigned barn.</p>

<p>Each cow gives FJ the order in which she prefers the barns. A cow&#39;s happiness with a particular assignment is her ranking of her barn. Your job is to find an assignment of cows to barns such that no barn&#39;s capacity is exceeded and the size of the range (i.e., one more than the positive difference between the the highest-ranked barn chosen and that lowest-ranked barn chosen) of barn rankings the cows give their assigned barns is as small as possible.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and B</li>
	<li>Lines 2..N+1: Each line contains B space-separated integers which are exactly 1..B sorted into some order. The first integer on line i+1 is the number of the cow i&#39;s top-choice barn, the second integer on that line is the number of the i&#39;th cow&#39;s second-choice barn, and so on.</li>
	<li>Line N+2: B space-separated integers, respectively the capacity of the first barn, then the capacity of the second, and so on. The sum of these numbers is guaranteed to be at least N.</li>
</ul>

### 출력

<ul>
	<li>Line 1: One integer, the size of the minumum range of barn rankings the cows give their assigned barns, including the endpoints.</li>
</ul>
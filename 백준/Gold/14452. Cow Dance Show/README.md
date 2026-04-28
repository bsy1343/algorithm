# [Gold IV] Cow Dance Show - 14452

[문제 링크](https://www.acmicpc.net/problem/14452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1021, 정답: 500, 맞힌 사람: 399, 정답 비율: 47.331%

### 분류

자료 구조, 이분 탐색, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<p>After several months of rehearsal, the cows are just about ready to put on their annual dance performance; this year they are performing the famous bovine ballet &quot;Cowpelia&quot;.</p>

<p>The only aspect of the show that remains to be determined is the size of the stage. A stage of size&nbsp;K&nbsp;can support&nbsp;K&nbsp;cows dancing simultaneously. The&nbsp;N&nbsp;cows in the herd (1 &le; N &le; 10,000) are conveniently numbered&nbsp;1&hellip;N in the order in which they must appear in the dance. Each cow&nbsp;i&nbsp;plans to dance for a specific duration of time&nbsp;d(i). Initially, cows&nbsp;1&hellip;K appear on stage and start dancing. When the first of these cows completes her part, she leaves the stage and cow&nbsp;K+1 immediately starts dancing, and so on, so there are always&nbsp;K&nbsp;cows dancing (until the end of the show, when we start to run out of cows). The show ends when the last cow completes her dancing part, at time&nbsp;T.</p>

<p>Clearly, the larger the value of&nbsp;K, the smaller the value of&nbsp;T. Since the show cannot last too long, you are given as input an upper bound&nbsp;T<sub>max</sub> specifying the largest possible value of&nbsp;T. Subject to this constraint, please determine the smallest possible value of&nbsp;K.</p>

### 입력

<p>The first line of input contains&nbsp;N&nbsp;and&nbsp;T<sub>max</sub>, where&nbsp;T<sub>max</sub> is an integer of value at most 1 million.</p>

<p>The next&nbsp;N&nbsp;lines give the durations&nbsp;d(1)&hellip;d(N) of the dancing parts for cows&nbsp;1&hellip;N. Each&nbsp;d(i) value is an integer in the range&nbsp;1&hellip;100,000.</p>

<p>It is guaranteed that if&nbsp;K=N, the show will finish in time.</p>

<p>&nbsp;</p>

### 출력

<p>Print out the smallest possible value of&nbsp;K&nbsp;such that the dance performance will take no more than&nbsp;T<sub>max</sub> units of time.</p>
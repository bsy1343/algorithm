# [Platinum V] Splitting the Field - 12011

[문제 링크](https://www.acmicpc.net/problem/12011)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 430, 정답: 183, 맞힌 사람: 148, 정답 비율: 43.787%

### 분류

기하학, 누적 합, 스위핑

### 문제 설명

<p>Farmer John&#39;s \(N\) cows (\(3 \leq N \leq 50,000\)) are all located at distinct positions in his two-dimensional field. FJ wants to enclose all of the cows with a rectangular fence whose sides are parallel to the x and y axes, and he wants this fence to be as small as possible so that it contains every cow (cows on the boundary are allowed).</p>

<p>FJ is unfortunately on a tight budget due to low milk production last quarter. He would therefore like to enclose a smaller area to reduce maintenance costs, and the only way he can see to do this is by building two enclosures instead of one. Please help him compute how much less area he needs to enclose, in total, by using two enclosures instead of one. Like the original enclosure, the two enclosures must collectively contain all the cows (with cows on boundaries allowed), and they must have sides parallel to the x and y axes. The two enclosures are not allowed to overlap -- not even on their boundaries. Note that enclosures of zero area are legal, for example if an enclosure has zero width and/or zero height.</p>

### 입력

<p>The first line of input contains \(N\). The next \(N\) lines each contain two integers specifying the location of a cow. Cow locations are positive integers in the range \(1 \ldots 1,000,000,000\).</p>

### 출력

<p>Write a single integer specifying amount of total area FJ can save by using two enclosures instead of one.</p>
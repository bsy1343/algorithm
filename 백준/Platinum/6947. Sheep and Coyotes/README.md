# [Platinum IV] Sheep and Coyotes - 6947

[문제 링크](https://www.acmicpc.net/problem/6947)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 9, 맞힌 사람: 6, 정답 비율: 20.000%

### 분류

기하학

### 문제 설명

<p>A square $1000$ by $1000$ field contains several sheep. A coyote enters the field at some point in the south boundary and proceeds to eat the sheep closest to the point of entry, picking arbitrarily if more than one sheep is equally close. The coyote, being sated, then leaves the field.</p>

<p>Your job is to determine which sheep may be eaten by the coyote.</p>

<p>Assume that the southwest corner of the field is located at $(0.00, 0.00)$, the northwest corner at $(0.00, 1000.00)$, the northeast corner at $(1000.00, 1000.00)$ and the southeast corner at $(1000.00, 0.00)$.</p>

### 입력

<p>The first line of input gives the number of sheep, between $1$ and $1000$. For each sheep a pair of lines follows, giving its coordinates within the field (between $0.00$ and $1000.00$).</p>

### 출력

<p>For each sheep that might be eaten print a line <code>The sheep at (x, y) might be eaten.</code> where $x$ and $y$ give the location of the sheep to two decimal places. The sheep can be listed in any order in the output.</p>
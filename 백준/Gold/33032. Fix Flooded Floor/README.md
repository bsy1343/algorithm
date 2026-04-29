# [Gold III] Fix Flooded Floor - 33032

[문제 링크](https://www.acmicpc.net/problem/33032)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 60, 정답: 37, 맞힌 사람: 30, 정답 비율: 68.182%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>Archimedes conducted his famous experiments on buoyancy. But not everyone knows that while he was taking a bath, he was too focused and didn't notice the moment when the water overflowed over the edge of the bath and flooded the floor near the wall. His expensive parquet was irreversibly damaged!</p>

<p>Archimedes noticed that not all was lost, and there were still several undamaged parquet pieces. The parquet near the wall had the shape of a long narrow stripe of $2\times n$ cells. Archimedes had an unlimited supply of $1\times 2$ parquet pieces that could be placed parallel or perpendicular to the wall. Archimedes didn't want to cut the parquet pieces. As a great scientist, he figured out that there was exactly one way to restore the parquet by filling the damaged area of the parquet with the non-overlapping $1\times 2$ cell shaped pieces.</p>

<p>Help historians to check Archimedes' calculations. For the given configuration of the $2\times n$ parquet floor, determine whether there is exactly one way to fill the damaged parquet cells with the $1\times 2$ cell parquet pieces. If Archimedes was wrong, find out whether there are multiple ways to restore the parquet, or there are no ways at all.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \le T \le 10^4$) --- the number of test cases to solve.</p>

<p>Then the description of test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2\cdot 10^5$) --- the length of the parquet floor.</p>

<p>The following two lines contain exactly $n$ characters each and describe the parquet, where '<code>.</code>' denotes a damaged cell and '<code>\#</code>' denotes an undamaged cell.</p>

<p>The total sum of $n$ in all $T$ test cases doesn't exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print "<code>Unique</code>" if there is exactly one way to restore the parquet, "<code>Multiple</code>" if there are multiple ways to do so, or "<code>None</code>" if it is impossible to restore the parquet.</p>
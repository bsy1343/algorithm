# [Platinum II] Balanced Cow Subsets - 5879

[문제 링크](https://www.acmicpc.net/problem/5879)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 411, 정답: 95, 맞힌 사람: 71, 정답 비율: 21.846%

### 분류

비트마스킹, 중간에서 만나기

### 문제 설명

<p>Farmer John&apos;s owns N cows (2 &lt;= N &lt;= 20), where cow i produces M(i) units of milk each day (1 &lt;= M(i) &lt;= 100,000,000).  FJ wants to streamline the process of milking his cows every day, so he installs a brand new milking machine in his barn.  Unfortunately, the machine turns out to be far too sensitive: it only works properly if the cows on the left side of the barn have the exact same total milk output as the cows on the right side of the barn!</p><p>Let us call a subset of cows &quot;balanced&quot; if it can be partitioned into two groups having equal milk output.  Since only a balanced subset of cows can make the milking machine work, FJ wonders how many subsets of his N cows are balanced.  Please help him compute this quantity.</p>

### 입력

<ul><li>Line 1: The integer N.</li><li>Lines 2..1+N: Line i+1 contains M(i).</li></ul>

### 출력

<ul><li>Line 1: The number of balanced subsets of cows.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 cows, with milk outputs 1, 2, 3, and 4.</p><h4>Output Details</h4><p>There are three balanced subsets: the subset {1,2,3}, which can be partitioned into {1,2} and {3}, the subset {1,3,4}, which can be partitioned into {1,3} and {4}, and the subset {1,2,3,4} which can be partitioned into {1,4} and {2,3}.</p>
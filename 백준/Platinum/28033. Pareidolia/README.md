# [Platinum IV] Pareidolia - 28033

[문제 링크](https://www.acmicpc.net/problem/28033)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 178, 정답: 80, 맞힌 사람: 65, 정답 비율: 45.775%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Pareidolia is the phenomenon where your eyes tend to see familiar patterns in images where none really exist -- for example seeing a face in a cloud. As you might imagine, with Farmer John&#39;s constant proximity to cows, he often sees cow-related patterns in everyday objects. For example, if he looks at the string &quot;bqessiyexbesszieb&quot;, Farmer John&#39;s eyes ignore some of the letters and all he sees is &quot;bessiebessie&quot;.</p>

<p>Given a string $s$, let $B(s)$ represent the maximum number of repeated copies of &quot;bessie&quot; one can form by deleting zero or more of the characters from $s$. In the example above, $B($&quot;bqessiyexbesszieb&quot;$) = 2$.</p>

<p>Computing $B(s)$ is an interesting challenge, but Farmer John is interested in solving a challenge that is even more interesting: Given a string $t$ of length at most $3\cdot 10^5$ consisting only of characters a-z, compute the sum of $B(s)$ over all contiguous substrings $s$ of $t$.</p>

### 입력

<p>The input consists of a nonempty string of length at most $3\cdot 10^5$ whose characters are all lowercase English letters.</p>

### 출력

<p>Output a single number, the total number of bessies that can be made across all substrings of the input string.</p>
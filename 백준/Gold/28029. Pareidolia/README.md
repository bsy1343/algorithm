# [Gold I] Pareidolia - 28029

[문제 링크](https://www.acmicpc.net/problem/28029)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 43, 맞힌 사람: 41, 정답 비율: 71.930%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Pareidolia is the phenomenon where your eyes tend to see familiar patterns in images where none really exist -- for example seeing a face in a cloud. As you might imagine, with Farmer John&#39;s constant proximity to cows, he often sees cow-related patterns in everyday objects. For example, if he looks at the string &quot;bqessiyexbesszieb&quot;, Farmer John&#39;s eyes ignore some of the letters and all he sees is &quot;bessiexbessieb&quot; -- a string that has contains two contiguous substrings equal to &quot;bessie&quot;.</p>

<p>Given a string of length at most $2\cdot 10^5$ consisting only of characters a-z, where each character has an associated deletion cost, compute the maximum number of contiguous substrings that equal &quot;bessie&quot; you can form by deleting zero or more characters from it, and the minimum total cost of the characters you need to delete in order to do this.</p>

### 입력

<p>The first line contains the string. The second line contains the deletion cost associated with each character (an integer in the range $[1,1000]$).</p>

### 출력

<p>The maximum number of occurrences, and the minimum cost to produce this number of occurrences.</p>
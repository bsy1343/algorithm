# [Platinum III] First! - 5861

[문제 링크](https://www.acmicpc.net/problem/5861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 197, 정답: 66, 맞힌 사람: 47, 정답 비율: 34.058%

### 분류

자료 구조, 그래프 이론, 트리, 방향 비순환 그래프, 트라이

### 문제 설명

<p>Bessie has been playing with strings again. She found that by changing the order of the alphabet she could make some strings come before all the others lexicographically (dictionary ordering).</p><p>For instance Bessie found that for the strings &quot;omm&quot;, &quot;moo&quot;, &quot;mom&quot;, and &quot;ommnom&quot; she could make &quot;mom&quot; appear first using the standard alphabet and that she could make &quot;omm&quot; appear first using the alphabet &quot;abcdefghijklonmpqrstuvwxyz&quot;.  However, Bessie couldn&apos;t figure out any way to make &quot;moo&quot; or &quot;ommnom&quot; appear first.</p><p>Help Bessie by computing which strings in the input could be lexicographically first by rearranging the order of the alphabet.  To compute if string X is lexicographically before string Y find the index of the first character in which they differ, j.  If no such index exists then X is lexicographically before Y if X is shorter than Y.  Otherwise X is lexicographically before Y if X[j] occurs earlier in the alphabet than Y[j].</p>

### 입력

<ul><li>Line 1: A single line containing N (1 &lt;= N &lt;= 30,000), the number of strings Bessie is playing with.</li><li>Lines 2..1+N: Each line contains a non-empty string.  The total number of characters in all strings will be no more than 300,000.  All characters in input will be lowercase characters &apos;a&apos; through &apos;z&apos;.  Input will contain no duplicate strings.</li></ul>

### 출력

<ul><li>Line 1: A single line containing K, the number of strings that could be lexicographically first.</li><li>Lines 2..1+K: The (1+i)th line should contain the ith string that could be lexicographically first.  Strings should be output in the same order they were given in the input.</li></ul>

### 힌트

<h4>Input Details</h4><p>The example from the problem statement.</p><h4>Output Details</h4><p>Only &quot;omm&quot; and &quot;mom&quot; can be ordered first.</p>
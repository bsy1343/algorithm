# [Gold II] Dessert - 27081

[문제 링크](https://www.acmicpc.net/problem/27081)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 246, 정답: 125, 맞힌 사람: 88, 정답 비율: 48.889%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>FJ has a new rule about the cows lining up for dinner. Not only must the N (3 &le; N &le; 15) cows line up for dinner in order, but they must place a napkin between each pair of cows with a &quot;+&quot;, &quot;-&quot;, or &quot;.&quot; on it. In order to earn their dessert, the cow numbers and the napkins must form a numerical expression that evaluates to 0. The napkin with a &quot;.&quot; enables the cows to build bigger numbers. Consider this equation for seven cows:</p>

<pre style="text-align: center;">
1 - 2 . 3 - 4 . 5 + 6 . 7</pre>

<p>This means 1-23-45+67, which evaluates to 0. You job is to assist the cows in getting dessert. (Note: &quot;... 10 . 11 ...&quot;) will use the number 1011 in its calculation.)</p>

### 입력

<p>One line with a single integer, N</p>

### 출력

<p>One line of output for each of the first 20 possible expressions -- then a line with a single integer that is the total number of possible answers. Each expression line has the general format of number, space, napkin, space, number, space, napkin, etc. etc. The output order is lexicographic, with &quot;+&quot; coming before &quot;-&quot; coming before &quot;.&quot;. If fewer than 20 expressions can be formed, print all of the expressions.</p>
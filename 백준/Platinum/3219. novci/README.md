# [Platinum III] novci - 3219

[문제 링크](https://www.acmicpc.net/problem/3219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 11, 맞힌 사람: 10, 정답 비율: 25.000%

### 분류

2-sat, 그래프 이론, 강한 연결 요소

### 문제 설명

<p>John and Ted are playing a very interesting game.</p>

<p>John throws a bunch of coins on the table, takes them back one by one, puts them in his pocket and writes P if the coin&#39;s upper side was head or G if it was tail.</p>

<p>This way, John will get a random sequence of characters P and G, and then make a number of statements of the form:</p>

<p>&quot;the i-th letter is X or the j-th letter is Y&quot;</p>

<p>where i and j are different numbers, X and Y are either P or G (independent of each other), and at least one of the claims in the statement is true.</p>

<p>Ted is sitting on his sofa on the other side of the room, listening to John and trying to determine his sequence based on the statements he makes.</p>

<p>Write a program that will help Ted determine any sequence (if one exists) of characters so that at least one claim is true in all of John&#39;s statements.&nbsp;</p>

### 입력

<p>The first line of input contains an integer L, 2 &le; L &le; 1000, the length of the sequence.</p>

<p>The second line of input contains an integer N, 1 &le; N &le; 100,000, the number of statements.</p>

<p>Each of the following lines contains a statement of the form:</p>

<pre>
i X j Y</pre>

<p>1 &le; i, j &le; L, i and j are different, and X and Y are both either &#39;P&#39; or &#39;G&#39;.&nbsp;</p>

### 출력

<p>The first and only line of output should contain the discovered sequence.</p>

<p>If there is no such sequence, output -1.</p>

<p>Note: the solution need not be unique.</p>
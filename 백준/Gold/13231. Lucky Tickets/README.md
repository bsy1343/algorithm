# [Gold IV] Lucky Tickets - 13231

[문제 링크](https://www.acmicpc.net/problem/13231)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 73, 맞힌 사람: 59, 정답 비율: 70.238%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>All bus and train tickets in Soviet Union had an identifier with an even number of digits (2*N). In many places in Russia and Kazakhstan there are tickets still like this. A ticket is called lucky if the sum of the first half of the digits of its identifier is equal to the sum of its last half of the digits​.</p>

<p>Many children believe that if you eat such ticket, something good will happen to you.</p>

<p>Let&rsquo;s find out how many lucky tickets exist!</p>

### 입력

<p>The first line is the number of test cases T (1 &lt;= T &lt;= 100).</p>

<p>Each of the following T lines contains one integer number N (where 2N is the number of digits in the ticket&rsquo;s identifier and 1 &lt;= N &lt;= 500);</p>

### 출력

<p>For ith test case print a line containing: &quot;Case #i: &quot; followed by the number of lucky tickets with 2N&shy;digit identifiers. The numbers get quite large soon so print the numbers modulo 1000000007 (10^9 + 7).</p>
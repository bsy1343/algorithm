# [Bronze I] The Middle Squares - 27037

[문제 링크](https://www.acmicpc.net/problem/27037)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 200, 정답: 89, 맞힌 사람: 83, 정답 비율: 44.624%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Bessie&#39;s daghter, Cassie, returned from calf school with a new math problem. &quot;I&#39;m not sure I can do all the arithmetic,&quot; she whined.</p>

<p>&quot;What is it you&#39;re doing?&quot; asked her concerned mother.</p>

<p>&quot;We are given a positive integer N less than 10,000,&quot; Cassie replied. &quot;We treat it as four digit number, even if it&#39;s like 12 or something. We extract the second and third digits to create a new number which we then square to create another four digit number. We repeat that until we get to some number that we have already seen.&quot;</p>

<p>Help poor Cassie with her homework. Here is an example that starts with the number 4444:</p>

<pre>
  N    2nd&amp;3rd  Squared
4444 ... 0044 ... 1936
1936 ... 0093 ... 8649
8649 ... 0064 ... 4096
4096 ... 0009 ... 0081
0081 ... 0008 ... 0064
0064 ... 0006 ... 0036
0036 ... 0003 ... 0009
0009 ... 0000 ... 0000
0000 ... 0000 ... 0000</pre>

<p>This example required nine iterations to complete. The number 0000 results in a loop, since its resulting middle square is also 0000.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of iterations before some number is  duplicated.</li>
</ul>
# [Gold II] sorting - 5261

[문제 링크](https://www.acmicpc.net/problem/5261)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 64 MB

### 통계

제출: 55, 정답: 19, 맞힌 사람: 16, 정답 비율: 57.143%

### 분류

수학, 정수론

### 문제 설명

<p>Little P has just learned the shell-sort sorting algorithm. He was given some code that sorts an array of N integers in ascending order. Let A be the array to be sorted.</p>

<pre>
gap = X;
do
{  ok = 1;
&nbsp;  for (i = 1; i&lt;= N - gap; i++)
&nbsp;     if (A[i] &gt; A[i+gap])
&nbsp;       {  temp = A[i];
&nbsp;          A[i] = A[i+gap];
&nbsp;          A[i+gap] = temp;
&nbsp;          ok = 0;
&nbsp;       }
<strong>&nbsp;  if (gap/2 &gt; 1) gap=gap/2; else gap=1;</strong>
}  while (ok == 0);
</pre>

<p>where <code>i</code>, <code>N</code>, <code>X</code>, <code>gap</code>, <code>temp</code>, <code>ok</code> are integers (<code>int</code> for C/C++).</p>

<p>While typing this code, little P forgot to copy line 11.</p>

<p>You are given the array to be sorted, A. A has N distinct elements, all between 1 and N.</p>

<p>You are asked to find all the values X for which the algorithm (without line 11) sorts A. We call these X values to be valid.</p>

### 입력

<p>The input has 2 lines. The first line has one integer, N. The next line describes A: N integers separated by one space.</p>

### 출력

<p>The output should have the number of valid values X on the first line. The second line should have all the valid values X, separated by one space. They should be sorted in ascending order.</p>

### 제한

<ul>
	<li>1 &lt; N &lt; 500000</li>
	<li>1 &le; X &le; N-1</li>
</ul>

### 힌트

<p>N is 6 and A is: 4, 2, 6, 1, 5, 3.</p>

<p>Valid values for X are:</p>

<ul>
	<li>X = 1, we swap the numbers on the following positions (1,2), (3,4), (4,5), (5,6), (2,3), (4,5), (1,2), (3,4);</li>
	<li>X = 3, we swap the numbers on the following positions (1,4), (3,6).</li>
</ul>
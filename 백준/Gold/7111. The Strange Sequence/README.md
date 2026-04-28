# [Gold II] The Strange Sequence - 7111

[문제 링크](https://www.acmicpc.net/problem/7111)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 89, 정답: 21, 맞힌 사람: 18, 정답 비율: 31.034%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>There is a sequence of positive integers {a<sub>i</sub>}. For each i (i&gt;1) a<sub>i</sub> is the least possible integer with the following features:</p>

<ol>
	<li>a<sub>i</sub> &gt; a<sub>i-1</sub>,</li>
	<li>the sum of a<sub>i</sub> digits equals the sum of 4 * a<sub>i-1</sub> digits.</li>
</ol>

<p>For the given values of the first sequence member a<sub>1</sub> and the index n, you must find and output the value of the a<sub>n</sub>.</p>

### 입력

<p>The values of integers a<sub>1</sub> (0 &lt; a<sub>1</sub> &lt; 20) and n (0 &lt; n &lt; 10000) are input from the keyboard.</p>

### 출력

<p>You must write one integer on the screen - the value of the a<sub>n</sub>. For the testing, only data where the corresponding a<sub>n</sub> value does not increase 10<sup>9</sup> are to be used.</p>
# [Gold III] Kvalitetni - 13942

[문제 링크](https://www.acmicpc.net/problem/13942)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 18, 정답: 10, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

(분류 없음)

### 문제 설명

<p>A quality arithmetic expression consists of brackets, number and operations of multiplication and addition.</p>

<p>A quality arithmetic expression is defined recursively in the following way:</p>

<ul>
	<li>An expression consisting of only one positive real​ number smaller than or equal to Z<sub>1</sub> is of good quality.<br />
	Such expression is of the following form:<br />
	(x)<br />
	For example, if Z<sub>1</sub> = 5, then (4) is a quality expression.</li>
	<li>If A<sub>1</sub> , A<sub>2</sub> , &hellip;, A<sub>k</sub> are quality expressions such that 2 k K and &le; &le; the sum​ of these expressions is at most Z<sub>k</sub> , then the following expressions are of good quality:<br />
	(A<sub>1</sub>+A<sub>2</sub>+...+A<sub>k</sub> )<br />
	(A<sub>1</sub> *A<sub>2</sub> *...*A<sub>k</sub> )</li>
</ul>

<p>You are given a quality expression where the numbers are replaced by question marks. Determine the maximal​ possible value that the expression could have had.&nbsp;</p>

### 입력

<p>The first line of input contains integer K (2 &le; K &le; 50).</p>

<p>The second line of input contains integers Z<sub>1</sub> , &hellip;, Z<sub>K</sub>,&nbsp;separated by space (1 &le; Z<sub>1</sub> , &hellip;, Z<sub>K</sub> &le; 50).</p>

<p>The third line of input contains one quality arithmetic expression in the described format. Arithmetic expression consists of: &lsquo;?&rsquo;, &lsquo;*&rsquo;, &lsquo;+&rsquo;, &lsquo;(&lsquo;, &lsquo;)&rsquo;, and its length is 1 000 000 characters, at most.&nbsp;</p>

### 출력

<p>You must output the maximal possible value of the expression.</p>

<p>A solution is considered correct if the absolute or relative deviation from the official solution is less than 10<sup>-3</sup> .&nbsp;</p>

### 힌트

<p>The expression ((3)+(3)) satisfies the conditions, so it is a quality expression, and it is easy to check that 6 is the maximal value.&nbsp;</p>
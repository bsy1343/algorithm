# [Platinum III] Trinomial - 8004

[문제 링크](https://www.acmicpc.net/problem/8004)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 133, 정답: 68, 맞힌 사람: 39, 정답 비율: 46.988%

### 분류

수학, 애드 혹, 정수론, 뤼카 정리

### 문제 설명

<p>Consider a trinomial (x<sup>2</sup>+x+1)<sup>n</sup>. We are interested in the coefficients c<sub>i</sub> of the expansion of this trinomial:</p>

<p>c<sub>0</sub>+c<sub>1</sub>x+c<sub>2</sub>x<sup>2</sup>+&hellip;+c<sub>2n</sub>x<sup>2n</sup></p>

<p>For example, (x<sup>2</sup>+x+1)<sup>3</sup>=1+3x+6x<sup>2</sup>+7x<sup>3</sup>+6x<sup>4</sup>+3x<sup>5</sup>+x<sup>6</sup>.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input sets of data that comprise numbers n and i,</li>
	<li>for each set of data computes c<sub>i</sub> modulo 3, where c<sub>i</sub> is the coefficient of x<sup>i</sup> in the expansion of the trinomial (x<sup>2</sup>+x+1)<sup>n</sup>,</li>
	<li>for each set of data writes the computed number to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer k denoting the number of the data sets, 1 &le; k &le; 10,000. It is followed by k sets of data, one per line. Each set consists of two non-negative integers n and i separated by a single space, 0 &le; n &le; 1,000,000,000,000,000, 0 &le; i &le; 2n.</p>

### 출력

<p>One should write k lines to the standard output. The j-th line ought to contain one non-negative integer being ci modulo 3 for the numbers from the j-th set.</p>
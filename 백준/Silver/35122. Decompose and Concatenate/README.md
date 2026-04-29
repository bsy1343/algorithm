# [Silver II] Decompose and Concatenate - 35122

[문제 링크](https://www.acmicpc.net/problem/35122)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 36, 맞힌 사람: 30, 정답 비율: 63.830%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>You are given an integer greater than or equal to $2$. When this number is decomposed into the sum of two <em>positive</em> integers, a new integer number can be formed as the concatenation of the decimal representations of the two integers. Find the maximum possible number formed in this way.</p>

<p>For example, $102$ can be decomposed and concatenated as follows.</p>

<p>$ \begin{array}{l l l} 1 + 101 &amp;\rightarrow&amp; 1101 \\ 2 + 100 &amp;\rightarrow&amp; 2100 \\ 3 + 99  &amp;\rightarrow&amp; 399 \\ 4 + 98  &amp;\rightarrow&amp; 498 \\ &amp; \vdots &amp; \\ 101 + 1 &amp;\rightarrow&amp; 1011 \end{array} $</p>

<p>Among them, $92 + 10 \rightarrow 9210$ is the largest.</p>

### 입력

<p>The input consists of a single test case in a single line. The line contains an integer between $2$ and $10^{17}$, inclusive, which is the integer to be decomposed and concatenated.</p>

### 출력

<p>Output the maximum possible number in a line.</p>
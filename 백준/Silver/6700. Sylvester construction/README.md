# [Silver II] Sylvester construction - 6700

[문제 링크](https://www.acmicpc.net/problem/6700)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 33, 맞힌 사람: 31, 정답 비율: 72.093%

### 분류

분할 정복, 재귀

### 문제 설명

<p>A Hadamard matrix of order n is an n &times; n matrix containing only 1s and -1s, called H<sub>n</sub>, such that \(&nbsp;H_nH_n^T = nI_n \)&nbsp;where I<sub>n</sub> is the n &times; n identity matrix. An interesting property of Hadamard matrices is that they have the maximum possible determinant of any n &times; n matrix with elements in the range [&minus;1,1]. Hadamard matrices have applications in error- correcting codes and weighing design problems.</p>

<p>The Sylvester construction is a way to create a Hadamard matrix of size 2n given H<sub>n</sub>. H<sub>2n</sub> can be constructed as:</p>

<p>\( H_{2n} = \begin{pmatrix} H_n &amp; H_n \\ H_n &amp; -H_n \end{pmatrix} \)</p>

<p>For example:&nbsp;</p>

<p>H<sub>1</sub> = (1)</p>

<p>\( H_2 = \begin{pmatrix} 1 &amp; 1 \\ 1 &amp; -1 \end{pmatrix} \)</p>

<p>and so on.</p>

<p>In this problem you are required to print a part of a Hadamard matrix<br />
constructed in the way described above.</p>

### 입력

<p>The first number in the input is the number of test cases to follow. For each test case there are five integers: n, x, y, w and h. n will be between 1 and 2<sup>62</sup> (inclusive) and will be a power of 2. x and y specify the upper left corner of the sub matrix to be printed, w and h specify the width and height respectively. Coordinates are zero based, so 0 &le; x,y &lt; n. You can assume that the sub matrix will fit entirely inside the whole matrix and that 0 &lt; w,h &le; 20. There will be no more than 1000 test cases.</p>

### 출력

<p>For each test case print the sub matrix followed by an empty line.</p>
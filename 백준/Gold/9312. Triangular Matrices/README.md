# [Gold V] Triangular Matrices - 9312

[문제 링크](https://www.acmicpc.net/problem/9312)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 5, 맞힌 사람: 5, 정답 비율: 26.316%

### 분류

자료 구조, 구현, 스택

### 문제 설명

<p>Let triangular matrices be defined as equilateral triangles with numbers in the form:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/6b8e849c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/6b8e849c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9312/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:68px; width:76px" /></p>

<p>Let triangular matrix addition be defined as:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/8f63733d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/8f63733d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9312/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:266px; width:282px" /></p>

<p>Let triangular matrix multiplication be defined as:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/d26351c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9312.%E2%80%85Triangular%E2%80%85Matrices/d26351c2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9312/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:239px; width:301px" /></p>

<p>The multiplication operation is not commutative, and the first matrix, A, must be of size less than or equal to B. The elements in the resultant matrix will be determined by matching A with every triangle of size A within the matrix B. For each of these matchings, multiply the overlapping elements of A and B and then sum them. Each matching will have a corresponding place in the resulting matrix.</p>

<p>In the example above, the A matches to the sub matrices formed by: {b<sub>1</sub>, b<sub>2</sub>, b<sub>3</sub>}, {b<sub>2</sub>, b<sub>4</sub>, b<sub>5</sub>} and {b<sub>3</sub>, b<sub>5</sub>, b<sub>6</sub>}. So taking the element wise multiplication and then sum of each sub matrix with matrix A gives the values c = a<sub>1</sub>b<sub>1</sub> + a<sub>2</sub>b<sub>2</sub> + a<sub>3</sub>b<sub>3</sub>, d = a<sub>1</sub>b<sub>2</sub> + a<sub>2</sub>b<sub>4</sub> + a<sub>3</sub>b<sub>5</sub> and e = a<sub>1</sub>b<sub>3</sub> + a<sub>2</sub>b<sub>5</sub> + a<sub>3</sub>b<sub>6</sub>. Since c corresponds to the top submatrix from B, it will be in the top position in the resulting matrix. d and e will be in the next row with d to the left of e because that is how the original corresponding submatrices of B were arranged.</p>

<p>The input will be given in postfix notation. For example, if you were given:</p>

<p>A B * A +</p>

<p>That would correspond to:</p>

<p>(A * B) + A</p>

<p>To solve this expression, start from the left side. First you get A, then B, then *. Which means A*B, we&#39;ll call this result C. Replace A B * with C, since that operation has been done. That leaves C A +, which means A + C, giving you the final result.</p>

### 입력

<p>Input sets will be given by an integer N, the number of matrices involved in the operation. For the next N lines, the matrices will be specified. A matrix will be specified by a string identifier K followed by an integer L, the length of each side of the matrix. The next L lines will contain the values in the matrix, each value separated by a space. The first line will only contain 1 value, the second line will contain 2 values, the third line will contain three values, and so on until the L th line. The first line with one value signifies the top point of the triangle, and the Lth line of L values signifies the bottom of the triangle.</p>

<p>After the matrices are given, there will be an expression, with spaces between the operators and symbols that needs to be evaluated. The expression will contain matrices that are represented by their string identifiers. The end of input will be given by N = 0.</p>

### 출력

<p>The output should be given by the resultant triangular matrix. It should be output in the same way the matrices were input. The top value on the first line, the next lowest values in order on the second line, all the way to the bottom row. If the expression is impossible to evaluate, output: &ldquo;Invalid expression&rdquo;.</p>
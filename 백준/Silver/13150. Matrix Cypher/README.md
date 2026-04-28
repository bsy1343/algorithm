# [Silver I] Matrix Cypher - 13150

[문제 링크](https://www.acmicpc.net/problem/13150)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 161, 정답: 87, 맞힌 사람: 83, 정답 비율: 54.248%

### 분류

수학, 임의 정밀도 / 큰 수 연산, 선형대수학

### 문제 설명

<p>Alice and Bob communicate via a matrix channel. Alice wants to send a message to Bob. She has a bitstring representing her message and performs a bitwise encoding algorithm: She starts with the identity matrix</p>

<p>\[A =\begin{pmatrix} 1 &amp; 0 \\ 0 &amp; 1 \end{pmatrix} \]</p>

<p>and then reads the bitstring starting from the left-most bit. For each 0-bit she multiplies the matrix \(A\) from the right with</p>

<p>\[A = \begin{pmatrix} 1 &amp; 0 \\ 1 &amp; 1 \end{pmatrix} \text{ , i.e. } A \leftarrow &nbsp;A \cdot \begin{pmatrix} 1 &amp; 0 \\ 1 &amp; 1 \end{pmatrix} &nbsp;\]</p>

<p>For each 1-bit she multiplies the matrix \(A\) from the right with</p>

<p>\[A = \begin{pmatrix} 1 &amp; 1 \\ 0 &amp; 1 \end{pmatrix} \text{ , i.e. } A \leftarrow &nbsp;A \cdot \begin{pmatrix} 1 &amp; 1 \\ 0 &amp; 1 \end{pmatrix} &nbsp;\]</p>

<p>Then the result is transmitted.</p>

<p>Now Bob accidentally deleted the software to decrypt a message from Alice. Can you help him to rewrite it?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>two lines, the \(i\)-th of them with two integers \(a_{i1}\) and \(a_{i2}\) (0 &le; \(a_{i1}\), \(a_{i2}\) &le; 2<sup>128</sup> &minus; 1 for all 1 &le; \(i\) &le; 2), where \[ \begin{pmatrix} a_{11} &amp; a_{12} \\ a_{21} &amp; a_{22} \end{pmatrix}&nbsp;\]is the matrix containing the encoded message.</li>
</ul>

<p>The bitstring representing the message consists of at most 120 characters.</p>

### 출력

<p>Output the decoded bitstring.</p>
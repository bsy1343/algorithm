# [Silver II] Hamiltonian Hypercube - 13935

[문제 링크](https://www.acmicpc.net/problem/13935)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 91, 맞힌 사람: 84, 정답 비율: 75.000%

### 분류

비트마스킹, 수학

### 문제 설명

<p>Hypercube graphs are fascinatingly regular, hence you have devoted a lot of time studying the mathematics related to them. The vertices of a hypercube graph of dimension n are all binary strings of length n, and two vertices are connected if they differ in a single position. There are many interesting relationships between hypercube graphs and error-correcting code.</p>

<p>One such relationship concerns the n-bit Gray Code, which is an ordering of the binary strings of length n, defined recursively as follows. The sequence of words in the n-bit code first consists of the words of the (n &minus; 1)-bit code, each prepended by a 0, followed by the same words in reverse order, each prepended by a 1. The 1-bit Gray Code just consists of a 0 and a 1. For example the 3-bit Gray Code is the following sequence:</p>

<p style="text-align: center;">000, 001, 011, 010, 110, 111, 101, 100</p>

<p>Now, the n-bit Gray Code forms a Hamiltonian path in the n-dimensional hypercube, i.e., a path that visits every vertex exactly once (see Figure H.1).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13935.%E2%80%85Hamiltonian%E2%80%85Hypercube/552ea2b6.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13935.%E2%80%85Hamiltonian%E2%80%85Hypercube/552ea2b6.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13935/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-28%20%EC%98%A4%ED%9B%84%204.26.49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:208px; width:218px" /></p>

<p>Figure H.1: The 3-dimensional hypercube and the Hamiltonian path corresponding to the 3-bit Gray Code.</p>

<p>You wonder how many vertices there are between the vertices 0<sup>n</sup> (n zeros) and 1<sup>n</sup> (n ones) on that path. Obviously it will be somewhere between 2<sup>n&minus;1</sup> &minus;1 and 2<sup>n</sup> &minus;2, since in general 0<sup>n</sup> is the first vertex, and 1<sup>n</sup> is somewhere in the second half of the path. After finding an elegant answer to this question you ask yourself whether you can generalise the answer by writing a program that can determine the number of vertices between two arbitrary vertices of the hypercube, in the path corresponding to the Gray Code.</p>

### 입력

<p>The input consists of a single line, containing:</p>

<ul>
	<li>one integer n (1 &le; n &le; 60), the dimension of the hypercube</li>
	<li>two binary strings a and b, both of length n, where a appears before b in the n-bit Gray Code.</li>
</ul>

### 출력

<p>Output the number of code words between a and b in the n-bit Gray Code.</p>
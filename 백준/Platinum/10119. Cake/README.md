# [Platinum I] Cake - 10119

[문제 링크](https://www.acmicpc.net/problem/10119)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 135, 정답: 38, 맞힌 사람: 28, 정답 비율: 26.923%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Leopold and Molly love cake: While Leopold loves eating cake, Molly loves watching Leopold eat cake. Today, they have bought N pieces of seedcake. The pieces are on a narrow plate with N cake piece positions in a row. From left to right, the positions are numbered from 1 to N. Also the pieces are numbered, with piece i on position i.</p>

<p>When eating cake, Leopold considers how delicious the pieces are. For each piece i, he exactly knows about its initial deliciousness value d<sub>i</sub>. He starts with some piece a; then, position a is empty. After that, the next piece he eats is always the least delicious piece next to any empty position. Hence, at any time, all empty positions are from a single closed interval. To make things even more interesting, Molly occasionally adds a topping to some piece to enhance its deliciousness. She will always do so in a way that makes the piece one of the 10 most delicious pieces. At any time, no two pieces will be equally delicious.</p>

<p>Sometimes, Molly wonders how many of the pieces Leopold will eat before he eats a certain piece b&mdash;assuming there are no future enhancements. Help Molly and write a program that can process instructions of the form &ldquo;enhance a piece&rdquo; or &ldquo;find the number of pieces Leopold will eat before a certain piece&rdquo;.</p>

### 입력

<p>The first line contains the two integers N (1 &le; N &le; 250 000), the number of pieces, and a (1 &le; a &le; N), the piece Leopold will eat first. The second line contains N mutually distinct integers 1 &le; d<sub>1</sub>, . . . , d<sub>N</sub> &le; N, the initial deliciousness values of the pieces. The third line contains 1 &le; Q &le; 500 000, the number of instructions to process. Each of the next Q lines contains an instruction of one of the following two types:</p>

<ul>
	<li>E i e (the character &ldquo;E&rdquo; followed by two integers 1 &le; i &le; N and 1 &le; e &le; 10): an instruction of this type tells your program that piece i is enhanced so that it becomes the unique e-th most delicious piece. The number of pieces that, before the enhancement, were more delicious than piece i is guaranteed to be at least e.</li>
	<li>F b (the character &ldquo;F&rdquo; followed by an integer 1 &le; b &le; N): an instruction of this type requests your program to tell how many pieces Leopold will eat before he eats piece b.</li>
</ul>

### 출력

<p>For each instruction of type &ldquo;F&rdquo;, in the order as these instructions appear in the input, output a line that contains a single integer: the requested number of pieces.</p>

### 제한

<ul>
	<li>N &le; 250 000, Q &le; 500 000</li>
</ul>
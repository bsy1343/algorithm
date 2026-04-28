# [Gold IV] Chain - 16539

[문제 링크](https://www.acmicpc.net/problem/16539)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 53, 맞힌 사람: 45, 정답 비율: 66.176%

### 분류

자료 구조, 스택

### 문제 설명

<p>Given is a sequence of N integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>. For any element a<sub>k</sub> (k = 1, 2, ..., n) we find the first larger than a<sub>k</sub> element, which is placed to the right of a<sub>k</sub> (if such exists). Denote it by a<sub>k1</sub>. Then do the same with a<sub>k1</sub> and denote the found element by a<sub>k2</sub>, and so on until we run out of the given sequence. Thus formed subsequence a<sub>k1</sub>, a<sub>k2</sub>, ..., we call chain beginning at index k.</p>

<p>Write program chain that outputs for any index k the length of the corresponding chain that begins at index k.</p>

### 입력

<p>On the first line of the standard input, the value of N is written. On the second line, the elements of the given sequence are written, separated by spaces.</p>

### 출력

<p>On a line in the standard output, your program has to write the sequence of chain&rsquo;s lengths, corresponding to the element of the input data. Each two consecutive numbers in the output must be separated by a single space.</p>

### 제한

<ul>
	<li>0 &lt; N &lt; 500 000</li>
	<li>0 &lt; a<sub>i</sub> &lt; 1 000 000, for each i = 1, ..., N.</li>
</ul>
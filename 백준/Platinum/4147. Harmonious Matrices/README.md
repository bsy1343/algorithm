# [Platinum V] Harmonious Matrices - 4147

[문제 링크](https://www.acmicpc.net/problem/4147)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

해 구성하기, 가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>Call an <em>m</em> &times; <em>n</em> matrix of bits &quot;harmonious&quot; if every cell in it has an even number of 1 bits as neighbors. A cell is a neighbor of itself, and also to the cells above, below, left, and right (if they exist). So the number of neighbors of a cell is at most five, but could be less, depending on where it is. The following is an harmonious 4 &times; 4 square of bits:</p>

<pre>
0 1 0 0
1 1 1 0
0 0 0 1
1 1 0 1
</pre>

<p>The task is to write a program which takes as input <em>m</em> and <em>n</em>, and produces an harmonious matrix of <em>m</em> rows and <em>n</em> columns of bits. The solution should avoid the all-zero matrix (if possible).</p>

### 입력

<p>The input will begin with a number <em>Z &le; 40</em> on a line by itself. This is followed by <em>Z</em> lines, each of which contains two space-separated positive integers <em>m</em> and <em>n</em>, each of which will be at most 40.</p>

### 출력

<p>For each input instance, the output will be an <em>m</em> &times; <em>n</em> harmonious matrix of 0s and 1s. The matrix should be non-zero if possible.</p>
# [Gold V] Nested Shrubbery Boxes - 9165

[문제 링크](https://www.acmicpc.net/problem/9165)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

다이나믹 프로그래밍, 정렬, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>After each commission to install a shrubbery, Roger the Shrubber has to transport many empty planting boxes with a drawn cart. In this instance, a planting box is a wooden box with one open side.</p>

<p>Given a set of n planting boxes, compute the largest number of boxes that can be nested. Specifically, report the number of the largest subset of boxes which may be nested such that the smallest box of the subset fits within the second smallest, the second smallest of the subset fits within the third smallest, the third smallest of the subset fits within the fourth smallest, and so forth.</p>

<p>A box i (b<sub>i</sub>) fits into box j (b<sub>j</sub>) if there exists some rotation of b<sub>i</sub> such that each dimension of b<sub>i</sub> is less than the corresponding dimension of b<sub>j</sub>. Any box can be rotated to nest inside another box.</p>

### 입력

<p>The input will consist of an unspecified number of box sets. Each set will begin with a line containing n, 0 &le; n &le; 500, the number of boxes in the set. Each box will be described on its own line by three positive integers representing length, width and height (Each value will not exceed 1000). The first two numbers of each box description will be followed by a space, the letter &lsquo;x&rsquo;, and a space. The end of input occurs when n = -1.</p>

### 출력

<p>For each set of boxes, print a line containing the largest number of boxes that can be selected from the original set to form a fully nesting subset of boxes.</p>
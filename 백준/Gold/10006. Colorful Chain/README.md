# [Gold I] Colorful Chain - 10006

[문제 링크](https://www.acmicpc.net/problem/10006)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 216, 정답: 59, 맞힌 사람: 47, 정답 비율: 28.659%

### 분류

두 포인터, 슬라이딩 윈도우

### 문제 설명

<p>Little Bytie loves to play with colorful chains. He already has quite an impressive collection, and some of them he likes more than the others. Each chain consists of a certain number of colorful links. Byteasar has noticed that Bytie&#39;s sense of aesthetics is very precise. It turns out that Bytie finds a contiguous fragment of a chain nice if it contains exactly l<sub>1</sub> links of color c<sub>1</sub>,l<sub>2</sub> links of color c<sub>2</sub>,&hellip;,l<sub>m</sub> links of color c<sub>m</sub>, and moreover it contains no links of other colors. A chain&#39;s appeal is its number of (contiguous) fragments that are nice. By trial and error, Byteasar has determined the values c<sub>1</sub>,&hellip;,c<sub>m</sub> and l<sub>m</sub>,&hellip;,l<sub>m</sub>. Now he would like to buy a new chain, and therefore asks you to write a program to aid him in shopping.</p>

### 입력

<p>The first line of the standard input gives two integers, n and m (1 &le; m &le; n &le; 1,000,000), separated by a single space. These are the length of the chain and the length of a nice fragment&#39;s description. The second line gives m integers, l<sub>1</sub>,&hellip;,l<sub>m</sub> (1 &le; l<sub>i</sub> &le; n), separated by single spaces. The third line gives m integers, c<sub>1</sub>,&hellip;,c<sub>m</sub> (1 &le; c<sub>i</sub> &le; n, c<sub>i</sub>&ne;c<sub>j</sub> for i&ne;j), also separated by single spaces. The sequences l<sub>1</sub>,&hellip;,l<sub>m</sub> and c<sub>1</sub>,&hellip;,c<sub>m</sub> define a nice fragment of a chain - it has to contain exactly l<sub>i</sub> links of color c<sub>i</sub>. The fourth line gives n integers, a<sub>1</sub>,&hellip;,a<sub>n</sub>(1 &le; a<sub>i</sub> &le; n), separated by single spaces, that are the colors of successive links of the chain.</p>

<p>&nbsp;</p>

### 출력

<p>Your program is to print a single integer, the number of nice contiguous fragments in the chain, to the first and only line of the standard output.</p>

### 힌트

<p>The two nice fragments of this chain are 2, 1, 3, 1 and 1, 3, 1, 2.</p>
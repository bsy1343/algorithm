# [Gold III] Secrets of Legendary Treasure - 21927

[문제 링크](https://www.acmicpc.net/problem/21927)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 71, 맞힌 사람: 69, 정답 비율: 61.062%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 역추적

### 문제 설명

<p>Finally, you have discovered the document with two integer sequences, the final keys to unlocking the secret of the legendary treasure! The ink on the document, however, has faded so much that some of the numbers in the sequences are too faint to read. Fortunately, you have heard of a legend on the characteristics of the key sequences that (1) the numbers in the two sequences are all different and are between 1 and the sum of the lengths of the two sequences, and (2) both sequences are arranged in ascending order.</p>

<p>Please restore the original sequences from the readable numbers and the legend.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n m
a<sub>1</sub> . . . a<sub>n</sub>
b<sub>1</sub> . . . b<sub>m</sub></pre>

<p>The first line consists of two integers n (1 &le; n &le; 100) and m (1 &le; m &le; 100). They are the lengths of the two sequences A and B, respectively. The second line describes the sequence A. Each a<sub>i</sub> is either 0, meaning that the i-th element of A is unreadable, or a positive integer 1 &le; a<sub>i</sub> &le; n + m meaning that the element reads a<sub>i</sub>. The third line describes the sequence B in the same fashion.</p>

### 출력

<p>Print a pair of restored sequences A and B in two lines. The sequences should be consistent with the input and the legendary characteristics of the sequences.</p>

<p>The elements of the sequence A should be printed in the first line, separated by a space character. Then the elements of the sequence B should be printed in the second line, in the same manner.</p>

<p>If there are multiple possibilities, print any one of such pairs. At least one sequence pair consistent with the input and conforming to the legend is guaranteed to exist.</p>

### 힌트

<p>Note that there are other acceptable outputs for the second sample input, such as the one with the positions of 6 and 7 exchanged.</p>
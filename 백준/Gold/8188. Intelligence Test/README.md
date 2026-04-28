# [Gold I] Intelligence Test - 8188

[문제 링크](https://www.acmicpc.net/problem/8188)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 202, 정답: 99, 맞힌 사람: 84, 정답 비율: 46.409%

### 분류

이분 탐색

### 문제 설명

<p>One of the tasks in the Byteotian Intelligence Test (BIT) is to cross out numbers from an initial sequence in such a way that leaves as a result certain given sequences. Byteasar longs to become the IQ Master of Byteotia, but he is no good in this kind of tasks. But since practice makes perfect, he intends to practise a lot. So much in fact that he asks you to write a program that will facilitate the training by verifying his answers quickly.</p>

### 입력

<p>The first line of the standard input contains one integer m (1 &le; m &le; 1,000,000). The second line holds m integers a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>m</sub> (1 &le; a<sub>i</sub> &le; 1,000,000 for 1 &le; i &le; m), separated by single spaces, that constitute the initial sequence of the test. The third line of the input holds one integer n. The following 2n lines describe the sequences to be obtained by crossing out numbers from the initial sequence. Each sequence&#39;s description takes two successive lines. The first of these two lines contains an integer m<sub>i</sub> (1 &le; m<sub>i</sub> &le; 1,000,000). The second contains an m<sub>i</sub>-element long sequence of integers b<sub>i,1</sub>,b<sub>i,2</sub>,&hellip;,b<sub>i,m<sub>i</sub></sub> (1 &le; b<sub>i,j</sub> &le; 1,000,000 for 1 &le; j &le; m<sub>i</sub>) separated by single spaces. You may assume that the total length on given n sequences does not exceed 1,000,000.</p>

### 출력

<p>Your program should print out n lines to the standard output. The i-th line (for 1 &le; i &le; n) should hold one word, &quot;TAK&quot; (yes in Polish) if the -th input sequence can be obtained by crossing out (i.e., removing) some, not necessarily contiguous, numbers from the initial sequence, or &quot;NIE&quot; (no in Polish) otherwise. Mind you, only the words should be printed, no quotation marks. Of course, the order of the numbers left after crossing out is important, as can be seen in the example.</p>
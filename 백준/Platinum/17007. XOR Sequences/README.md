# [Platinum II] XOR Sequences - 17007

[문제 링크](https://www.acmicpc.net/problem/17007)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 25, 맞힌 사람: 24, 정답 비율: 61.538%

### 분류

애드 혹, 분할 정복

### 문제 설명

<p>Suppose you are given two integers, m and n. You are also given a list of n distinct integers x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>n</sub>, with 0 &le; x<sub>i</sub> &le; 2<sup>m</sup>&minus;1. For each number y from 0 to 2<sup>m</sup>&minus;1, you&rsquo;ve found the number p<sub>y</sub> such that x<sub>p<sub>y</sub></sub> has a maximum bitwise-XOR with y. That is, y &oplus; x<sub>p<sub>y</sub></sub> &gt;y &oplus; x<sub>i</sub> for all i=1..n, i &ne; p<sub>y</sub> (&oplus; means bitwise-XOR).</p>

<p>Now, consider the reverse problem. Given m, n, and the sequence p<sub>0</sub>, p<sub>1</sub>, . . . , p<sub>2<sup>m</sup>&minus;1</sub>, count the number of sequences of distinct integers x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>n</sub> that could have generated that p sequence from the above algorithm. Two x sequences are different if there is some i such that x<sub>i</sub> in one sequence is different from x<sub>i</sub> in the other sequence. Output this count modulo 10<sup>9</sup>+7.</p>

### 입력

<p>Each test case will begin with a line with two space-separated integers m (0 &le; m &le; 16) and n (1 &le; n &le; 2<sup>m</sup>), where 2<sup>m</sup> is the length of the p sequence, and n is the length of the x sequences. Each of the next 2<sup>m</sup> lines will contain a single integer p (1 &le; p &le; n). These are the values of the sequence p<sub>0</sub>, p<sub>1</sub>, . . . , p<sub>2<sup>m</sup>&minus;1</sub>, in order. Every value from 1 to n inclusive will appear at least once.</p>

### 출력

<p>Output a single integer, which is the number of sequences x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>n</sub> which could have generated the sequence p<sub>0</sub>, p<sub>1</sub>, . . . , p<sub>2<sup>m</sup>&minus;1</sub> from the above algorithm, modulo 10<sup>9</sup>+7.</p>
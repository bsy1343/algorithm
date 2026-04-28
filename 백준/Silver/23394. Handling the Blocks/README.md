# [Silver III] Handling the Blocks - 23394

[문제 링크](https://www.acmicpc.net/problem/23394)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 56, 맞힌 사람: 53, 정답 비율: 59.551%

### 분류

정렬

### 문제 설명

<p>A friend of yours invented a game and wants to know if you can solve it or if it&rsquo;s impossible.</p>

<p>He assembled a sequence of N blocks. Each block has a number engraved on it and some color. All numbers are distinct and between 1 and N, and different blocks can be of the same color.</p>

<p>The game works as follows: you can play as many turns as you want. In one turn, you choose two different blocks that share the same color and swap them.</p>

<p>You have to tell whether it is possible to get the entire sequence to be sorted into ascending order by numbers engraved on the blocks.</p>

### 입력

<p>The first line contains two integers N and K (1 &le; N &le; 10<sup>5</sup>, 1 &le; K &le; N), representing the number of blocks in the sequence and the number of different colors, respectively.</p>

<p>Each of the next N lines contains two integers n<sub>i</sub> and c<sub>i</sub> (1 &le; n<sub>i</sub> &le; N, 1 &le; c<sub>i</sub> &le; K), representing the number and color of the i-th block, respectively.</p>

### 출력

<p>Output one line containing one character. If the sequence can be arranged in ascending order, write the upper case letter &lsquo;<code>Y</code>&rsquo;; otherwise write the uppercase letter &lsquo;<code>N</code>&rsquo;.</p>
# [Platinum IV] Binary Transformations - 15398

[문제 링크](https://www.acmicpc.net/problem/15398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 158, 정답: 54, 맞힌 사람: 50, 정답 비율: 40.323%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>There are n bits. Each bit i has a value a<sub>i</sub> (0 or 1) and an associated cost c<sub>i</sub>. We can change the value of bit i with a cost computed as the sum of all the costs c<sub>j</sub> of the bits j such that a<sub>j</sub> = 1 AFTER bit i is changed. What is the minimum amount that should be paid to set each bit i to a specified value b<sub>i</sub>.</p>

### 입력

<p>The first line contains the integer n (1 &le; n &le; 5 x 10<sup>3</sup>) - the number of bits</p>

<p>The second line contains n integers c<sub>i</sub> (1 &le; c<sub>i</sub> &le; 10<sup>9</sup>) - the costs associated with the bits</p>

<p>The third line contains the original n values of the bits a<sub>i</sub> - the original values of the bits</p>

<p>The fourth line contains the required n values of the bits b<sub>i</sub> - the required values of the bits&nbsp;</p>

### 출력

<p>Print one number - the minimum cost.</p>
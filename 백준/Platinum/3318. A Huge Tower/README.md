# [Platinum III] A Huge Tower - 3318

[문제 링크](https://www.acmicpc.net/problem/3318)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 28, 맞힌 사람: 25, 정답 비율: 80.645%

### 분류

수학, 정렬, 조합론, 두 포인터

### 문제 설명

<p>The ancient Babylonians decided to build a huge tower. The tower consists of N cubic building blocks that are stacked one onto another. The Babylonians gathered many building blocks of various sizes from all over the country. From their last unsuccessful attempt they have learned that if they put a large block directly onto a much smaller block, the tower will fall.</p>

<p>Each two building blocks are different, even if they have the same size. For each building block you are given its side length. You are also given an integer D with the following meaning: you are not allowed to put block A directly onto block B if the side length of A is strictly larger than D plus the side length of B.</p>

<p>Compute the number of different ways in which it is possible to build the tower using all the building blocks. Since this number can be very large, output the result modulo 10<sup>9</sup> + 9.</p>

### 입력

<p>The first line of the input contains two positive integers N and D: the number of building blocks and the tolerance respectively.</p>

<p>The second line contains N space-separated integers; each represents the size of one building block.</p>

### 출력

<p>Output a single line containing a single integer: the number of towers that can be built, modulo 1 000 000 009.</p>

### 제한

<p>All numbers in the input files are positive integers not exceeding 10<sup>9</sup>.</p>

<p>N is always at least 2.</p>
# [Silver IV] Sharkovski’s Ordering - 9738

[문제 링크](https://www.acmicpc.net/problem/9738)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 28, 맞힌 사람: 24, 정답 비율: 88.889%

### 분류

구현, 정렬, 집합과 맵

### 문제 설명

<p>In a 1964 paper on continuous mappings of the reals into the reals, Alexandr Sharkovski used the following ordering of the positive integers:</p>

<p style="text-align:center">3 ◄ 5 ◄ 7 ◄ 9 ◄ ... ◄ 3&middot;2 ◄ 5&middot;2 ◄ 7&middot;2 ◄ ... ◄ 3&middot;2<sup>2</sup> ◄ 5&middot;2<sup>2</sup> ◄ ... ◄ 2<sup>3</sup> ◄ 2<sup>2</sup> ◄ 2 ◄ 1</p>

<p>As Ciesielski and Pogoda (2008) describe it:</p>

<p>&ldquo;First come the odd numbers, beginning with 3, arranged in increasing order. This sequence is repeated with each odd integer multiplied by 2. The initial sequence is again repeated with each odd integer multiplied by 2<sup>2</sup>, and so on. The terminal sequence consists of the nonnegative powers of 2 arranged in decreasing order (note that 1 = 2<sup>0</sup>).&rdquo;</p>

<p>Write a program that reads an input containing a list of up to 255 unsigned integers with values less than or equal to 65,535 (not necessarily distinct) separated by white space and terminated by &lsquo;0&rsquo;. The program should display on the screen the numbers arranged in Sharkovski&rsquo;s ordering in one line. The numbers in the line are separated exactly by one space.</p>

### 입력

<p>The input starts with an integer N (0 &le; N &le; 255). This is followed by N input cases. Each input case is a non-empty list of up to 255 unsigned integers (not necessarily distinct) with values not exceeding 65,535. Each pair of numbers is separated by white space. Each input case is terminated by &lsquo;0&rsquo;.</p>

### 출력

<p>For every input case, print the required numbers arranged in Sharkovski&rsquo;s ordering in one line. The numbers in the line are separated exactly by one space.</p>
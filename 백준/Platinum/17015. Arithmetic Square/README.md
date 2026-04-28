# [Platinum I] Arithmetic Square - 17015

[문제 링크](https://www.acmicpc.net/problem/17015)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 20, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

브루트포스 알고리즘, 가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>You are given a 3&times;3 grid which contains integers.</p>

<p>Some of the 9 elements in the grid will have a value already, and the remaining elements will be unspecified.</p>

<p>Your task is to determine values for the unspecified elements such that each row, when read from left-to-right is an arithmetic sequence, and that each column, when read from the top-down, is an arithmetic sequence.</p>

<p>Recall that an arithmetic sequence of length three is a sequence of integers of the form</p>

<p style="text-align: center;">a, a+d, a+2d</p>

<p>for integer values of a and d. Note that d may be any integer, including zero or a negative integer.</p>

### 입력

<p>The input will be 3 lines long. Each line will have three space-separated values. Each value will either be an integer in the range from &minus;1000000 to 1000000, inclusive, or the symbol X.</p>

<p>For 4 of the 15 marks available, there will be at most 3 X symbols in the input.</p>

<p>For an additional 3 of the 15 marks available, all integer values in the input will be between &minus;10 and 10, inclusive.</p>

<p>For an additional 4 of the 15 marks available, there will be at least 7 X symbols in the input.</p>

<p>For an additional 2 of the 15 marks available, all integer values in the input will be even numbers.</p>

### 출력

<p>The output will be 3 lines long. Each line will have three space-separated integers. All integers that were given in the input must be in their same position (i.e., same row and same column as in the input). All rows and columns must form arithmetic sequences. All integers in the output must be between &minus;1000000000 and 1000000000, inclusive.</p>

<p>If there is more than one solution, output any solution. There is guaranteed to be at least one solution.</p>
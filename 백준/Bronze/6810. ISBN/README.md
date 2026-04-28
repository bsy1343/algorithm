# [Bronze IV] ISBN - 6810

[문제 링크](https://www.acmicpc.net/problem/6810)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5535, 정답: 3787, 맞힌 사람: 3558, 정답 비율: 68.767%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>The International Standard Book Number (ISBN) is a 13-digit code for identifying books. These numbers have a special property for detecting whether the number was written correctly.</p>

<p>The 1-3-sum of a 13-digit number is calculated by multiplying the digits alternately by 1&rsquo;s and 3&rsquo;s (see example) and then adding the results. For example, to compute the 1-3-sum of the number 9780921418948 we add</p>

<p>9 &lowast; 1 + 7 &lowast; 3 + 8 &lowast; 1 + 0 &lowast; 3 + 9 &lowast; 1 + 2 &lowast; 3 + 1 &lowast; 1 + 4 &lowast; 3 + 1 &lowast; 1 + 8 &lowast; 3 + 9 &lowast; 1 + 4 &lowast; 3 + 8 &lowast; 1</p>

<p>to get 120.</p>

<p>The special property of an ISBN number is that its 1-3-sum is always a multiple of 10.</p>

<p>Write a program to compute the 1-3-sum of a 13-digit number. To reduce the amount of typing, you may assume that the first ten digits will always be 9780921418, like the example above. Your program should input the last three digits and then print its 1-3-sum. Use a format similar to the samples below.</p>

### 입력



### 출력


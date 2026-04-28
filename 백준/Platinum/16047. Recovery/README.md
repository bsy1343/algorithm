# [Platinum IV] Recovery - 16047

[문제 링크](https://www.acmicpc.net/problem/16047)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 20, 맞힌 사람: 19, 정답 비율: 29.231%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>Consider an n &times; m matrix of ones and zeros. For example, this 4 &times; 4:</p>

<pre>
1 1 1 1
0 1 1 1
0 1 1 1
0 1 1 0</pre>

<p>We can compute even parity for each row, and each column. In this case, the row parities are [0, 1, 1, 0] and the column parities are [1, 0, 0, 1] (the parity is 1 if there is an odd number of 1s in the row or column, 0 if the number of 1s is even). Note that the top row is row 1, the bottom row is row n, the leftmost column is column 1, and the rightmost column is column m.</p>

<p>Suppose we lost the original matrix, and only have the row and column parities. Can we recover the original matrix? Unfortunately, we cannot uniquely recover the original matrix, but with some constraints, we can uniquely recover a matrix that fits the bill. Firstly, the recovered matrix must contain as many 1&rsquo;s as possible. Secondly, of all possible recovered matrices with the most 1&rsquo;s, use the one which has the smallest binary value when you start with row 1, concatenate row 2 to the end of row 1, then append row 3, row 4, and so on.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. Each test case will consist of exactly two lines. The first line will contain a string R (1 &le; |R| &le; 50), consisting only of the characters 0 and 1. These are the row parities, in order. The second line will contain a string C (1 &le; |C| &le; 50), consisting only of the characters 0 and 1. These are the column parities, in order.</p>

### 출력

<p>If it is possible to recover the original matrix with the given constraints, then output the matrix as |R| lines of exactly |C| characters, consisting only of 0&rsquo;s and 1&rsquo;s. If it is not possible to recover the original matrix, output &minus;1.</p>
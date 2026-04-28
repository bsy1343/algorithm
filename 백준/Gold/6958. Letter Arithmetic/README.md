# [Gold III] Letter Arithmetic - 6958

[문제 링크](https://www.acmicpc.net/problem/6958)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 9, 정답 비율: 50.000%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>A popular form of pencil game is to use letters to represent digits in a mathematical statement. An example is</p>

<pre>
 SEND
+MORE
-----
MONEY</pre>

<p>which represents</p>

<pre>
 9567
+1085
-----
10652</pre>

<p>Your task is to read in sets of three &quot;words&quot; and assign unique digits to the letters in such a way as to make the sum of the first two words equal to the third word.</p>

### 입력

<p>The input begins with a line containing a positive integer $n$ which is the number of test data sets. Each data set consists of three lines, each of which will contain one word with the third word being the sum of the first two. The words will contain no more than 20 uppercase letters.</p>

### 출력

<p>The output is to consist of $n$ sets of lines each containing the numeric representation of each word in the corresponding test data set. There will be exactly one correct solution for each data set. Leave an empty line after the output for each data set.</p>
# [Gold II] Beautiful Partition - 12810

[문제 링크](https://www.acmicpc.net/problem/12810)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 65, 정답: 24, 맞힌 사람: 11, 정답 비율: 28.205%

### 분류

수학, 정수론

### 문제 설명

<p>Today Peter learned about greatest common divisor of a set of integers. He liked the idea so much, that now he tries to find it in anything he sees.</p>

<p>So during the Computer Science lesson today after the teacher has written an array of integers at the blackboard, Peter has noticed that its elements can be divided into two parts M<sub>1</sub> and M<sub>2</sub> so that gcd(M<sub>1</sub>) and gcd(M<sub>2</sub>) are both quite big. Here gcd(M) is the greatest common divisor of all numbers in M.</p>

<p>Peter has decided to generalize the problem. For a given array he wants to find the way to divide its elements into two non-empty parts M<sub>1</sub> and M<sub>2</sub> so that min(gcd(M<sub>1</sub>), gcd(M<sub>2</sub>)) was maximal possible. Help him!</p>

### 입력

<p>Input contains several tests. The first line contains the number of tests t (1 &le; t &le; 1000).</p>

<p>Each test is given in two lines. The first line contains an integer n (2 &le; n &le; 5&middot;104) &mdash; the size of the array. The second line contains n integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the elements of the array.</p>

<p>The sum of values of n for all tests in one input doesn&#39;t exceed 5&middot;10<sup>4</sup>.</p>

### 출력

<p>For each test print one integer on a line &mdash; the maximal possible value of min(gcd(M<sub>1</sub>), gcd(M<sub>2</sub>)).</p>
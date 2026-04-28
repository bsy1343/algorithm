# [Gold IV] A+B Problem - 18014

[문제 링크](https://www.acmicpc.net/problem/18014)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 16, 정답 비율: 84.211%

### 분류

구현, 수학

### 문제 설명

<p>Although da Vinci primarily worked as an artist, he was also well known for his scientific investigations rooting in nature. Da Vinci had outstanding skills in dividing natural phenomena into smaller segments to seek the secrets beyond the mistery, which involved a lot of mathematical computations.</p>

<p>While deriving the golden ratio and applying it in his artwork, da Vinci felt bored at repeating tedious computations, especially addition. He hoped that a calculator could compute the sum of two relatively large integers for him, however no one could implement an A+B algorithm in any programming language at his time.</p>

<p>Knowing that you have solved so many difficult problems at this programming contest, da Vinci was impressed by your problem-solving skills and asked if you could implement this A+B calculator for him. Because da Vinci wanted to compute incredibly large numbers, he decided to compress the integer A as N pairs of integers (t<sub>i</sub>, d<sub>i</sub>), where d<sub>i</sub> is a digit and t<sub>i</sub> is the number of times d<sub>i</sub> repeats. In other words, A = d<sub>1</sub>d<sub>1</sub>...d<sub>1</sub>(repeats t<sub>1</sub> times)d<sub>2</sub>d<sub>2</sub>...d<sub>2</sub>(repeats t<sub>2</sub>&nbsp;times)d<sub>N</sub>d<sub>N</sub>...d<sub>N</sub>(repeats t<sub>N</sub>&nbsp;times).&nbsp;B is compressed as M pairs of integers in the same way. The output of your program should also follow this format.</p>

<p>To make this format more standardized, no leading zero is allowed, t<sub>i</sub> should be strictly positive, and d<sub>i</sub> should not be equal to d<sub>i+1</sub> (or they can be compressed as (t<sub>i</sub> + t<sub>i+1</sub>, d<sub>i</sub>)). For example, the integer 1112231 should be encoded as (3, 1),(2, 2),(1, 3),(1, 1), but (1, 0),(3, 1),(2, 2),(1, 3),(1, 1) or (2, 1),(1, 1),(2, 2),(1, 3),(1, 1) or (3, 1),(0, 9),(2, 2),(1, 3),(1, 1) would be invalid.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 20, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains a single integer 1 &le; N &le; 100, followed by N lines describing number A. Each of the N lines contains a pair of integers 1 &le; t<sub>i</sub> &le; 10<sup>18</sup> , 0 &le; d<sub>i</sub> &le; 9 separated by space.</p>

<p>The following line contains a single integer 1 &le; M &le; 100, followed by M lines describing number B. Each of the M lines contains a pair of integers 1 &le; t<sub>j</sub> &le; 10<sup>18</sup> , 0 &le; d<sub>j</sub> &le; 9 separated by space.</p>

<p>It is guaranteed that the presentation of A and B is well-formed without leading zero, i.e. &forall;2 &le; i &le; N(or M for B), d<sub>i&minus;1 &ne;&nbsp;</sub>d<sub>i</sub> and d<sub>1</sub> &ne; 0. Also, the input integers have at most 10<sup>18</sup> digits after decoding, i.e. (&sum;t<sub>i</sub>) &le; 10<sup>18</sup>.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the sum of A + B in the same format as the input.</p>

<p>Each data set should be followed by a blank line</p>

### 힌트

<p>The first data set is 9999909999 + 999999 = 10000909998.</p>

<p>The second data set is 999...999(44444 9&prime;s)333...333(55555 3&prime;s) +&nbsp;+ 111...111(44444 1&prime;s)777...777(55555 7&prime;s) =&nbsp;= 111...111(99999 1&prime;s)0.</p>

<p>The third data set is trivial, however it warns that you may want to use 8-byte integer types (long long in C/C++, long in Java), which can hold integers up to 9.22 &times; 10<sup>18</sup>.</p>
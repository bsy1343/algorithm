# [Platinum IV] Given a string. . . - 3600

[문제 링크](https://www.acmicpc.net/problem/3600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 37, 정답: 16, 맞힌 사람: 12, 정답 비율: 40.000%

### 분류

자료 구조, 집합과 맵, 해싱, 비트 집합

### 문제 설명

<p>Peter&rsquo;s Boss is now very upset. He said that Peter&rsquo;s vision of the orthogonal sum of two strings is not collinear to the general pary line of <em>RIGS</em>. At least, it is very bad that the orthogonal sum of two strings in Peter&rsquo;s vision can be different depending on a selected set of strings. But Boss decided to give Peter a last str. . . well, a chance.</p>

<p>Peter&rsquo;s colleague Andrew invented another definition of orthogonal sum of two strings of equal length n, which depends only on the alphabet. The basic alphabet to define this operation consists only of zeros and ones. The orthogonal sum of two strings a &oplus; b is just a string c where c<sub>i</sub> = a<sub>i</sub> &oplus; b<sub>i</sub> (S<sub>i</sub> denotes i-th character of string S). Here &oplus; stands for <em>exclusive OR</em> operation which returns 0 for equal characters and 1 otherwise.</p>

<p>Now Peter must study properties of orthogonal closure of a given string S. The orthogonal closure of S (denoted S<sup>&oplus;</sup>) is a set of strings S<sub>(k)</sub> &oplus; S<sub>(l)</sub> for any 0 &le; k, l &le; n &minus; 1, where n is the length of S, and S<sub>(k)</sub> denotes an operation of k-th circular shift of S &mdash; moving k last characters from the end of the string S to its beginning. For example, the second circular shift of <code>abcde</code> is <code>deabc</code>.</p>

<p>Given a string T, Peter&rsquo;s task is to check whether it belongs to S<sup>&oplus;</sup>. Could you solve this task for him?</p>

### 입력

<p>The first line of the input file contains a given string T. The second line contains S. Both strings are of equal length in range from 1 to 5 000 characters. All characters in these strings are zeros or ones.</p>

### 출력

<p>If a given string belongs to S<sup>&oplus;</sup>, output &ldquo;Yes&rdquo;. Otherwise output &ldquo;No&rdquo;.</p>
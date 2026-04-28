# [Platinum II] Kotrljanje - 15498

[문제 링크](https://www.acmicpc.net/problem/15498)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 41, 정답: 21, 맞힌 사람: 6, 정답 비율: 26.087%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Vla-tko, Vla-tko, Vla-tko!</p>

<p>Nobody comes to Vlatko&rsquo;s office hours anymore. Angered, enraged and disgruntled, Vlatko&rsquo;s revenge is a convenient task for COCI:</p>

<p>You are given an infinite arithmetic sequence A(n) = Cn + D, defined for all natural numbers n. We want find a sequence of M distinct natural numbers n<sub>1</sub>, n<sub>2</sub>, ..., n<sub>M</sub> less than or equal to 10<sup>15</sup> such that the corresponding members of sequence A(n<sub>1</sub>), A(n<sub>2</sub>), ..., A(n<sub>M</sub>) all have the same sum of digits in base B.</p>

<p>Please note: Every positive integer N can be written in base B as follows: create the unique string x<sub>k</sub>x<sub>k-1</sub>...x<sub>1</sub>x<sub>0</sub> , where 0 &le; x<sub>i</sub> &lt; B for each i, and the equation x<sub>k</sub>B<sup>k</sup> + x<sub>k-1</sub>B<sup>k-1</sup> + ... + x<sub>1</sub>B + x<sub>0</sub> = N is satisfied. The sum of digits is given with x<sub>k</sub> + ... + x<sub>0</sub>.</p>

### 입력

<p>The first line of input contains four integers C, D, B and M (1 &le; C, D &le; 10000, 2 &le; B &le; 5000, 1 &le; M &le; 250000).</p>

### 출력

<p>The first and only line of output must contain the required numbers, separated by spaces, in an arbitrary order.</p>

<p>Please note: you must output the numbers ​n​<sub>i</sub>, not numbers ​A(n<sub>i</sub>)​. All numbers in the output should be less than or equal to 10<sup>15</sup>.</p>

<p>The input data will be such that a solution that meets the given conditions exists.</p>

### 힌트

<p><strong>Clarification of the test cases:</strong></p>

<p>In the first test case, one of the possible sequences is the sequence in the output. The corresponding members of the arithmetic sequence are 5 * 2 + 3 = 13 and 5 * 5 + 3 = 28. The format of number 13 in base 2 is 1101, whereas the format of number 28 in base 2 is 11100. The sum of digits in both formats is equal to 3.</p>

<p>In the second test case, the corresponding members of the sequence are 2 * 2 + 1 = 5, 2 * 20 + 1 = 41, and 2 * 200 + 1 = 401. Each of the numbers&rsquo; digits, written in base 10, sum up to 5.</p>
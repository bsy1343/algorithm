# [Gold I] nnnnn - 15222

[문제 링크](https://www.acmicpc.net/problem/15222)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 376, 정답: 106, 맞힌 사람: 38, 정답 비율: 24.675%

### 분류

수학, 이분 탐색, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Hsara and Simone like to communicate without anyone else knowing what they&rsquo;re saying. This time, Simone invented a very sneaky cipher. When she wants to tell Hsara a non-negative number n, she performs the following encryption procedure.</p>

<p>Let d(n) denote the decimal expansion of n. Consider the string x := d(n)<sup>n</sup> , i.e., the decimal expansion of n concatenated with itself n times. The encryption of n is then the length of x.</p>

<p>As an example, assume Simone wants to encrypt the number 10. Then</p>

<p style="text-align:center">x = 10101010101010101010.</p>

<p>The length of x is then 20, which will be the encrypted value of x.</p>

<p>Hsara had no problem writing a decryption algorithm for this procedure. But can you?</p>

### 입력

<p>The first and only line contains an integer L (0 &le; L &le; 10<sup>10<sup>6</sup></sup>), the encrypted value of some non-negative integer n.</p>

### 출력

<p>Output a single line containing the integer n.</p>
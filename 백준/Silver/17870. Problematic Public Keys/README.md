# [Silver IV] Problematic Public Keys - 17870

[문제 링크](https://www.acmicpc.net/problem/17870)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 82, 맞힌 사람: 53, 정답 비율: 68.831%

### 분류

수학, 자료 구조, 브루트포스 알고리즘, 정수론, 집합과 맵, 해시를 사용한 집합과 맵, 소수 판정, 소인수분해

### 문제 설명

<p>On February 15, 2012, the New York Times reported a flaw in the method of generating keys for a public-key encryption system (&ldquo;Researchers Find a Flaw in a Widely Used Online Encryption Method&quot; by John Markoff). This flaw enables an attacker to determine private keys given a set of flawed public keys.</p>

<p>Your job is to write a program that takes flawed public keys and determines the corresponding private keys. For the purposes of this problem, a private key consists of a pair of prime numbers,</p>

<p style="text-align: center;">2 &lt; K<sub>1</sub>, K<sub>2</sub> &lt; 2<sup>31</sup></p>

<p>and the corresponding public key consists of the product K<sub>1</sub> &times; K<sub>2</sub>.</p>

### 입력

<p>The first line of the input contains an integer value, M (2 &le; M &le; 100). M is the number of input lines that follow. Each of the M lines contains a single &ldquo;public key.&quot; Each public key is the product of exactly two prime numbers and will fit in a 32-bit unsigned integer.</p>

### 출력

<p>The output lines produced by your program should contain the unique prime factors of the input data values in ascending numeric order, five per line, except for the last line. Output values on the same line are separated by a single space.</p>
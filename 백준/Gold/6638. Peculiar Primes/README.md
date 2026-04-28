# [Gold IV] Peculiar Primes - 6638

[문제 링크](https://www.acmicpc.net/problem/6638)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 40, 맞힌 사람: 33, 정답 비율: 64.706%

### 분류

수학, 정수론, 백트래킹

### 문제 설명

<p>The level of corruption in some countries is really high. It is hard to imagine that these unethical manners have already hit the academic field. Some rumors are spreading that some students tried to bribe their lecturers to get better grades. Would you believe it?</p>

<p>But the real situation may be even much worse. ACM has a very strong suspicion that somebody has bribed mathematicians in the Academy of Sciences in order to forge some of their results. In particular, it is suspected that a very influential person wants to prefer some prime numbers over others.</p>

<p>It is said that many mathematicians have already completely stopped using some primes and they create only those numbers that can be &ldquo;assembled&rdquo; without those primes. Your task is to verify this hypothesis.</p>

<p>Given a set of prime numbers, your program should output all integer numbers that can be created solely by multiplying these primes, without using any other primes.</p>

### 입력

<p>The input will consist of several test scenarios. Each scenario starts by a line with a single positive integer N (1&le;N&le;10) &mdash; the number of primes in the set.</p>

<p>On the second line of a scenario, there are N integer numbers 2 &le; P<sub>1</sub> &lt; P<sub>2</sub> &lt; P<sub>3</sub> &lt;... &lt;P<sub>N</sub> &lt; 10000, separated by a space. You are guaranteed that all these numbers are prime. On the third line of each scenario, there are 2 integers X and Y (1 &le; X &le; Y &lt; 2<sup>31</sup>), separated by a space.</p>

<p>The last scenario is followed by a line containing single zero.</p>

### 출력

<p>Your task is to print all positive integer numbers in the closed interval [X, Y] that have no other prime factors than those given in the input (P<sub>i</sub>). Print all such numbers in the increasing order, with no duplicates and separated by a single comma character (&ldquo;,&rdquo;). If there are no such numbers, print the word &ldquo;none&rdquo; instead.</p>

<p>Note that the number 1 does not need any primes to be constructed and is therefore always allowed.</p>
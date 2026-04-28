# [Platinum III] Random Number Generator - 15850

[문제 링크](https://www.acmicpc.net/problem/15850)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 31, 맞힌 사람: 27, 정답 비율: 39.130%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Aristides has a random number generator. Each time he asks the random number generator, it will return a random integer between 1 to N inclusive uniformly.</p>

<p>Aristides&#39; friend, Iorgos, will note the returned number one by one. Aristides would keep asking a random number until Iorgos stop him. To analyse the randomness of the random number generator, he would stop Aristides immediately after each number from 1 to N is returned at least twice.</p>

<p>Aristides has already asked K numbers to the random number generator. The i-th number returned by the random number generator is A<sub>i</sub>. Since Iorgos does not stop him yet, he knows that at least one of the integer between 1 to N inclusive has not been returned at least twice.</p>

<p>Aristides wants to know the expected number of additional numbers to be asked until Iorgos stopped him.</p>

### 입력

<p>The first line contains an integer: T (1 &le; T &le; 100,000) denoting the number of testcases. The first line of each testcase contains two integers: N K (1 &le; N &le; 3,000; 0 &le; K &le; 100,000) in a line denoting the range of the returned integers and the number of integers that is already asked. The second line of each testcase contains K integers: A<sub>1</sub> A<sub>2</sub> ... A<sub>K</sub> (1 &le; A<sub>i</sub> &le; N) in a line denoting the first K returned integers. It is guaranteed that at least one of the integer between 1 to N inclusive has not been returned at least twice. It is also guaranteed that the sum of the value K of on all testcases is not more than 100,000.&nbsp;</p>

### 출력

<p>For each testcase, the output contains the expected number of additional numbers to be asked by Aristides until Iorgos stopped him, in a line. Your answer will be considered correct if the relative or absolute difference between your answer and judge&#39;s answer is not more than 10<sup>-6</sup>.</p>

### 힌트

<p>Explanation for the 1st sample case</p>

<p>For the first sample, the first two numbers returned by the random number generator is always 1. Therefore, by asking the random number generator twice, each number from 1 to N will be returned at least twice.</p>

<p>Explanation for the 2nd sample case</p>

<p>For the second sample, Aristides already asked one number from the random number generator. Therefore, he only need to ask for one additional number.</p>
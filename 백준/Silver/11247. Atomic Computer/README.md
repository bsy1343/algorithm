# [Silver I] Atomic Computer - 11247

[문제 링크](https://www.acmicpc.net/problem/11247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 101, 정답: 33, 맞힌 사람: 25, 정답 비율: 41.667%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p>Mathematical calculation is no longer a problem because one particular professor has invented &ldquo;Atomic Computer&rdquo; that is 8,000,000,000 times faster than the normal computer.</p>

<p>This Atomic Computer store data in special kind of very expensive memory. This memory store information very similar to traditional binary computer. The only exception is that one bit in this memory can represent 3 different states. These 3 states represents value -1, 0 and 1 respectively. This professor use the amazing property of this memory to construct marvelous things. You, as a senior student, would like to do a senior project with him.</p>

<p>The professor has suggested basic usage of the Atomic Computer to you. You try to have the computer store a value 1 in the memory. You then realized that the computer might store the value 1 in various way, one possible way is as (1)<sub>2</sub> and another possible way is (1)(-1)<sub>2</sub></p>

<p>Write a program that read an integer value that you want to store in the memory and a number of bits in the memory. Calculate the number of all possible ways to store that number in the Atomic Computer.</p>

### 입력

<p>The first line of input contain one integer T that gives the number of test cases. For each test case, there will be one line of input containing two integer x<sub>i</sub> and y<sub>i</sub> where x<sub>i</sub> is the integer value we want to store in the memory and y<sub>i</sub> is the number of bits in the computer. (-2,000,000,000 &le; x<sub>i</sub> &le; 2,000,000,000 and 1 &le; y<sub>i</sub> &le; 20)</p>

### 출력

<p>There will be T lines of output. The ith line gives the number of all possible ways to store the integer x<sub>i</sub> using y<sub>i</sub> bits of memory.</p>

### 힌트

<p>In the first example, there are two possible ways to store a value 1 in 2 bits which are (0)(1)<sub>2</sub> and (1)(-1)<sub>2</sub> In the second example, for the first test case, there are no possible ways to store a value -2 in 1 bits.</p>

<p>For second test case, there are only one way to store a value -2 in 2 bits, which is (-1)(0)<sub>2</sub></p>
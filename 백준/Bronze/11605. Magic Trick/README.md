# [Bronze II] Magic Trick - 11605

[문제 링크](https://www.acmicpc.net/problem/11605)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 402, 정답: 239, 맞힌 사람: 201, 정답 비율: 64.013%

### 분류

수학, 구현, 문자열, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Your friend has come up with a math trick that supposedly will blow your mind. Intrigued, you ask your friend to explain the trick.</p>

<p>First, you generate a random positive integer k between 1 and 100. Then, your friend will give you n operations to execute. An operation consists of one of the four arithmetic operations <code>ADD</code>, <code>SUBTRACT</code>, <code>MULTIPLY</code>, or <code>DIVIDE</code>, along with an integer-valued operand x.</p>

<p>You are supposed to perform the requested operations in order. You don&rsquo;t like dealing with fractions or negative numbers though, so if during the process, the operations generate a fraction or a negative number, you will tell your friend that he messed up.</p>

<p>Now, you know the n operations your friend will give. How many of the first 100 positive integers will cause your friend to mess up?</p>

### 입력

<p>The first line of input contains a single positive integer n (1 &le; n &le; 10). Each of the next n lines consists of an operation, followed by an operand. The operation is one of the strings <code>ADD</code>,&nbsp;<code>SUBTRACT</code>,&nbsp;<code>MULTIPLY</code>, or&nbsp;<code>DIVIDE</code>. Operands are positive integes not exceeding 5.</p>

### 출력

<p>Print, on a single line, a single integer indicating how many of the first 100 positive integers will result in you telling your friend that he messed up.</p>
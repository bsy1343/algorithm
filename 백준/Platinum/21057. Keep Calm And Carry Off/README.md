# [Platinum V] Keep Calm And Carry Off - 21057

[문제 링크](https://www.acmicpc.net/problem/21057)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 109, 정답: 45, 맞힌 사람: 36, 정답 비율: 56.250%

### 분류

그리디 알고리즘, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Petra is learning how to add two positive integers in school, but thinks it is a bit too difficult. They are currently working with the standard algorithm for addition, where you first compute the sum of the two units digits, then the sum of the two tens digits, and so on. Whenever the sum of the digits at the same position in the two numbers exceeds 9, a carry digit is added onto the digit of the next higher magnitude. Petra has trouble with the last step -- she often forgets to keep track of the carry digit.</p>

<p>A few weeks ago, she also learnt a simpler method of addition. In this method, you repeatedly add $1$ to one of the numbers and subtract $1$ from the other, until the second one reaches zero. This can of course take a lot of time for large numbers.</p>

<p>Petra now wants to combine the two methods, for fast and error-free addition. Her plan is to first perform the second method one step at a time, until the two numbers would not produce a carry digit when added using the standard algorithm (for positive integers, this always happens eventually). To evaluate the performance of her new method, she has asked you to help her compute the number of steps she must perform of the second method when adding two given integers. Petra may perform the addition by $1$ to either of the two numbers (and subtraction by $1$ from the other).</p>

### 입력

<p>The input consists of two lines, each containing a positive integer with at most $10^6$ digits. These are the two integers Petra wants to add.</p>

### 출력

<p>Output a single integer, the minimum number of times Petra must add $1$ to one of her numbers (while subtracting $1$ from the other) until they can be added using the standard addition algorithm without any carry digits.</p>
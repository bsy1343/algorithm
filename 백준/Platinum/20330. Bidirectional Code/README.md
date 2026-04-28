# [Platinum IV] Bidirectional Code - 20330

[문제 링크](https://www.acmicpc.net/problem/20330)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 270, 정답: 109, 맞힌 사람: 97, 정답 비율: 42.174%

### 분류

그리디 알고리즘, 애드 혹, 해 구성하기

### 문제 설명

<p>For communication through space between earth and satellites, one cannot simply transmit a message in the same way as cellular communication like 4G. Because of the extremely long distance a signal travels, the message might be distorted by noise.&nbsp;</p>

<p>Throughout the years, researchers have found ways to bypass this problem, and the solution lies in introducing redundant data. This gives the receiver a method to test if the received data contains an error, in which case it can ask the sender to transmit the message again, or it might be able to recover the original message if there was only a small error. This area of research is called Coding Theory.</p>

<p>We created a new redundant system to prevent mistakes. Now, to send a number, you simply find a way to express it as a sum of palindromic numbers, and send each palindromic number as you would normally do. The receiver may now check if it received a number which was not palindromic, in which case there was an error.</p>

<p>To keep the communication efficient enough, the institute has added the constraint that a number can only be broken down into the sum of at most $10$ palindromic numbers. You must find a way to break any number down into palindromic numbers.</p>

<p>A recent paper has shown that every positive integer is a sum of three palindromic numbers.</p>

### 입력

<ul>
	<li>One line containing a single integer $n$ ($1\leq n &lt; 10^{18}$), the number you want to write as a sum of palindromic numbers.</li>
</ul>

### 출력

<p>First, output a line with a single number $1\leq k\leq 10$, the number of palindromic numbers you need. Then follow $k$ lines each containing a palindromic number.</p>
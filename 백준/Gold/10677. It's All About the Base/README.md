# [Gold V] It's All About the Base - 10677

[문제 링크](https://www.acmicpc.net/problem/10677)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 323, 정답: 193, 맞힌 사람: 154, 정답 비율: 59.459%

### 분류

수학, 이분 탐색, 두 포인터

### 문제 설명

<p>Bessie the cow has been taking computing classes at her local college (or &quot;cow-ledge&quot;, in her case), and she has been very excited to recently learn about writing numbers in different bases.</p>

<p>Recall that a number written in base B has digit places representing 1, B, B^2, B^3, and so on from right to left. &nbsp;For example, in our familiar base 10 numbering system, we have digits representing 1&#39;s, 10&#39;s, 100&#39;s, 1000&#39;s and so on. The sequence of digits 1234, interpreted in base 10, really means 1(1000) + 2(100) + 3(10) + 4(1). The same sequence of digits 1234, interpreted in base 5, would mean 1(125) + 2(25) + 3(5) + 4(1), which adds up to the number 194 in base 10. &nbsp;Bessie notices that if the base increases, so does the number represented by a sequence of digits -- for example, 1234 in base 7 represents a larger number than 1234 in base 6.</p>

<p>When writing numbers in base B, each digit can range from 0 through B-1, so for example in base 10 each digit is in the range 0..9, and in base 5 each digit is in the range 0..4. &nbsp;It is entirely possible to consider bases larger than 10. &nbsp;Computer scientists often use base 16 (&quot;hexadecimal&quot;), where the letters A..F represent digits of values 10..15. &nbsp;For example, BEEF in hexadecimal corresponds to 11(4096) + 14(256) + 14(16) + 15, which adds up to the number 48879 in base 10.</p>

<p>Bessie is intrigued by the concept of using bases much larger than 10. She takes a number N and writes it down in two different bases X and Y, where both X and Y are in the range 10..15,000. &nbsp;Interestingly, in both cases, she gets a sequence of 3 digits, each of which happens to be only in the range 1..9. &nbsp;Unfortunately, due to Bessie&#39;s poor memory, she has now forgotten N, X, and Y! &nbsp;Given just the two 3-digit sequences she wrote down, please help her figure the two bases X and Y that she used.</p>

<p>Note that due to the potential size of X and Y, a program that searches exhaustively over every possible value of X and Y (nearly 15,000^2 possibilities!) will not run within the time limit, so it would not receive full credit.</p>

### 입력

<p>The input file starts with an integer K, then it contains K lines each specifying a separate test case. &nbsp;Each test case consists of two 3-digit numbers. &nbsp;The first is a number N written in base X, and the second is N written in base Y (N, X, and Y are possibly different for each test case).</p>

### 출력

<p>Your output should contain K lines, one for each test case. &nbsp;On each line, output the two numbers X and Y for the relevant test case, separated by a space. &nbsp;A unique solution for each case is guaranteed to exist.</p>

### 힌트

<p>The number 8892, written in base 47, is 419. &nbsp;Written in base 35, it is 792.</p>
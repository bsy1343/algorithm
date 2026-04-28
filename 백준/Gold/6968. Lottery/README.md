# [Gold III] Lottery - 6968

[문제 링크](https://www.acmicpc.net/problem/6968)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 21, 맞힌 사람: 13, 정답 비율: 40.625%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>You have just won the lottery. All that separates you from your multi-million dollar prize is your correct answer to the following skill-testing question:</p>

<p>$1234 + 4567 \times 11$</p>

<p>In your twenty seconds you see your fortune slipping away because you don&#39;t know whether the answer is</p>

<p>$(1234 + 4567) \times 11 = 63\,811$</p>

<p>or</p>

<p>$1234 + (4567 \times 11) = 51\,471$</p>

<p>Finally you guess <code>63811</code>, but that answer is incorrect. Your math teacher set the question and expected you to remember that multiplication is done before addition. The correct answer is <code>51471</code>.</p>

<p>Your job is to write a program to insert parentheses into lottery questions such as the above so as to make clear the order of operations.</p>

### 입력

<p>The input to your program consists of a line containing an integer, $n$, followed by $n$ lines of input. Each of the $n$ lines contains an expression consisting of integers, and the operators <code>+</code>, <code>-</code>, and <code>X</code> denoting addition, subtraction, and multiplication respectively. Adjacent integers are separated by one operator. There is a single space to the left and to the right of each operator and no input line contains more than 80 characters.</p>

### 출력

<p>Your output should consist of the same $n$ lines, with a blank line between them, with parentheses inserted in the $n$ lines so as to indicate the order of operations. Multiplication should be done first, from left to right, and addition and subtraction should then be done from left to right. Spaces surrounding operators should be preserved.</p>
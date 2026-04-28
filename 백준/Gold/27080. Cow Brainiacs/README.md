# [Gold V] Cow Brainiacs - 27080

[문제 링크](https://www.acmicpc.net/problem/27080)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 45, 맞힌 사람: 27, 정답 비율: 48.214%

### 분류

수학, 정수론, 소인수분해

### 문제 설명

<p>One afternoon as the cows were chewing their cud, Bessie said, &quot;Let&#39;s have a contest to see who is the smartest cow.  Here&#39;s the contest:  we will choose a positive number N (no larger than 2,000,000) and whoever computes the rightmost non-zero digit of N factorial will be crowned the smartest cow.&quot;</p>

<p>The other cows demurred, however, mooing, &quot;We did that last year.&quot;</p>

<p>&quot;Oh,&quot; said Bessie, &quot;but there&#39;s a catch.  We&#39;re not necessarily going to use base 10.  I know my hooves don&#39;t have that many digits!  We&#39;ll just specify a positive number base B from 2 through 29.&quot;</p>

<p>Write a program to help the cows judge their intelligence contest.</p>

### 입력

<p>A single line with integers N and B</p>

### 출력

<p>A single line with the decimal-representation of the &quot;digit&quot; that is the rightmost non-zero digit for N! in base B.  If B &gt; 10, go ahead and output a two-digit decimal number as a representation of the final &quot;digit&quot;.</p>

### 힌트

<p>13*12*11*10*9*8*7*6*5*4*3*2*1=6227020800 base 10, which in base 3 is 121001222020102200000, so the right-most non-zero digit is 2.</p>
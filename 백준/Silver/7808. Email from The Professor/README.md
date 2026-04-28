# [Silver III] Email from The Professor - 7808

[문제 링크](https://www.acmicpc.net/problem/7808)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 211, 정답: 68, 맞힌 사람: 64, 정답 비율: 40.000%

### 분류

구현, 문자열, 정렬

### 문제 설명

<p>Being a judge in a programming contest like ACM/ICPC INC sometimes means trouble. They have to prepare challenging and interesting problems, and most importantly, they should keep the problems secret before the contest day. Usually, the judges use email as a main device to communicate and discuss on problems. As you might think, this is not a secure way to communicate confidentially since emails can be unintentionally sent to unexpected recipients, e.g. his/her student or worst, the contestant.</p>

<p>Considering those issues, Prof. Nash V. Ruhdney, one of the judges, has proposed a method to communicate confidentially amongst judges. Supposed there is a message of length n, write the message in a rectangle of width k, row by row, and read it column by column in a permuted order. The order of columns will then be the encryption key for the message. For example,</p>

<pre>
Message     : I am Prof. Nash V. Ruhdney
Key         : 3 7 4 1 2 6 5
Plain Text  : I   a m   P r
              o f .   N a s
              h   V .   R u
              h d n e y * *	    note: &#39;*&#39; means blank and is not part of the message.
Column      : 11112222333344445556667777
Cipher Text : m .e N yIohha.VnrsuPaR f d
</pre>

<p>Prof. Nash then send this encrypted message (cipher text) through email, while the encryption key is sent through other means, such as phone or SMS. This way he can reduce the risk of erroneously sent email.</p>

<p>Of course there is no way that the professor would use paper &amp; pencil to encrypt those messages. So, would you be kind to help him while he is preparing a nice problem for you?</p>

### 입력

<p>Input consists of several test cases. The first line of each test case contains a message of length n (1 &lt;= n &lt;= 1,000) in a line (the message consists of ASCII characters). The next line contains k, (1 &lt;= k &lt;= 1,000) the width of rectangle, followed by k integer(s) separated by a single space, the permutation of 1 to k which represents the encryption key.</p>

<p>&nbsp;</p>

### 출력

<p>For each message, output the encrypted message in a single line.</p>

<p>&nbsp;</p>
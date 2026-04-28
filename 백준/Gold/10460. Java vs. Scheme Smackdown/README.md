# [Gold V] Java vs. Scheme Smackdown - 10460

[문제 링크](https://www.acmicpc.net/problem/10460)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 80, 정답: 27, 맞힌 사람: 22, 정답 비율: 46.809%

### 분류

수학, 문자열, 브루트포스 알고리즘, 정수론, 파싱, 유클리드 호제법

### 문제 설명

<p>Edgar thinks he knows it all.</p>

<p>He has programmed in Java before, and he believes all numbers on a computer are stored inexactly. Moreover, Java programs are mostly composed of dots: <code>System.out.please.oh.please.println()</code> for example. Edgar thinks that all numbers between 0 and 1 in Java are stored only partially, and the rest of the number is a sequence of dots, since it is Java. For example, the number &quot;1/6&quot; is stored in Java as &quot;0.1666...&quot; However, after Edgar is enlightened by the beauty of Scheme, he realizes that numbers can be stored exactly. He needs to rewrite his Java programs to use this exact representation.</p>

<p>In order to make this task feasible, he assumes that the original fraction is always the simplest one that produces the given sequence of digits; by <em>simplest</em>, he means the the one with smallest denominator. Also, he assumes that Java always stores enough important digits; no digit from the repeating portion of the decimal expansion was left unrecorded (even if this repeating portion was all zeroes).</p>

### 입력

<p>There are several test cases. For each test case there is one line of input of the form &quot;0.<em>dddd</em>...&quot; where <em>dddd</em> is a string of 1 to 9 digits, not all zero. A line containing 0 follows the last case.&nbsp;</p>

### 출력

<p>For each case, output the original fraction.</p>

<p>Note that an exact decimal fraction has two repeating expansions (e.g. 1/5 = 0.2000... = 0.19999...).</p>
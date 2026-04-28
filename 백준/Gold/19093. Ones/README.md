# [Gold IV] Ones - 19093

[문제 링크](https://www.acmicpc.net/problem/19093)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 36, 맞힌 사람: 31, 정답 비율: 77.500%

### 분류

해 구성하기, 비트마스킹

### 문제 설명

<p>Let us define <em>1-expressions</em> to be the numeric expressions containing only ones, addition signs, multiplication signs and parentheses. In such expressions no two digits can be neighboring -- every two ones must be separated by an operator. We follow the usual order of evaluating the expressions -- for example, the multiplication has larger priority than the addition.</p>

<p>For example, each of the following 1-expressions evaluates to 6:</p>

<p style="text-align: center;"><code>(1+1)*(1+1+1)</code>, <code>(1+1+1)*(1+1)*1</code>, <code>((1+1)+1)*(1+1)</code>, <code>1+1+1+1+1+1</code>, <code>1+(1+(1+(1+(1+1))))</code>.</p>

<p>Formally, the following grammar describes all the correct 1-expressions $E$:</p>

<p style="text-align: center;"><code>E ::= 1 | E+E | E*E | (E+E) | (E*E)</code></p>

<p>Write a program that, given an integer $k$ ($k \le 10^9$), outputs a 1-expression evaluating to $k$ that contains at most 100 <strong>ones</strong>.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 100$) -- the number of testcases.</p>

<p>Each of the following $t$ lines describe a single testcase. The $i$-th of these lines describes the $i$-th test and contains a single integer $k_i$ ($1 \le k_i \le 10^9$).</p>

### 출력

<p>You should output exactly $t$ lines.</p>

<p>If there is no 1-expression evaluating to $k_i$ and containing at most 100 ones, you should output <code>NO</code> in the $i$-th line. Otherwise, the line should contain the required solution. You should not print any spaces inside the expression. If there is more than one correct solution, print any.</p>
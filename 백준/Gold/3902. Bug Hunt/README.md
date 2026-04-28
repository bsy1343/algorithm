# [Gold III] Bug Hunt - 3902

[문제 링크](https://www.acmicpc.net/problem/3902)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 15, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵, 파싱, 스택, 재귀

### 문제 설명

<p>In this problem, we consider a simple programming language that has only declarations of one- dimensional integer arrays and assignment statements. The problem is to find a bug in the given program.</p>

<p>The syntax of this language is given in BNF as follows:</p>

<pre>
       &lt;program&gt; ::= &lt;declaration&gt; | &lt;program&gt;&lt;declaration&gt; | &lt;program&gt;&lt;assignment&gt;
   &lt;declaration&gt; ::= &lt;array name&gt;[&lt;number&gt;]&lt;new line&gt;
    &lt;assignment&gt; ::= &lt;array name&gt;[&lt;expression&gt;]=&lt;expression&gt;&lt;new line&gt;
    &lt;expression&gt; ::= &lt;number&gt; | &lt;array name&gt;[&lt;expression&gt;]
        &lt;number&gt; ::= &lt;digit&gt; | &lt;digit_positive&gt;&lt;digit_string&gt;
  &lt;digit_string&gt; ::= &lt;digit&gt; | &lt;digit&gt;&lt;digit_string&gt;
&lt;digit_positive&gt; ::= 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
         &lt;digit&gt; ::= 0 | &lt;digit_positive&gt;
    &lt;array_name&gt; ::= a | b | c | d | e | f | g | h | i | j | k | l | m | 
                     n | o | p | q | r | s | t | u | v | w | x | y | z |
                     A | B | C | D | E | F | G | H | I | J | K | L | M |
                     N | O | P | Q | R | S | T | U | V | W | X | Y | Z</pre>

<p>where &lt;new_line&gt;a new line character (LF).</p>

<p>Characters used in a program are alphabetical letters, decimal digits, =, [, ] and new line characters. No other characters appear in a program.</p>

<p>A declaration declares an array and specifies its length. Valid indices of an array of length n are integers between 0 and n &minus; 1, inclusive. Note that the array names are case sensitive, i.e. array a and array A are different arrays. The initial value of each element in the declared array is undefined.</p>

<p>For example, array a of length 10 and array b of length 5 are declared respectively as follows.</p>

<pre>
a[10]
b[5]</pre>

<p>An expression evaluates to a non-negative integer. A &lt;number&gt; is interpreted as a decimal integer. An &lt;array name&gt;[&lt;expression&gt;] evaluates to the value of the &lt;expression&gt;-th element of the array. An assignment assigns the value denoted by the right hand side to the array element specified by the left hand side.</p>

<p>Examples of assignments are as follows.</p>

<pre>
a[0]=3
a[1]=0
a[2]=a[a[1]]
a[a[0]]=a[1]</pre>

<p>A program is executed from the first line, line by line. You can assume that an array is declared once and only once before any of its element is assigned or referred to.</p>

<p>Given a program, you are requested to find the following bugs.</p>

<ul>
	<li>An index of an array is invalid.</li>
	<li>An array element that has not been assigned before is referred to in an assignment as an index of array or as the value to be assigned.</li>
</ul>

<p>You can assume that other bugs, such as syntax errors, do not appear. You can also assume that integers represented by &lt;number&gt;s are between 0 and 2<sup>31</sup> &minus; 1 (= 2147483647), inclusive.</p>

### 입력

<p>The input consists of multiple datasets followed by a line which contains only a single &#39;.&#39; (period). Each dataset consists of a program also followed by a line which contains only a single &#39;.&#39; (period). A program does not exceed 1000 lines. Any line does not exceed 80 characters excluding a new line character.</p>

### 출력

<p>For each program in the input, you should answer the line number of the assignment in which the first bug appears. The line numbers start with 1 for each program. If the program does not have a bug, you should answer zero. The output should not contain extra characters such as spaces.</p>
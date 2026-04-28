# [Platinum I] Bitwise Expressions - 3367

[문제 링크](https://www.acmicpc.net/problem/3367)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 10, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

구현, 자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>In signal processing, one is sometimes interested in the maximum value of a certain expression, containing bitwise AND and OR operators, when the variables are integers in certain ranges. You are to write a program that takes such an expression and the range of each variable as input and determines the maximum value that the expression can take.</p>

<p>For simplicity, the expression is of a specific form, namely a number of subexpressions in parentheses separated by the bitwise AND operator (denoted &amp;). Each subexpression consists of one or more variables separated by the bitwise OR operator (denoted |). Using this convention, it is possible to completely specify the expression by giving the number of subexpressions and, for each subexpression, the number of variables in the subexpression. The variables are simply numbered according to their occurrence in the expression.</p>

<p>An example will clarify this. If the number of subexpressions is 4 and the number of variables in each subexpression is 3, 1, 2, and 2, then the expression will be</p>

<p style="text-align: center;">E = (v<sub>1</sub> | v<sub>2</sub> | v<sub>3</sub>) &amp; (v<sub>4</sub>) &amp; (v<sub>5</sub> | v<sub>6</sub>) &amp; (v<sub>7</sub> | v<sub>8</sub>)</p>

<p>The bitwise operators are defined in the common way. For example, to perform the operation 21 &amp; 6, we first write down the binary form of the numbers (operands): 10101 and 110 (since 21 = 24 + 2<sup>2</sup> + 2<sup>0</sup> and 6 = 2<sup>2</sup> + 2<sup>1</sup>). Every binary digit in the result now depends on the corresponding digit in the operands: if it is 1 in both operands, the resulting digit will be one, otherwise it will be zero. As is illustrated below to the left, the resulting value is 4. If instead we want to calculate 21 | 6, the procedure is the same except that the resulting digit will be one if the corresponding digit is one in <em>any</em> of the operands, and thus it will be zero only in the case that the digit is zero in both operands. As is illustrated below in the center, the result is 23. The generalization to more than two operands is straightforward. The rightmost example below illustrates that 30 &amp; 11 &amp; 7 = 2.</p>

<pre style="text-align: center;">
                    11110
  10101    10101    01011
&amp; 00110  | 00110  &amp; 00111
-------  -------  -------
  00100    10111    00010
</pre>

### 입력

<p>In the first line, two integers N and P are given, where N is the total number of variables (1 &le; N &le; 100) and P is the number of subexpressions (1 &le; P &le; N). In the next line, P integers (K<sub>1</sub>, K<sub>2</sub>, ... ,K<sub>P</sub>) are given, where K<sub>i</sub> is the number of variables in the i-th subexpression. The Ki are all greater than or equal to 1 and their sum equals N. Each of the following N lines contains two integers A<sub>j</sub> and B<sub>j</sub> (0 &le; A<sub>j</sub>&nbsp;&le; B<sub>j</sub>&nbsp;&le; 2 000 000 000), specifying the range of the j-th variable in the expression according to A<sub>j</sub>&nbsp;&le; v<sub>j</sub>&nbsp;&le; B<sub>j</sub>.</p>

### 출력

<p>The content should be one row with a single integer: the maximum value that the expression can take.</p>

### 힌트

<p>Assume that we want to limit the values of the eight variables in the expression above according to 2 &le; v<sub>1</sub> &le; 4, 1 &le; v<sub>2</sub> &le; 4, v<sub>3</sub> = 0, 1 &le; v<sub>4</sub> &le; 7, 1 &le; v<sub>5</sub> &le; 4, 1 &le; v<sub>6</sub> &le; 2, 3 &le; v<sub>7</sub> &le; 4, and 2 &le; v<sub>8</sub> &le; 3.</p>

<p>If writing in binary notation, one of the best assignments gives the expression (100 | 011 | 000) &amp; (111) &amp; (100 | 010) &amp; (100 | 011), from which we note that all subexpressions may become equal to 7 except the third.</p>
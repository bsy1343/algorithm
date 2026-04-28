# [Gold I] Toothpick Arithmetic - 4851

[문제 링크](https://www.acmicpc.net/problem/4851)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 19, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>A toothpick expression uses toothpicks to represent a positive integer. The expression consists of operands and operators.</p>

<p>Each operand consists of one or more vertical toothpicks (&quot;|&quot;); the value of the operand is the number of toothpicks.</p>

<p>The operators that can appear in an expression are addition and multiplication. The addition operator is the plus sign (&quot;+&quot;), which consists of one vertical and one horizontal toothpick. The multiplication operator is the letter &quot;x&quot;, which also consists of two toothpicks. Multiplication has precedence over addition.</p>

<p>The expression must begin with an operand. Thereafter, operators and operands alternate. Finally, the expression must end with an operand. Given a positive integer, your program must represent it as a toothpick expression, using the smallest number of toothpicks.</p>

### 입력

<p>The input file will consist of one or more lines; each line will contain data for one instance of the problem. More specifically, each line will contain one positive integer, not exceeding 5000.</p>

### 출력

<p>Each line of input will give rise to one line of output, consisting of: the number of toothpicks used in the expression, the expression, and the given integer from the input, formatted as shown in the sample output. The word &quot;toothpicks&quot; (even if the answer is 1) will be preceded by one blank space and followed by a colon and one blank space. An equal sign (but no blank spaces) will separate the expression from the given number. The expression should not contain any spaces.</p>

<p>If there are multiple expressions which use the smallest number of toothpicks, any such expression is acceptable.</p>
# [Silver III] Boolean Postfix - 11289

[문제 링크](https://www.acmicpc.net/problem/11289)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 197, 정답: 119, 맞힌 사람: 77, 정답 비율: 63.636%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>Logical Boolean expressions are typically represented using infix notation, where the operators (&and;, &or;) are placed between the operands. For example, ((a&and;b)&or;&not;c) states that for the expression to be true, both a and b should be true, or c should be false. In her mathematics, Mary Lucy Margret uses an alternate form, where the operator is placed after the operands, called postfix notation. For example, the above expression could be written in postfix notation as: (a b &and; c &not; &or;).</p>

<p>Your task is to write a program to parse and evaluate Mary Lucy Margret&rsquo;s Boolean expressions, which are represented in postfix notation. You can be confident in her mathematics; you are guaranteed to be given correct and valid expressions.</p>

### 입력

<p>The first line of input contains a single integer T representing the number of expressions. Each of the next T lines contains a single Boolean formula in postfix notation. The line starts with a single integer n representing the number of tokens, with the remainder of the line containing n tokens, each separated by a single space.</p>

<p>The tokens 1 and 0 are used to denote Boolean truth values true and false respectively, and uppercase characters are used to denote the operators. Thus, the set of possible tokens are:</p>

<ul>
	<li>1 for Boolean true,</li>
	<li>0 for Boolean false,</li>
	<li>A for logical and,</li>
	<li>R for logical or,</li>
	<li>X for logical exclusive-or,</li>
	<li>N for logical negation.</li>
</ul>

### 출력

<p>The output should consist of T lines where each line contains a 1 if the corresponding expression evaluates to true, or 0 otherwise.</p>
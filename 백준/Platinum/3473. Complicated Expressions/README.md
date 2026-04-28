# [Platinum III] Complicated Expressions - 3473

[문제 링크](https://www.acmicpc.net/problem/3473)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 92, 정답: 37, 맞힌 사람: 27, 정답 비율: 32.927%

### 분류

구현, 자료 구조, 문자열, 많은 조건 분기, 파싱

### 문제 설명

<p>The most important activity of ACM is the GSM network. As the mobile phone operator, ACM must build its own transmitting stations. It is very important to compute the exact behaviour of electro-magnetic waves. Unfortunately, prediction of electro-magnetic fields is a very complex task and the formulas describing them are very long and hard-to-read. For example, below are the Maxwell&#39;s Equations describing the basic laws of electrical engineering.</p>

<p>\[\nabla \times \vec{\mathbf{B}} = 0 \\ \nabla \vec{\mathbf{E}} = \frac {\rho} {\varepsilon_0} \\ \nabla x \vec{\mathbf{H}} = \vec{\mathbf{j}} + \frac{\partial \vec{\mathbf{D}} } {\partial t} \\ \nabla x \vec{\mathbf{E}} = - \frac{\partial \vec{\mathbf{B}} } {\partial t}\]</p>

<p>ACM has designed its own computer system that can make some field computations and produce results in the form of mathematic expressions. Unfortunately, by generating the expression in several steps, there are always some unneeded parentheses inside the expression. Your task is to take these partial results and make them &quot;nice&quot; by removing all unnecessary parentheses.</p>

### 입력

<p>There is a single positive integer T on the first line of input. It stands for the number of expressions to follow. Each expression consists of a single line containing only lowercase letters, operators (+, -, *, /) and parentheses (( and )). The letters are variables that can have any value, operators and parentheses have their usual meaning. Multiplication and division have higher priority then subtraction and addition. All operations with the same priority are computed from left to right (operators are left-associative). There are no spaces inside the expressions. No input line contains more than 250 characters.</p>

### 출력

<p>Print a single line for every expression. The line must contain the same expression with unneeded parentheses removed. You must remove as many parentheses as possible without changing the semantics of the expression. The semantics of the expression is considered the same if and only if any of the following conditions hold:</p>

<ul>
	<li>The ordering of operations remains the same. That means &quot;(a+b)+c&quot; is the same as &quot;a+b+c&quot;, and &quot;a+(b/c)&quot; is the same as &quot;a+b/c&quot;.</li>
	<li>The order of some operations is swapped but the result remains unchanged with respect to the addition and multiplication associativity. That means &quot;a+(b+c)&quot; and &quot;(a+b)+c&quot; are the same. We can also combine addition with subtraction and multiplication with division, if the subtraction or division is the second operation. For example, &quot;a+(b-c)&quot; is the same as &quot;a+b-c&quot;.</li>
</ul>

<p>You cannot use any other laws, namely you cannot swap left and right operands and you cannot replace &quot;a-(b-c)&quot; with &quot;a-b+c&quot;.</p>
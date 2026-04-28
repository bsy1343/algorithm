# [Gold I] Brackets - 8474

[문제 링크](https://www.acmicpc.net/problem/8474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 6, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

구현, 문자열, 많은 조건 분기, 파싱

### 문제 설명

<p>We are given an arithmetic expression template w that consists of four basic types of operations, some brackets and holes, denoted by x, that represent some missing numbers. For instance, (x*x)/(x+x) is a valid template.</p>

<p>A valuation of a template consists in inserting real numbers to the template so that the value of the resulting expression is correctly defined. For instance, by inserting the numbers 1, 2, 3, 4 into the respective holes in the example above, we obtain an expression that evaluates to (1&times;2)/(3+4) = 2/7, whereas inserting the numbers 1, 2, 3, -3 yields an expression with undefined value, hence this is not a valuation.</p>

<p>If the sets of valuations of two templates w and w&#39; are the same and for each valuation the expressions obtained from w and w&#39; have the same value, and the template w&#39; can be obtained by inserting and/or deleting some brackets from the template w, we say that the two templates are equivalent. For instance, the templates (x*x)/(x+x) and x*x/(x+x) are equivalent. On the other hand, the templates (x*x)/(x+x) and x*x/x+x are not equivalent, since the valuation 1, 2, 3, 4 of these templates yields two expressions that are evaluated to 2/7 and 14/3 respectively. Also the templates x-(x-x) and x-x+x are not equivalent since none of them can be transformed to the other by inserting or removing brackets.</p>

<p>Your task is to find a template with the minimum number of brackets among templates equivalent to a given template.</p>

<p>Multiplication and division have the same priority, which is greater than the priority of addition and subtraction. Hence, multiplication and division are performed before addition and subtraction. Addition and subtraction have the same priority. Operations with the same priority are performed from left to right.</p>

### 입력

<p>The first line of input contains an integer n that represents the number of expression templates in the input. Each of the following n lines contains a non-empty, correct expression template consisting of the characters +, -, *, /, (, ) and x (the holes). The sum of lengths of all the expressions does not exceed 10<sup>6</sup>.</p>

### 출력

<p>Your program should output n lines. The i-th line should contain a template that is equivalent to the -th template from the input, which contains the minimum number of brackets.</p>
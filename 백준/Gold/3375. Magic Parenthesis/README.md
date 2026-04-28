# [Gold II] Magic Parenthesis - 3375

[문제 링크](https://www.acmicpc.net/problem/3375)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 12, 맞힌 사람: 11, 정답 비율: 55.000%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>In the LISP programming language <strong><em>everything</em></strong> is written inside balanced parentheses <code>(LIKE THIS)</code>. This means that LISP code sometimes contains long stretches &quot;<code>)))...)</code>&quot; of closing parentheses. It is very tedious for the LISP programmer to get the number of these closing parentheses &#39;<code>)</code>&#39; to correspond exactly to the number of opening parentheses &#39;<code>(</code>&#39;.</p>

<p>To prevent such syntax errors, some LISP dialects introduce a <em><strong>magic closing parenthesis</strong></em> &#39;<code>]</code>&#39; which substitutes <em>one or more closing parentheses &#39;</em><code>)</code><em>&#39; as needed to properly balance the opening parentheses &#39;</em><code>(</code><em>&#39;</em>. But then the LISP compiler must calculate how many closing parentheses &#39;<code>)</code>&#39; each magic parenthesis &#39;<code>]</code>&#39; really substitutes. How?</p>

<p>Write a program which is given a string of opening, closing, and magic parentheses, and which calculates for each occurrence of the magic parenthesis the number of opening parentheses it corresponds to. In case of multiple solutions, the program should find any one of them.</p>

### 입력

<p>The first line consists of two integers 0 &le; N &le; 10 000 000 and 0 &le; M &le; 5 000 000 separated by a space. The first number N is the length of the input string. The second number M is the number of magic closing parentheses in the string. The rest of the input file starts on the second line and is a string of length N consisting of characters &#39;<code>(</code>&#39;, &#39;<code>)</code>&#39; and &#39;<code>]</code>&#39;. The character &#39;<code>]</code>&#39; occurs exactly M &le; N times in this string. This string is divided into lines of at most 72 characters each for readability.</p>

### 출력

<p>The first line consists of an integer &#39;<code>0</code>&#39; or &#39;<code>1</code>&#39;.</p>

<p>The number &#39;<code>0</code>&#39; means that the input cannot be balanced. (For example, the string which consists of just a single magic parenthesis &quot;<code>]</code>&quot; obviously cannot be balanced.) In this case there is no more output.</p>

<p>The number &#39;<code>1</code>&#39; means that the input can be balanced. In this the output continues with the following M extra lines.</p>

<p>The 1st of these extra lines consists of the number C<sub>1</sub> &ge; 1 of closing parentheses &#39;<code>)</code>&#39; the 1st magic parenthesis &#39;<code>]</code>&#39; in the input substitutes to. The 2nd extra line consists of the corresponding number C<sub>2</sub> &ge; 1 for the 2nd &#39;<code>]</code>&#39; in the input, and so on.</p>

<p>If there are many ways in which the given string can be balanced, then your program may output any one of them.</p>

### 힌트

<p>The input on the left describes a string with 8 characters, of which 2 are magic. The output on the right shows one way of balancing this input: the first magic parenthesis corresponds to 3 opening parentheses, and the second magic parenthesis corresponds to 1 opening parenthesis. And indeed, the magic-free string <code>(((((<u>)))</u>)<u>)</u></code> is properly balanced, where the closing parentheses corresponding to the magic parentheses are <u>underlined</u>.</p>
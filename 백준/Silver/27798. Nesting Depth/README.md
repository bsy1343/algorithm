# [Silver IV] Nesting Depth - 27798

[문제 링크](https://www.acmicpc.net/problem/27798)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 41, 맞힌 사람: 32, 정답 비율: 91.429%

### 분류

구현, 그리디 알고리즘, 문자열

### 문제 설명

<p>tl;dr: Given a string of digits <b>S</b>, insert a minimum number of opening and closing parentheses into it such that the resulting string is balanced and each digit d is inside exactly d pairs of matching parentheses.</p>

<p>Let the <i>nesting</i> of two parentheses within a string be the substring that occurs strictly between them. An opening parenthesis and a closing parenthesis that is further to its right are said to <i>match</i> if their nesting is empty, or if every parenthesis in their nesting matches with another parenthesis in their nesting. The <i>nesting depth</i> of a position p is the number of pairs of matching parentheses m such that p is included in the nesting of m.</p>

<p>For example, in the following strings, all digits match their nesting depth: <code>0((2)1)</code>, <code>(((3))1(2))</code>, <code>((((4))))</code>, <code>((2))((2))(1)</code>. The first three strings have minimum length among those that have the same digits in the same order, but the last one does not since <code>((22)1)</code> also has the digits <code>221</code> and is shorter.</p>

<p>Given a string of digits <b>S</b>, find another string S&#39;, comprised of parentheses and digits, such that:</p>

<ul>
	<li>all parentheses in S&#39; match some other parenthesis,</li>
	<li>removing any and all parentheses from S&#39; results in <b>S</b>,</li>
	<li>each digit in S&#39; is equal to its nesting depth, and</li>
	<li>S&#39; is of minimum length.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> lines follow. Each line represents a test case and contains only the string <b>S</b>.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the string S&#39; defined above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>1 &le; length of <b>S</b> &le; 100.</li>
</ul>

### 힌트

<p>The strings <code>()0000()</code>, <code>(1)0(((()))1)</code> and <code>(1)(11)000</code> are not valid solutions to Sample Cases #1, #2 and #3, respectively, only because they are not of minimum length. In addition, <code>1)(</code> and <code>)(1</code> are not valid solutions to Sample Case #4 because they contain unmatched parentheses and the nesting depth is 0 at the position where there is a 1.</p>

<p>You can create sample inputs that are valid only for Test Set 2 by removing the parentheses from the example strings mentioned in the problem statement.</p>
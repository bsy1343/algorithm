# [Platinum II] mars - 3220

[문제 링크](https://www.acmicpc.net/problem/3220)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 9, 맞힌 사람: 7, 정답 비율: 17.500%

### 분류

다이나믹 프로그래밍, 해싱, 수학, 정수론, 라빈–카프, 문자열

### 문제 설명

<p>Person A discovered the DNA formula of Martians.</p>

<p>He wants to give the information to person B in exchange for a large amount of peanuts. They suspect that the Bureau of Prevention of the Spreading of the DNA Formula of Martians (BPSDFM) is easedropping on them, so they will meet in a deserted bakery to exchange goods.</p>

<p>Since the formula is very long, person A wants to shorten it some way so that he can give it to the other person as easily as possible. He does it the following way:</p>

<p>The formula is a sequence of lowercase letters of the English alphabet. We shorten the formula so that some repeating strings of characters are written as follows: &#39;<code>abcabcabc</code>&#39; as &#39;<code>(abc)3</code>&#39;, &#39;<code>axyxyxyxyb</code>&#39; as &#39;<code>a(xy)4b</code>&#39;, and we can also have nested shortening eg. &#39;<code>mnmndefmnmndef</code>&#39; as &#39;<code>((mn)2def)2</code>&#39;.</p>

<p>The length of a formula is defined as the total number of characters, including the parentheses and digits.</p>

<p>Write a program that will, given a formula, shorten it so that the number of characters in the new formula is minimal.</p>

<p>Note: the solution need not be unique.&nbsp;</p>

### 입력

<p>The first and only line of input contains the formula. The maximum length is 1000 characters.</p>

### 출력

<p>The first and only line of output should contain the shortest way of writing the formula. If there is more than one way of shortening the formula with minimal length, output any of them.</p>
# [Silver I] Zeroes and Ones - 13036

[문제 링크](https://www.acmicpc.net/problem/13036)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 44, 맞힌 사람: 37, 정답 비율: 66.071%

### 분류

그리디 알고리즘

### 문제 설명

<p>Peter hasn&#39;t submitted his homework for today&#39;s Computer Science lesson, so he is punished and given an additional task. The teacher has written two strings of the same length at the blackboard and asks Peter to make them equal using operations of only one type: take two adjacent characters of one of the strings and invert them both. Inversion transforms 0 to 1 and 1 to 0.</p>

<p>To make the problem even harder, Peter must use the minimal number of inversion operations.</p>

<p>Help Peter to complete his difficult task.</p>

<p>For example, if the two strings were &quot;0101&quot; and &quot;1111&quot; one way to make them equal is to invert two characters in the middle of the first string to get &quot;0011&quot; and &quot;1111&quot; and then invert two first characters of the second string to get &quot;0011&quot; and &quot;0011&quot;. Note that there are other ways to complete the task with two operations in this example.</p>

### 입력

<p>Input data contains multiple test cases. The first line contains the number of test cases t (1 &le; t &le; 100).</p>

<p>Each test case is described in the following way. The first line contains n (1 &le; n &le; 10<sup>5</sup>) &mdash; the length of the strings written by the teacher. The second and the third lines contain the strings themselves &mdash; two strings of length n containing only 0-s and 1-s.</p>

<p>The sum of values of n for all test cases in one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case print one line: the minimal required number of inversion operations to make the strings equal, or - 1 if it is impossible to make the strings equal.</p>

<p>&nbsp;</p>
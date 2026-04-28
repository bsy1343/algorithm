# [Platinum V] DISH - 18401

[문제 링크](https://www.acmicpc.net/problem/18401)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 문자열, 백트래킹, 역추적, 최장 공통 부분 수열 문제

### 문제 설명

<p>A restaurant in Kabul is very interested to create new food by combining multiple foods. They want to name each of these foods in a way so that customers can learn about it with the least explanation when displaying the menu.</p>

<p>The head of the restaurant decided to use the shortest string which includes the main meal names as substrings in the new name. For example, &quot;shrimpce&quot; is the name of a dish which was created by combining &quot;rice&quot; and &quot;shrimp&quot;, and there is no shorter string that has the same property. Write a program that calculates the shortest name for those dishes&rsquo; foods.</p>

### 입력

<p>The first input line contains N, the number of test cases. The next N line, each contains two strings that represent the names of the foods that should be combined. All names have a maximum length of 100 and only consist of alphabetic characters.</p>

### 출력

<p>For each test case, output the shortest name of the resulting food on one line. If more than one shortest name is possible, any one is acceptable.</p>
# [Bronze II] K-Goodness String - 22999

[문제 링크](https://www.acmicpc.net/problem/22999)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 313, 정답: 192, 맞힌 사람: 177, 정답 비율: 60.410%

### 분류

구현, 문자열

### 문제 설명

<p>Charles defines the goodness score of a string as the number of indices i such that S<sub>i</sub> &ne; S<sub>N&minus;i+1</sub> where 1 &le; i &le; N/2 (1-indexed). For example, the string CABABC has a goodness score of 2 since&nbsp;S<sub>2</sub> &ne; S<sub>5</sub> and S<sub>3</sub> &ne; S<sub>4</sub>.</p>

<p>Charles gave Ada a string S of length N, consisting of uppercase letters and asked her to convert it into a string with a goodness score of K. In one operation, Ada can change any character in the string to any uppercase letter. Could you help Ada find the minimum number of operations required to transform the given string into a string with goodness score equal to K?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>The first line of each test case contains two integers N and K. The second line of each test case contains a string S of length N, consisting of uppercase letters.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y is the minimum number of operations required to transform the given string&nbsp;S&nbsp;into a string with goodness score equal to&nbsp;K.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>0 &le; K &le; N/2.</li>
</ul>

### 힌트

<p>In Sample Case #1, the given string already has a goodness score of 1. Therefore the minimum number of operations required is 0.</p>

<p>In Sample Case #2, one option is to change the character at index 1 to B in order to have a goodness score of 2. Therefore, the minimum number of operations required is 1.</p>
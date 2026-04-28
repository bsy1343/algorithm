# [Gold III] The Total is Right - 16093

[문제 링크](https://www.acmicpc.net/problem/16093)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 33, 맞힌 사람: 16, 정답 비율: 33.333%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>The total is right is a popular TV game that has been broadcast in many countries. The goal of the game is to reach a chosen number N using the four arithmetic operations (+, &minus;, &times;, &divide;) and six given integer numbers m<sub>i</sub> for 1 &le; i &le; 6. All the intermediate numbers must be positive and any division must be exact (for example, it is not possible to divide 5 by 2). The input numbers m<sub>i</sub> as well as all intermediate numbers can be used at most once, but you are not required to use all input numbers.</p>

<p>For instance, suppose N = 888 and m<sub>1</sub> = 100, m<sub>2</sub> = 6, m<sub>3</sub> = 75, m<sub>4</sub> = 3, m<sub>5</sub> = 1, and m<sub>6</sub> = 6. We can then obtain N = 888 by computing</p>

<ul>
	<li>75 &minus; 1 = 74 (using m<sub>3</sub>/m<sub>5</sub>)</li>
	<li>6 + 6 = 12 (using m<sub>2</sub>/m<sub>6</sub>)</li>
</ul>

<p>and finally</p>

<ul>
	<li>74 &times; 12 = 888. (using m<sub>3</sub>/m<sub>5</sub> and m<sub>2</sub>/m<sub>6</sub> respectively)</li>
</ul>

<p>Hence, in that example, the total is right!</p>

### 입력

<p>The input file consists of multiple test cases. The first line of the input file consists of a single integer indicating the number of test cases. Each test case follows, and consists of one single line that consists of seven integers N, m<sub>1</sub>, m<sub>2</sub>, m<sub>3</sub>, m<sub>4</sub>, m<sub>5</sub>, and m<sub>6</sub>, each separated by a single space. The integer 101 &le; N &le; 999 is the number that must be reached, and the integers m<sub>i</sub> are the numbers that can be used to reach N: for each 1 &le; i &le; 6, we have m<sub>i</sub> &isin; {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 75, 100}.</p>

### 출력

<p>For each test case in the input, your program should print one line consisting of the string The total is right (followed by a newline) or of the string Impossible (followed by a newline), depending on whether or not it is possible to obtain exactly N using some or all of the numbers m<sub>i</sub> for 1 &le; i &le; 6 according to the rules of the game. There should not be any blank lines in your output.</p>
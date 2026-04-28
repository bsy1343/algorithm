# [Platinum II] Diverse Subarray - 23934

[문제 링크](https://www.acmicpc.net/problem/23934)

### 성능 요약

시간 제한: 30 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 15, 맞힌 사람: 13, 정답 비율: 44.828%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 슬라이딩 윈도우

### 문제 설명

<p>Vanity has&nbsp;<b>N</b>&nbsp;trinkets on her shelf, numbered 1, 2, ...,&nbsp;<b>N</b>&nbsp;from left to right. Trinkets come in different types, which are denoted by positive integers. The i-th trinket on her shelf is of type&nbsp;<b>A<sub>i</sub></b>.</p>

<p>She is going to see her family overseas today and would like to bring as many trinkets as she can. However, since she is in a hurry, Vanity must take a consecutive interval of trinkets. Formally, Vanity selects two indices,&nbsp;<i>l</i>&nbsp;and&nbsp;<i>r</i>, and takes all of the trinkets numbered&nbsp;<i>l</i>,&nbsp;<i>l</i>+1, ...,&nbsp;<i>r</i>-1,&nbsp;<i>r</i>. Also, due to tax rules, airport security will throw away&nbsp;<i>all</i>&nbsp;trinkets of a type if Vanity has more than&nbsp;<b>S</b>&nbsp;of that type in the chosen interval.</p>

<p>For example, suppose that&nbsp;<b>S</b>&nbsp;= 2, and Vanity brings six trinkets: one of type 0, two of type 1, and three of type 2. She will be allowed to keep the trinket of type 0 and both trinkets of type 1, but she will lose&nbsp;<i>all</i>&nbsp;of the trinkets of type 2!</p>

<p>Vanity needs to choose&nbsp;<i>l</i>&nbsp;and&nbsp;<i>r</i>&nbsp;such that she can take the maximum number of trinkets for her family. What is the maximum number of trinkets she can bring?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>S</b>, the number of trinkets, and the maximum number of trinkets allowed of a single type, respectively. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer gives&nbsp;<b>A<sub>i</sub></b>, the type of the i-th trinket.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of trinkets that Vanity can bring to her family.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>1 &le;&nbsp;<b>S</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, Vanity should choose&nbsp;<i>l</i>&nbsp;= 2 and&nbsp;<i>r</i>&nbsp;= 5. This allows her to take 4 trinkets to the airport of types 1, 4, 1 and 4. None of them are thrown away by airport security, so she is able to bring 4 trinkets to her family.</p>

<p>In Sample Case #2, Vanity should choose&nbsp;<i>l</i>&nbsp;= 1 and&nbsp;<i>r</i>&nbsp;= 8. This allows her to take all 8 trinkets to the airport. Her trinkets of type 500 are thrown away since she has more than&nbsp;<b>S</b>&nbsp;= 1 of them, so she is able to bring a total of 6 trinkets to her family.</p>

<p>In Sample Case #3, Vanity should choose&nbsp;<i>l</i>&nbsp;= 1 and&nbsp;<i>r</i>&nbsp;= 9. This allows her to take 9 trinkets to the airport of types 100, 200, 8, 8, 8, 8, 8, 300 and 400. Her trinkets of type 8 are thrown away since she has more than&nbsp;<b>S</b>&nbsp;= 1 of them, so she is able to bring a total of 4 trinkets to her family.</p>

<p>In Sample Case #4, Vanity should choose&nbsp;<i>l</i>&nbsp;= 1 and&nbsp;<i>r</i>&nbsp;= 12. This allows her to take all 12 trinkets to the airport. Her trinkets of type 1 and 2 are thrown away since she has more than&nbsp;<b>S</b>&nbsp;= 2 of each of them, so she is able to bring a total of 6 trinkets to her family.</p>

<p><b>Note</b>: We do not recommend using interpreted/slower languages for this problem.</p>
# [Gold IV] King Thrór’s Gold Problem - 7001

[문제 링크](https://www.acmicpc.net/problem/7001)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The Dwarf king Thr&oacute;r wants to give some of his bars of gold to reward his k best warriors. The dwarf unit of currency is called a Mirian. Thr&oacute;r has n different bars whose values in Mirians are {v<sub>1</sub>,...,v<sub>n</sub>}. He wants to give away a total target value of T Mirians to these warriors by handing out k gold bars. Not all of his warriors are equally deserving, and so they will generally receive bars of different values.</p>

<p>Thr&oacute;r asks his brother Fr&oacute;r to help him to determine all the different ways in which he can form T as the sum of the values of k bars from his stock. For example, suppose that he has n = 10 bars of values V = {1, 2, 4, 5, 10, 11, 13, 15, 17, 19} Mirians, respectively. He wants to distribute k = 3 bars, and he wants to give a target amount of T = 20 Mirians. Fr&oacute;r determines that there are four different possible ways to do this:</p>

<p style="text-align: center;">1 + 2 + 17 1 + 4 + 15 2 + 5 + 13 4 + 5 + 11.</p>

<p>If, instead, there had been k = 4 warriors, there would be only two solutions:</p>

<p style="text-align: center;">1 + 2 + 4 + 13 1 + 4 + 5 + 10</p>

<p>You are to write a program to help brother Fr&oacute;r determine the number of solutions. Given the target amount T, the number of warriors k, and the values of bars V = {v<sub>1</sub>,...,v<sub>n</sub>}, your program is to output the number of different ways of forming T as the sum of k different values from V . If the number of solutions is 20 or fewer, your program should also list all the solutions in lexicographically increasing order. That is, all solutions involving the smallest bar are listed first, among those, solutions with the second smallest bar are listed first, and so on.</p>

### 입력

<p>The first line of the input file contains the number of test cases (&le; 100). Each case has the same format:</p>

<ul>
	<li>A line containing T, the desired target value, and k, the number of warriors. (You may assume that T &le; 500 and k &le; 50.)</li>
	<li>A line containing n, the number of gold bars. (You may assume that n &le; 100.)</li>
	<li>The next n positive integers represent the values of the bars v<sub>1</sub>,...,v<s>n</s>. (You may assume that the values are distinct and are given in increasing order.)</li>
</ul>

<p>You may assume that the number of solutions will fit into a single long integer, i.e., it will be less than 2<sup>63</sup>-1.</p>

### 출력

<p>After computing the number of possible solutions, your program will output the number of solutions on a single line (preceded by the string &ldquo;Number of solutions = &rdquo;). If this number is less than or equal to 20, it will then output each solution in lexicographically increasing order on a separate line, with the values separated by white spaces (blanks or tabs).</p>
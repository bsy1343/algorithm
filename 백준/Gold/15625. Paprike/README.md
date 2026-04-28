# [Gold II] Paprike - 15625

[문제 링크](https://www.acmicpc.net/problem/15625)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 37, 맞힌 사람: 31, 정답 비율: 55.357%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 트리

### 문제 설명

<p>Kre&scaron;o went to a local family farm and bought a bunch of hot peppers that are neatly connected with pieces of string into a so-called wreath. In this task, a wreath consists of n peppers and (n &minus; 1) pieces of string. Each piece of string connects two different peppers, and each two peppers in the wreath are connected (directly or indirectly) by the string. Therefore, the peppers and pieces of string form a so-called tree. Making one cut with scissors, Kre&scaron;o can cut the string, and split a pepper wreath into two smaller wreaths, which can again be split into smaller wreaths, and so on. Notice that a single pepper not connected to anything also forms a wreath.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15625/1.png" style="width: 517px; height: 217px;" /></p>

<p style="text-align: center;">Figure 1: The initial wreaths from the first two test cases together with the optimal cuts.</p>

<p>The spiciness of a single peper is measured using the so-called Scoville scale, and is represented as a non-negative integer. The spiciness of the wreath is the sum of spiciness of individual peppers it contains. Kre&scaron;o wants to spice up the lunch of high school students after an informatics competition and knows that the average high school student can eat a wreath whose spiciness is at most k before they need to ask for a doctor and a juvenile lawyer.</p>

<p>Determine the minimal number of cuts needed so that Kre&scaron;o can split the initial wreath into wreaths with spiciness at most k.</p>

### 입력

<p>The first line of input contains the integers n and k &mdash; the number of peppers and the maximal allowed spiciness of an individual wreath. The peppers are denoted with numbers from 1 to n. The following line contains n integers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> &mdash; the number h<sub>j</sub> is the spiciness of pepper j. Each of the following n &minus; 1 lines contains two distinct integers x and y (1 &le; x, y &le; n) &mdash; the labels of the peppers directly connected with a piece of string in the initial wreath. The peppers and strings form a tree, as described in the task.</p>

### 출력

<p>You must output the minimal number of cuts.</p>

### 제한

<p>In all subtasks, it holds n &ge; 2 and 0 &le; h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> &le; k &le; 3 000 000.</p>
# [Bronze I] Tables - 8321

[문제 링크](https://www.acmicpc.net/problem/8321)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 193, 정답: 148, 맞힌 사람: 131, 정답 비율: 74.857%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Byteman works as a carpenter. He has just received an order for <em>s</em>&nbsp;pine-wood tables. Although he has plenty of pine-wood boards in his workshop, he has just run out of screws. Therefore he needs to walk to the warehouse and bring back some boxes with screws. What is the minimum number of boxes that he needs to bring in order to have enough screws to make the tables?</p>

### 입력

<p>The first line of the standard input contains three integers <em>n</em>, <em>k</em>&nbsp;and <em>s</em>&nbsp;(1 &le; <em>n</em>, <em>k</em>, <em>s</em> &le; 1 000) separated with single spaces. They denote the number of boxes with screws in Byteman&#39;s warehouse, the number of screws needed to make a table and the number of tables to be made by Byteman, respectively. The second line contains <em>n</em>&nbsp;(not necessarily different) integers <em>a<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 1 000) separated with single spaces, such that <em>a<sub>i</sub></em>&nbsp;is the number of screws in the <em>i</em><sup>th</sup>&nbsp;box in the warehouse.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer - the minimal number of boxes with screws that Byteman needs to bring from his warehouse in order to make <em>s</em>&nbsp;tables. You may assume that Byteman has enough screws in the warehouse to make all tables.</p>

### 힌트

<p>To make three tables, each of which requires six screws, Byteman has to bring three boxes with screws from the warehouse. These can be either the ones containing 3, 7 and 9 screws, or the ones with 9, 5 and 7 screws.</p>
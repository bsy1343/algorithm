# [Gold I] The Biggest Triangle - 17881

[문제 링크](https://www.acmicpc.net/problem/17881)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 60, 맞힌 사람: 50, 정답 비율: 38.760%

### 분류

브루트포스 알고리즘, 기하학, 선분 교차 판정

### 문제 설명

<p>Three infinite lines define a triangle, unless they meet at a common point or some of them are parallel.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/98b0e568-abe6-4d1b-8da6-c4de5b72e917/-/preview/" style="width: 525px; height: 277px;" /></p>

<p>Given a collection of infinite lines, what is the largest possible perimeter of a triangle defined by some three lines in the collection?</p>

### 입력

<p>The first line of input contains a single integer n (3 &le; n &le; 100) indicating the number of infinite lines.</p>

<p>The next n lines describe the collection of infinite lines. The i<sup>th</sup> such line contains four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> (&minus;10 000 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 10 000) where (x<sub>1</sub>, y<sub>1</sub>) &ne;&nbsp;(x<sub>2</sub>, y<sub>2</sub>) are two points lying on the i<sup>th</sup> infinite line.</p>

### 출력

<p>Display a single real value which is the perimeter of the largest triangle that can be formed from three of the infinite lines. Your output will be considered correct if it is within an absolute or relative error of 10<sup>&minus;5</sup> of the correct answer.</p>

<p>If no triangle can be formed using the given lines, then you should instead display the message &quot;no triangle&quot;.</p>
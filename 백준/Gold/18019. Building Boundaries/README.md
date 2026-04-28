# [Gold IV] Building Boundaries - 18019

[문제 링크](https://www.acmicpc.net/problem/18019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 175, 정답: 81, 맞힌 사람: 65, 정답 비율: 42.763%

### 분류

브루트포스 알고리즘, 구현, 수학

### 문제 설명

<p>Maarja wants to buy a rectangular piece of land and then construct three buildings on that land.</p>

<p>The boundaries of the buildings on the ground must have rectangular sizes a<sub>1</sub> &times; b<sub>1</sub>, a<sub>2</sub> &times; b<sub>2</sub>, and a<sub>3</sub> &times; b<sub>3</sub>. They can touch each other but they may not overlap. They can also be rotated as long as their sides are horizontal and vertical.</p>

<p>What is the minimum area of land Maarja has to buy?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1be3e66f-9738-4aef-97a7-342a7c44eaff/-/preview/" style="width: 372px; height: 113px;" /></p>

<p style="text-align: center;">Figure B.1: Illustration of the two test scenarios in Sample Input 1 and their solutions. In the second scenario the 5 &times; 1 building has been rotated by 90 degrees.</p>

### 입력

<p>The input consists of multiple test scenarios. The first line of input contains a single integer t (1 &le; t &le; 1000), the number of scenarios. Then follow the t scenarios. Each scenario consists of a single line, containing six integers a<sub>1</sub>, b<sub>1</sub>, a<sub>2</sub>, b<sub>2</sub>, a<sub>3</sub> and b<sub>3</sub> (1 &le; a<sub>1</sub>, b<sub>1</sub>, a<sub>2</sub>, b<sub>2</sub>, a<sub>3</sub>, b<sub>3</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>For each test scenario, output the minimum area of land such that Maarja can construct the three buildings.</p>
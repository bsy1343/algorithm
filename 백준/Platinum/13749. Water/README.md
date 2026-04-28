# [Platinum III] Water - 13749

[문제 링크](https://www.acmicpc.net/problem/13749)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 29, 맞힌 사람: 24, 정답 비율: 53.333%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>A water company is trying to provide water from its pumping station to a mansion. The company owns n water stations, numbered 1..n, which are connected by a variety of pipes. Water can flow through both directions of a pipe, but the total amount of water that can flow through the pipe is bounded by the capacity of the pipe.</p>

<p>The water company is constantly improving the pipes, increasing the capacity of various pipes. The water company is conducting k improvements (each of which is permanent after it is executed). An improvement consists of taking a pipe between two locations and increasing its capacity by a fixed amount, or installing a pipe between two locations which are not directly connected by a pipe.</p>

<p>After each improvement, the water company wants to know the maximum amount of water the mansion could receive.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple&nbsp;times on different inputs. The first line of input contains three integers, n (2 &le; n &le; 100), p&nbsp;(0 &le; p &le;&nbsp;n(n-1)/2), and k (1 &le; k &le; 10,000), where n is the number of stations, p is the number of&nbsp;initial pipes, and k is the number of improvements. The first station in the list is always&nbsp;the pumping station, and the second is always the mansion.</p>

<p>The next p lines will describe the pipes in the initial setup. The lines will each contain&nbsp;three integers, a, b (1 &nbsp;&le; a &lt; b &le; n) and c (1 &le; c &le; 1,000), which indicates that stations a and b&nbsp;are connected by a pipe with capacity c. No (a,b) pair will appear more than once in this&nbsp;section.</p>

<p>The next k lines will describe the improvements. The lines will each contain three&nbsp;integers, a, b (1 &le; a &lt; b &le; n) and c (1 &le; c &le; 1,000), which indicates that the pipe connecting&nbsp;stations a and b has its capacity increased by c (if there is currently no pipe between a&nbsp;and b, then one is created with capacity c). Note that it is possible for an (a,b) pair to be&nbsp;repeated in this section.</p>

### 출력

<p>Output k+1 integers, each on its own line, describing the maximum amount of water that can reach the mansion. The first number is the amount of water reaching the mansion in the initial configuration. The next k numbers are the amounts of water reaching the mansion after each improvement.</p>
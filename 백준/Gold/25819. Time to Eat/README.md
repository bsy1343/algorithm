# [Gold III] Time to Eat - 25819

[문제 링크](https://www.acmicpc.net/problem/25819)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 22, 맞힌 사람: 18, 정답 비율: 58.065%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>The UCF Programming Team has made it to the World Contest Finals (WF), thanks to the great team members and coaches. Fortunately for Dr. Orooji (Team Faculty Advisor), WF is in a city with streets running only horizontally and vertically (this means the chance of Dr. O getting lost is less). The city can be described as a two-dimensional grid with R rows and C columns. The team hotel is at the upper-left corner (cell with indices 1, 1). The contest will be at the bottomright corner (cell with indices R, C).</p>

<p>The UCF group will start at the hotel and needs to be at the contest site. From a cell, the group can walk into one of the four neighboring cells (north, south, east, west). Note that the cells on the boundary do not have four neighbors. The group would like to make it to the contest with the fewest number of steps &ndash; moving from a cell to a neighboring cell is considered taking a step.</p>

<p>One complication with the trip from the hotel to the contest site is that the UCF group gets hungry and needs to eat after they&rsquo;ve taken certain number of steps. For example, if they have to eat after taking 10 steps, then their 10th step (or an earlier step) must walk them into a cell with food (sub shop).</p>

<p>The need to eat means the group may not be able to take the shortest path from the hotel to the contest site because the sub shops may not be on that path. Fortunately, there are enough sub shops at different spots (cells) such that the group can eat when needed and make it to the contest site, though they may take a few extra steps than the straight path from the hotel to the contest site.</p>

<p>Given the description of the city, determine the minimum number of steps needed for the UCF group to go from their hotel to the contest site, taking into account that they need to eat after taking certain number of steps (or before taking that many steps if a sub shop is not exactly at that position on the path).</p>

### 입력

<p>The first input line contains four integers: R (1 &le; R &le; 50), indicating the number of rows in the grid, C (1 &le; C &le; 50), indicating the number of columns in the grid, F (1 &le; F &le; 100), indicating the number of steps the group can take and then need to eat, and S (1 &le; S &le; 100), indicating the number of sub shops in the grid.</p>

<p>Each of the next S input lines contains two integers (1 &le; r &le; R, 1 &le; c &le; C) providing the row and column number for a sub shop. Assume that all sub shops are at different locations and they are not at the hotel or contest site.</p>

### 출력

<p>Print the minimum number of steps needed for the UCF group to go from their hotel to the contest site.</p>

### 힌트

<p>Explanation of the first Sample Input/Output: The group must take the path that goes through the sub shops at locations (2,5), (5,4) and (8,3), since they need to eat every 5th step (or before 5th step).</p>
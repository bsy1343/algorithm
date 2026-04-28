# [Gold IV] Campaign Stops - 5196

[문제 링크](https://www.acmicpc.net/problem/5196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 백트래킹

### 문제 설명

<p>One of the important parts of running an election year campaign is to go lots of places, give your carefully crafted stump speech, and convince a lot of potential voters to vote for you. Unfortunately, there are only so many hours in the day, so you cannot go everywhere. So you need to plan your campaign trips carefully, trading off between travel time, time spent at the stops, and the number of voters you are going to sway. Better have a computer do the planning for you.</p>

<p>We assume that for each potential campaign stop, you are given the number of voters you expect to sway by appearing there, and the number of hours you would have to spend at the location. In addition, for each pair of stops, you are given the travel time from one to the other. If you also know the number of hours you have available, you can now optimize to sway as many voters as possible.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains two number n and H. Here, 1 &le; n &le; 10 is the number of candidate campaign stops, and 1.0 &le; H &le; 24.0 is the number of hours you have available (this may be a fractional number).</p>

<p>This is followed first by n lines, each describing a campaign stop, by giving two numbers, an integer vi &ge; 0, and a fractional number hi &ge; 0. vi is the number of voters you could sway at that stop, and hi the number of hours you&rsquo;d have to spend there.</p>

<p>Finally, this is followed by n more lines, each containing n numbers, where the jth number of line i is a fractional number, the number of hours it takes to travel from city i to city j. (Thus, the i th number of line i is 0, but it is not necessarily the case that the travel time from city i to city j is the same as from city j to city i.)</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum number of voters that can be swayed during the available time H. Assume that the candidate&rsquo;s tour always starts at city 1, and has to return there, although he may not have to campaign there.</p>
# [Gold III] The Neptune Adventure - 4513

[문제 링크](https://www.acmicpc.net/problem/4513)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>You are aboard the luxury liner Neptune, which is flooding fast. See if you can make it off the ship before drowning!</p>

<p>The schematics of the ship can be described by a series of locations (e.g., cabins, lounges, and various other rooms) and paths (e.g., hallways, elevators, Christmas trees, and stairs) between the locations (as well as the time it takes to travel along these paths). You must determine the shortest amount of time it takes to get from your starting location to the rescue team. Unfortunately, there are a series of explosions occurring on the ship that cause certain locations <strong>and</strong> the paths to and from those locations to flood, and if you are in these locations or paths when the explosions occur, you will drown. Also, you cannot travel through a location once it is flooded. Note that if you reach a non-flooded location at the same exact time as the path you were previously on is flooded, or if you reach the rescue team at the same exact time its location is flooded, you would not drown at that time (i.e. you &quot;win&quot; ties).</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer <em>N</em> (1 &le; <em>N</em> &le; 100) indicating the number of data sets. Each data set will consist of a series of lines:</p>

<ol>
	<li>The first line will contain integers &quot;<em>L</em> <em>S</em> <em>R</em>&quot;, with <em>L</em> (1 &le; <em>L</em> &le; 100) specifying the number of locations in this data set, <em>S</em> (1 &le; <em>S</em> &le; <em>L</em>) specifying your starting location, and <em>R</em> (1 &le; <em>R</em> &le; <em>L</em>) specifying the location of the rescue team.</li>
	<li>The next <em>L</em> lines will contain information for each of the locations in ascending order, starting with the first line containing information for location 1. These lines will contain integers in the format &quot;<em>F T<sub><small>1</small></sub></em> <em>T<sub><small>2</small></sub></em> ... <em>T<sub><small>X</small></sub></em> ... <em>T<sub><small>L</small></sub></em>&quot; where <em>F</em> (0 &le; <em>F</em> &le; 10000) corresponds to the time (expressed in minutes passed, starting at time 0) at which this location will flood.&nbsp; When a location floods, all paths to and from it flood as well. <em>T<sub><small>X</small></sub></em> (0 &le; <em>T<sub><small>X</small></sub></em> &le; 10000) indicates the amount of time (also in minutes) it takes to travel from this location to location <em>X</em>. Note that the time it takes to travel from this location to location <em>X</em> may not be equivalent to the time it takes to travel from location <em>X</em> to this location. In fact, some paths are unidirectional. A value of 0 for <em>F</em> indicates that this location will not flood and a value of 0 for <em>T<sub><small>X</small></sub></em> indicates that a path from this location to location <em>X</em> (but not necessarily vice versa) does not exist. Note that there will also be 0 values for when <em>X</em> is equal to <em>L</em>.</li>
</ol>

### 출력

<p>For each data set in the input, print a single line with the shortest amount of time in minutes it takes to reach the location of the rescue team from your starting location without drowning (if possible). If it is not possible to reach the location of the rescue team, output &quot;<code>GENE HACKMAN</code>&quot;.</p>
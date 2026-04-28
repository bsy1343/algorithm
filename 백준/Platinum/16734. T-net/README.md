# [Platinum III] T-net - 16734

[문제 링크](https://www.acmicpc.net/problem/16734)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 12, 맞힌 사람: 11, 정답 비율: 19.298%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬

### 문제 설명

<p>T-net which is a new telecommunications company, plans to install its base stations in the city. The places where base stations must be installed have been already specified. T-net has two types of antennas to be used in the base stations: (i) antennas with transmission radius a, and (ii) antennas with transmission radius b. Two antennas can communicate with each other if and only if both are inside the coverage area of each other. Antenna with smaller transmission radius of course is cheaper. T-net plans to minimize its cost while keeping the whole network connected. Precisely, T-net plans to minimize its cost which is the sum of the transmission radii of all antennas. Interestingly, all base-station places are on a line. Help T-net construct a connected network with the minimum cost.</p>

### 입력

<p>The first line of the input contains three positive integers n, a and b (1 &le; n &le; 10<sup>5</sup> and 1 &le; a, b &le; 10<sup>5</sup>) where n is the number of base stations, and a and b are radii as defined in the problem statement. The second line contains n distinct coordinates of base stations on the line with respect to an origin on the line. All coordinates are positive integers not more than 10<sup>5</sup>.</p>

### 출력

<p>If it is possible to construct a connected network, print the minimum cost in the output. Otherwise, print -1.</p>
# [Gold III] Beer Marathon - 17812

[문제 링크](https://www.acmicpc.net/problem/17812)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 10, 맞힌 사람: 10, 정답 비율: 33.333%

### 분류

삼분 탐색

### 문제 설명

<p>In the booths version of the popular annual Beer Marathon, many beer booths (also called beer stalls or beer stands) are installed along the track. A prescribed number of visits to different beer booths is a part of the race for all contestants. The distances between any two consecutive beer booths should be exactly the same and equal to the particular value specified in the race rules.</p>

<p>The company responsible for beer booths installation did the sloppy work (despite being excessively paid), left the beer booths on more or less random positions along the track and departed from the town. Fortunately, thanks to advanced AI technology, the company was able to report the exact positions of the beer booths along the track, measured in meters, with respect to the particular anchor point on the track. The marathon committee is going to send out the volunteers to move the beer booths to new positions, consistent with the race rules.</p>

<p>They want to minimize the total number of meters by which all beer booths will be moved. The start line and the finishing line of the race will be chosen later, according to the resulting positions of the beer booths.</p>

### 입력

<p>The first line of input contains two integers N and K (1 &le; N, K &le; 10<sup>6</sup>), where N is the number of beer booths and K is the prescribed distance between the consecutive beer booths. The second line of input contains N pairwise different integers x<sub>1</sub>, . . . , x<sub>N</sub> (&minus;10<sup>6</sup> &le; x<sub>i</sub> &le; 10<sup>6</sup>), the original positions, in meters, of the beer booths relative to the anchor point. The positive values refer to the positions past the anchor point and the negative values refer to the positions before the anchor point.</p>

### 출력

<p>Output a single integer &mdash; the minimal total number of meters by which the beer booths should be moved to satisfy the race rules.</p>
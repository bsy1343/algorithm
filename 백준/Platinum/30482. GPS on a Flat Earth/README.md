# [Platinum III] GPS on a Flat Earth - 30482

[문제 링크](https://www.acmicpc.net/problem/30482)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 87, 정답: 25, 맞힌 사람: 24, 정답 비율: 58.537%

### 분류

기하학, 구현, 선분 교차 판정

### 문제 설명

<p>On the day when aliens finally attacked humanity, nobody could have anticipated their weapon of choice. No nuclear weapons, meteors, lasers, or giant monsters. Instead, our planet was subjugated with the power of physics!</p>

<p>Specifically, the aliens transformed Earth into a two-dimensional, flat surface, forever neutering our space-faring capabilities. Although frustrated, humanity survived, and we resumed our lives as best as we could. This new two-dimensional existence requires many adjustments, including the use of GPS (Global Positioning System).</p>

<p>GPS normally works by using radio waves to measure the Euclidean distances from the user to several reference points (satellites), and using these distances to calculate the user&rsquo;s coordinates. However, the now flat Earth has two quirks we need to adapt to:</p>

<ul>
	<li>Without satellites in orbit, we need to use radio towers instead. Each radio tower now has coverage over the entire planet due to the flat surface.</li>
	<li>Radio waves, which propagate differently in a two-dimensional world, require a shift from Euclidean to Manhattan distance for accurate calculations. Given any two points (X<sub>1</sub>, Y<sub>1</sub>) and (X<sub>2</sub>, Y<sub>2</sub>), the Manhattan distance between them is defined as |X<sub>1</sub> &minus; X<sub>2</sub>| + |Y<sub>1</sub> &minus; Y<sub>2</sub>|.</li>
</ul>

<p>Your task is to write software for these adapted GPS calculations. Given a list of locations of N reference radio towers and their respective Manhattan distances to the GPS user, your algorithm must provide a list of possible locations of the user. These potential user locations are limited to those that are exactly at the measured Manhattan distance from each reference radio tower. The GPS is still in the initial test phase, so the user&rsquo;s true location is limited to integer coordinates.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 10<sup>5</sup>) indicating the number of reference radio towers.</p>

<p>Each of the next N lines describes a tower with three integers X, Y (&minus;10<sup>4</sup> &le; X, Y &le; 10<sup>4</sup>), and D (0 &le; D &le; 4 &times; 10<sup>4</sup>), representing that a tower with coordinates (X, Y) is at Manhattan distance D from the GPS user. No two towers have the same location. It is guaranteed that the input data is reliable, pinpointing a non-empty finite set of possible locations for a user with integer coordinates.</p>

### 출력

<p>Output several lines. Each line must contain a different pair of integers X<sub>u</sub> and Y<sub>u</sub> indicating that (X<sub>u</sub>, Y<sub>u</sub>) is a user location compatible with the input data. The lines must be sorted by non-decreasing X<sub>u</sub> value, breaking ties by increasing Y<sub>u</sub> value.</p>
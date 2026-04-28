# [Silver I] Global Roaming - 6564

[문제 링크](https://www.acmicpc.net/problem/6564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 106, 정답: 12, 맞힌 사람: 11, 정답 비율: 16.176%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>A great deal in today&#39;s mobile communication depends on having a direct view to a satellite. For communication providers it is therefore crucial to know where their services are available.</p>

<p>You are to identify locations which have a direct view to a particular satellite, i.e. this satellite must be above the horizon. To make things easier you may assume that the earth is a perfect sphere with a radius of 6378 km (mountains will be added next year...). The satellite is a pointlike object above the earth&#39;s surface.</p>

### 입력

<p>The input file consists of several test cases. For each test case the first line contains the number of locations <em>n</em> to be checked followed by the position of the satellite: its latitude, its longitude (both in degrees) and its height (in km) above the earth&#39;s surface.</p>

<p>Each of the following <em>n</em> lines contains a location on the earth&#39;s surface: the location&#39;s label (a sequence of less than 60 printable ASCII characters containing no whitespace characters) followed by its latitude and longitude (both in degrees).</p>

<p>Input is terminated by <em>n=0</em>.</p>

### 출력

<p>For each test case output the number of the test case as formatted in the sample output. Then, output the locations from where the satellite is visible by printing the corresponding labels on separate lines in the same order as they appear in the input file.</p>

<p>Output a blank line after each test case.</p>
# [Platinum III] Ice Cream - 17988

[문제 링크](https://www.acmicpc.net/problem/17988)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

그래프 이론, 이분 탐색, 매개 변수 탐색, 최대 유량

### 문제 설명

<p>The Better Get Obese (BGO) ice cream factory is gearing up for the holiday season, and after several years with mediocre sales, they have decided to focus only on their most popular product, ice cream with flavour of chocolate and vanilla.</p>

<p>In order to make a perfect such ice cream, it is important that the mixing machine receives equal amounts of vanilla and chocolate ice cream.</p>

<p>There are two separate creaming machines in the factory which produce respectively chocolate and vanilla ice cream, and the resulting creamy goodness is stored in two separate tanks. From there, it can be transported to the mixing machine through pipes, however the dimension of a pipe gives an upper bound for how much ice cream can pass through it each minute. These pipes meet in welding points, where streams of ice cream go from one pipe to another. Streams can also merge or split into other streams at such points, if more than two pipes meet here. It is not important to keep the flavors separate during the transportation, since they will eventually be mixed anyways.</p>

<p>Given a map of the pipe system, can you decide how many liters of ice cream the factory can produce each minute?</p>

### 입력

<p>The first line of input contains two integers n (3 &le; n &le; 200) and m (2 &le; m &le; 1 000), respectively the number of welding points, and the number of pipes. The second line contains three distinct integers f, c and v (1 &le; f, c, v &le; n), the welding points where respectively the mixing machine, the chocolate tank and the vanilla tank is connected to the pipe system.</p>

<p>Finally follows m lines, the i<sup>th</sup> of which contains three non-negative integers u<sub>i</sub>, v<sub>i</sub> and x<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n, 1 &le; x<sub>i</sub> &le; 1 000). These indicate that there is a pipe between welding points u<sub>i</sub> and v<sub>i</sub> with a capacity for transporting x<sub>i</sub> liters of ice cream per minute. Note that several pipes can go in parallel between the same welding points.</p>

### 출력

<p>A single integer, the maximum amount of ice cream the BGO factory can produce each minute (in liters).</p>
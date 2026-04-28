# [Gold I] Amateur Radio Network - 16095

[문제 링크](https://www.acmicpc.net/problem/16095)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 6, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

그래프 이론, 이분 탐색, 매개 변수 탐색, 이분 그래프

### 문제 설명

<p>The Society for Wireless Emission and Reception Channels (SWERC) is a small community of residents of Hertzville. They love to organize small-talk gatherings on the radio-waves. The SWERC has one official radio frequency which is used by all their members, and all members have very powerful transmitters that can reach all other transmitters of the society so that they can all happily chat together. Whenever they are chatting, each transmitter automatically sets its emission power depending on the distance to the other transmitters used by SWERC members. Specifically, the power of each member&rsquo;s transmitter is proportional to the distance to the furthest transmitter.</p>

<p>Unfortunately for them, the new mayor of Hertzville is not fond of telecommunications. To be precise, the mayor claims that the SWERC&rsquo;s radio communications are a public health hazard, because the transmitters are too powerful. What the mayor is concerned about is the highest power setting of a SWERC transmitter.</p>

<p>In an attempt to negotiate, the SWERC is willing to split up into two groups, each of which would use a separate radio frequency. This would reduce the maximal transmission power, because each group&rsquo;s transmitter would only communicate with the other transmitters of that group. Specifically, the SWERC would decide how to allocate each member to one of the two groups. Within group 1, the transmitters would work as before: each transmitter would set its emission power according to the distance to the furthest transmitter in group 1, ensuring that all members of group 1 can still communicate as before. The same is true for group 2. As the SWERC is a very inclusive society, it would never consider isolating any single member. Hence, each group should contain at least two people, so that no member is left alone in a group on their own.</p>

<p>The SWERC will soon be meeting the mayor, and must come up with a concrete proposal. They need to know the smallest distance d such that the SWERC can be split into two groups, each group containing at least two people, such that, for each SWERC member, the maximal distance between that member and a member of their group is at most d. Can you help them?</p>

### 입력

<p>The input consists of several test cases. The first line consists of an integer indicating the number of test cases. Each test case follows. The first line of a test case consists of a single integer 4 &le; N &le; 700 indicating the number of members of the SWERC. This is followed by N lines describing each member: each line consists of two integers &minus;10<sup>3</sup> &le; X<sub>i</sub> &le; 10<sup>3</sup> and &minus;10<sup>3</sup> &le; Y<sub>i</sub> &le; 10<sup>3</sup> separated by a single space, indicating the x- and y-coordinates of the station of the i-th SWERC member. You may assume that two stations are always in different locations, namely, for all 1 &le; i &lt; j &le; N, we have (X<sub>i</sub>, Y<sub>i</sub>) &ne; (X<sub>j</sub>, Y<sub>j</sub>).</p>

### 출력

<p>For each test case in the input, your program should produce one line containing a floating point number d with exactly two digits at the right of the decimal point. The value of d should be the smallest possible value (rounded up) which ensures that there is a way to partition the SWERC members into two groups, each group containing at least two people, such that the Euclidean distance between any two members of the same group is less than or equal to d. There should be no blank lines in your output.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16095.%E2%80%85Amateur%E2%80%85Radio%E2%80%85Network/1a2e7fbc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16095.%E2%80%85Amateur%E2%80%85Radio%E2%80%85Network/1a2e7fbc.png" data-original-src="https://upload.acmicpc.net/8317fdee-56bc-4848-9f43-e9935456b487/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 184px; height: 93px;" /></p>

<p style="text-align: center;">Figure 1: Illustration of the solution of the Sample Input</p>
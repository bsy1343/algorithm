# [Gold I] 100 meter dash - 24244

[문제 링크](https://www.acmicpc.net/problem/24244)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

이분 탐색, 슬라이딩 윈도우

### 문제 설명

<p>As CS student we sit around all day looking at screens. This is bad for us in many different ways; back pain, need of glasses, and lack of social life. According to the government regular exercise can help with some of these problems. Although you strongly believe this might not be the case, you have decided to start running, and tracking your runs with Ztrawa GPS-tracking mobile app.</p>

<p>Ztrawa stores your position coordinates $(x, y)$ at some random intervals. When you are done with your run you can look at many different cool stats like your elevation gain, your fastest $100$m, and your average speed from point $A$ to $B$.</p>

<p>Since all CS students are looking to Min-Max everything you are only interested in your best $100$m over your run. Sadly your Ztrawa app has a bug and the Min-Max feature has stop working, so you need to work it out yourself.</p>

<p>As Ztrawa only collect some finite amount of data points, we will assume constant speed between two consecutive data points. For example, say you were running around a $400$m track and recorded $6$ data points going all around the track and back where you started. This is sample case $1$, where we started running from the bottom left, and went around counter-clockwise.</p>

<p>You need to create your own program so you can find what your fastest $100$m was measured in seconds.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24244.%E2%80%85100%E2%80%85meter%E2%80%85dash/2dd13259.png" data-original-src="https://upload.acmicpc.net/166e8a41-9188-465f-84e1-aee82d901085/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 383px; height: 225px;" /></p>

<p style="text-align: center;">Illustration of sample case $1$.</p>

### 입력

<p>The first line contains an integer $1 \leq n \leq 10^5$ indicating the number of readings from Ztrawa. Then follows $n$ lines containing the information of each reading. The $i^{\text{th}}$ such lines contains three real numbers $x_i$, $y_i$ and $t_i$, indicating that at the time of reading $i$, you were at meter coordinates $(x_i, y_i)$ relative to where you started, and $t_i$ seconds has passed since the beginning of the session. It holds that $-10^5 \leq x_i, y_i \leq 10^5$ for every $i$, and $0 &lt; t_1 &lt; t_2 &lt; \ldots &lt; t_n \leq 10^7$. All real numbers are given with at most $6$ decimal places.</p>

<p>You always start running from $(0, 0)$ at time $0$.</p>

### 출력

<p>Output a single real number, how fast you ran the fastest 100m measured in seconds. Anything with an absolute or relative error of $10^{-4}$ will be accepted.</p>
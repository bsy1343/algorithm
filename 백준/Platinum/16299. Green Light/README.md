# [Platinum V] Green Light - 16299

[문제 링크](https://www.acmicpc.net/problem/16299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 13, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

수학, 누적 합, 확률론, 값 / 좌표 압축

### 문제 설명

<p>Sarah is cycling to work. On her way there, she encounters the same traffic light every day. Before she reaches the lights, she alternates between using social media on her mobile device and glancing at the traffic lights, observing if they are green, yellow or red at that time. From experience, she knows that the lights have a fixed greenyellow-red cycle, and how long each stage lasts. So if the light goes from red to green at time T, she knows it will stay green until (but not including) T +T<sub>g</sub>, then go yellow until (but not including) T + T<sub>g</sub>&nbsp;+ T<sub>y</sub> and finally stay red until (but not including) T + T<sub>g</sub> + T<sub>y</sub> + T<sub>r</sub>, at which point it will turn green again. However, she does not know T, the time at which the traffic light cycle starts. Based on her observations, she can deduce what values of T are (im)possible. Assuming that each possible value of T that is consistent with her observations is equally likely, can you compute the probability that the lights will be green at a certain time?</p>

### 입력

<ul>
	<li>The first line contains three positive integers T<sub>g</sub> T<sub>y</sub> T<sub>r</sub>, corresponding to the duration (in seconds) for which the lights stay green, yellow, and red (0 &lt; T<sub>g</sub>, T<sub>y</sub>, T<sub>r</sub> &le; 10<sup>8</sup>).</li>
	<li>The second line contains a single positive integer n, the number of times Sarah looked at the lights (3 &le; n &lt; 1000).</li>
	<li>Each of the next n lines contains one integer 0 &le; t &le; 10<sup>9</sup> followed by a color c: the time (in seconds) of the observation and color of the lights at that moment. Sarah did see the lights being each color (green, yellow and red) at least once.</li>
	<li>The last line contains an integer 0 &le; t<sub>q</sub> &le; 10<sup>9</sup> and a color c<sub>q</sub>. These specify the question asked: What is the probability of the lights being of color c<sub>q</sub> at time t<sub>q</sub>?</li>
</ul>

### 출력

<ul>
	<li>0 &le; p &le; 1, the probability of the lights being color c<sub>q</sub> at time t<sub>q</sub>. Your answer will be considered correct when it differs from the actual answer by at most 10<sup>&minus;3</sup> either absolutely or relatively.</li>
</ul>
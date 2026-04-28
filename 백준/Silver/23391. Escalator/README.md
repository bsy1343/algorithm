# [Silver IV] Escalator - 23391

[문제 링크](https://www.acmicpc.net/problem/23391)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 42, 맞힌 사람: 28, 정답 비율: 41.176%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You have just invented a new type of escalator: the double escalator. Regular escalators take people from one endpoint to another but not in the other direction, while the double escalator can take people from any one of its endpoints to the other one.</p>

<p>It takes 10 seconds for the double escalator to take a person from any of its endpoints to the other one. That is, if a person enters the double escalator from one of the endpoints at moment T, then they will leave at the other endpoint at moment T + 10 &ndash; this person won&rsquo;t be using the double escalator anymore at moment T + 10.</p>

<p>Any time that no one is using the double escalator, it will stop immediately. Thus, it is initially stopped.</p>

<p>When the double escalator is stopped and a person enters it from one of its endpoints, it will turn on automatically and move in the direction that this person wants to go.</p>

<p>If a person arrives at the double escalator and it is already moving in the direction that they want to go, they will enter it immediately. Otherwise, if it&rsquo;s moving in the opposite direction that they want to go, they will wait until it stops, and only then will they enter it. The escalator is so large that it can accommodate many people entering it at the same time.</p>

<p>The double escalator has a very weird effect, probably related to some quantum physics effect (or just chance): no person will ever arrive on the double escalator at the exact moment the escalator stops.</p>

<p>Now that you know how the double escalator works, you will be given the task of simulating it. Given the information about N people, including their time of arrival at the escalator and which direction they want to go, you have to figure out the last moment that the escalator stops.</p>

### 입력

<p>The first line contains one integer N (1 &le; N &le; 10<sup>4</sup>), representing the number of people that will use the double escalator.</p>

<p>Each of the next N lines contains two integers t<sub>i</sub> and d<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10<sup>5</sup>, 0 &le; d<sub>i</sub> &le; 1), representing the time that the i-th person will arrive at the escalator and which direction they want to go. If d<sub>i</sub> is equal to 0, they want to go from the left to the right endpoint, and if d<sub>i</sub> is equal to 1, they want to go from the right to the left endpoint. All values of t<sub>i</sub> are distinct and will be given in ascending order.</p>

### 출력

<p>Output one line containing the time that the last person will leave the double escalator.</p>
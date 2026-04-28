# [Gold II] Messi An-Gimossi - 17355

[문제 링크](https://www.acmicpc.net/problem/17355)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 740, 정답: 211, 맞힌 사람: 146, 정답 비율: 31.330%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p><a href="https://www.acmicpc.net/user/messi">메시</a>는 축구 선수이다. 메시는 기분이 안 좋다.</p>

<p>messi: <em>Messi An-Gimossi</em></p>

<p>메시의 기분은 예측 가능하다. N일의 기분 예보가 있다.&nbsp;<strong>기분이 나쁠 확률</strong>이&nbsp;각 날마다 기약분수&nbsp;A/B 꼴로 주어진다.</p>

<p>기분이 나쁜 것이&nbsp;독립적인 사건이라 할 때, 메시의&nbsp;기분이 <strong>매일 좋을 확률(N일 내내 좋을 확률)</strong>을 기약분수로 구해 보자.</p>

### 입력

<p>첫째 줄에 예보의 수 N이 주어진다.&nbsp;(1 &le; N &le; 10<sup>5</sup>)</p>

<p>둘째 줄부터 N개의 줄에 걸쳐,&nbsp;A<sub>i</sub>와 B<sub>i</sub>가 주어진다. 이는 i번째 날에 기분이 나쁠 확률이&nbsp;A<sub>i</sub>/B<sub>i</sub>라는 뜻이다.&nbsp;(1 &le; A<sub>i</sub>&nbsp;&lt;&nbsp;B<sub>i</sub>&nbsp;&le; 10<sup>7</sup>, A<sub>i</sub>와 B<sub>i</sub>는 서로소인 정수)</p>

### 출력

<p>메시의<strong>&nbsp;</strong>기분이 <strong>N일 내내&nbsp;좋을 확률</strong>이 기약분수 A/B와 같다고 할 때, A를 10<sup>9</sup>+7로 나눈 나머지와 B를 10<sup>9</sup>+7로 나눈 나머지를 공백을 사이에 두고&nbsp;차례대로 출력한다.</p>
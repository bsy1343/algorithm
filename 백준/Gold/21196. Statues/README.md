# [Gold II] Statues - 21196

[문제 링크](https://www.acmicpc.net/problem/21196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 29, 맞힌 사람: 24, 정답 비율: 46.154%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>To escape the loneliness of working remotely everyday, Erika decided to try on a new hobby: sculpture. She already has a large collection of statues and the municipality has allowed her to show her art outside.</p>

<p>Erika wants her statues to be well visible and thus each statue needs to be placed under a distinct street light. Further, the arrangement should be aesthetic which means that the statues should be placed by increasing size with the smallest statues near the beginning of the street and the biggest ones near the end.</p>

<p>Erika placed her statues but she forgot to place them in increasing size and now she has to reposition them in accordance to both of her desires.</p>

<p>The street has N evenly spaced street lights numbered from 1 at the beginning of the street to N at the end of the street. You estimate the time required to move a statue of size s from the street light i to the light j as taking Erika s &times; |i &minus; j| units of time. You ask yourself, how much time does it take to reposition all statues knowing that she will use the fastest way possible? Note that she may put statues under street lights that do not have statues at the moment.</p>

### 입력

<p>The first line of the input contains two space-separated integers: N the number of street lights and K the number of statues. The K following lines each contains two space-separated integers, the i + 1-th line containing the integers P<sub>i</sub> and S<sub>i</sub> describing the i-th statue. P<sub>i</sub> gives the number of the street light under which the statue is and S<sub>i</sub> gives its size.</p>

### 출력

<p>The output should contain a single line containing a single integer: the minimum amount of time needed to move statues such that each statue is under a different street light and such that the size of statues grows with the street light numbers under which they are.</p>

### 제한

<ul>
	<li>1 &le; K &le; N &le; 5 000</li>
	<li>for all 1 &le; i &le; K, 1 &le; S<sub>i</sub> &le; 1 000 000, 1 &le; P<sub>i</sub> &le; N</li>
</ul>
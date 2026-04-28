# [Gold V] 이진수 게임 - 18112

[문제 링크](https://www.acmicpc.net/problem/18112)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 1806, 정답: 541, 맞힌 사람: 410, 정답 비율: 29.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>이진수 게임은 주어진 &lsquo;시작&nbsp;이진수&rsquo;를 몇 가지 동작으로 &lsquo;목표 이진수&rsquo;로 바꾸는 게임이다.</p>

<p>이 게임에서 가능한 동작들은&nbsp;다음과 같다.</p>

<ol>
	<li>한 자리 숫자를 보수로 바꾸기. 단, 맨 앞&nbsp;숫자(Most Significant Digit)는&nbsp;바꿀 수 없다.<br />
	101<sub>2</sub> &rarr; 111<sub>2</sub></li>
	<li>현재 수에 1 더하기.<br />
	11<sub>2</sub> &rarr; 100<sub>2</sub></li>
	<li>현재 수에서&nbsp;1 빼기. 단, 현재 수가 0이라면&nbsp;빼기가 불가능하다.<br />
	110<sub>2</sub> &rarr; 101<sub>2</sub></li>
</ol>

<p>&lsquo;시작&nbsp;이진수&rsquo;와 &lsquo;목표 이진수&rsquo;가 주어질 때, &lsquo;시작&nbsp;이진수&rsquo;를 &lsquo;목표 이진수&rsquo;로 만들기 위한 최소 동작 횟수를 출력하라.&nbsp;주어지는 이진수들의 맨 앞 숫자는 항상 1이다.</p>

### 입력

<p>첫 번째 줄에 길이 <em>L</em>의 &lsquo;시작&nbsp;이진수&rsquo;가&nbsp;주어진다. 두 번째 줄에 길이 <em>K</em>의 &lsquo;목표 이진수&rsquo;가 주어진다. (1 &le;&nbsp;<em>L</em>, <em>K&nbsp;&le;&nbsp;</em>10)</p>

### 출력

<p>&lsquo;시작&nbsp;이진수&rsquo;를 &lsquo;목표 이진수&rsquo;로 만들기 위한 최소 동작 횟수를 출력한다.</p>
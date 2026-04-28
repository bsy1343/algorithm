# [Platinum V] 계획왕 - 20439

[문제 링크](https://www.acmicpc.net/problem/20439)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 397, 정답: 103, 맞힌 사람: 76, 정답 비율: 32.068%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>매일 다이어리에 세워 둔 계획을 지키며 바른 생활을 실천하는 바름이가 내일의&nbsp;일정을&nbsp;계획하고&nbsp;있다.</p>

<p>바름이는&nbsp;스터디,&nbsp;실시간&nbsp;강의, 동아리&nbsp;등&nbsp;할&nbsp;일이&nbsp;많아서, 일부&nbsp;시간은&nbsp;이미&nbsp;해당&nbsp;일들을&nbsp;하는&nbsp;데&nbsp;고정적으로&nbsp;쓰인다.</p>

<p>그런데 바름이에게는 위의 일 말고도 과제, 연애 등 해야 할 일이 많다! 우리가 해야 할 일은 바름이가 세운 계획이 실현 가능한지 알려주는 것이다.</p>

<p>바름이는 강단 있고 추진력이 뛰어나서,</p>

<ul>
	<li>한 가지 일을 시작하면 반드시 끝을 봐야 한다.</li>
	<li>일이 종료됨과 동시에 새 일을 시작할 수 있다.</li>
</ul>

### 입력

<p>첫째&nbsp;줄에는&nbsp;이미&nbsp;고정된&nbsp;일정의&nbsp;개수&nbsp;<em>N</em>(1 &le; <em>N</em> &le; 11), 바름이가&nbsp;내일 추가적으로 해야 할&nbsp;일의&nbsp;개수&nbsp;<em>K</em>(1 &le; <em>K</em> &le; 12)가&nbsp;주어진다.</p>

<p>둘째&nbsp;줄부터&nbsp;<em>N</em>개의&nbsp;줄에는&nbsp;각&nbsp;줄마다&nbsp;고정된&nbsp;일정의&nbsp;시작&nbsp;시각 <em>s</em>(0 &le; <em>s&nbsp;</em>&nbsp;&lt;&nbsp;1440)와&nbsp;종료&nbsp;시각 <em>e</em>(<em>s</em>&nbsp;&lt;&nbsp;<em>e</em> &le; 1440)가&nbsp;주어진다.</p>

<p>하루의 시작 시각은 0, 종료 시각은 1440이며,&nbsp;각 일정은 겹치지 않고&nbsp;시간 순으로 주어진다.</p>

<p>마지막 줄에는 바름이가&nbsp;계획한&nbsp;일&nbsp;<em>K</em>개를&nbsp;하는&nbsp;데&nbsp;걸리는&nbsp;시간 T<sub>1</sub>, T<sub>2</sub>, ..., T<sub>K</sub>가&nbsp;공백을 사이에 두고&nbsp;주어진다.</p>

<p>각 일을 하는 데 걸리는 시간 T<sub>i</sub>는 1 이상 1440 이하의 정수이며, T<sub>1</sub>, T<sub>2</sub>, ..., T<sub>K</sub>의 합은 1440을 넘지 않는다.</p>

### 출력

<p>바름이가 계획한 일을 모두 수행하는 것이 가능하면 <code>GOOD</code>, 그렇지 않으면 <code>BAD</code>를 출력한다.</p>
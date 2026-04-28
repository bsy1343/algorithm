# [Gold III] Prime Caves - 9199

[문제 링크](https://www.acmicpc.net/problem/9199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 9, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

수학, 구현, 다이나믹 프로그래밍, 정수론, 시뮬레이션, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>An international expedition discovered abandoned Buddhist cave temples in a giant cliff standing on the middle of a desert. There were many small caves dug into halfway down the vertical cliff, which were aligned on square grids. The archaeologists in the expedition were excited by Buddha&#39;s statues in those caves. More excitingly, there were scrolls of Buddhism sutras (holy books) hidden in some of the caves. Those scrolls, which estimated to be written more than thousand years ago, were of immeasurable value.</p>

<p>The leader of the expedition wanted to collect as many scrolls as possible. However, it was not easy to get into the caves as they were located in the middle of the cliff. The only way to enter a cave was to hang you from a helicopter. Once entered and explored a cave, you can climb down to one of the three caves under your cave; i.e., either the cave directly below your cave, the caves one left or right to the cave directly below your cave. This can be repeated for as many times as you want, and then you can descent down to the ground by using a long rope.</p>

<p>So you can explore several caves in one attempt. But which caves you should visit? By examining the results of the preliminary attempts, a mathematician member of the expedition discovered that (1) the caves can be numbered from the central one, spiraling out as shown in Figure D-1; and (2) only those caves with their cave numbers being prime (let&#39;s call such caves <em>prime caves</em>), which are circled in the figure, store scrolls. From the next attempt, you would be able to maximize the number of prime caves to explore.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9199.%E2%80%85Prime%E2%80%85Caves/a5f56e11.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9199.%E2%80%85Prime%E2%80%85Caves/a5f56e11.png" data-original-src="https://upload.acmicpc.net/d0124331-e924-4bd5-bf90-ed6d0639ce06/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure D-1: Numbering of the caves and the prime caves</p>

<p>Write a program, given the total number of the caves and the cave visited first, that finds the descending route containing the maximum number of prime caves.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset has an integer <i>m</i> (1 &le; <i>m</i> &le; 10<sup>6</sup>) and an integer <i>n</i> (1 &le; <i>n</i> &le; <i>m</i>) in one line, separated by a space. <i>m</i> represents the total number of caves. <i>n</i> represents the cave number of the cave from which you will start your exploration. The last dataset is followed by a line with two zeros.</p>

### 출력

<p>For each dataset, find the path that starts from the cave <i>n</i> and contains the largest number of prime caves, and output the number of the prime caves on the path and the last prime cave number on the path in one line, separated by a space. The cave <i>n</i>, explored first, is included in the caves on the path. If there is more than one such path, output for the path in which the last of the prime caves explored has the largest number among such paths. When there is no such path that explores prime caves, output &quot;<code>0 0</code>&quot; (without quotation marks).</p>
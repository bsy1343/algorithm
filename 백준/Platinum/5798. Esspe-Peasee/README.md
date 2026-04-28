# [Platinum I] Esspe-Peasee - 5798

[문제 링크](https://www.acmicpc.net/problem/5798)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 15, 맞힌 사람: 13, 정답 비율: 32.500%

### 분류

확장 유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Esspe-Peasee is an ancient game played by children throughout the land of Acmania. The rules are simple:&nbsp;</p>

<p>A player simply quibs the yorba at the kwonk. If the yorba hurms the kwonk the player gets a foom. If the yorba hurfs the kwonk the player gets a foob.&nbsp;</p>

<p>The objective is to get a twob with as few quibs as possible.</p>

<p>Every group of children has its own opinion regarding the value of a foom, the value of a foob, and the value of a twob. However, everyone agrees that a foob is worth more than a foom, and that a twob is worth more than a foob. You may assume that a foom and a foob can each be represented by a 32 bit integer, and a twob can be represented by a 64 bit integer.&nbsp;</p>

### 입력

<p>You will be given a number of game instances to solve. Each instance is specified by 3 non-negative integers that represent the value of a foom, a foob and a twob, respectively. The final line contains three 0&#39;s and should not be processed.</p>

### 출력

<p>For each instance your program should print &quot;A fooms and B foobs for a twob!&quot;, on a line by itself as shown in the samples below, where the value of &ldquo;A&rdquo; fooms plus &ldquo;B&rdquo; foobs add up to a twob, and the sum of &ldquo;A&rdquo; and &ldquo;B&rdquo; is as small as possible. &ldquo;fooms&rdquo; and &ldquo;foobs&rdquo; should be appropriately pluralised, as shown in &ldquo;Output for the Sample Input&rdquo; below.&nbsp;</p>

<p>If there is no such pair you should print out the age-old chant: &nbsp;&ldquo;Unquibable!&rdquo;</p>
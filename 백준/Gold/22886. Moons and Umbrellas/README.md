# [Gold V] Moons and Umbrellas - 22886

[문제 링크](https://www.acmicpc.net/problem/22886)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 151, 정답: 98, 맞힌 사람: 91, 정답 비율: 70.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Cody-Jamal is working on his latest piece of abstract art: a mural consisting of a row of waning moons and closed umbrellas. Unfortunately, greedy copyright trolls are claiming that waning moons look like an uppercase C and closed umbrellas look like a J, and they have a copyright on CJ and JC. Therefore, for each time CJ appears in the mural, Cody-Jamal must pay X, and for each time JC appears in the mural, he must pay Y.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7a04f85f-2dd5-4b51-bfe8-b57dc2cbce50/-/preview/" /></p>

<p>Cody-Jamal is unwilling to let them compromise his art, so he will not change anything already painted. He decided, however, that the empty spaces he still has could be filled strategically, to minimize the copyright expenses.</p>

<p>For example, if&nbsp;<code>CJ?CC?</code>&nbsp;represents the current state of the mural, with&nbsp;<code>C</code>&nbsp;representing a waning moon,&nbsp;<code>J</code>&nbsp;representing a closed umbrella, and&nbsp;<code>?</code>&nbsp;representing a space that still needs to be painted with either a waning moon or a closed umbrella, he could finish the mural as&nbsp;<code>CJCCCC</code>,&nbsp;<code>CJCCCJ</code>,&nbsp;<code>CJJCCC</code>, or&nbsp;<code>CJJCCJ</code>. The first and third options would require paying&nbsp;X+Y in copyrights, while the second and fourth would require paying&nbsp;2&sdot;X+Y.</p>

<p>Given the costs X and Y and a string representing the current state of the mural, how much does Cody-Jamal need to pay in copyrights if he finishes his mural in a way that minimizes that cost?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T lines follow. Each line contains two integers X and Y and a string S representing the two costs and the current state of the mural, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the minimum cost that Cody-Jamal needs to pay in copyrights for a finished mural.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>Each character of&nbsp;S&nbsp;is either&nbsp;<code>C</code>,&nbsp;<code>J</code>, or&nbsp;<code>?</code>.</li>
</ul>
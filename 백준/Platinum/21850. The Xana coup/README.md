# [Platinum III] The Xana coup - 21850

[문제 링크](https://www.acmicpc.net/problem/21850)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 43, 맞힌 사람: 38, 정답 비율: 71.698%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Having to visit the museum day after day as an art critic&mdash;and not being allowed to touch the exhibits!&mdash;turned out to be too much for you. Therefore, you decided to give your career as an art thief another try.<sup>*</sup> However, after the total disaster of your debut, you are determined to do something about the surveillance cameras this time.</p>

<p>Accordingly, you have used your IT skills to hack into the camera control system. Unfortunately, the cameras themselves are part of the recent installation artwork <em>Xanadu</em>. This leads to a rather strange behaviour: There are $N$ cameras (numbered 1, &hellip; , $N$) distributed over the museum, some of which might already be turned off for artistic reasons. The $N$ cameras are connected by $N - 1$ wires in such a way that any two of them are connected to each other either directly or indirectly. The camera control system offers a button for each individual camera. However, pressing such a button does not only toggle this single camera, but also <em>all cameras directly connected to it</em>.<sup>&dagger;</sup></p>

<p>You are worried that your hacking effort might get noticed if you interact with the camera control system too much. Write a program that calculates the <em>minimal number</em> of button presses necessary to switch off all cameras.</p>

<p><sup>*</sup> Plus, you noticed the amazing synergies between your day job as an art critic and your night time activities as an art thief&mdash;like being able to scout the area without raising suspicion, or increasing the prizes for the art you are going to steal by publishing glowing reviews beforehand.</p>

<p><sup>&dagger;</sup> It&rsquo;s a metaphor for how our own well-being and mood affects the well-being of those closest to us. <em>Obviously</em>.</p>

### 입력

<p>The first line contains an integer $N$, the number of cameras in the museum.</p>

<p>Each of the following $N&nbsp;- 1$ lines contains two integers $a$ and $b$ ($1 \le a, b &le; N$, $a \ne b$). This means that cameras $a$ and $b$ are directly connected by a wire.</p>

<p>The last line contains $N$ integers. The $i$-th of these integers is 1 if camera $i$ is turned on at the beginning, and 0 if camera $i$ is turned off.</p>

### 출력

<p>Your program should output a single line. This line should consist of an integer, the minimum number of button presses required to turn off all cameras, or the string <code>impossible</code> if it is not possible to turn off all cameras.</p>

### 제한

<ul>
	<li>$3 \le N \le 100 000$</li>
</ul>

### 힌트

<p>The following graphic shows the first sample:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cb652f9e-01b7-43cf-af21-2a140d8bd67f/-/preview/" style="width: 94px; height: 144px;" /></p>

<p>An optimal sequence of button presses to turn off all the cameras is given by pressing the buttons for cameras 4, 5, 3, and 1 in this order.</p>
# [Platinum IV] Traitor - 9672

[문제 링크](https://www.acmicpc.net/problem/9672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>According to an intelligence source, we&rsquo;ve got a traitor in ACM Security Agency (ASA). ASA has a hierarchical structure where each agent has a manager and there are also some (at least one) top managers who are not managed by anyone. Our source doesn&rsquo;t exactly know the traitor, but he has a list of suspects. Therefore, all we know is that there is exactly one traitor in our agency and we have a list of suspects. In order to find that traitor, we want to assign a watcher for each suspect, satisfying the following three conditions:</p>

<ol>
	<li>Two suspects cannot watch each other.</li>
	<li>Each suspect should be watched by either his manager or one of his direct employees.</li>
	<li>Nobody can watch more than one suspect.</li>
</ol>

<p>If we want to satisfy all above conditions, it may be impossible to watch all suspects. Therefore, you should write a program that gets the structure of ASA and the list of suspects as the input and finds the maximum number of suspects for whom the watcher assignment is possible. In the following figure that illustrates the organizational structure of ASA with two top managers and eleven agents, the suspects are indicated with gray color. One watcher assignment covering 7 out of 8 suspects is possible in this case which is shown by arrows. An arrow from agent x to agent y, means agent x is supposed to watch agent y. It can be shown that in this example there is no watcher assignment covering all suspects.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9672.%E2%80%85Traitor/4e136125.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9672.%E2%80%85Traitor/4e136125.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9672/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-12%20%EC%98%A4%ED%9B%84%206.25.11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:166px; width:340px" /></p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two integers n(1 &le; n &le; 10,000) specifying the number of agents, and k(1 &le; k &le; n) specifying the number of the suspected agents. The agents are numbered from 1 to n. On the second line there are n space-separated integers, where the i<sup>th</sup> number is the number of agent who is the manger of the agent i. A zero means the agent i is a top manager. On the third line there are k positive integers s<sub>1</sub>, s<sub>2</sub>, &hellip;, s<sub>k</sub>, indicating the numbers of the suspected agents. The input terminates with &ldquo;0 0&rdquo; which should not be processed.</p>

### 출력

<p>For each test case, output in a line the maximum number of suspects for whom the watcher assignment is possible.</p>
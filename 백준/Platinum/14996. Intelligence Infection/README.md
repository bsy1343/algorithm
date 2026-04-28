# [Platinum III] Intelligence Infection - 14996

[문제 링크](https://www.acmicpc.net/problem/14996)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 17, 맞힌 사람: 15, 정답 비율: 31.915%

### 분류

(분류 없음)

### 문제 설명

<p>You are a spy for the Benevolent Agent Protection Center (BAPC) and have recently obtained some top secret information. As you are very excited about this discovery, you want to inform your fellow spies of these newfound documents by sending a message to each of them. One option is to privately message all spies within your organization, but this takes a lot of time. Fortunately, the other spies have networks of their own, so they are able to pass on your message to other spies.</p>

<p>However, there are enemy spies in the network, who will pass along the message to the enemy organization. It is therefore vital that the enemy spies do not receive your message. Luckily, you happen to know who these traitors are, so you can avoid them.</p>

<p>There are two ways for you to send the information to other spies in the network: either by private or by public message. If you use a private message, the receiving spy knows that the message is confidential and they will not tell any other spy. If, on the other hand, you send a spy a public message, the spy will notify all other spies he/she can contact about the message. Since the message is not deemed confidential for them, these spies will in turn contact all spies they can get in contact with and so on (regardless of any messages that they received before). Since you do not want anyone else to know who the enemy spies are, you cannot tell people to contact only specific connections.</p>

<p>Because of the huge size of your spy network, you would like to minimize the number of people you personally need to tell the secret message, while ensuring that no enemy spies receive the message. Can you find out how many spies you need to message?</p>

### 입력

<p>The input consists of three parts:</p>

<ul>
	<li>The first line contains three integers, S, E and C. The first integer (1 &le; S &le; 50.000) denotes the total number of spies in the network (yourself not included), the second integer (0 &le; E &le; S) denotes the total number of enemies in the network and the third integer specifies the total number of connections (0 &le; C &le; 10<sup>5</sup>) between spies in the network.</li>
	<li>Then follow C lines, with two integers 0 &le; S<sub>1</sub> &lt; S and 0 &le; S<sub>2</sub> &lt; S on each line, indicating that there is a connection from spy S<sub>1</sub> to spy S<sub>2</sub>. These connections are not symmetric.</li>
	<li>Finally, one line with E integers, indicating that these spies are enemies.</li>
</ul>

<p>You may assume that you can message every spy in the network directly.</p>

### 출력

<p>Output a single line with one integer indicating the minimum number of messages you need to send to other spies, counting both private and public messages.</p>
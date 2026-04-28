# [Platinum IV] We don’t wanna work! - 15531

[문제 링크](https://www.acmicpc.net/problem/15531)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 31, 맞힌 사람: 29, 정답 비율: 40.845%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 우선순위 큐, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>ACM is an organization of programming contests. The purpose of ACM does not matter to you. The only important thing is that workstyles of ACM members are polarized: each member is either a workhorse or an idle fellow.</p>

<p>Each member of ACM has a motivation level. The members are ranked by their motivation levels: a member who has a higher motivation level is ranked higher. When several members have the same value of motivation levels, the member who joined ACM later have a higher rank. The top 20% highest ranked members work hard, and the other (80%) members never (!) work. Note that if 20% of the number of ACM members is not an integer, its fraction part is rounded down.</p>

<p>You, a manager of ACM, tried to know whether each member is a workhorse or an idle fellow to manage ACM. Finally, you completed to evaluate motivation levels of all the current members. However, your task is not accomplished yet because the members of ACM are dynamically changed from day to day due to incoming and outgoing of members. So, you want to record transitions of members from workhorses to idle fellows, and vice versa.</p>

<p>You are given a list of the current members of ACM and their motivation levels in chronological order of their incoming date to ACM. You are also given a list of incoming/outgoing of members in chronological order.</p>

<p>Your task is to write a program that computes changes of workstyles of ACM members.</p>

### 입력

<p>The first line of the input contains a single integer N (1 &le; N &le; 50,000) that means the number of initial members of ACM. The (i + 1)-th line of the input contains a string s<sub>i</sub> and an integer a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 10<sup>5</sup>), separated by a single space. s<sub>i</sub> means the name of the i-th initial member and a<sub>i</sub> means the motivation level of the i-th initial member. Each character of s<sub>i</sub> is an English letter, and 1 &le; |s<sub>i</sub>| &le; 20. Note that those N lines are ordered in chronological order of incoming dates to ACM of each member.</p>

<p>The (N + 2)-th line of the input contains a single integer M (1 &le; M &le; 20,000) that means the number of changes of ACM members. The (N + 2 + j)-th line of the input contains information of the j-th incoming/outgoing member. When the j-th information represents an incoming of a member, the information is formatted as &ldquo;+ t<sub>j</sub> b<sub>j</sub>&rdquo;, where t<sub>j</sub> is the name of the incoming member&nbsp;and b<sub>j</sub> (0 &le; b<sub>j</sub> &le; 10<sup>5</sup>) is his motivation level. On the other hand, when the j-th information represents an outgoing of a member, the information is formatted as &ldquo;- t<sub>j</sub>&rdquo;, where t<sub>j</sub> means the name of the outgoing member. Each character of t<sub>j</sub> is an English letter, and 1 &le; |t<sub>j</sub>| &le; 20. Note that uppercase letters and lowercase letters are distinguished. Note that those M lines are ordered in chronological order of dates when each event happens.</p>

<p>No two incoming/outgoing events never happen at the same time. No two members have the same name, but members who left ACM once may join ACM again.</p>

### 출력

<p>Print the log, a sequence of changes in chronological order. When each of the following four changes happens, you should print a message corresponding to the type of the change as follows:</p>

<ul>
	<li>Member name begins to work hard : &ldquo;name is working hard now.&rdquo;</li>
	<li>Member name begins to not work : &ldquo;name is not working now.&rdquo;</li>
</ul>

<p>For each incoming/outgoing, changes happen in the following order:</p>

<ol>
	<li>Some member joins/leaves.</li>
	<li>When a member joins, the member is added to either workhorses or idle fellows.</li>
	<li>Some member may change from a workhorse to an idle fellow and vice versa. Note that there are no cases such that two or more members change their workstyles at the same time.</li>
</ol>

### 힌트

<p>Sample 1:&nbsp;Initially, no member works because 4 &times;20% &lt; 1. When one member joins ACM, Durrett begins to work hard.</p>

<p>Sample 2:&nbsp;No member works.</p>

<p>Sample 4:&nbsp;Some member may repeat incoming and outgoing.</p>
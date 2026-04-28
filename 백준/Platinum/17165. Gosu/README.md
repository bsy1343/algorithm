# [Platinum I] Gosu - 17165

[문제 링크](https://www.acmicpc.net/problem/17165)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 465, 정답: 151, 맞힌 사람: 111, 정답 비율: 35.463%

### 분류

그래프 이론, 애드 혹

### 문제 설명

<p>Ho is an expert in martial arts called <em>Taebo</em>. She runs a Taebo school, and there are $N$ students in her school. Since Ho is too old to teach Taebo, she is going to hand over her school to one of her students. To find a suitable candidate, Ho made all $\frac{N(N-1)}{2}$ pairs of students do a Taebo matchup with each other. In a Taebo matchup, exactly one person wins the match, and another person loses the match.&nbsp;Ho thinks that a student is good enough to receive her school if the student is a <strong>Gosu</strong>&nbsp;of Taebo.</p>

<p><strong>Gosu</strong>&nbsp;is a Korean word which means a person who is very good at games, sports, competitive programming, etc. In Taebo, Gosu has a different meaning.&nbsp;</p>

<p>Let&#39;s define a <strong>winning path</strong>&nbsp;from player $x$ to player $y$ as a sequence of $K+1$ integers $a_0 = x,\ a_1,\ \cdots ,\ a_K = y$, where student $a_i$ has won student $a_{i+1}$ for all $0 \le i &lt; K$. We call $K$ as the <strong>length&nbsp;</strong>of this winning path. For example, if there exists a <strong>winning path</strong>&nbsp;of length 1, we can immediately know that&nbsp;$x$ has won student $y$. If there exists a winning path of length 2, then $x$ may not have won $y$ directly, but there exists some other player $z$ that $x$ has won, and has won $y$.</p>

<p>The <strong>distance</strong>&nbsp;$d(x,\ y)$ is defined as a minimum length of winning path from $x$ to $y$, if such exists. There could be a case that $x$ can not find a winning path to $y$. In that case, we define $d(x,\ y) = 9000$. Note that, the path can have zero length, thus $d(i,\ i)$ is always $0$.&nbsp;</p>

<p>Ho wants her student to be strong to all kind of opponents, so she defines the <strong>weakness</strong>&nbsp;of student $i$, as a maximum value among $d(i,\ 1),\ d(i,\ 2),\ \cdots,\ d(i,\ N)$. A student $i$ is a <strong>Gosu</strong>&nbsp;in Taebo when the weakness of student $i$ is minimum among all weakness values. By this definition, there can be multiple Gosu-s.</p>

<p>Since Ho is too old to tell who is Gosu, your task is to find a Gosu and weakness value of Gosu to help Ho. If there exist multiple Gosu-s, you can print any of them. &nbsp;</p>

### 입력

<p>In the first line, the number of students $N$ is given.</p>

<p>In the $i$-th line of next $N$ lines, a string $s_i$ consists of <kbd>W</kbd>, <kbd>L</kbd>, and <kbd>-</kbd>. Let&#39;s denote $j$-th character of $s_i$ as $s_{i,j}$. $s_{i,j}$ is given as follows:</p>

<ul>
	<li>$s_{i,j}=$&nbsp;<kbd>-</kbd>, if $i=j$.</li>
	<li>$s_{i,j}=$ <kbd>W</kbd>, if student $i$ won student $j$.</li>
	<li>$s_{i,j}=$ <kbd>L</kbd>, if student $j$ won student $i$.</li>
</ul>

### 출력

<p>Print two space-separated integers, <s>u&nbsp;and d</s>&nbsp;${\color{red}d}$ <span style="color:#e74c3c;">and</span> ${\color{red}u}$, where student $u$ is Gosu, and $d$ is weakness of student $u$.</p>

<p>If there are multiple answers, you can print any of them.</p>

### 제한

<ul>
	<li>$2 \le N \le 3\,000$</li>
	<li>$s_{i, i} =$ <kbd>-</kbd> ($1 \le i \le N$)</li>
	<li>If $i \neq j$, then $s_{i, j}=$ <kbd>W</kbd> or $s_{i, j}=$ <kbd>L</kbd>. ($1 \le i \le N$)</li>
	<li>If $s_{i, j} = $ <kbd>W</kbd>, then $s_{j, i} = $ <kbd>L</kbd>. ($1 \le i,\ j \le N$)</li>
	<li>If $s_{i, j} = $ <kbd>L</kbd>, then $s_{j, i} = $&nbsp;<kbd>W</kbd>. ($1 \le i,\ j \le N$)</li>
</ul>
# [Platinum I] A Light Inconvenience - 29742

[문제 링크](https://www.acmicpc.net/problem/29742)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 100, 정답: 22, 맞힌 사람: 20, 정답 비율: 29.851%

### 분류

애드 혹

### 문제 설명

<p>The Scientific Committee is relaxing at the opening ceremony of this year&rsquo;s CEOI. The tasks are prepared, the grading server&rsquo;s $10^{12}$ firewalls are finally up, and the committee is looking forward to an amazing show with flaming torches. Nothing can go wrong. Except&hellip; no one bought enough oil for those torches! Now the committee needs help to run the show without using up their oil supplies.</p>

<p>During the show, there will be performers standing in a line, numbered from left to right starting at $1$. The number of performers will vary over time. Each performer holds a torch which may or may not be on fire at any point in time. Initially, there is only one performer whose torch is on fire.</p>

<p>The show is divided into $Q$ acts. At the beginning of act $a$, either $p_a &gt; 0$ performers decide to join the line on the right, or the rightmost $p_a &gt; 0$ performers decide to leave. This is out of the committee&rsquo;s control. The leftmost performer always remains on stage. The torches of joining performers are not on fire, and leaving performers extinguish their torches if they are on fire.</p>

<p>As soon as the line of performers for act $a$ is ready, the committee has to announce a number $t_a &ge; 0$. Then, each performer whose torch is on fire shares their fire with the $t_a$ performers on their right. This means that the torch of performer $i$ will be on fire afterwards if and only if the torch of at least one of the performers $\max\{i &minus; t_a , 1\}, \dots , i$ was on fire beforehand. <em>For a more dynamic show, $t_a$ must not be larger than $5p_a$, and should be as low as possible</em> (see the grading section below).</p>

<p>At the end of each act, the committee has to tell every performer whose torch is currently on fire whether to extinguish it or not. For aesthetic reasons, the torch of the rightmost performer should always be on fire after that. <em>Moreover, to conserve oil, the number of torches left on fire must not be larger than $150$.</em></p>

<p>Write a program that tells the committee how to run the show within these constraints.</p>

### 입력



### 출력


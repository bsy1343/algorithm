# [Gold V] Annoyed Coworkers - 24825

[문제 링크](https://www.acmicpc.net/problem/24825)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 38, 맞힌 사람: 31, 정답 비율: 42.466%

### 분류

자료 구조, 이분 탐색, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<figure style="float: right;"><img alt="" src="https://upload.acmicpc.net/558659d3-81f2-4f91-902d-dd2f6a8e47b1/-/preview/" style="width: 300px; height: 262px;" />
<figcaption>A picture of you, not working. Source: <a href="https://xkcd.com/303/">XKCD 303</a></figcaption>
</figure>

<p>It&#39;s another day in the office, and you&#39;re a mastermind of not doing any work yourself. Instead, you&#39;ll go to your coworkers for &quot;help,&quot; but secretly have them do all the work.</p>

<p>You&#39;ve determined that the more one of your coworkers helps you, the more annoyed they become. You&#39;ve also been able to determine how much more annoyed a coworker gets everytime you ask them for help. At the beginning of the day, a coworker is initially $a$ annoyed at you.  That&#39;s their annoyance level. Everytime you ask them for help though, they become $d$ more annoyed at you -- their annoyance level $a$ increases by a constant amount $d$ so that $a=a+d$.</p>

<p>You want to complete a project of $h$ tasks solely with &quot;help&quot; from your coworkers, but you need to be careful not to annoy any of them too much.</p>

<p>What&#39;s the best you can do?</p>

### 입력

<p>The first line contains $2$ integers $h$ and $c$, where $h$ ($1 \le h \le 100\,000$) is the number of times you have to ask for help to complete the project, and $c$ ($1 \le c \le 100\,000$) denotes the number of coworkers you have.</p>

<p>Each of the following $c$ lines contains two positive integers $a$ and $d$, representing a coworker whose initial annoyance level is $a$ and who is getting more annoyed at you by an increase of $d$ every time you ask them for help ($1\le a, d \le 10^9$).</p>

### 출력

<p>Output a single number, which is the maximum annoyance level <em>any</em> coworker has at you provided you use an optimal strategy to minimize this level. (In other words, of all possible strategies, choose one that minimizes the annoyance level of the worker or workers who are most annoyed at you at the end.)</p>
# [Platinum I] Stranded Far From Home - 25263

[문제 링크](https://www.acmicpc.net/problem/25263)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 31, 맞힌 사람: 29, 정답 비율: 46.032%

### 분류

자료 구조, 분리 집합, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>You just couldn&rsquo;t leave it alone&hellip; You actually carried out the break-in, and initially everything worked out as planned. However, the communication with your assistant went terribly wrong.* Instead of returning safely to L&uuml;beck, you are now stranded on a small island, and your submarine is out of fuel.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25263.%E2%80%85Stranded%E2%80%85Far%E2%80%85From%E2%80%85Home/ad089d6a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25263.%E2%80%85Stranded%E2%80%85Far%E2%80%85From%E2%80%85Home/ad089d6a.png" data-original-src="https://upload.acmicpc.net/9fa73f6a-9161-4f15-b97a-7ff2b765cb72/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 149px; height: 207px; float: right;" />To return in time for the BOI award ceremony, you now have to get to the ferry on the other side of the island. However, the local population has strange traditions. Ties are very important to them, and every village has its own preferred tie color which might change over time.</p>

<p>A report from the internet tells you that different villages initially preferred different tie colors. Unfortunately, the report is quite outdated. Since then, every week exactly one village convinced a neighboring village to prefer the same tie color as them. (Two villages are neighbors if they are directly connected by a road.) However, this can only happen if there were at least as many people on the entire island who preferred the tie color of the first village as there were people who preferred the tie color of the second village. Enough time has passed so that all islanders now prefer the same tie color.</p>

<p>You are almost sure that the islanders won&rsquo;t let you pass if you don&rsquo;t wear a tie matching their preference. To get to the ferry, you therefore plan to wear a tie of every color that the islanders could prefer. However, wearing too many ties will make you look suspicious. Write a program that uses a description of the island to calculate which ties you have to wear.</p>

<hr />
<p>* That was to be expected, right?</p>

### 입력

<p>The first line of the input contains two integers $N$ and $M$ where $N$ is the number of villages and $M$ is the number of roads on the island. The villages are numbered from $1$ to $N$.</p>

<p>The next line contains $N$ integers $s_1, \dots , s_N$ where $s_i$ describes the number of inhabitants of village $i$.</p>

<p>Each of the following $M$ lines contains two integers $a$ and $b$ ($1 &le; a, b &le; N$, $a \ne b$), meaning that there is a road between villages $a$ and $b$. All villages are connected to each other at least indirectly.</p>

### 출력

<p>Your program should output a string of length $N$ consisting of <code>0</code>s and <code>1</code>s. The $i$-th digit should be <code>1</code> if and only if it is possible that all islanders now prefer the tie color that village $i$ preferred initially.</p>

### 제한

<p>It always holds that $1 &le; N &le; 200\,000$, $0 &le; M &le; 200\,000$, and $1 &le; s_i &le; 10^9$.</p>

### 힌트

<p>The following picture shows the first example:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25263.%E2%80%85Stranded%E2%80%85Far%E2%80%85From%E2%80%85Home/d85488bd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25263.%E2%80%85Stranded%E2%80%85Far%E2%80%85From%E2%80%85Home/d85488bd.png" data-original-src="https://upload.acmicpc.net/28f8fae3-9652-4bce-87e6-3a444a1bff26/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 162px; height: 89px;" /></p>

<p>The first digit of the output is $1$ since it is possible that all islanders now prefer the tie color that village $1$ preferred initially. This could happen as follows: In the first week, village $1$ convinces village $2$ that their tie color is better. After that, there are four people who prefer the tie color of village $1$. Therefore, village $1$ can now convince village $3$ of their tie color, and if afterwards village $3$ convinces village $4$, everybody prefers the tie color that village $1$ preferred initially.</p>

<p>The last digit of the output is $0$ since it is impossible that village $4$ convinces anyone of their tie color. This is because village $4$ is only connected to village $3$, but village $3$ has more inhabitants.</p>

<p>Note that the second example is a valid test case for the second subtask.</p>
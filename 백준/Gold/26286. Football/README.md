# [Gold V] Football - 26286

[문제 링크](https://www.acmicpc.net/problem/26286)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 129, 맞힌 사람: 53, 정답 비율: 29.282%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<p>Scientists are researching an impact of football match results on the mood of football fans. They have a hypothesis that there is a correlation between the number of draws and fans&#39; desire to watch football matches in the future.</p>

<p>In football, two teams play a match. The teams score goals throughout a match. A score &quot;$x$<code>:</code>$y$&quot; means that the team we observe scored $x$ goals and conceded $y$ goals. If $x = y$, then the match ends in a draw. If $x &gt; y$, then the observed team wins, and if $x &lt; y$, then it loses.</p>

<p>To find out if there is a correlation, the scientists gathered information about the results of teams in lower leagues. The information they found is the number of matches played by the team ($n$), the number of goals scored in these matches ($a$), and the number of goals conceded in these matches ($b$).</p>

<p>You are given this information for a single team. You are asked to calculate the minimum number of draws that could have happened during the team&#39;s matches and provide a list of match scores with the minimum number of draws.</p>

### 입력

<p>The first line contains an integer $n$ --- the number of matches played by the team ($1 \le n \le 100$). The second line contains an integer $a$ --- the total number of goals scored by the team in all $n$ matches ($0 \le a \le 1000$). The third line contains an integer $b$ --- the total number of goals conceded by the team in all $n$ matches ($0 \le b \le 1000$).</p>

### 출력

<p>In the first line, print a single integer $d$ --- the minimum number of draws.</p>

<p>In the following $n$ lines, print a list of match scores, each line in the format &quot;$x$<code>:</code>$y$&quot;, where $x$ is the number of goals scored in the match, and $y$ -- the number of goals conceded, so that exactly $d$ of these matches have ended in a draw. In case multiple such lists of match scores exist, print any of them.</p>
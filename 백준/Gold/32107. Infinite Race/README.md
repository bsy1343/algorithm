# [Gold II] Infinite Race - 32107

[문제 링크](https://www.acmicpc.net/problem/32107)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

애드 혹, 자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Every year, there is a marathon in Eindhoven. This year, the organizers have come up with something special, and instead of being over after 42 kilometres, the race goes on forever! To keep the organization simple, the race takes place on a running track at Eindhoven university, and the participants run an infinite number of laps on the track.</p>

<p>Anika is excited to be one of the $N$ participants, numbered from $0$ to $N-1$. She was quick to sign up which means she is participant $0$. She starts right after the finish line with all other participants positioned ahead of her on the track. Anika cannot keep track of how many laps she has run, but she remembers when she overtakes someone or when someone overtakes her. What is the minimum number of times she must have crossed the finish line? Nobody moves backwards, and no overtaking happens exactly at the finish line. Furthermore, note that the participants do not necessarily run at a constant speed.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32107.%E2%80%85Infinite%E2%80%85Race/e1ae6f42.png" data-original-src="https://upload.acmicpc.net/143748a8-0995-4b25-868a-8d0be16591a2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 266px;" /></p>

### 입력

<p>The first line of input contains an integer $N$, the number of participants.</p>

<p>The second line contains an integer $Q$, the number of events.</p>

<p>The following $Q$ lines describe the events in the order they occurred during the race. The $i$th line contains an integer $x_i$.</p>

<ul>
	<li>If $x_i &gt; 0$, it means that Anika overtook participant $x_i$.</li>
	<li>If $x_i &lt; 0$, it means that participant $-x_i$ overtook Anika.</li>
</ul>

### 출력

<p>Output a single integer, the minimum number of times Anika must have crossed the finish line.</p>

### 제한

<ul>
	<li>$2 \le N \le 200\,000$.</li>
	<li>$1 \le Q \le 200\,000$.</li>
	<li>$1 \le x_i \le N-1$ or $-(N-1) \le x_i \le -1$.</li>
</ul>

### 힌트

<p>Note that some of the samples are not valid input for all test groups.</p>

<p>In the first sample, there are $N = 4$ participants and $Q = 5$ events. Anika first gets overtaken by $2$, who is now a full lap ahead of her. Then she overtakes $2$ back, followed by overtaking $1$ and then being overtaken by $3$. At this point, Anika can still be on her first lap. Finally, she overtakes $2$ again, and to do so means that she must have crossed the finish line at least once.</p>

<p>In the second sample, there is just one participant other than Anika. Anika overtakes the other participant four times, meaning that Anika must have crossed the finish line at least three times.</p>
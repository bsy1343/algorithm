# [Gold III] ㄷㄷㄷㅈ - 19535

[문제 링크](https://www.acmicpc.net/problem/19535)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 4615, 정답: 1428, 맞힌 사람: 1099, 정답 비율: 29.995%

### 분류

수학, 트리, 조합론

### 문제 설명

<p>어느 날, 트리를 물끄러미 보고 있던 동현이는 엄청난 사실을 하나 발견했다. 바로 정점이 네 개인 트리는 &lsquo;ㄷ&rsquo;과 &lsquo;ㅈ&rsquo;의 두 종류밖에 없다는 사실이다!</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/255cb1ee-1778-4c09-bdd9-202f25422d24/-/preview/" style="width: 700px; height: 257px;" /></p>

<p>정점이 네 개 이상 있는 임의의 트리에 대해, 그 트리에서 정점 네 개로 이루어진 집합을 고르자. 전체 트리의 간선들 중 집합에 속한 두 정점을 잇는 간선만을 남겼을 때, 네 개의 정점이 하나의 트리 형태로 이어지게 된다면 &lsquo;ㄷ&rsquo; 모양이거나 &lsquo;ㅈ&rsquo; 모양일 것이다. 트리에서 &lsquo;ㄷ&rsquo;의 개수와 &lsquo;ㅈ&rsquo;의 개수를 각각 트리에서 &lsquo;ㄷ&rsquo; 모양, &lsquo;ㅈ&rsquo; 모양을 이루는 정점 네 개짜리 집합의 개수라고 하자.</p>

<p>이제, 동현이는 세상의 모든 트리를 다음과 같은 세 종류로 나누었다.</p>

<ul>
	<li>D-트리 : &lsquo;ㄷ&rsquo;이 &lsquo;ㅈ&rsquo;의 $3$배보다 많은 트리</li>
	<li>G-트리 : &lsquo;ㄷ&rsquo;이 &lsquo;ㅈ&rsquo;의 $3$배보다 적은 트리</li>
	<li>DUDUDUNGA-트리 : &lsquo;ㄷ&rsquo;이 &lsquo;ㅈ&rsquo;의 정확히 $3$배만큼 있는 트리</li>
</ul>

<p>신이 난 동현이는 트리만 보이면 그 트리에 있는 &lsquo;ㄷ&rsquo;과 &lsquo;ㅈ&rsquo;이 몇 개인지 세고 다니기 시작했다. 하지만 곧 정점이 $30$만 개나 있는 트리가 동현이 앞에 나타났고, 동현이는 그만 정신을 잃고 말았다. 동현이를 대신해 주어진 트리가 D-트리인지 G-트리인지 아니면 DUDUDUNGA-트리인지 알려주자!</p>

### 입력

<p>첫 번째 줄에 트리의 정점 수 $N$이 주어진다. ($4 \leq&nbsp;N&nbsp;\leq&nbsp;300\ 000$)</p>

<p>두 번째 줄부터 $N-1$개의 줄에 트리의 각 간선이 잇는 두 정점의 번호 $u$, $v$가 주어진다. ($1 \leq&nbsp;u,&nbsp;v&nbsp;\leq&nbsp;N$)</p>

### 출력

<p>첫 번째 줄에 주어진 트리가 D-트리라면 <span style="color:#e74c3c;"><code>D</code></span>, G-트리라면 <span style="color:#e74c3c;"><code>G</code></span>, DUDUDUNGA-트리라면 <span style="color:#e74c3c;"><code>DUDUDUNGA</code></span>를 출력한다.</p>
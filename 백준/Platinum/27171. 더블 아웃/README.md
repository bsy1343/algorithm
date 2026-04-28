# [Platinum III] 더블 아웃 - 27171

[문제 링크](https://www.acmicpc.net/problem/27171)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

다이나믹 프로그래밍, 구현, 수학, 확률론

### 문제 설명

<p><strong>《다트》</strong>는 둥근 과녁인 다트판에 다트를 던져 나온 점수로 경쟁하는 게임입니다. 대부분의 다트 경기는 $501$점, $701$점 등 특정 점수에서 시작해서, 각 라운드마다 $3$발의 다트를 던져 맞힌 점수만큼 점수를 깎아 먼저 정확히 $0$점에 도달하는 것이 목표입니다.</p>

<p>다트판에 그려진 원은 넓이가 같은 $20$개의 부채꼴 영역으로 나뉘어 있으며, 위에서부터 시계방향으로 $20$, $1$, $18$, $4$, $13$, $6$, $10$, $15$, $2$, $17$, $3$, $19$, $7$, $16$, $8$, $11$, $14$, $9$, $12$, $5$점의 영역입니다. 다트판에는 원의 바깥쪽과 안쪽에 두 개의 링이 존재하며, 한가운데에는 작은 동심원이 있습니다. 다트를 던져서 맞힌 위치에 따른 점수는 다음과 같습니다.</p>

<ul>
	<li>안쪽 링과 바깥쪽 링 사이 또는 안쪽 링과 바깥쪽 동심원 사이: 해당 영역의 점수 (<strong>Single</strong>)</li>
	<li>바깥쪽 링 내부: 해당 영역의 점수의 <strong>$2$배</strong> (<strong>Double</strong>)</li>
	<li>안쪽 링 내부: 해당 영역의 점수의 <strong>$3$배</strong> (<strong>Triple</strong>)</li>
	<li>바깥쪽 동심원과 안쪽 동심원 사이: <strong>$25$점</strong> (<strong>Single Bull</strong>)</li>
	<li>안쪽 동심원 내부: <strong>$50$점</strong> (<strong>Double Bull</strong>)</li>
	<li>바깥쪽 링 외부: <strong>$0$점</strong> (<strong>Miss</strong>)</li>
</ul>

<p>아래는 다트판의 영역별 점수를 나타낸 그림입니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27171.%E2%80%85%EB%8D%94%EB%B8%94%E2%80%85%EC%95%84%EC%9B%83/8a57f3d6.png" data-original-src="https://upload.acmicpc.net/fa849804-b05d-4074-80f2-d1dcf4832efb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 616px; max-width: 100%;" /></p>

<p>다트에는 <strong>Double Out</strong>이라는 규칙이 있습니다. 이 규칙에 따르면 마지막 라운드에서, 다트 $3$발을 모두 사용할 필요는 없지만, 점수를 $0$점으로 만드는 마지막 화살은 <strong>Double 또는 Double Bull</strong>을 맞혀야 합니다. 예를 들어 남은 점수가 $3$점일 때 게임이 진행되는 예시는 다음과 같습니다.</p>

<ul>
	<li>Single $1$ &rarr; Double $1$ (성공)</li>
	<li>Single $1$ &rarr; Miss &rarr; Double $1$ (성공)</li>
	<li>Single $1$ &rarr; Miss &rarr; Miss (실패: $2$점이 남음. 다음 라운드는 $2$점 남은 상황에서 진행)</li>
	<li>Single $3$ (실패: Double로 끝내지 않음)</li>
	<li>Double $1$ &rarr; Single $1$ (실패: Double로 끝내지 않음)</li>
	<li>Double $2$ (실패: 점수가 정확히 $0$점에 도달하지 않음)</li>
</ul>

<p>다트 $3$발을 모두 던지지 않았더라도, 점수가 $0$점보다 낮아지거나, 점수가 $0$점이 되었지만 Double로 끝내지 않은 경우 해당 라운드는 종료되며 무효 처리됩니다. $3$발의 다트로 얻을 수 있는 가장 큰 점수는 $180$점(Triple $20$, Triple $20$, Triple $20$)이지만, $3$발의 다트로 Double Out이 가능한 가장 큰 점수는 $170$점(Triple $20$, Triple $20$, Double Bull)입니다.</p>

<p>숙련된 다트 플레이어인 16silver가 다트를 하고 있습니다. 16silver가 다트판의 어느 위치를 조준하는가에 따라 정확도가 달라집니다. 조준할 수 있는 영역별로 실제로 맞히게 되는 영역, 그리고 맞히는 확률은 다음과 같습니다. 모든 설명에서 $Y$점 영역의 양 옆으로 인접한 영역은 $X$점, $Z$점입니다. 예를 들어 $Y$가 $20$이면 $X$는 $5$, $Z$는 $1$입니다.</p>

<ul>
	<li><strong>Triple $Y$</strong>: (Triple $Y$, <span style="color:#16a085;"><strong>$\boldsymbol{a_1\%}$</strong>)</span>, (Triple $X$, <span style="color:#c0392b;"><strong>$\boldsymbol{a_2\%}$</strong></span>), (Triple $Z$, <span style="color:#c0392b;"><strong>$\boldsymbol{a_2\%}$</strong></span>), (Single $Y$, <span style="color:#7f8c8d;"><strong>$\boldsymbol{(100-a_1-2a_2)\%}$</strong></span>)</li>
	<li><strong>Double $Y$</strong>: (Double $Y$, <span style="color:#16a085;"><strong>$\boldsymbol{b_1\%}$</strong></span>), (Double $X$, <span style="color:#c0392b;"><strong>$\boldsymbol{b_2\%}$</strong></span>), (Double $Z$, <span style="color:#c0392b;"><strong>$\boldsymbol{b_2\%}$</strong></span>), (Single $Y$, <strong><span style="color:#2980b9;">$\boldsymbol{b_3\%}$</span></strong>), (Miss, <span style="color:#7f8c8d;"><strong>$\boldsymbol{(100-b_1-2b_2-b_3)\%}$</strong></span>)</li>
	<li><strong>Single $Y$</strong>: (Single $Y$, <span style="color:#16a085;"><strong>$\boldsymbol{c_1\%}$</strong></span>), (Single $X$, <span style="color:#c0392b;"><strong>$\boldsymbol{c_2\%}$</strong></span>), (Single $Z$, <span style="color:#c0392b;"><strong>$\boldsymbol{c_2\%}$</strong></span>), (Double $Y$, <span style="color:#7f8c8d;"><strong>$\boldsymbol{(100-c1-2c_2)}\%$</strong></span>)</li>
	<li><strong>Single Bull</strong>: (Single Bull, <span style="color:#16a085;"><strong>$\boldsymbol{d_1\%}$</strong></span>), (Double Bull, <span style="color:#7f8c8d;"><strong>$\boldsymbol{(100-d_1)\%}$</strong></span>)</li>
	<li><strong>Double Bull</strong>: (Double Bull, <span style="color:#16a085;"><strong>$\boldsymbol{e_1\%}$</strong></span>), (Single Bull, <span style="color:#7f8c8d;"><strong>$\boldsymbol{(100-e_1)\%}$</strong></span>)</li>
</ul>

<p>정수 <strong><span style="color:#16a085;">$\boldsymbol{a_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{a_2}$</strong></span>, <strong><span style="color:#16a085;">$\boldsymbol{b_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{b_2}$</strong></span>, <strong><span style="color:#2980b9;">$\boldsymbol{b_3}$</span></strong>, <strong><span style="color:#16a085;">$\boldsymbol{c_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{c_2}$</strong></span>, <strong><span style="color:#16a085;">$\boldsymbol{d_1}$</span></strong>, <strong><span style="color:#16a085;">$\boldsymbol{e_1}$</span></strong>이 주어질 때, 남은 점수와 남은 다트 개수에 따라 첫 다트를 어느 영역으로 조준해야 <strong>해당 라운드에</strong> Double Out을 성공할 가능성이 가장 높은지 구해봅시다!</p>

### 입력

<p>첫 번째 줄에 쿼리의 개수 $Q$가 주어집니다.</p>

<p>두 번째 줄에 $9$개의 정수 <strong><span style="color:#16a085;">$\boldsymbol{a_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{a_2}$</strong></span>, <strong><span style="color:#16a085;">$\boldsymbol{b_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{b_2}$</strong></span>, <strong><span style="color:#2980b9;">$\boldsymbol{b_3}$</span></strong>, <strong><span style="color:#16a085;">$\boldsymbol{c_1}$</span></strong>, <span style="color:#c0392b;"><strong>$\boldsymbol{c_2}$</strong></span>, <strong><span style="color:#16a085;">$\boldsymbol{d_1}$</span></strong>, <strong><span style="color:#16a085;">$\boldsymbol{e_1}$</span></strong>이 주어집니다.</p>

<p>다음 $Q$개의 줄에 남은 점수 $s$와 남은 다트 개수 $n$이 주어집니다.</p>

### 출력

<p>각 쿼리마다, 남은 점수가 $s$고 남은 다트 개수가 $n$개인 경우 조준했을 때 성공할 가능성이 가장 높은 영역을 <span style="color:#e74c3c;"><code>Single X</code></span>, <span style="color:#e74c3c;"><code>Double X</code></span>, <span style="color:#e74c3c;"><code>Triple X</code></span>, <span style="color:#e74c3c;"><code>Single Bull</code></span>, <span style="color:#e74c3c;"><code>Double Bull</code></span> 중 하나로 출력합니다. </p>

<p>만약 어떤 곳을 조준하더라도 해당 라운드에 Double Out을 성공할 가능성이 없다면 대신 <span style="color:#e74c3c;"><code>Impossible</code></span>을 출력합니다.</p>

<p>Double Out을 성공할 가능성이 존재하고, 조준했을 때 성공할 가능성이 가장 높은 영역이 여러 개라면, 출력해야 하는 문자열을 기준으로 사전순으로 가장 앞서는 것 하나만 출력합니다.</p>

### 제한

<ul>
	<li>$1 \le Q \le 540$</li>
	<li>$0 \le\,$<strong><span style="color:#16a085;">$\boldsymbol{a_1}$</span></strong>$,\,$<span style="color:#c0392b;"><strong>$\boldsymbol{a_2}$</strong></span>$,\,$<strong><span style="color:#16a085;">$\boldsymbol{b_1}$</span></strong>$,\,$<span style="color:#c0392b;"><strong>$\boldsymbol{b_2}$</strong></span>$,\,$<strong><span style="color:#2980b9;">$\boldsymbol{b_3}$</span></strong>$,\,$<strong><span style="color:#16a085;">$\boldsymbol{c_1}$</span></strong>$,\,$<span style="color:#c0392b;"><strong>$\boldsymbol{c_2}$</strong></span>$,\,$<strong><span style="color:#16a085;">$\boldsymbol{d_1}$</span></strong>$,\,$<strong><span style="color:#16a085;">$\boldsymbol{e_1}$</span></strong>$\,\le 100$</li>
	<li><strong><span style="color:#16a085;">$\boldsymbol{a_1}$</span></strong>$\, + \, 2 $<span style="color:#c0392b;"><strong>$\boldsymbol{a_2}$</strong></span>$\, \le 100$</li>
	<li><strong><span style="color:#16a085;">$\boldsymbol{b_1}$</span></strong>$\, + \,2 $<span style="color:#c0392b;"><strong>$\boldsymbol{b_2}$</strong></span>$\, + \,$<strong><span style="color:#2980b9;">$\boldsymbol{b_3}$</span></strong>$\, \le 100$</li>
	<li><strong><span style="color:#16a085;">$\boldsymbol{c_1}$</span></strong>$\, + \, 2 $<span style="color:#c0392b;"><strong>$\boldsymbol{c_2}$</strong></span>$\, \le 100$</li>
	<li>$1 \le s \le 180$</li>
	<li>$1 \le n \le 3$</li>
</ul>

### 힌트

<p>사전순은 아스키코드를 기준으로 합니다. 예를 들어 <span style="color:#e74c3c;"><code>Double 1</code></span> &lt; <span style="color:#e74c3c;"><code>Double 10</code></span> &lt; <span style="color:#e74c3c;"><code>Double 19</code></span> &lt; <span style="color:#e74c3c;"><code>Double 2</code></span> &lt; <span style="color:#e74c3c;"><code>Double 9</code></span> &lt; <span style="color:#e74c3c;"><code>Double Bull</code></span> &lt; <span style="color:#e74c3c;"><code>Single 1</code></span> &lt; <span style="color:#e74c3c;"><code>Single Bull</code></span> &lt; <span style="color:#e74c3c;"><code>Triple 1</code></span> &lt; <span style="color:#e74c3c;"><code>Triple 10</code></span> &lt; <span style="color:#e74c3c;"><code>Triple 9</code></span>입니다.</p>

<p>Q: 다트도 보드게임인가요?</p>

<p>A: 다트판이 영어로 dart<strong>board</strong>기 때문에 <strong>보드</strong>게임이 맞습니다.</p>